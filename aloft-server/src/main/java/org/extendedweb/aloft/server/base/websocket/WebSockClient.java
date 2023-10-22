package org.extendedweb.aloft.server.base.websocket;

import java.net.URI;
import java.util.concurrent.Future;

import org.eclipse.jetty.websocket.api.Session;
import org.eclipse.jetty.websocket.client.WebSocketClient;

public class WebSockClient
{
    public static WebSockClient create(String host, int port, String path)
    {
        path = (path.charAt(0) == '/') ? path.substring(1) : path;
        WebSockClient client = new WebSockClient();
        URI uri = URI.create("ws://" + host + ":" + port + "/" + path);
        return client;
    }

    public void run(URI uri) throws Exception
    {
        WebSocketClient client = new WebSocketClient();

        try
        {
            client.start();
            WebSockEndpoint socket = new WebSockEndpoint();
            Future<Session> fut = client.connect(socket, uri);
            Session session = fut.get();

            session.getRemote().sendString("Hello...");
            session.getRemote().sendString("Sorry, gotta go!");

            socket.awaitClosure();
            session.close();
        }
        finally
        {
            client.stop();
        }
    }
}