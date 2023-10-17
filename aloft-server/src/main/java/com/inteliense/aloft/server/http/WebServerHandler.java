package com.inteliense.aloft.server.http;

import com.inteliense.aloft.compiler.lang.lib._AloftProject;
import com.inteliense.aloft.server.http.supporting.Request;
import com.inteliense.aloft.server.http.supporting.Response;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;

public class WebServerHandler implements HttpHandler {

    private _AloftProject project;

    public WebServerHandler(_AloftProject project) {
        this.project = project;
    }

    @Override
    public void handle(HttpExchange t) throws IOException {
        try {
            app(t);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private void app(HttpExchange t) {
        Request req = new Request(t, project.getConfig());
        if(req.validated()) {
            Response resp = req.handle();
            if(resp != null) resp.send();
        } else {
            (new Response(t, "[500] Internal server error.", 500)).send();
        }
    }
}
