package org.extendedweb.aloft.server.base.api;

import org.extendedweb.aloft.lib.http.supporting.*;

public class ApiEndpoint extends Endpoint {
    public ApiEndpoint(String requestPath, Route route, RequestType type, AloftRequestType internalType, VariableTree vars) {
        super(route, type, internalType, vars);
    }
}
