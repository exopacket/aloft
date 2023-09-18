package com.inteliense.aloft.compiler.application.config;

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

}
