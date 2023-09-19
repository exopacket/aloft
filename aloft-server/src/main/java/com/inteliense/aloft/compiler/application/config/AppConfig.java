package com.inteliense.aloft.compiler.application.config;

import com.inteliense.aloft.server.http.middleware.base.ApplyToType;
import com.inteliense.aloft.server.http.middleware.types.HasHeaders;
import com.inteliense.aloft.server.http.supporting.Route;

public class AppConfig {

    //SERVER CONFIGURATION
    private boolean localhostOnly = false;
    private int httpPort = 0;
    private int httpsPort = 0;
    private String apiPath = "/api";

    //APPLICATION CONFIGURATION
    private String name = "";

    //MODULES
    private ModuleList modules;

    //MIDDLEWARE
    private MiddlewareList middleware;

    public MiddlewareList getMiddleware() { return this.middleware; }

    public AppConfig() {
        //FIXME ....FOR TESTING
        MiddlewareList list = new MiddlewareList();
        HasHeaders m = new HasHeaders(new String[]{"X-Test-Header"});
        m.appendAppliesTo(ApplyToType.PUBLIC_API, new Route[]{new Route("/index/main", "GET")});
        list.appendAppMiddleware(m);
        this.middleware = list;
    }

}
