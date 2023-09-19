package com.inteliense.aloft.server.http.debug;

import com.inteliense.aloft.application.config.AppConfig;
import com.inteliense.aloft.compiler.lang.keywords.listeners.base.AloftListener;
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
            //test(t);
            app(t);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private void test(HttpExchange t) throws Exception {
        TextAloftElement textElement = new TextAloftElement("Hello World!\n\nSincerely yours,\n- Server.") {
            @Override
            protected AloftListener[] listeners() {
                return new AloftListener[0];
            }
        };
        String response = HtmlRenderer.render(textElement).get();
        t.sendResponseHeaders(200, response.length());
        OutputStream os = t.getResponseBody();
        os.write(response.getBytes());
        os.close();
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
