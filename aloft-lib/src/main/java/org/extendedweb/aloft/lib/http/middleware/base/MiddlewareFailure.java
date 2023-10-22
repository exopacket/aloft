package org.extendedweb.aloft.lib.http.middleware.base;

public class MiddlewareFailure extends MiddlewareResult {

    public MiddlewareFailure(String message, int code) {
        super(message, code);
    }

    public MiddlewareFailure(int code) {
        super(code);
    }

    public MiddlewareFailure(String[] problems, int code) {
        super(problems, code);
    }

    public MiddlewareFailure(String message, String[] problems, int code) {
        super(message, problems, code);
    }

    @Override
    public boolean failedValidation() {
        return true;
    }
}
