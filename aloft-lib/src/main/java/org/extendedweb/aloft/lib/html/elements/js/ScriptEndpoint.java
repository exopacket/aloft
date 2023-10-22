package org.extendedweb.aloft.lib.html.elements.js;

import org.extendedweb.aloft.lib.application.config.AppConfig;
import org.extendedweb.aloft.lib.http.supporting.*;

public class ScriptEndpoint extends Endpoint {

    private JavaScript script;

    public ScriptEndpoint(Route route, RequestType type, AloftRequestType internalType, VariableTree vars, JavaScript js) {
        super(route, type, internalType, vars);
        this.script = js;
    }

    public ScriptEndpoint(Route route, RequestType type, AloftRequestType internalType, VariableTree vars) {
        super(route, type, internalType, vars);
    }

    public ScriptEndpoint(Route route, RequestType type, AloftRequestType internalType, VariableTree vars, AppConfig config) {
        super(route, type, internalType, vars, config);
    }

    public JavaScript getScript() {
        return script;
    }

}
