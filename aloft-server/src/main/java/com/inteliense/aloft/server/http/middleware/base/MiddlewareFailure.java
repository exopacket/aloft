package com.inteliense.aloft.server.http.middleware.base;

public class MiddlewareFailure extends MiddlewareResult {

    public MiddlewareFailure(String message, int code) {
        super(message, code);
    }

    public MiddlewareFailure(int code) {
        super(code);
    }

    @Override
    public boolean failedValidation() {
        return true;
    }
}
