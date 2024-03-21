package org.extendedweb.aloft.lib.html;

import org.extendedweb.aloft.lib.http.supporting.Response;
import com.sun.net.httpserver.HttpExchange;
import org.extendedweb.aloft.utils.encryption.SHA;

public class StaticSourceFile {

    private String id;
    private String content = "";
    private byte[] data;
    private String contentType;
    private boolean binary = false;

    public StaticSourceFile(String id, String filepath, String contentType) {
        this.id = SHA.getSha1(id);
        this.content = filepath;
        this.contentType = contentType;
    }

    public StaticSourceFile(String id, byte[] bytes, String contentType) {
        this.id = SHA.getSha1(id);
        this.data = bytes;
        this.binary = true;
        this.contentType = contentType;
    }

    public Response get(HttpExchange t) {
        Response resp = (binary) ? new Response(t, data, 200) : new Response(t, content, 200);
        System.out.println(" == " + contentType);
        resp.addHeader("Content-Type", contentType);
        return resp;
    }

}
