package org.extendedweb.aloft.utils.exceptions.types;

public class UndefinedException extends ExceptionAdapter {

    public UndefinedException() {
        super();
    }

    public UndefinedException(String message) {
        super(message);
    }

    public UndefinedException(String message, Throwable cause) {
        super(message, cause);
    }

    public UndefinedException(Throwable cause) {
        super(cause);
    }

    protected UndefinedException(String message, Throwable cause,
                                boolean enableSuppression,
                                boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }


    @Override
    protected void onError() {

    }
}
