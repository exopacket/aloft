package org.extendedweb.aloft.server.base.http.debug;

import org.extendedweb.aloft.lib.application.config.AppConfig;
import org.extendedweb.aloft.utils.global.__;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.net.InetSocketAddress;

public class DebugServer {

    HttpServer httpServer = null;

    public DebugServer(String configPath, int port, boolean secure, boolean localhostOnly) throws IOException {

        httpServer = HttpServer.create(buildBindAddr(port, localhostOnly), 0);
        httpServer.createContext("/", new DebugServerHandler(new AppConfig(configPath)));
        httpServer.setExecutor(null);
        httpServer.start();
        __.printPrettyLn("Debug server running at http://localhost:" + port);

    }

    public void stop() {
        httpServer.stop(0);
    }

    private InetSocketAddress buildBindAddr(int port, boolean localhostOnly) {

        if(localhostOnly) return new InetSocketAddress("127.0.0.1", port);
        else return new InetSocketAddress(port);

    }

}
