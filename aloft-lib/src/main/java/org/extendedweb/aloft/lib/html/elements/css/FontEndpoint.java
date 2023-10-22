package org.extendedweb.aloft.lib.html.elements.css;

import org.extendedweb.aloft.lib.application.config.AppConfig;
import org.extendedweb.aloft.lib.html.elements.js.JavaScript;
import org.extendedweb.aloft.lib.http.supporting.*;

public class FontEndpoint extends Endpoint {

    private Font font;

    public FontEndpoint(Route route, RequestType type, AloftRequestType internalType, VariableTree vars, Font font) {
        super(route, type, internalType, vars);
        this.font = font;
    }

    public FontEndpoint(Route route, RequestType type, AloftRequestType internalType, VariableTree vars) {
        super(route, type, internalType, vars);
    }

    public FontEndpoint(Route route, RequestType type, AloftRequestType internalType, VariableTree vars, AppConfig config) {
        super(route, type, internalType, vars, config);
    }

    public Font getFont() {
        return font;
    }

}
