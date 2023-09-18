package com.inteliense.aloft.server.http.supporting;

import com.inteliense.aloft.compiler.application.config.AppConfig;
import com.inteliense.aloft.server.client.ClientInfo;
import com.sun.net.httpserver.HttpExchange;
import org.json.simple.JSONObject;

public class DirectRequest {

    private HttpExchange t;

    public DirectRequest(HttpExchange t, HeaderList headers, ClientInfo client, AppConfig config) {
        this.t = t;
    }

    private void exit(String message, int code) {
        (new Response(t, message, code)).send();
    }

    private void exit(String[] stacktrace, int code) {
        (new Response(t, stacktrace, code)).send();
    }

    private void exit(JSONObject json, int code) {
        (new Response(t, json, code)).send();
    }

    public boolean validate() {
        return true;
    }

    public Response get() {
        return new Response(t, "Hello World", 200);
    }

}
