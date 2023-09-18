package com.inteliense.aloft.server.http.middleware.base;

import com.inteliense.aloft.utils.data.JSON;
import org.json.simple.JSONObject;

public abstract class MiddlewareResult {

    private boolean silentlyChecked = false;
    protected JSONObject json;
    protected int code;

    public abstract boolean failedValidation();

    public MiddlewareResult(String result, int code) {
        build(JSON.getObject(result), code);
    }

    public MiddlewareResult(JSONObject object, int code) {
        build(object, code);
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

}
