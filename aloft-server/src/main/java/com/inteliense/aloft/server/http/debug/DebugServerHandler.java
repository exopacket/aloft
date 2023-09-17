package com.inteliense.aloft.server.http.debug;

import com.inteliense.aloft.compiler.lang.keywords.listeners.base.AloftListener;
import com.inteliense.aloft.compiler.lang.keywords.elements.types.TextAloftElement;
import com.inteliense.aloft.server.html.HtmlRenderer;
import com.inteliense.aloft.server.html.elements.js.AloftJavaScript;
import com.inteliense.aloft.server.html.elements.js.JavaScript;
import com.inteliense.aloft.server.html.elements.js.JavaScriptWriterType;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.OutputStream;

public class DebugServerHandler implements HttpHandler {
    @Override
    public void handle(HttpExchange t) throws IOException {
        TextAloftElement textElement = new TextAloftElement("Hello World!\n\nSincerely yours,\n- Server.") {
            @Override
            protected AloftListener[] listeners() {
                return new AloftListener[0];
            }
        };
        String js = new JavaScript(JavaScriptWriterType.ELEMENT, new AloftJavaScript("js/main")).getContent();
        System.out.println(js);
        String response = HtmlRenderer.render(textElement).get();
        t.sendResponseHeaders(200, response.length());
        OutputStream os = t.getResponseBody();
        os.write(response.getBytes());
        os.close();
    }
}
