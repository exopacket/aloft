package com.inteliense.aloft.server.http.middleware.base;

import org.json.simple.JSONObject;

public class MiddlewareSuccess extends MiddlewareResult {

    public MiddlewareSuccess() {
        super();
    }

    @Override
    public boolean failedValidation() {
        return false;
    }
}
