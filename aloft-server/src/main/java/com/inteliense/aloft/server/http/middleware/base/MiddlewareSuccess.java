package com.inteliense.aloft.server.http.middleware.base;

import org.json.simple.JSONObject;

public class MiddlewareSuccess extends MiddlewareResult {

    public MiddlewareSuccess(String result, int code) {
        super(result, code);
    }

    public MiddlewareSuccess(JSONObject object, int code) {
        super(object, code);
    }

    @Override
    public boolean failedValidation() {
        return false;
    }
}
