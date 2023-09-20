package com.inteliense.aloft.server.api;

import com.inteliense.aloft.server.http.supporting.*;

public class ApiEndpoint extends Endpoint {
    public ApiEndpoint(Route route, RequestType type, AloftRequestType internalType, VariableTree vars) {
        super(route, type, internalType, vars);
    }
}
