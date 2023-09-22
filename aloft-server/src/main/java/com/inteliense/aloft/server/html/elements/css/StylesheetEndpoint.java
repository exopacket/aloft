package com.inteliense.aloft.server.html.elements.css;

import com.inteliense.aloft.application.config.AppConfig;
import com.inteliense.aloft.compiler.lang.keywords.AloftTheme;
import com.inteliense.aloft.server.http.supporting.*;

public class StylesheetEndpoint extends Endpoint {

    private Stylesheet stylesheet;

    public StylesheetEndpoint(Route route, RequestType type, AloftRequestType internalType, VariableTree vars, Stylesheet css) {
        super(route, type, internalType, vars);
        this.stylesheet = css;
    }

    public StylesheetEndpoint(Route route, RequestType type, AloftRequestType internalType, VariableTree vars) {
        super(route, type, internalType, vars);
    }

    public StylesheetEndpoint(Route route, RequestType type, AloftRequestType internalType, VariableTree vars, AppConfig config) {
        super(route, type, internalType, vars, config);
    }

    public Stylesheet getStylesheet() {
        return stylesheet;
    }

}
