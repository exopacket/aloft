package com.inteliense.aloft.run.cli.fs;

import java.io.File;
import java.io.PrintWriter;

public class FileSystem {

    private File projectDir;
    private File globalConfig;
    private File srcDir;
    private File resourcesDir;

    public FileSystem() {
        this.projectDir = new File("./");
        setup();
    }

    public FileSystem(String projectDir) {
        this.projectDir = new File(projectDir);
        setup();
    }

    private void setup() {
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

    public void printConfig(String appName, String config) throws Exception {
        projectDir = new File(projectDir.getPath() + "/" + appName);
        if(!projectDir.exists()) projectDir.mkdir();
        else throw new RuntimeException("directory already exists.");
        File file = new File(projectDir.getPath() + "/" + appName + ".json");
        System.out.println(projectDir.getPath() + appName + ".json");
        file.createNewFile();
        PrintWriter pw = new PrintWriter(file);
        Print.txt(config, pw);
        pw.close();
        pw.flush();
    }

}
