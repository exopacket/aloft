package com.inteliense.aloft.server.http.supporting;

import com.inteliense.aloft.utils.data.JSON;
import com.sun.net.httpserver.HttpExchange;
import org.json.simple.JSONObject;

import java.io.OutputStream;
import java.util.List;

public class Response {

    private HttpExchange t;
    private int code;
    private String content;
    private int len;
    private HeaderList headers = new HeaderList();

    public Response(HttpExchange t, String content, int code) {
        this.t = t;
        this.code = code;
        this.content = content;
        this.len = this.content.length();
    }

    public Response(HttpExchange t, String[] content, int code) {
        this.t = t;
        this.code = code;
        this.content = strFromArr(content);
        this.len = this.content.length();
    }

    public Response(HttpExchange t, JSONObject content, int code) {
        this.t = t;
        this.code = code;
        this.content = JSON.getString(content);
        this.len = this.content.length();
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

    public void addHeader(String key, String value) {
        headers.addHeader(new Header(key, value));
    }

    public void addHeader(String key, List<String> value) {
        headers.addHeader(new Header(key, value));
    }

    private String strFromArr(String[] arr) {
        StringBuilder builder = new StringBuilder();
        for(int i=0; i< arr.length; i++) {
            builder.append(" [ ").append(i + 1).append(" ]   ").append(arr[i]).append("\n");
        }
        return builder.toString();
    }

}
