package org.extendedweb.aloft.lib.http.supporting;

import com.sun.net.httpserver.HttpExchange;
import org.extendedweb.aloft.lib._AloftProject;
import org.extendedweb.aloft.lib.application.config.AppConfig;
import org.extendedweb.aloft.lib.client.ClientInfo;

public class Request {

    private HttpExchange t;
    private ClientInfo client;
    private HeaderList headers;
    private DirectRequest location;
    private boolean validated = false;
    private AppConfig config;

    public Request(HttpExchange t, AppConfig config) {
        this.t = t;
        this.config = config;
        this.headers = HeaderParser.getHeaders(t);
        this.client = ClientParser.getClientInfo(t, this.headers);
        this.location = new DirectRequest(t, this.headers, this.client, this.config);
        this.validated = this.location.validate();
    }

    public Request(HttpExchange t, _AloftProject project) {
        this.t = t;
        this.config = project.getConfig();
        this.headers = HeaderParser.getHeaders(t);
        this.client = ClientParser.getClientInfo(t, this.headers);
        this.location = new DirectRequest(t, this.headers, this.client, this.config);
        this.validated = this.location.validate();
    }

    public Response handle() {
        if(this.validated)
            return this.location.get();
        return null;
    }

    public boolean validated() {
        return this.validated;
    }

}