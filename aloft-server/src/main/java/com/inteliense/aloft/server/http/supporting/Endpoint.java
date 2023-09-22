package com.inteliense.aloft.server.http.supporting;

import com.inteliense.aloft.compiler.lang.keywords.AloftPage;
import com.inteliense.aloft.compiler.lang.keywords.AloftTheme;

public class Endpoint {

    protected RoutePath path;
    protected RequestType type;
    protected AloftRequestType internalType;
    protected VariableTree vars;
    protected AloftTheme theme;

    public Endpoint(Route route, RequestType type, AloftRequestType internalType, VariableTree vars) {
        this.path = route.getPath();
        this.type = type;
        this.internalType = internalType;
        this.vars = vars;
    }

    public Endpoint(Route route, RequestType type, AloftRequestType internalType, VariableTree vars, AloftTheme theme) {
        this.path = route.getPath();
        this.type = type;
        this.internalType = internalType;
        this.vars = vars;
        this.theme = theme;
    }

    public static Endpoint create(String requestPath, Route route, RequestType type, AloftRequestType internalType) {
        return new AloftPage(route, type, internalType, route.getPath().getVariables(requestPath));
    }

    public static Endpoint create(String requestPath, Route route, RequestType type, AloftRequestType internalType, AloftTheme theme) {
        return new AloftPage(route, type, internalType, route.getPath().getVariables(requestPath), theme);
    }

}
