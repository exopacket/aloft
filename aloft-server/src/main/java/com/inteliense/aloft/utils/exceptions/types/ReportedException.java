package com.inteliense.aloft.utils.exceptions.types;

import com.inteliense.aloft.utils.exceptions.reporting.ErrorReporter;

public class ReportedException extends ExceptionAdapter {

    private boolean reported = false;
    private boolean failed = false;

    public ReportedException() {
        super();
    }

    public ReportedException(String message) {
        super(message);
    }

    public ReportedException(String message, Throwable cause) {
        super(message, cause);
    }

    public ReportedException(Throwable cause) {
        super(cause);
    }

    protected ReportedException(String message, Throwable cause,
                                boolean enableSuppression,
                                boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }


    public boolean tryReport() {
        if(reported && !failed) return true;
        else if(reported && failed) return false;
        else {
            return ErrorReporter.report(this);
        }
    }

    @Override
    protected void onError() {

    }
}
