package org.extendedweb.aloft.lib.http.supporting;

import org.extendedweb.aloft.lib.application.config.AppConfig;
import org.extendedweb.aloft.lib.html.JsonObjectRenderer;
import org.extendedweb.aloft.lib.http.protocol.responses.base.DefinedResponse;
import org.extendedweb.aloft.lib.lang.structure.AloftPage;
import org.extendedweb.aloft.lib.lang.structure.AloftTheme;
import org.extendedweb.aloft.lib.html.HtmlRenderer;
import org.extendedweb.aloft.lib.html.elements.css.FontEndpoint;
import org.extendedweb.aloft.lib.html.elements.css.FontRenderer;
import org.extendedweb.aloft.lib.html.elements.css.StylesheetEndpoint;
import org.extendedweb.aloft.lib.html.elements.css.StylesheetRenderer;
import org.extendedweb.aloft.lib.html.elements.js.JavaScriptRenderer;
import org.extendedweb.aloft.lib.html.elements.js.ScriptEndpoint;
import org.extendedweb.aloft.lib.lang.structure.components.AloftComponent;
import org.extendedweb.aloft.utils.data.BaseX;
import org.extendedweb.aloft.utils.encryption.SHA;
import org.extendedweb.aloft.utils.global.__;
import com.sun.net.httpserver.HttpExchange;

import java.lang.reflect.Constructor;

public class Route {

    private String id;
    private RoutePath path;

    private String requestTypeStr;
    private RequestType requestType;
    private AloftRequestType aloftRequestType;
    private Class<?> content = null;
    private Object instantiated = null;

    private VariableTree vars;

    public Route(String path, RequestType type, String typeStr) {
        if(!__.isset(type)) return;
        this.path = new RoutePath(path);
        this.requestTypeStr = typeStr;
        this.requestType = type;
        this.id = BaseX.encode64(SHA.Bites.getSha1(typeStr.toUpperCase() + ":" + path));
    }

    public Route(String path, String typeStr) {
        typeStr = typeStr.toUpperCase();
        if(!__.isset(getRequestType(typeStr))) return;
        this.path = new RoutePath(path);
        this.requestTypeStr = typeStr;
        this.requestType = getRequestType(typeStr);
        this.id = BaseX.encode64(SHA.Bites.getSha1(typeStr + ":" + path));
    }

    public Route(String path, String typeStr, Class<? extends AloftPage> content) {
        typeStr = typeStr.toUpperCase();
        if(!__.isset(getRequestType(typeStr))) return;
        this.path = new RoutePath(path);
        this.requestTypeStr = typeStr;
        this.requestType = getRequestType(typeStr);
        this.id = BaseX.encode64(SHA.Bites.getSha1(typeStr + ":" + path));
        this.content = content;
    }

    public Route(String path, String typeStr, Object instantiated) {
        typeStr = typeStr.toUpperCase();
        if(!__.isset(getRequestType(typeStr))) return;
        this.path = new RoutePath(path);
        this.requestTypeStr = typeStr;
        this.requestType = getRequestType(typeStr);
        this.id = BaseX.encode64(SHA.Bites.getSha1(typeStr + ":" + path));
        this.instantiated = instantiated;
    }

    public Route(String path, RequestType type, String typeStr, VariableTree vars) {
        if(!__.isset(type)) return;
        this.path = new RoutePath(path, vars);
        this.requestTypeStr = typeStr;
        this.requestType = type;
        this.id = BaseX.encode64(SHA.Bites.getSha1(typeStr.toUpperCase() + ":" + path));
        this.vars = vars;
    }

    public Route(String path, String typeStr, VariableTree vars) {
        typeStr = typeStr.toUpperCase();
        if(!__.isset(getRequestType(typeStr))) return;
        this.path = new RoutePath(path, vars);
        this.requestTypeStr = typeStr;
        this.requestType = getRequestType(typeStr);
        this.id = BaseX.encode64(SHA.Bites.getSha1(typeStr + ":" + path));
        this.vars = vars;
    }

    public Route(String path, String typeStr, VariableTree vars, Class<?> content) {
        typeStr = typeStr.toUpperCase();
        if(!__.isset(getRequestType(typeStr))) return;
        this.path = new RoutePath(path, vars);
        this.requestTypeStr = typeStr;
        this.requestType = getRequestType(typeStr);
        this.id = BaseX.encode64(SHA.Bites.getSha1(typeStr + ":" + path));
        this.vars = vars;
        this.content = content;
    }

    public String getId() {
        return this.id;
    }

    public Object instantiate() throws Exception {
        if(__.isset(instantiated)) return instantiated;
        Constructor<?> construct = content.getConstructor();
        return construct.newInstance();
    }

    public Response go(HttpExchange t, Endpoint endpoint, AloftTheme theme, AppConfig config) {
//        if(endpoint instanceof DefinedResponse)
//            return JsonObjectRenderer.render((DefinedResponse) endpoint).get(t);
        if(endpoint.getClass() == AloftPage.class)
            return HtmlRenderer.render((AloftPage) endpoint, theme, config).get(t);
        if(endpoint.getClass() == ScriptEndpoint.class)
            return JavaScriptRenderer.render((ScriptEndpoint) endpoint).get(t);
        if(endpoint.getClass() == StylesheetEndpoint.class)
            return StylesheetRenderer.render((StylesheetEndpoint) endpoint).get(t);
        if(endpoint.getClass() == FontEndpoint.class)
            return FontRenderer.render((FontEndpoint) endpoint).get(t);
        return new Response(t, "Page not found", 404);
    }

    public RequestType getRequestType() {
        return requestType;
    }

    public String getRequestTypeString() {
        return requestTypeStr.toUpperCase();
    }

    public RoutePath getPath() {
        return path;
    }

    private RequestType getRequestType(String reqType) {
        if(__.same(reqType, "GET")) return RequestType.GET;
        if(__.same(reqType, "POST")) return RequestType.POST;
        if(__.same(reqType, "PUT")) return RequestType.PUT;
        if(__.same(reqType, "PATCH")) return RequestType.PATCH;
        if(__.same(reqType, "DELETE")) return RequestType.DELETE;
        if(__.same(reqType, "OPTIONS")) return RequestType.OPTIONS;
        return null;
    }

}
