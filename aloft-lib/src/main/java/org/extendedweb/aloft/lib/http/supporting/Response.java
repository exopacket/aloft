package org.extendedweb.aloft.lib.http.supporting;

import org.extendedweb.aloft.utils.data.JSON;
import com.sun.net.httpserver.HttpExchange;
import org.json.simple.JSONObject;

import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class Response {

    private HttpExchange t;
    private int code;
    private String content;
    private byte[] bytes;
    private boolean binary = false;
    private HeaderList headers = new HeaderList();

    public Response(HttpExchange t, String content, int code) {
        this.t = t;
        this.code = code;
        this.content = content;
    }

    public Response(HttpExchange t, byte[] bytes, int code) {
        this.t = t;
        this.code = code;
        this.bytes = bytes;
        this.binary = true;
    }

    public Response(HttpExchange t, String[] content, int code) {
        this.t = t;
        this.code = code;
        this.content = strFromArr(content);
    }

    public Response(HttpExchange t, JSONObject content, int code) {
        this.t = t;
        this.code = code;
        this.content = JSON.getString(content);
    }

    public boolean send() {
        try {
            headers.appendResponse(t.getResponseHeaders());
            t.sendResponseHeaders(code, 0);
            OutputStream os = t.getResponseBody();
            if(!binary) os.write(content.getBytes(StandardCharsets.UTF_8));
            else os.write(bytes);
            os.close();
            return true;
        } catch (Exception e) { e.printStackTrace(); return false; }
    }

    public void addHeader(String key, String value) {
        headers.addHeader(new Header(key, value));
    }

    public void addHeader(String key, List<String> value) {
        headers.addHeader(new Header(key, value, value.size()));
    }

    private String strFromArr(String[] arr) {
        StringBuilder builder = new StringBuilder();
        for(int i=0; i< arr.length; i++) {
            builder.append(" [ ").append(i + 1).append(" ]   ").append(arr[i]).append("\n");
        }
        return builder.toString();
    }

}
