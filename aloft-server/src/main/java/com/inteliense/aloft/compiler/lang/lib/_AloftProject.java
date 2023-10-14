package com.inteliense.aloft.compiler.lang.lib;

import com.inteliense.aloft.application.config.AppConfig;
import com.inteliense.aloft.compiler.tests.models._User;

public class _AloftProject {

    private static AppConfig config;

    private static String projectName;
    private static _AloftObjects objects;

    public static AppConfig getConfig() {
        return config;
    }

    public static void buildObjects() throws Exception {
        buildRoutes();
        config = new AppConfig(objects.getRouteCache());
        buildModels();
    }

    private static void buildModels() throws Exception {
        objects.append(_User.class);
    }

    private static void buildRoutes() throws Exception {
        objects.append(new _AloftRoute("/", "GET"));
    }

}
