package com.inteliense.aloft.cli.fs;

import com.inteliense.aloft.utils.data.JSON;
import com.inteliense.aloft.utils.sys.uid.LimitedEscalate;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.File;

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
        this.globalConfig = new File("./projects.json");
        if(!this.globalConfig.exists()) {
            //LimitedEscalate.createConfigFile();
            createBase();
            return;
        }
        loadProjects();
    }

    private void loadProjects() {

    }

    private void createBase() {
        JSONObject root = new JSONObject();
        JSONObject server = new JSONObject();
        JSONArray apps = new JSONArray();
        root.put("server", server);
        root.put("apps", apps);
        this.globalConfig = createFile("./projects.json");
        Print.setPrinter(this.globalConfig);
        Print.txt(JSON.getString(root, true));
        Print.reset();
    }

    public File createDir(String path) {
        return createDir(path, false);
    }

    public File createFile(String path) {
        return createFile(path, false);
    }

    public File createDir(String path, boolean nullOnExists) {
        File dir = new File(path);
        if(dir.exists() && nullOnExists) return null;
        else if(dir.exists()) return dir;
        dir.mkdirs();
        return dir;
    }

    public File createFile(String path, boolean nullOnExists) {
        File file = new File(path);
        if(file.exists() && nullOnExists) return null;
        else if(file.exists()) return file;
        try {
            file.createNewFile();
        } catch (Exception ignored) { }
        return file;
    }

    public void printConfig(String appName, String config) throws Exception {
        projectDir = createDir(projectDir.getPath() + "/" + appName, true);
        if(projectDir == null) throw new RuntimeException("directory already exists.");
        File file = createFile(projectDir.getPath() + "/" + appName + ".json", false);
        Print.setPrinter(file);
        Print.txt(config);
        Print.reset();
    }

}
