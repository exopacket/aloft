package com.inteliense.aloft.cli.utils.exceptions.types;

public class CriticalException extends ExceptionAdapter {

    public CriticalException() {
        super();
    }

    public CriticalException(String message) {
        super(message);
    }

    public CriticalException(String message, Throwable cause) {
        super(message, cause);
    }

    public CriticalException(Throwable cause) {
        super(cause);
    }

    protected CriticalException(String message, Throwable cause,
                               boolean enableSuppression,
                               boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    @Override
    protected void onError() {

    }
}
