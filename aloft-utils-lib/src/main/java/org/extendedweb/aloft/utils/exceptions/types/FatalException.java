package org.extendedweb.aloft.utils.exceptions.types;

public class FatalException extends ExceptionAdapter {

    public FatalException() {
        super();
    }

    public FatalException(String message) {
        super(message);
    }

    public FatalException(String message, Throwable cause) {
        super(message, cause);
    }

    public FatalException(Throwable cause) {
        super(cause);
    }

    protected FatalException(String message, Throwable cause,
                                boolean enableSuppression,
                                boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }


    @Override
    protected void onError() {

    }
}
