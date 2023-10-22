package org.extendedweb.aloft.server.base.websocket;

import org.eclipse.jetty.websocket.api.Session;
import org.eclipse.jetty.websocket.server.JettyServerUpgradeRequest;
import org.eclipse.jetty.websocket.server.JettyServerUpgradeResponse;
import org.eclipse.jetty.websocket.server.JettyWebSocketCreator;
import org.json.simple.JSONObject;

public abstract class WebSockEndpointCreator implements JettyWebSocketCreator
{

    protected abstract String onConnect(Session session);
    protected abstract boolean onMessage(JSONObject json);
    protected abstract void onDisconnect(String sessionId);

    @Override
    public Object createWebSocket(JettyServerUpgradeRequest jettyServerUpgradeRequest, JettyServerUpgradeResponse jettyServerUpgradeResponse)
    {
        return new WebSockServerEndpoint() {
            @Override
            protected String onConnect(Session session) {
                return WebSockEndpointCreator.this.onConnect(session);
            }

            @Override
            protected boolean onMessage(JSONObject json) {
                return WebSockEndpointCreator.this.onMessage(json);
            }

            @Override
            protected void onDisconnect(String sessionId) {
                WebSockEndpointCreator.this.onDisconnect(sessionId);
            }
        };
    }
}