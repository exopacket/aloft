package org.extendedweb.aloft.lib.html.elements.css;

import org.extendedweb.aloft.lib.application.config.AppConfig;
import org.extendedweb.aloft.lib.client.ClientInfo;
import org.extendedweb.aloft.lib.client.ClientSession;
import org.extendedweb.aloft.lib.html.elements.js.JavaScript;
import org.extendedweb.aloft.lib.http.supporting.*;

public class FontEndpoint extends Endpoint {

    private Font font;

    public FontEndpoint(RequestParams params, AppConfig config, Font font) {
        super(params, config);
        this.font = font;
    }

    public Font getFont() {
        return font;
    }

}
