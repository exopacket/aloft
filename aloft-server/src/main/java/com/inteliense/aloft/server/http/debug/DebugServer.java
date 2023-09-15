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
        try {
            Thread thr = new Thread(()  -> {
                httpServer.start();
                while(true) {
                    try {
                        Thread.sleep(1500);
                    } catch (InterruptedException e) {
                        break;
                    }
                }
            });
            thr.start();
            thr.join();
        } catch (Exception ignored) {}

    }

    private InetSocketAddress buildBindAddr(int port, boolean localhostOnly) {

        if(localhostOnly) return new InetSocketAddress("127.0.0.1", port);
        else return new InetSocketAddress(port);

    }

}
