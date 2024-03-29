package org.extendedweb.aloft.lib.http.supporting;

import org.extendedweb.aloft.lib.client.ClientInfo;
import org.extendedweb.aloft.utils.data.JSON;
import org.extendedweb.aloft.utils.global.__;
import com.sun.net.httpserver.HttpContext;
import org.json.simple.JSONObject;

import java.io.InputStream;
import java.net.URI;
import java.util.Scanner;

public class RequestParams {

    private Route route;
    private HeaderList headers;
    private ClientInfo client;
    private AloftRequestType internalRequestType;
    private RequestType requestType;
    private String body;
    private URI requestUri;
    private String protocol;
    private HttpContext context;

    public RequestParams(InputStream body, Route route, URI requestUri, String protocol, HttpContext context, HeaderList headers, ClientInfo client, AloftRequestType internalRequestType, RequestType requestType) {
        this.body = bodyFromStream(body);
        this.requestUri = requestUri;
        this.protocol = protocol;
        this.context = context;
        this.headers = headers;
        this.client = client;
        this.internalRequestType = internalRequestType;
        this.requestType = requestType;
        this.route = route;
    }

    public JSONObject getJson() {
        if(!__.empty(JSON.verify(body))) return JSON.getObject(JSON.verify(body));
        return null;
    }

    public String getUriString() {
        return this.requestUri.getPath();
    }

    public HeaderList getHeaders() {
        return headers;
    }

    public String getBody() {
        return body;
    }

    public String getProtocol() {
        return protocol;
    }

    public AloftRequestType getInternalRequestType() {
        return internalRequestType;
    }

    public ClientInfo getClient() {
        return client;
    }

    public RequestType getRequestType() {
        return requestType;
    }

    public boolean hasHeader(String header) {
        return headers.has(header);
    }

    public Route route() {
        return this.route;
    }

    private String bodyFromStream(InputStream bodyInput) {
        Scanner scnr = new Scanner(bodyInput);
        String body = "";
        while(scnr.hasNextLine()) {
            body += scnr.nextLine();
        }
        scnr.close();
        return body;
    }

}
