package com.inteliense.aloft.server.html;

import com.inteliense.aloft.server.http.supporting.Response;
import com.sun.net.httpserver.HttpExchange;

public class StaticSourceFile {

    private String id;
    private String content;
    private String contentType;

    public StaticSourceFile(String id, String content, String contentType) {
        this.id = id;
        this.content = content;
        this.contentType = contentType;
    }

    public Response get(HttpExchange t) {
        Response resp = new Response(t, content, 200);
        resp.addHeader("Content-Type", contentType);
        return resp;
    }

}
