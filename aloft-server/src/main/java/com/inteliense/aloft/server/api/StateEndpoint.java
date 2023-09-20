package com.inteliense.aloft.server.api;

import com.inteliense.aloft.server.http.supporting.*;

public class StateEndpoint extends Endpoint {
    public StateEndpoint(String requestPath, Route route, RequestType type, AloftRequestType internalType, VariableTree vars) {
        super(route, type, internalType, vars);
    }
}
