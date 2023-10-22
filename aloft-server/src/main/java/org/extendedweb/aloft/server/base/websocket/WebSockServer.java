package org.extendedweb.aloft.server.base.websocket;

import java.net.InetSocketAddress;
import java.net.URI;
import java.util.HashMap;

import org.extendedweb.aloft.utils.data.JSON;
import org.extendedweb.aloft.utils.global.__;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.ServerConnector;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.websocket.api.Session;
import org.eclipse.jetty.websocket.server.config.JettyWebSocketServletContainerInitializer;
import org.json.simple.JSONObject;

public abstract class WebSockServer
{

    private Server server;
    private ServerConnector connector;

    private HashMap<String, Session> sessions = new HashMap<>();

    protected abstract boolean validateConnection(Session session);
    protected abstract void onConnect(String sessionId);
    protected abstract void onMessage(String sessionId, JSONObject json);
    protected abstract void onClose(String sessionId);

    public WebSockServer(String host, int port, String path) throws Exception
    {
        path = (path.charAt(0) == '/') ? path.substring(1) : path;
        InetSocketAddress addr = new InetSocketAddress(host, port);
        create(addr, path);
    }

    public void create(InetSocketAddress address, String base)
    {
        server = new Server(address);
        connector = new ServerConnector(server);
        server.addConnector(connector);

        ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
        context.setContextPath("/");
        server.setHandler(context);

        JettyWebSocketServletContainerInitializer.configure(context, (servletContext, wsContainer) ->
        {
            wsContainer.setMaxTextMessageSize(65535);
            wsContainer.addMapping("/" + base, createEndpoint());
        });
    }

    public boolean sendJson(String sessionId, JSONObject jsonObject) {
        if(!sessions.containsKey(sessionId)) return false;
        Session session = sessions.get(sessionId);
        String json = JSON.getString(jsonObject, false);
        try { session.getRemote().sendString(json); }
        catch (Exception e) { return false; }
        return true;
    }

    public Session getSession(String id) {
        if(sessions.containsKey(id)) return sessions.get(id);
        return null;
    }

    private WebSockEndpointCreator createEndpoint() {
        return new WebSockEndpointCreator() {
            @Override
            protected String onConnect(Session session) {
                return connected(session, WebSockServer.this.validateConnection(session));
            }

            @Override
            protected boolean onMessage(JSONObject json) {
                if(!json.containsKey("session_id")) return false;
                String sessionId = (String) json.get("session_id");
                json.remove("session_id");
                WebSockServer.this.onMessage(sessionId, json);
                return true;
            }

            @Override
            protected void onDisconnect(String sessionId) {
                onClose(sessionId);
                disconnected(sessionId);
            }
        };
    }


    private void disconnected(String sessionId) {
        sessions.remove(sessionId);
    }

    private String connected(Session session, boolean valid) {
        if (!valid) {
            session.disconnect();
            return null;
        }
        String id = __.id();
        sessions.put(id, session);
        JSONObject obj = new JSONObject();
        obj.put("status", "connected");
        obj.put("server_time", System.currentTimeMillis());
        obj.put("id", id);
        sendJson(id, obj);
        onConnect(id);
        return id;
    }

    public void setPort(int port)
    {
        connector.setPort(port);
    }

    public void start() throws Exception
    {
        server.start();
    }

    public URI getURI()
    {
        return server.getURI();
    }

    public void stop() throws Exception
    {
        server.stop();
    }

    public void join() throws InterruptedException
    {
        server.join();
    }
}