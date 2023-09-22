package com.inteliense.aloft.server.html.elements.js;

import com.inteliense.aloft.application.config.AppConfig;
import com.inteliense.aloft.compiler.lang.keywords.AloftTheme;
import com.inteliense.aloft.server.html.elements.js.JavaScript;
import com.inteliense.aloft.server.http.supporting.*;

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
