package org.extendedweb.aloft.lib.http.middleware.base;

import org.extendedweb.aloft.lib.http.supporting.AloftRequestType;
import org.extendedweb.aloft.lib.http.supporting.RequestParams;
import org.extendedweb.aloft.lib.http.supporting.Route;

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

    public boolean hardFails() {
        return hardFail;
    }

    public void appendAppliesTo(ApplyToType type) {
        ApplyTo applyTo = new ApplyTo(type);
        if(!contains(applyTo)) this.appliesTo.add(applyTo);
    }

    public void appendAppliesTo(ApplyToType type, Route[] routes) {
        ApplyTo applyTo = new ApplyTo(type, routes);
        if(!contains(applyTo)) this.appliesTo.add(applyTo);
    }

    public boolean appliesTo(AloftRequestType type, Route appliesTo) {
        ApplyToType appliesToType = getType(type);
        for(int i=0; i<this.appliesTo.size(); i++)
            if(this.appliesTo.get(i).applies(appliesToType, appliesTo)) return true;
        return false;
    }

    public MiddlewareResult apply(RequestParams params, MiddlewareResultCollection previous) {
        MiddlewareResult middlewareResult = null;
        if(this.appliesTo(params.getInternalRequestType(), params.route())) middlewareResult = validate(params);
        return middlewareResult;
    }

    private boolean contains(ApplyTo toCheck) {
        for(int i=0; i<appliesTo.size(); i++) if(appliesTo.get(i).isEqual(toCheck)) return true;
        return false;
    }

    private ApplyToType getType(AloftRequestType requestType) {
        return ApplyToType.PUBLIC_API;
    }

}
