package com.inteliense.aloft.server.http.debug;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.OutputStream;

public class DebugServerHandler implements HttpHandler {
    @Override
    public void handle(HttpExchange t) throws IOException {
        String response = "Hello World!\n\nSincerely yours,\n- Server.";
        t.sendResponseHeaders(200, response.length());
        OutputStream os = t.getResponseBody();
        os.write(response.getBytes());
        os.close();
    }
}
