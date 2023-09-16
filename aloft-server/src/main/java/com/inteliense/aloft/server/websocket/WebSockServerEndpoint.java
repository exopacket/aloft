package com.inteliense.aloft.server.websocket;

import com.inteliense.aloft.utils.data.JSON;
import com.inteliense.aloft.utils.global.__;
import org.eclipse.jetty.websocket.api.Session;
import org.eclipse.jetty.websocket.api.WebSocketAdapter;
import org.json.simple.JSONObject;

import java.util.concurrent.CountDownLatch;

public abstract class WebSockServerEndpoint extends WebSocketAdapter
{
    private final CountDownLatch closureLatch = new CountDownLatch(1);

    protected abstract String onConnect(Session session);
    protected abstract boolean onMessage(JSONObject json);
    protected abstract void onDisconnect(String sessionId);

    private String sessionId = null;

    @Override
    public void onWebSocketConnect(Session sess)
    {
        super.onWebSocketConnect(sess);
        this.sessionId = onConnect(sess);
    }

    @Override
    public void onWebSocketText(String message)
    {
        super.onWebSocketText(message);
        if(__.empty(JSON.verify(message))) { this.getSession().disconnect(); return; }
        if(!onMessage(JSON.getObject(JSON.verify(message)))) this.getSession().disconnect();
    }

    @Override
    public void onWebSocketClose(int statusCode, String reason)
    {
        super.onWebSocketClose(statusCode, reason);
        onDisconnect(this.sessionId);
        closureLatch.countDown();
    }

    @Override
    public void onWebSocketError(Throwable cause)
    {
        super.onWebSocketError(cause);
        cause.printStackTrace(System.err);
    }

    public void awaitClosure() throws InterruptedException
    {
        closureLatch.await();
    }
}