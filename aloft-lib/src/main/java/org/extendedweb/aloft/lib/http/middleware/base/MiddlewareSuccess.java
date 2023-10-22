package org.extendedweb.aloft.lib.http.middleware.base;

public class MiddlewareSuccess extends MiddlewareResult {

    public MiddlewareSuccess() {
        super();
    }

    @Override
    public boolean failedValidation() {
        return false;
    }
}
