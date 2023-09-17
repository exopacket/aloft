package com.inteliense.aloft.server.debug;

import com.inteliense.aloft.server.websocket.WebSockServer;
import com.inteliense.aloft.utils.global.__;
import org.eclipse.jetty.websocket.api.Session;
import org.json.simple.JSONObject;

public class ReloadServer extends WebSockServer {

    public ReloadServer(String host, int port, String path) throws Exception {
        super(host, port, path);
    }

    @Override
    protected boolean validateConnection(Session session) {
        return true;
    }

    @Override
    protected void onConnect(String sessionId) {
        __.printPrettyLn("New reload server connection.", __.ANSI_GREEN);
    }

    @Override
    protected void onMessage(String sessionId, JSONObject json) {
        __.printPrettyLn("New request for hot reload.");
    }

    @Override
    protected void onClose(String sessionId) {
        __.printPrettyLn("Closing reload server connection.", __.ANSI_YELLOW);
    }
}
