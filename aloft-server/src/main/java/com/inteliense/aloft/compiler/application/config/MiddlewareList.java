package com.inteliense.aloft.compiler.application.config;

import com.inteliense.aloft.server.http.middleware.base.Middleware;
import com.inteliense.aloft.server.http.middleware.base.MiddlewareResult;
import com.inteliense.aloft.server.http.middleware.base.MiddlewareResultCollection;
import com.inteliense.aloft.server.http.supporting.RequestParams;
import com.inteliense.aloft.utils.global.__;

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
            MiddlewareResult result = current.apply(params, results);
            if(!__.isset(result)) continue;
            if(current.hardFails() && result.failedValidation()) {
                results.fail();
                results = results.appendResult(result);
                return results;
            } else if(results.hasFailed()) {
                result.wasSilentlyChecked();
                results = results.appendResult(result);
            } else if(result.failedValidation()) {
                results.fail();
                results = results.appendResult(result);
            }
        }
        if(!results.hasFailed()) results.passAll();
        return results;
    }

}
