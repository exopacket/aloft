package com.inteliense.aloft.server.http;

import com.sun.net.httpserver.HttpServer;

import java.net.InetSocketAddress;

public class WebServer {

    HttpServer httpServer = null;

    public WebServer(int httpPort, int httpsPort, boolean localhostOnly) throws Exception {

        httpServer = HttpServer.create(buildBindAddr(httpPort, localhostOnly), 0);
        httpServer.createContext("/", new WebServerHandler());
        httpServer.setExecutor(null);
        httpServer.start();

    }

    private InetSocketAddress buildBindAddr(int port, boolean localhostOnly) {

        if(localhostOnly) return new InetSocketAddress("127.0.0.1", port);
        else return new InetSocketAddress(port);

    }

}
