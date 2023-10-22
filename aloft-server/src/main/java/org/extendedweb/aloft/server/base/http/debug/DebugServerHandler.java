package org.extendedweb.aloft.server.base.http.debug;

import org.extendedweb.aloft.lib.application.config.AppConfig;
import org.extendedweb.aloft.lib.lang.structure.elements.types.TextAloftElement;
import org.extendedweb.aloft.lib.html.HtmlRenderer;
import org.extendedweb.aloft.lib.http.supporting.Request;
import org.extendedweb.aloft.lib.http.supporting.Response;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;

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
