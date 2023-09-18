package com.inteliense.aloft.server.http.middleware.base;

import com.inteliense.aloft.server.http.supporting.HttpErrorMessages;
import com.inteliense.aloft.utils.data.JSON;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public abstract class MiddlewareResult {

    private boolean silentlyChecked = false;
    protected JSONObject json;
    protected int code;

    public abstract boolean failedValidation();

    public MiddlewareResult() { build(new JSONObject(), 0); }

    public MiddlewareResult(String message, int code) {
        build(buildErrorJson(message, code), code);
    }

    public MiddlewareResult(String[] problems, int code) {
        JSONObject root = new JSONObject();
        JSONArray arr = new JSONArray();
        for(int i=0; i<problems.length; i++) {
            arr.add(problems[i]);
        }
        root.put("errors", arr);
        build(buildErrorJson("There were multiple errors with your request.", root, code), code);
    }

    public MiddlewareResult(String message, String[] problems, int code) {
        JSONObject root = new JSONObject();
        JSONArray arr = new JSONArray();
        for(int i=0; i<problems.length; i++) {
            arr.add(problems[i]);
        }
        root.put("errors", arr);
        build(buildErrorJson(message, root, code), code);
    }

    public MiddlewareResult(int code) {
        build(buildErrorJson(code), code);
    }

    private void build(JSONObject object, int code) {
        this.json = object;
        this.code = code;
    }

    public void silentlyChecked() {
        this.silentlyChecked = true;
    }

    public boolean wasSilentlyChecked() {
        return this.silentlyChecked;
    }

    public JSONObject getJson() {
        return this.json;
    }

    public int getCode() {
        return this.code;
    }

    protected JSONObject buildErrorJson(JSONObject json, int code) {
        JSONObject root = new JSONObject();
        JSONObject status = new JSONObject();
        JSONObject error = json;
        status.put("code", code);
        status.put("reason", HttpErrorMessages.getMessage(code));
        root.put("error", error);
        root.put("status", status);
        return root;
    }

    protected JSONObject buildErrorJson(String message, JSONObject json, int code) {
        JSONObject root = new JSONObject();
        JSONObject status = new JSONObject();
        JSONObject error = json;
        if(!error.containsKey("message")) error.put("message", message);
        else error.replace("message", message);
        status.put("code", code);
        status.put("reason", HttpErrorMessages.getMessage(code));
        error.put("message", message);
        root.put("error", error);
        root.put("status", status);
        return root;
    }

    protected JSONObject buildErrorJson(String message, int code) {
        JSONObject root = new JSONObject();
        JSONObject status = new JSONObject();
        JSONObject error = new JSONObject();
        status.put("code", code);
        status.put("reason", HttpErrorMessages.getMessage(code));
        error.put("message", message);
        root.put("error", error);
        root.put("status", status);
        return root;
    }

    protected JSONObject buildErrorJson(int code) {
        JSONObject root = new JSONObject();
        JSONObject status = new JSONObject();
        JSONObject error = new JSONObject();
        status.put("code", code);
        status.put("reason", HttpErrorMessages.getMessage(code));
        error.put("message", HttpErrorMessages.getMessage(code));
        root.put("error", error);
        root.put("status", status);
        return root;
    }

}
