package org.extendedweb.aloft.lib.html.elements.css;

import org.extendedweb.aloft.lib.application.config.AppConfig;
import org.extendedweb.aloft.lib.http.supporting.*;

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
