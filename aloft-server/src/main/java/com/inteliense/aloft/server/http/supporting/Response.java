package com.inteliense.aloft.server.http.supporting;

import com.sun.net.httpserver.HttpExchange;

import java.io.OutputStream;

public class Response {

    private HttpExchange t;
    private int code;
    private String content;
    private int len;

    public Response(HttpExchange t) {

    }

    public boolean send() {
        try {
            t.sendResponseHeaders(code, len);
            OutputStream os = t.getResponseBody();
            os.write(content.getBytes());
            os.close();
            return true;
        } catch (Exception e) { return false; }
    }

}
