package org.extendedweb.aloft.server.base.api;

import org.extendedweb.aloft.lib.http.supporting.*;

public class StateEndpoint extends Endpoint {
    public StateEndpoint(String requestPath, Route route, RequestType type, AloftRequestType internalType, VariableTree vars) {
        super(route, type, internalType, vars);
    }
}
