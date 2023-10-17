package com.inteliense.aloft.server.http.debug;

import com.inteliense.aloft.application.config.AppConfig;
import com.inteliense.aloft.compiler.lang.keywords.elements.types.TextAloftElement;
import com.inteliense.aloft.server.html.HtmlRenderer;
import com.inteliense.aloft.server.http.supporting.Request;
import com.inteliense.aloft.server.http.supporting.Response;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.OutputStream;

public class DebugServerHandler implements HttpHandler {

    private AppConfig config;

    public DebugServerHandler(AppConfig config) { this.config = config; }

    @Override
    public void handle(HttpExchange t) throws IOException {
        try {
            app(t);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private void app(HttpExchange t) {
        Request req = new Request(t, config);
        if(req.validated()) {
            Response resp = req.handle();
            if(resp != null) resp.send();
        } else {
            (new Response(t, "[500] Internal server error.", 500)).send();
        }
    }

}
