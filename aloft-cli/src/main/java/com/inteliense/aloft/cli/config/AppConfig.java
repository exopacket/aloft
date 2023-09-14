package com.inteliense.aloft.cli.config;

import com.inteliense.aloft.cli.fs.FileSystem;
import com.inteliense.aloft.cli.project.AloftProject;
import com.inteliense.aloft.utils.data.JSON;
import com.inteliense.aloft.utils.encryption.Rand;
import com.inteliense.aloft.utils.global.__;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class AppConfig {

    private AloftProject project;
    private FileSystem fs;

    public AppConfig(FileSystem fs) {
        this.fs = fs;
    }

    public void createTemplate(String projectName) {
        JSONObject json = new JSONObject();

        JSONObject project = new JSONObject();
        project.put("name", projectName);
        project.put("author", "");
        project.put("description", "");
        project.put("key", __.hex(Rand.secure(32)));
        project.put("version", "1.0.0");

        JSONArray modules = new JSONArray();
        modules.add(buildModule("aloft/tailwindcss", "git://path/to/repo", "1.0.0"));
        modules.add(buildModule("aloft/base-components", "git://path/to/repo", "1.0.0"));
        modules.add(buildModule("aloft/crypto", "git://path/to/repo", "1.0.0"));

        json.put("project", project);
        json.put("modules", modules);
        try {
            fs.printConfig(projectName, JSON.getString(json, true));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private JSONObject buildModule(String name, String repo, String version) {
        JSONObject obj = new JSONObject();
        JSONObject mod = new JSONObject();
        mod.put("git", repo);
        mod.put("version", version);
        obj.put(name, mod);
        return obj;
    }

}
