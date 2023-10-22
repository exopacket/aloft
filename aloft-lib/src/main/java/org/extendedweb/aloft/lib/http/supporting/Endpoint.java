package org.extendedweb.aloft.lib.http.supporting;

import org.extendedweb.aloft.lib.application.config.AppConfig;
import org.extendedweb.aloft.lib.lang.structure.AloftPage;
import org.extendedweb.aloft.lib.lang.structure.AloftTheme;
import org.extendedweb.aloft.lib._AloftPage;
import org.extendedweb.aloft.lib.tests._TestProject;
import org.extendedweb.aloft.lib.html.elements.HtmlElement;
import org.extendedweb.aloft.lib.html.elements.css.FontEndpoint;
import org.extendedweb.aloft.lib.html.elements.css.StylesheetEndpoint;
import org.extendedweb.aloft.lib.html.elements.js.AppJavaScript;
import org.extendedweb.aloft.lib.html.elements.js.ScriptEndpoint;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

public class Endpoint {

    protected RoutePath path;
    protected RequestType type;
    protected AloftRequestType internalType;
    protected VariableTree vars;
    protected AloftTheme theme;
    protected ArrayList<HtmlElement> staticFiles;
    protected AtomicReference<AppJavaScript> js;

    public Endpoint(Route route, RequestType type, AloftRequestType internalType, VariableTree vars) {
        this.path = route.getPath();
        this.type = type;
        this.internalType = internalType;
        this.vars = vars;
    }

    public Endpoint(Route route, RequestType type, AloftRequestType internalType, VariableTree vars, AppConfig config) {
        this.path = route.getPath();
        this.type = type;
        this.internalType = internalType;
        this.vars = vars;
        this.theme = config.getTheme();
        this.staticFiles = config.getStaticFiles();
        this.js = config.getAppJs();
    }

    public static Endpoint create(String requestPath, Route route, RequestType type, AloftRequestType internalType, AppConfig config) throws Exception {
        if(internalType == AloftRequestType.JAVASCRIPT_FILE) return new ScriptEndpoint(route, type, internalType, route.getPath().getVariables(requestPath), config.getStaticJavaScript(route.getPath().getPathString()));
        if(internalType == AloftRequestType.STYLESHEET_FILE) return new StylesheetEndpoint(route, type, internalType, route.getPath().getVariables(requestPath), config.getStaticStylesheet(route.getPath().getPathString()));
        if(internalType == AloftRequestType.FONT_FILE) return new FontEndpoint(route, type, internalType, route.getPath().getVariables(requestPath), config.getStaticFont(route.getPath().getPathString()));
        if(internalType == AloftRequestType.SERVER_SIDE_RENDERING) return new AloftPage(route, type, internalType, route.getPath().getVariables(requestPath), config, ((_AloftPage) route.instantiate()).getRoot());
        return new AloftPage(route, type, internalType, route.getPath().getVariables(requestPath), config);
    }

    public static Endpoint create(String requestPath, Route route, RequestType type, AloftRequestType internalType, AppConfig config, String[] componentPath) {
        return new AloftPage(route, type, internalType, route.getPath().getVariables(requestPath), config);
    }

    public RoutePath getPath() {
        return path;
    }
}
