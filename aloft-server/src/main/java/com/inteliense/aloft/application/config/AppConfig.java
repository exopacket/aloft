package com.inteliense.aloft.application.config;

import com.inteliense.aloft.server.http.middleware.base.ApplyToType;
import com.inteliense.aloft.server.http.middleware.types.HasHeaders;
import com.inteliense.aloft.server.http.supporting.Route;
import com.inteliense.aloft.utils.data.JSON;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.File;
import java.io.FileNotFoundException;
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

    //MIDDLEWARE
    private MiddlewareList middleware;

    public MiddlewareList getMiddleware() { return this.middleware; }

    public AppConfig() {
        //FIXME ....FOR TESTING
        MiddlewareList list = new MiddlewareList();
        HasHeaders m = new HasHeaders(new String[]{"X-Test-Header"});
        m.appendAppliesTo(ApplyToType.PUBLIC_API, new Route[]{new Route("/index/main", "GET")});
        list.appendAppMiddleware(m);
        this.middleware = list;
    }

    public AppConfig(String configPath) throws FileNotFoundException {
        File file = new File(configPath);
        if(!file.exists()) throw new RuntimeException("Config does not exist");
        Scanner scnr = new Scanner(file);
        String content = "";
        while(scnr.hasNextLine()) content += scnr.nextLine();
        parseObjects(JSON.getObject(content));
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
