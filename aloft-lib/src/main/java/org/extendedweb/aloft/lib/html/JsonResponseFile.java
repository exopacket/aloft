package org.extendedweb.aloft.lib.html;

import com.sun.net.httpserver.HttpExchange;
import org.extendedweb.aloft.lib.http.supporting.Response;
import org.extendedweb.aloft.utils.data.JSON;
import org.json.simple.JSONObject;

public class JsonResponseFile {

    private String content;

    public JsonResponseFile(JSONObject object) {
        this.content = JSON.getString(object);
    }

    public Response get(HttpExchange t) {
        Response resp = new Response(t, content, 200);
        resp.addHeader("Content-Type", "application/json");
        return resp;
    }

}
