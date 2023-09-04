package com.inteliense.aloft.utils.exceptions.types;

import com.inteliense.datautils.JSON;
import com.inteliense.lot.exceptions.reporting.ErrorReporter;
import org.json.simple.JSONObject;

import java.util.ArrayList;

public class ReportedException extends Throwable {

    private String message;
    private ArrayList<String> stacktrace;
    private ArrayList<String[]> suppressed;

    private int code;
    private String userMessage;

    private boolean reported = false;
    private boolean failed = false;

    public ReportedException() {
        super();
    }

    public ReportedException(String message) {
        super(message);
        this.message = message;
        this.userMessage = message;
        parseStacktrace();
    }

    public ReportedException(String message, Throwable cause) {
        super(cause);
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

    private void parseStacktrace() {
        StackTraceElement[] arr = this.getStackTrace();
        for(StackTraceElement entry : arr) {
            this.stacktrace.add(getStacktraceJson(entry));
        }
    }

    private String getStacktraceJson(StackTraceElement element) {
        JSONObject obj = new JSONObject();
        obj.put("class_name", element.getClassName());
        obj.put("file_name", element.getFileName());
        obj.put("method_name", element.getMethodName());
        obj.put("line_number", element.getLineNumber());
        obj.put("class_loader_name", element.getClassLoaderName());
        obj.put("module_name", element.getModuleName());
        obj.put("module_version", element.getModuleVersion());
        return JSON.getString(obj);
    }

}
