package com.inteliense.aloft.server.http.supporting;


import com.sun.net.httpserver.HttpExchange;

public class Route {

    private String id;

    public Route(String id) {
        this.id = id;
    }

    public String getId() {
        return this.id;
    }

    public Response go(HttpExchange t) { return new Response(t, "Hello World!", 200); }

}
