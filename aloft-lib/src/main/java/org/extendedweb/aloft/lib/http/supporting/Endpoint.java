package org.extendedweb.aloft.lib.http.supporting;

import org.extendedweb.aloft.lib.application.config.AppConfig;
import org.extendedweb.aloft.lib.client.ClientInfo;
import org.extendedweb.aloft.lib.client.ClientSession;
import org.extendedweb.aloft.lib.http.protocol.responses.defined.ApplicationInfoResponse;
import org.extendedweb.aloft.lib.lang.structure.AloftPage;
import org.extendedweb.aloft.lib.lang.structure.AloftTheme;
import org.extendedweb.aloft.lib._AloftPage;
import org.extendedweb.aloft.lib.tests._TestProject;
import org.extendedweb.aloft.lib.html.elements.HtmlElement;
import org.extendedweb.aloft.lib.html.elements.css.FontEndpoint;
import org.extendedweb.aloft.lib.html.elements.css.StylesheetEndpoint;
import org.extendedweb.aloft.lib.html.elements.js.AppJavaScript;
import org.extendedweb.aloft.lib.html.elements.js.ScriptEndpoint;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

public class Endpoint {

    protected RoutePath path;
    protected RequestType type;
    protected AloftRequestType internalType;
    protected VariableTree vars;
    protected AloftTheme theme;
    protected ArrayList<HtmlElement> staticFiles;
    protected AtomicReference<AppJavaScript> js;
    protected AppConfig config;
    protected RequestParams params;

    public Endpoint(RequestParams params, AppConfig config) {
        this.path = params.route().getPath();
        this.type = params.getRequestType();
        this.internalType = params.getInternalRequestType();
        this.vars = params.route().getPath().getVariables(params.getUriString());
        this.theme = config.getTheme();
        this.staticFiles = config.getStaticFiles();
        this.js = config.getAppJs();
        this.config = config;
        this.params = params;
    }

    public static Endpoint create(RequestParams params, AppConfig config) throws Exception {
        AloftRequestType internalType = params.getInternalRequestType();
        if(internalType == AloftRequestType.JAVASCRIPT_FILE) return new ScriptEndpoint(params, config, config.getStaticJavaScript(params.route().getPath().getPathString()));
        if(internalType == AloftRequestType.STYLESHEET_FILE) return new StylesheetEndpoint(params, config, config.getStaticStylesheet(params.route().getPath().getPathString()));
        if(internalType == AloftRequestType.FONT_FILE) return new FontEndpoint(params, config, config.getStaticFont(params.route().getPath().getPathString()));
        if(internalType == AloftRequestType.SERVER_SIDE_RENDERING) return new AloftPage(params, config, ((_AloftPage) params.route().instantiate()).getRoot());
        if(internalType == AloftRequestType.APPLICATION_INFO) return new ApplicationInfoResponse(params, config);
        return null;
    }

    public RoutePath getPath() {
        return path;
    }
}
