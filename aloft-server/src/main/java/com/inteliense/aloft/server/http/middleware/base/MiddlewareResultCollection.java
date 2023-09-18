package com.inteliense.aloft.server.http.middleware.base;

import com.inteliense.aloft.utils.global.__;
import org.json.simple.JSONObject;

import java.util.ArrayList;

public class MiddlewareResultCollection {

    private ArrayList<MiddlewareResult> results = new ArrayList<>();
    private boolean hasFailed = false;
    private boolean passed = false;

    public boolean passed() {
        return this.passed;
    }

    public void passAll() {
        if(!hasFailed) passed = true;
    }

    public boolean hasFailed() {
        return hasFailed;
    }

    public MiddlewareResultCollection appendResult(MiddlewareResult result) {
        if(__.isset(result)) this.results.add(result);
        return this;
    }

    public JSONObject getJson() {
        return new JSONObject();
    }

    public int getCode() {
        return 0;
    }

}
