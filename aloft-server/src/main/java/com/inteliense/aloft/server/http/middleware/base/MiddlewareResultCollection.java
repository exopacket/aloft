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

    public void fail() {
        hasFailed = true;
    }

    public MiddlewareResultCollection appendResult(MiddlewareResult result) {
        if(__.isset(result)) this.results.add(result);
        return this;
    }

    public JSONObject getJson() {
        for(int i=0; i<results.size(); i++) {
            MiddlewareResult result = results.get(i);
            if(result.failedValidation()) return result.getJson();
        }
        return new JSONObject();
    }

    public int getCode() {
        for(int i=0; i<results.size(); i++) {
            MiddlewareResult result = results.get(i);
            if(result.failedValidation()) return result.getCode();
        }
        return 0;
    }

}
