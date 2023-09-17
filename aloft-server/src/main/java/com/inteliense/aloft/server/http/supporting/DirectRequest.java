package com.inteliense.aloft.server.http.supporting;

import com.inteliense.aloft.compiler.application.config.AppConfig;
import com.inteliense.aloft.server.client.ClientInfo;
import com.sun.net.httpserver.HttpExchange;

public class DirectRequest {

    private HttpExchange t;

    public DirectRequest(HttpExchange t, HeaderList headers, ClientInfo client, AppConfig config) {
        this.t = t;
    }

    public Response get() {
        return new Response(t);
    }

}
