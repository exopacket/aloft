package com.inteliense.aloft.run.cli.config;

import com.inteliense.aloft.application.config.AppConfig;
import com.inteliense.aloft.run.cli.fs.FileSystem;
//import com.inteliense.aloft.run.cli.project.AloftProject;


public class ConfigLoader {

//    private AloftProject project;
    private FileSystem fs;

    public ConfigLoader(FileSystem fs) {
        this.fs = fs;
    }

    public AppConfig getConfig() {
        return null;
    }

}
