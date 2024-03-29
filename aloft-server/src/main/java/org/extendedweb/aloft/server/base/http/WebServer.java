package org.extendedweb.aloft.server.base.http;

import org.extendedweb.aloft.lib._AloftProject;
import org.extendedweb.aloft.server.base.http.WebServerHandler;
import org.extendedweb.aloft.lib.tests._TestProject;
import com.sun.net.httpserver.HttpServer;

import java.net.InetSocketAddress;

public class WebServer {

    HttpServer httpServer = null;

    public WebServer(int httpPort, int httpsPort, boolean localhostOnly, _AloftProject project) throws Exception {

        httpServer = HttpServer.create(buildBindAddr(httpPort, localhostOnly), 0);
        httpServer.createContext(project.getContext(), new WebServerHandler(project));
        httpServer.setExecutor(null);
        httpServer.start();

    }

    private InetSocketAddress buildBindAddr(int port, boolean localhostOnly) {

        if(localhostOnly) return new InetSocketAddress("127.0.0.1", port);
        else return new InetSocketAddress(port);

    }

}
