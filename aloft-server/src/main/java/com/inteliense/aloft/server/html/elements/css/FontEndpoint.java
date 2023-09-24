package com.inteliense.aloft.server.html.elements.css;

import com.inteliense.aloft.application.config.AppConfig;
import com.inteliense.aloft.server.html.elements.js.JavaScript;
import com.inteliense.aloft.server.http.supporting.*;

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
