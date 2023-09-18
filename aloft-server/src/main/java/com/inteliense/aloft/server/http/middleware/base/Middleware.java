package com.inteliense.aloft.server.http.middleware.base;

import com.inteliense.aloft.server.http.supporting.RequestParams;
import com.inteliense.aloft.utils.global.__;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class Middleware {

    protected ArrayList<ApplyTo> appliesTo =  new ArrayList<>();
    protected boolean hardFail = false;

    protected abstract MiddlewareResult validate(RequestParams params);

    public Middleware() { }

    public Middleware(boolean hardFail) {
        this.hardFail = hardFail;
    }

    public Middleware(ApplyTo[] appliesTo) {
        this.appliesTo.addAll(Arrays.asList(appliesTo));
    }

    public Middleware(ApplyTo[] appliesTo, boolean hardFail) {
        this.appliesTo.addAll(Arrays.asList(appliesTo));
        this.hardFail = hardFail;
    }

    public void appendAppliesTo(ApplyTo appliesTo) {
        if(!this.appliesTo.contains(appliesTo)) this.appliesTo.add(appliesTo);
    }

    public boolean appliesTo(ApplyTo appliesTo) {
        return this.appliesTo.contains(appliesTo);
    }

    public MiddlewareResultCollection apply(ApplyTo appliesTo, RequestParams params, MiddlewareResultCollection previous) {
        MiddlewareResult middlewareResult = null;
        if(this.appliesTo(appliesTo)) middlewareResult = validate(params);
        if(__.isset(middlewareResult) && previous.hasFailed()) middlewareResult.wasSilentlyChecked();
        return previous.appendResult(middlewareResult);
    }

}
