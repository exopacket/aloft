package com.inteliense.aloft.server.http.supporting;

import com.inteliense.aloft.application.config.AppConfig;
import com.inteliense.aloft.compiler.lang.keywords.AloftPage;
import com.inteliense.aloft.compiler.lang.keywords.AloftTheme;
import com.inteliense.aloft.server.html.elements.HtmlElement;
import com.inteliense.aloft.server.html.elements.css.StylesheetEndpoint;
import com.inteliense.aloft.server.html.elements.js.ScriptEndpoint;

import java.util.ArrayList;

public class Endpoint {

    protected RoutePath path;
    protected RequestType type;
    protected AloftRequestType internalType;
    protected VariableTree vars;
    protected AloftTheme theme;
    protected ArrayList<HtmlElement> staticFiles;

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
    }


    public static Endpoint create(String requestPath, Route route, RequestType type, AloftRequestType internalType) {
        return new AloftPage(route, type, internalType, route.getPath().getVariables(requestPath));
    }

    public static Endpoint create(String requestPath, Route route, RequestType type, AloftRequestType internalType, AppConfig config) {
        if(internalType == AloftRequestType.JAVASCRIPT_FILE) return new ScriptEndpoint(route, type, internalType, route.getPath().getVariables(requestPath), config.getStaticJavaScript(route.getPath().getPathString()));
        if(internalType == AloftRequestType.STYLESHEET_FILE) return new StylesheetEndpoint(route, type, internalType, route.getPath().getVariables(requestPath), config.getStaticStylesheet(route.getPath().getPathString()));
        return new AloftPage(route, type, internalType, route.getPath().getVariables(requestPath), config);
    }

    public RoutePath getPath() {
        return path;
    }
}
