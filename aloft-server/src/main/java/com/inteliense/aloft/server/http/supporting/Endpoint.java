package com.inteliense.aloft.server.http.supporting;

import com.inteliense.aloft.compiler.lang.keywords.AloftPage;

public class Endpoint {

    protected String path;
    protected RequestType type;
    protected AloftRequestType internalType;
    protected VariableTree vars;

    public Endpoint(Route route, RequestType type, AloftRequestType internalType, VariableTree vars) {
        this.path = route.getPath();
        this.type = type;
        this.internalType = internalType;
        this.vars = vars;
    }

    public static Endpoint create(Route route, RequestType type, AloftRequestType internalType, VariableTree vars) {
        return new AloftPage(route, type, internalType, vars);
    }

}
