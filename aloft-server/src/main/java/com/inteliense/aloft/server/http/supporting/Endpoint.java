package com.inteliense.aloft.server.http.supporting;

import com.inteliense.aloft.compiler.lang.keywords.AloftPage;

public class Endpoint {

    private String path;
    private RequestType type;
    private AloftRequestType internalType;
    private StateVariableNode vars;

    public static Endpoint create(Route route, RequestType type, AloftRequestType internalType, StateVariableNode vars) {
        return new AloftPage(route);
    }

}
