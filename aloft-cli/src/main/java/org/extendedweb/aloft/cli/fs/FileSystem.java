package org.extendedweb.aloft.cli.fs;

import org.extendedweb.aloft.utils.data.JSON;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.File;

public class FileSystem {

    private File projectDir;
    private File projectConfig;
    private File globalConfig;
    private File srcDir;
    private File packageDir;
    private File resourcesDir;

    public FileSystem() {
        this.projectDir = new File("");
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
        projectDir = createDir(projectDir.getAbsolutePath() + "/" + appName, true);
        if(projectDir == null) throw new RuntimeException("Project already exists.");
        projectConfig = createFile(projectDir.getAbsolutePath() + "/" + appName + ".json", false);
        Print.setPrinter(projectConfig);
        Print.txt(config);
        Print.reset();
    }

    public void createProjectDirs(String pkg) {
        srcDir = createDir(projectDir.getAbsolutePath() + "/src");
        resourcesDir = createDir(projectDir.getAbsolutePath() + "/resources");
        String[] parts = pkg.split("\\.");
        String path = srcDir.getAbsolutePath();
        for(int i=0; i<parts.length; i++) {
            path += "/" + parts[i];
            packageDir = createDir(path);
        }
        createDotFile(srcDir.getAbsolutePath());
        createFile(packageDir.getAbsolutePath() + "/main.ss");
    }

    public void createDotFile(String path) {
        File dotFile = createFile(path + "/.adir", false);
        Print.setPrinter(dotFile);
        Print.ln(projectDir.getAbsolutePath());
        Print.ln(projectConfig.getAbsolutePath());
        Print.ln(srcDir.getAbsolutePath());
        Print.ln(resourcesDir.getAbsolutePath());
        Print.ln(packageDir.getAbsolutePath());
        Print.reset();
    }

}
