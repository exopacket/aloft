package com.inteliense.aloft.cli.config;

import com.inteliense.aloft.cli.fs.FileSystem;
import com.inteliense.aloft.cli.project.AloftProject;
import com.inteliense.aloft.utils.data.JSON;
import com.inteliense.aloft.utils.encryption.Rand;
import com.inteliense.aloft.utils.global.__;
import org.json.simple.JSONObject;

public class AppConfig {

    private AloftProject project;
    private FileSystem fs;

    public AppConfig(FileSystem fs) {

    }

    public static void createTemplate(FileSystem fs, String projectName) {
        JSONObject json = new JSONObject();
        JSONObject project = new JSONObject();
        project.put("name", projectName);
        project.put("author", "");
        project.put("key", __.hex(Rand.secure(32)));
        json.put("project", project);
        fs.printConfig(JSON.getString(json, true));
    }

}
