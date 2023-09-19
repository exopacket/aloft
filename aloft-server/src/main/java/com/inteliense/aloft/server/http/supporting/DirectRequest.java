package com.inteliense.aloft.server.http.supporting;

import com.inteliense.aloft.compiler.application.config.AppConfig;
import com.inteliense.aloft.compiler.application.config.MiddlewareList;
import com.inteliense.aloft.server.client.ClientInfo;
import com.inteliense.aloft.server.http.middleware.base.MiddlewareResultCollection;
import com.sun.net.httpserver.HttpExchange;
import org.json.simple.JSONObject;

public class DirectRequest {

    private HttpExchange t;
    private HeaderList headers;
    private ClientInfo client;
    private AppConfig config;
    private AloftRequestType internalRequestType;
    private RequestType requestType;
    private boolean exited = false;

    public DirectRequest(HttpExchange t, HeaderList headers, ClientInfo client, AppConfig config) {
        this.t = t;
        this.headers = headers;
        this.client = client;
        this.config = config;
        this.requestType = getRequestType();
        this.internalRequestType = getInternalRequestType();
    }

    private RequestParams buildParams() {
        return new RequestParams(
                t.getRequestBody(),
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

    private AloftRequestType getInternalRequestType() {
        return AloftRequestType.PUBLIC_API;
    }

    private RequestType getRequestType() {
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
        return new Response(t, "Hello World", 200);
    }

}
