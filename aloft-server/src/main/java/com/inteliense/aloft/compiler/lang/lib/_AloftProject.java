package com.inteliense.aloft.compiler.lang.lib;

import com.inteliense.aloft.application.config.AppConfig;
import com.inteliense.aloft.compiler.tests.models._User;
import com.inteliense.aloft.compiler.tests.pages._TestProjectHome;

public class _AloftProject {

    private AppConfig config;

    private String projectName;
    private String context;
    private _AloftObjects objects = new _AloftObjects();

    public _AloftProject(String[] args) {
        projectName = args[0];
        context = args[1];
    }

    public AppConfig getConfig() {
        return config;
    }

    public String getProjectName() {
        return projectName;
    }

    public String getContext() {
        return context;
    }

    public void buildObjects() throws Exception {
        buildPages();
        buildRoutes();
        config = new AppConfig(objects.getRouteCache());
        buildModels();
    }

    private void buildPages() throws Exception {
        objects.append(_TestProjectHome.class);
    }

    private void buildModels() throws Exception {
        objects.append(_User.class);
    }

    private void buildRoutes() throws Exception {
//        objects.append(new _AloftRoute("/", "GET"));
    }

}
