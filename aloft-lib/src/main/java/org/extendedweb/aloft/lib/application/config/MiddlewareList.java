package org.extendedweb.aloft.lib.application.config;

import org.extendedweb.aloft.lib.http.middleware.base.Middleware;
import org.extendedweb.aloft.lib.http.middleware.base.MiddlewareResult;
import org.extendedweb.aloft.lib.http.middleware.base.MiddlewareResultCollection;
import org.extendedweb.aloft.lib.http.supporting.RequestParams;
import org.extendedweb.aloft.utils.global.__;

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
