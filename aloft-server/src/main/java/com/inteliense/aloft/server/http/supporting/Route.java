package com.inteliense.aloft.server.http.supporting;

import com.inteliense.aloft.compiler.lang.keywords.AloftPage;
import com.inteliense.aloft.server.html.HtmlRenderer;
import com.inteliense.aloft.utils.data.BaseX;
import com.inteliense.aloft.utils.encryption.SHA;
import com.inteliense.aloft.utils.global.__;
import com.sun.net.httpserver.HttpExchange;

public class Route {

    private String id;
    private RoutePath path;

    private String requestTypeStr;
    private RequestType requestType;
    private AloftRequestType aloftRequestType;

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

    public String getId() {
        return this.id;
    }

    public Response go(HttpExchange t, Endpoint endpoint) {
        if(endpoint.getClass() == AloftPage.class)
            return HtmlRenderer.render((AloftPage) endpoint).get(t);
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
