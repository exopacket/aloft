package com.inteliense.aloft.server.http.supporting;

import com.inteliense.aloft.compiler.application.config.AppConfig;
import com.inteliense.aloft.server.client.ClientInfo;
import com.sun.net.httpserver.HttpExchange;

public class Request {

    private HttpExchange t;
    private ClientInfo client;
    private HeaderList headers;
    private DirectRequest location;
    private boolean validated = false;
    private AppConfig config;

    public Request(HttpExchange t, AppConfig config) {
        this.t = t;
        this.config = config;
        this.headers = HeaderParser.getHeaders(t);
        this.client = ClientParser.getClientInfo(t, this.headers);
        this.location = new DirectRequest(t, this.headers, this.client, this.config);
        this.validated = true;
    }

    public Response handle() {
        if(this.validated)
            return this.location.get();
        return null;
    }

    public boolean validated() {
        return this.validated;
    }

}
