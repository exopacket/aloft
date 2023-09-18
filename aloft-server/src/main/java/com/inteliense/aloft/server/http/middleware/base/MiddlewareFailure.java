package com.inteliense.aloft.server.http.middleware.base;

import org.json.simple.JSONObject;

public class MiddlewareFailure extends MiddlewareResult {

    public MiddlewareFailure(String result, int code) {
        super(result, code);
    }

    public MiddlewareFailure(JSONObject object, int code) {
        super(object, code);
    }

    @Override
    public boolean failedValidation() {
        return true;
    }
}
