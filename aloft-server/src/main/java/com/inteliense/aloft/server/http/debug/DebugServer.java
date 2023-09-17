package com.inteliense.aloft.server.http.debug;

import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.net.InetSocketAddress;

public class DebugServer {

    HttpServer httpServer = null;

    public DebugServer(int port, boolean secure, boolean localhostOnly) throws IOException {

        httpServer = HttpServer.create(buildBindAddr(port, localhostOnly), 0);
        httpServer.createContext("/", new DebugServerHandler());
        httpServer.setExecutor(null);
        httpServer.start();

    }

    public void stop() {
        httpServer.stop(0);
    }

    private InetSocketAddress buildBindAddr(int port, boolean localhostOnly) {

        if(localhostOnly) return new InetSocketAddress("127.0.0.1", port);
        else return new InetSocketAddress(port);

    }

}
