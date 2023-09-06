package com.inteliense.aloft.compiler.mobile.flutter.project;

import com.inteliense.aloft.utils.sys.shell.Run;

import java.util.ArrayList;

public class FlutterProject {

    private String appName;
    private FlutterDirectories directories;
    private FlutterPlatform ios;
    private FlutterPlatform android;

    private FlutterConfig config;
    private ArrayList<FlutterDependency> dependencies;

    public FlutterProject(String appName, String directory, boolean iosMake, boolean androidMake) {
        makeProject(appName, directory, iosMake, androidMake);
        this.appName = appName;
    }

    public void addDependency(FlutterDependency dependency) {
        dependencies.add(dependency);
    }

    private void makeProject(String appName, String directory, boolean iosMake, boolean androidMake) {
        String platforms = "";
        if(iosMake && androidMake) platforms = "ios,android";
        else if(iosMake) platforms = "ios";
        else if(androidMake) platforms = "android";

        try {
            Run.runAndWait("flutter create --platforms " + platforms);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
