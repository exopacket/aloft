package com.inteliense.aloft.cli.fs;

import com.inteliense.aloft.cli.config.AppConfig;

import java.io.File;

public class FileSystem {

    private File projectDir;
    private File globalConfig;
    private File srcDir;
    private File resourcesDir;

    public FileSystem() {
        this.globalConfig = new File("/etc/aloft/projects.json");
        if(!this.globalConfig.exists()) createBase();
        loadProjects();
    }

    private void loadProjects() {

    }

    private void createBase() {

    }

    public void createDir(String path) {

    }

    public void createFile(String path) {

    }

    public void printConfig(String config) {

    }

}
