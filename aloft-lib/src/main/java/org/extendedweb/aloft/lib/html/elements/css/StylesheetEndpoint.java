package org.extendedweb.aloft.lib.html.elements.css;

import org.extendedweb.aloft.lib.application.config.AppConfig;
import org.extendedweb.aloft.lib.client.ClientInfo;
import org.extendedweb.aloft.lib.client.ClientSession;
import org.extendedweb.aloft.lib.http.supporting.*;

public class StylesheetEndpoint extends Endpoint {

    private Stylesheet stylesheet;

    public StylesheetEndpoint(RequestParams params, AppConfig config, Stylesheet css) {
        super(params, config);
        this.stylesheet = css;
    }

    public Stylesheet getStylesheet() {
        return stylesheet;
    }

}
