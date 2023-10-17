package com.inteliense.aloft.server.http;

import com.inteliense.aloft.compiler.lang.lib._AloftProject;
import com.inteliense.aloft.compiler.tests._TestProject;
import com.sun.net.httpserver.HttpServer;

import java.net.InetSocketAddress;

public class WebServer {

    HttpServer httpServer = null;

    public WebServer(int httpPort, int httpsPort, boolean localhostOnly, _AloftProject[] projects) throws Exception {

        httpServer = HttpServer.create(buildBindAddr(httpPort, localhostOnly), 0);
        for(int i=0; i<projects.length; i++) {
            httpServer.createContext(projects[i].getContext(), new WebServerHandler(projects[i]));
        }
        httpServer.setExecutor(null);
        httpServer.start();

    }

    private InetSocketAddress buildBindAddr(int port, boolean localhostOnly) {

        if(localhostOnly) return new InetSocketAddress("127.0.0.1", port);
        else return new InetSocketAddress(port);

    }

}
