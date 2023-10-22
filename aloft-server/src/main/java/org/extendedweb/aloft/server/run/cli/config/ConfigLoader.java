package org.extendedweb.aloft.server.run.cli.config;

import org.extendedweb.aloft.lib.application.config.AppConfig;
import org.extendedweb.aloft.server.run.cli.fs.FileSystem;
//import org.extendedweb.aloft.server.run.cli.project.AloftProject;


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
