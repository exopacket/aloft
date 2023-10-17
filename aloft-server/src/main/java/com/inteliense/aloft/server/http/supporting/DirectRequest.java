package com.inteliense.aloft.server.http.supporting;

import com.inteliense.aloft.application.config.AppConfig;
import com.inteliense.aloft.application.config.MiddlewareList;
import com.inteliense.aloft.compiler.lang.lib._AloftProject;
import com.inteliense.aloft.server.client.ClientInfo;
import com.inteliense.aloft.server.http.middleware.base.MiddlewareResultCollection;
import com.inteliense.aloft.utils.global.__;
import com.sun.net.httpserver.HttpExchange;
import org.json.simple.JSONObject;

public class DirectRequest {

    private HttpExchange t;
    private HeaderList headers;
    private ClientInfo client;
    private AppConfig config;
    private AloftRequestType internalRequestType;
    private RequestType requestType;
    private Route route;
    private Endpoint endpoint;
    private boolean exited = false;

    public DirectRequest(HttpExchange t, HeaderList headers, ClientInfo client, AppConfig config) {
        this.t = t;
        this.headers = headers;
        this.client = client;
        this.config = config;
        String path = t.getRequestURI().getPath();
        if(path.length() > 256) exit("Request.js path length is too large.", 403);
        this.requestType = getRequestType();
        this.internalRequestType = getInternalRequestType(path);
        this.route = config.getRoute(path, t.getRequestMethod().toUpperCase());
        if(!__.isset(this.route)) exit("Page not found.", 404);
        try {
            this.endpoint = Endpoint.create(path, route, requestType, internalRequestType, config);
        } catch (Exception e) {
            e.printStackTrace();
            exit("Server error", 500);
        }
    }

    private RequestParams buildParams() {
        return new RequestParams(
                t.getRequestBody(),
                this.route,
                t.getRequestURI(),
                t.getProtocol(),
                t.getHttpContext(),
                headers,
                client,
                internalRequestType,
                requestType
        );
    }

    private MiddlewareResultCollection middleware() {
        MiddlewareList middlewareList = this.config.getMiddleware();
        RequestParams params = buildParams();
        return middlewareList.validateAgainstMiddleware(params);
    }

    private AloftRequestType getInternalRequestType(String path) {
        return AloftRequestTypeParser.get(headers, path, requestType, config);
    }

    private RequestType getRequestType() {
        String reqType = t.getRequestMethod().toUpperCase();
        if(__.same(reqType, "GET")) return RequestType.GET;
        if(__.same(reqType, "POST")) return RequestType.POST;
        if(__.same(reqType, "PUT")) return RequestType.PUT;
        if(__.same(reqType, "PATCH")) return RequestType.PATCH;
        if(__.same(reqType, "DELETE")) return RequestType.DELETE;
        if(__.same(reqType, "OPTIONS")) return RequestType.OPTIONS;
        return null;
    }

    private void exit(String message, int code) {
        exited = true;
        (new Response(t, message, code)).send();
    }

    private void exit(String[] stacktrace, int code) {
        exited = true;
        (new Response(t, stacktrace, code)).send();
    }

    private void exit(JSONObject json, int code) {
        exited = true;
        (new Response(t, json, code)).send();
    }

    public boolean validate() {
        MiddlewareResultCollection middlewareResult = middleware();
        if(!middlewareResult.passed()) exit(middlewareResult.getJson(), middlewareResult.getCode());
        return !exited;
    }

    public Response get() {
        if(exited) return null;
        return this.route.go(t, endpoint, config.getTheme());
    }

}
