package org.extendedweb.aloft.lib.application.config;

import org.extendedweb.aloft.utils.global.__;
import org.json.simple.JSONObject;

import java.util.HashMap;

public class RoutesConfig {

    private HashMap<String, String> config = new HashMap<String, String>();

    public RoutesConfig(JSONObject json) {
        appendConfig(json, "api");
        appendConfig(json, "public-api");
        appendConfig(json, "update-state");
        appendConfig(json, "javascript");
        appendConfig(json, "stylesheets");
        appendConfig(json, "images");
        appendConfig(json, "files");
    }

    public String api() {
        return getValue("api");
    }

    public String publicApi() {
        return getValue("public-api");
    }

    public String updateState() {
        return getValue("update-state");
    }

    public String javascript() {
        return getValue("javascript");
    }

    public String stylesheets() {
        return getValue("stylesheets");
    }

    public String images() {
        return getValue("images");
    }

    public String files() {
        return getValue("files");
    }

    private String getValue(String key) {
        return config.get(key);
    }

    private void appendConfig(JSONObject json, String key) {
        if(json.containsKey(key)) config.put(key, (String) json.get(key));
        else {
            if(__.same(key, "api")) config.put(key, "/ajax");
            if(__.same(key, "public-api")) config.put(key, "/api");
            if(__.same(key, "update-state")) config.put(key, "/state");
            if(__.same(key, "javascript")) config.put(key, "/js");
            if(__.same(key, "stylesheets")) config.put(key, "/css");
            if(__.same(key, "images")) config.put(key, "/image");
            if(__.same(key, "files")) config.put(key, "/attachments");
        }
    }

}
