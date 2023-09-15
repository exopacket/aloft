package com.inteliense.aloft.run.cli.config;

import com.inteliense.aloft.run.cli.fs.FileSystem;
//import com.inteliense.aloft.run.cli.project.AloftProject;
import com.inteliense.aloft.utils.data.JSON;
import com.inteliense.aloft.utils.encryption.Rand;
import com.inteliense.aloft.utils.global.__;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class AppConfig {

//    private AloftProject project;
    private FileSystem fs;

    public AppConfig(FileSystem fs) {
        this.fs = fs;
    }

}
