package org.extendedweb.aloft.server.base.http;

import org.extendedweb.aloft.lib._AloftProject;
import org.extendedweb.aloft.lib.http.supporting.Request;
import org.extendedweb.aloft.lib.http.supporting.Response;
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
            e.printStackTrace();
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
