package org.extendedweb.aloft.lib.html;

import org.extendedweb.aloft.lib.http.supporting.Response;
import com.sun.net.httpserver.HttpExchange;

public class StaticSourceFile {

    private String id;
    private String content;
    private byte[] data;
    private String contentType;
    private boolean binary = false;

    public StaticSourceFile(String id, String content, String contentType) {
        this.id = id;
        this.content = content;
        this.contentType = contentType;
    }

    public StaticSourceFile(String id, byte[] bytes, String contentType) {
        this.id = id;
        this.data = bytes;
        this.binary = true;
        this.contentType = contentType;
    }

    public Response get(HttpExchange t) {
        Response resp = (binary) ? new Response(t, data, 200) : new Response(t, content, 200);
        resp.addHeader("Content-Type", contentType);
        return resp;
    }

}
