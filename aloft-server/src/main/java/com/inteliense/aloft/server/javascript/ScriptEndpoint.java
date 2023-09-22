package com.inteliense.aloft.server.javascript;

import com.inteliense.aloft.compiler.lang.keywords.AloftTheme;
import com.inteliense.aloft.server.html.elements.js.JavaScript;
import com.inteliense.aloft.server.http.supporting.*;

public class ScriptEndpoint extends Endpoint {

    private JavaScript script;

    public ScriptEndpoint(Route route, RequestType type, AloftRequestType internalType, VariableTree vars) {
        super(route, type, internalType, vars);
    }

    public ScriptEndpoint(Route route, RequestType type, AloftRequestType internalType, VariableTree vars, AloftTheme theme) {
        super(route, type, internalType, vars, theme);
    }

    public JavaScript getScript() {
        return script;
    }

}
