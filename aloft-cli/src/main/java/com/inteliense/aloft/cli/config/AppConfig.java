package com.inteliense.aloft.cli.config;

import com.inteliense.aloft.cli.fs.FileSystem;
import com.inteliense.aloft.cli.utils.data.JSON;
import org.json.simple.JSONObject;

public class AppConfig {

    public AppConfig(FileSystem fs) {

    }

    public static void createTemplate(FileSystem fs, String projectName) {
        JSONObject json = new JSONObject();
        JSONObject project = new JSONObject();
        project.put("name", projectName);
        project.put("author", "");
        json.put("project", project);
        fs.printConfig(JSON.getString(json, true));
    }

}
