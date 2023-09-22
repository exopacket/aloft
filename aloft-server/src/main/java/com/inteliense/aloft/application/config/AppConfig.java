package com.inteliense.aloft.application.config;

import com.inteliense.aloft.application.cache.AppCache;
import com.inteliense.aloft.compiler.lang.keywords.AloftTheme;
import com.inteliense.aloft.run.Main;
import com.inteliense.aloft.server.html.elements.HtmlElement;
import com.inteliense.aloft.server.html.elements.css.Stylesheet;
import com.inteliense.aloft.server.html.elements.css.StylesheetBuilder;
import com.inteliense.aloft.server.html.elements.css.StylesheetWriterType;
import com.inteliense.aloft.server.html.elements.js.JavaScript;
import com.inteliense.aloft.server.html.elements.js.JavaScriptBuilder;
import com.inteliense.aloft.server.html.elements.js.JavaScriptWriterType;
import com.inteliense.aloft.server.http.middleware.base.ApplyToType;
import com.inteliense.aloft.server.http.middleware.types.HasHeaders;
import com.inteliense.aloft.server.http.supporting.Route;
import com.inteliense.aloft.utils.data.JSON;
import com.inteliense.aloft.utils.global.__;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class AppConfig {

    //SERVER CONFIGURATION
    private DebugServerConfig debugServer;
    private PublicServerConfig publicServer;
    private LoadBalancingConfig loadBalancing;
    private ProxiesConfig proxies;
    private RoutesConfig routes;

    //APPLICATION CONFIGURATION
    private String name = "";
    private String key = "";
    private String pkg = "";

    //MODULES
    private ModuleList modules;

    //APPLICATION CACHE
    private AppCache cache;

    //MIDDLEWARE
    private MiddlewareList middleware;

    //CLASSES AND STYLES
    private AloftTheme theme;

    //JAVASCRIPT AND STYLESHEETS;
    private JavaScriptEndpointList scriptEndpoints;
    private StylesheetEndpointList stylesheetEndpoints;

    public MiddlewareList getMiddleware() { return this.middleware; }

    public AppConfig() {
        //FIXME ....FOR TESTING
        File file = new File("/home/ryan/aloft/aloft-cli/my-project/my-project.json");
        if(!file.exists()) throw new RuntimeException("Config does not exist");
        Scanner scnr = null;
        try {
            scnr = new Scanner(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        String content = "";
        while(scnr.hasNextLine()) content += scnr.nextLine();
        parseObjects(JSON.getObject(content));
        MiddlewareList list = new MiddlewareList();
        HasHeaders m = new HasHeaders(new String[]{"X-Test-Header"});
        m.appendAppliesTo(ApplyToType.PUBLIC_API, new Route[]{new Route("/index/main", "GET")});
        list.appendAppMiddleware(m);
        this.middleware = list;
        cache = new AppCache();
        theme = new AloftTheme();
        theme.setUsesBootstrap();
        scriptEndpoints = new JavaScriptEndpointList();
        stylesheetEndpoints = new StylesheetEndpointList();
        if(theme.usesBootstrap()) {
            buildStaticJavaScript();
            cache.addStaticJavascript(scriptEndpoints);
            buildStaticStylesheets();
            cache.addStaticStylesheets(stylesheetEndpoints);
        }
    }

    public AppConfig(String configPath) throws FileNotFoundException {
        File file = new File(configPath);
        if(!file.exists()) throw new RuntimeException("Config does not exist");
        Scanner scnr = new Scanner(file);
        String content = "";
        while(scnr.hasNextLine()) content += scnr.nextLine();
        parseObjects(JSON.getObject(content));
    }

    public ArrayList<HtmlElement> getStaticFiles() {
        ArrayList<HtmlElement> staticFiles = new ArrayList<>();
        for(int i=0; i< scriptEndpoints.size(); i++) {
            staticFiles.add(scriptEndpoints.next().getTag());
        }
        for(int i=0; i< stylesheetEndpoints.size(); i++) {
            staticFiles.add(stylesheetEndpoints.next().getTag());
        }
        return staticFiles;
    }

    public JavaScript getStaticJavaScript(String id) {
        return this.scriptEndpoints.get(id);
    }

    public Stylesheet getStaticStylesheet(String id) {
        return this.stylesheetEndpoints.get(id);
    }

    private void buildStaticJavaScript() {
        ArrayList<String[]> paths = new ArrayList<>();
        if(this.theme.usesBootstrap()) {
            paths.addAll(getBootstrapJsResources());
            ArrayList<File> bootstrapJs = getBootstrapJsList(getBootstrapJsResources());
            for(int i=0; i< bootstrapJs.size(); i++){
                JavaScriptBuilder builder = new JavaScriptBuilder(getBootstrapJsResources().get(i)[1], bootstrapJs.get(i));
                JavaScript js = new JavaScript(JavaScriptWriterType.FILE, builder);
                scriptEndpoints.appendAppScriptEndpoints(js);
            }
        }
    }

    private ArrayList<String[]> getBootstrapJsResources() {
        ArrayList<String[]> resources = new ArrayList<>();
        resources.add(new String[]{"/bootstrap/bootstrap.bundle.js", this.routes.javascript() + "/bootstrap.js"});
        return resources;
    }

    private ArrayList<File> getBootstrapJsList(ArrayList<String[]> resources) {
        return getFiles(resources);
    }

    private void buildStaticStylesheets() {
        ArrayList<String[]> paths = new ArrayList<>();
        if(this.theme.usesBootstrap()) {
            paths.addAll(getBootstrapCssResources());
            ArrayList<File> bootstrapCss = getBootstrapCssList(getBootstrapCssResources());
            for(int i=0; i< bootstrapCss.size(); i++){
                StylesheetBuilder builder = new StylesheetBuilder(getBootstrapCssResources().get(i)[1], bootstrapCss.get(i));
                Stylesheet css = new Stylesheet(StylesheetWriterType.FILE, builder);
                stylesheetEndpoints.appendAppStylesheetEndpoints(css);
            }
        }
    }

    private ArrayList<String[]> getBootstrapCssResources() {
        ArrayList<String[]> resources = new ArrayList<>();
        resources.add(new String[]{"/bootstrap/bootstrap.min.css", this.routes.stylesheets() + "/bootstrap.css"});
        return resources;
    }

    private ArrayList<File> getBootstrapCssList(ArrayList<String[]> resources) {
        return getFiles(resources);
    }

    private ArrayList<File> getFiles(ArrayList<String[]> resources) {
        ArrayList<File> files = new ArrayList<>();
        for(int i=0; i< resources.size();i++) {
            try {
                URL url = this.getClass().getResource(resources.get(i)[0]);
                if (!__.isset(url)) continue;
                files.add(Paths.get(url.toURI()).toFile());
            } catch(Exception ignored) { }
        }
        return files;
    }

    public AloftTheme getTheme() {
        return this.theme;
    }

    public Route getRoute(String path, String requestType) {
        return this.cache.fetchRoute(path, requestType);
    }

    public RoutesConfig getRoutesConfig() {
        return routes;
    }

    private void parseObjects(JSONObject json) {
        JSONObject project = (JSONObject) json.get("project");
        JSONArray modules = (JSONArray) json.get("modules");
        JSONArray middleware = (JSONArray) json.get("middleware");
        JSONObject server = (JSONObject) json.get("server");
        project(project);
        server(server);
    }

    private void project(JSONObject json) {
        this.name = (String) json.get("name");
        this.key = (String) json.get("key");
        this.pkg = (String) json.get("pkg");
    }

    private void server(JSONObject server) {
        routes((JSONObject) server.get("routes"));
    }

    private void routes(JSONObject json) {
        this.routes = new RoutesConfig(json);
    }

}
