package org.extendedweb.aloft.utils.exceptions.types;

import org.extendedweb.aloft.utils.data.JSON;
import org.json.simple.JSONObject;

import java.util.ArrayList;

public abstract class ExceptionAdapter extends Throwable {

    protected String message;
    protected ArrayList<String> stacktrace;
    protected ArrayList<String[]> suppressed;

    protected int code;
    protected String userMessage;
    protected abstract void onError();

    public ExceptionAdapter() {
        super();
    }

    public ExceptionAdapter(String message) {
        super(message);
        if(printErrors()) System.err.println(message);
        this.message = message;
        this.userMessage = message;
        onError();
    }

    public ExceptionAdapter(String message, Throwable cause) {
        super(message, cause);
        if(printErrors()) System.err.println(message);
        this.message = message;
        this.userMessage = message;
        onError();
    }

    public ExceptionAdapter(Throwable cause) {
        super(cause);
        if(printErrors()) System.err.println(cause.getMessage());
        onError();
    }

    protected ExceptionAdapter(String message, Throwable cause,
                                boolean enableSuppression,
                                boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
        if(printErrors()) System.err.println(message);
        onError();
    }

    public void report() {
        if(this instanceof ReportedException) {
            ((ReportedException) this).tryReport();
            return;
        }
        ReportedException conversion = new ReportedException(this);
        conversion.tryReport();
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

    protected boolean printErrors() {
        return true;
    }
    
}
