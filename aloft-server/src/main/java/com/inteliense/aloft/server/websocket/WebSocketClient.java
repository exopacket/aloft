package com.inteliense.aloft.server.websocket;

import org.glassfish.tyrus.client.ClientManager;
import org.glassfish.tyrus.core.wsadl.model.Endpoint;

import java.io.IOException;
import java.net.URI;
import java.util.concurrent.CountDownLatch;
import javax.websocket.*;

@ClientEndpoint
public class WebSocketClient extends Endpoint {

    jakarta.websocket.Session userSession = null;
    private MessageHandler messageHandler;
    private static CountDownLatch messageLatch;

    public WebSocketClient(URI endpointURI) {
        try {

            final jakarta.websocket.ClientEndpointConfig cec = jakarta.websocket.ClientEndpointConfig.Builder.create().build();

            ClientManager client = ClientManager.createClient();

            this.userSession = client.connectToServer(new jakarta.websocket.Endpoint() {
                @Override
                public void onOpen(jakarta.websocket.Session session, jakarta.websocket.EndpointConfig endpointConfig) {
                    session.addMessageHandler(new jakarta.websocket.MessageHandler.Whole<String>() {

                        @Override
                        public void onMessage(String message) {

                        }

                    });
                }

                @Override
                public void onClose(jakarta.websocket.Session session, jakarta.websocket.CloseReason closeReason) {
                    super.onClose(session, closeReason);
                }

                @Override
                public void onError(jakarta.websocket.Session session, Throwable thr) {
                    super.onError(session, thr);
                }

            }, cec, endpointURI);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @OnOpen
    public void onOpen(jakarta.websocket.Session userSession) {


    }

    public void closeConnection() {

        try {
            this.userSession.close();
        } catch (IOException ex) {
            System.out.println(ex.toString());
        }

    }

    @OnClose
    public void onClose(jakarta.websocket.Session userSession, CloseReason reason) {

    }

    @OnMessage
    public void onMessage(String message) throws IOException {
        if (this.messageHandler != null) {
            this.messageHandler.handleMessage(message);
        }
    }

    public void addMessageHandler(MessageHandler msgHandler) {
        this.messageHandler = msgHandler;
    }

    public void sendMessage(String message) throws IOException {
        userSession.getAsyncRemote().sendText(message);
    }

    public static interface MessageHandler {
        public void handleMessage(String message) throws IOException;
    }
}
