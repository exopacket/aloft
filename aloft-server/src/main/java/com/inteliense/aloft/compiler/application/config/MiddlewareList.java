package com.inteliense.aloft.compiler.application.config;

import com.inteliense.aloft.server.http.middleware.base.ApplyTo;
import com.inteliense.aloft.server.http.middleware.base.Middleware;
import com.inteliense.aloft.server.http.middleware.base.MiddlewareResult;
import com.inteliense.aloft.server.http.middleware.base.MiddlewareResultCollection;
import com.inteliense.aloft.server.http.supporting.RequestParams;

import java.util.ArrayList;
import java.util.Arrays;

public class MiddlewareList {

    private ArrayList<Middleware> list = new ArrayList<>();

    public MiddlewareList() { }

    public MiddlewareList(Middleware[] middleware) {
        this.list.addAll(Arrays.asList(middleware));
    }

    public void appendAppMiddleware(Middleware middleware) {
        this.list.add(middleware);
    }

    public MiddlewareResultCollection validateAgainstMiddleware(RequestParams params) {
        MiddlewareResultCollection results = new MiddlewareResultCollection();
        for(int i=0; i<list.size(); i++) {
            Middleware current = list.get(i);
            results = current.apply(params.getAppliedMiddleware(), params, results);
        }
        return results;
    }

}
