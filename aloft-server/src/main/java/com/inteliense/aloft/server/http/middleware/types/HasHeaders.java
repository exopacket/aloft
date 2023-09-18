package com.inteliense.aloft.server.http.middleware.types;

import com.inteliense.aloft.server.http.middleware.base.Middleware;
import com.inteliense.aloft.server.http.middleware.base.MiddlewareFailure;
import com.inteliense.aloft.server.http.middleware.base.MiddlewareResult;
import com.inteliense.aloft.server.http.middleware.base.MiddlewareSuccess;
import com.inteliense.aloft.server.http.supporting.HeaderList;
import com.inteliense.aloft.server.http.supporting.RequestParams;

import java.util.ArrayList;
import java.util.Arrays;

public class HasHeaders extends Middleware {

    private ArrayList<String> required = new ArrayList<>();

    public HasHeaders() { }

    public HasHeaders(ArrayList<String> required) {
        this.required = required;
    }

    public HasHeaders(String[] required) {
        this.required.addAll(Arrays.asList(required));
    }

    public void appendHeader(String header) {
        this.required.add(header);
    }

    @Override
    protected MiddlewareResult validate(RequestParams params) {
        ArrayList<String> missing = new ArrayList<>();
        for(int i=0; i< required.size(); i++) {
            String requirement = required.get(i);
            if(!params.hasHeader(requirement)) missing.add(requirement);
        }
        if(missing.size() == 0) return new MiddlewareSuccess();
        String[] messages = new String[missing.size()];
        for(int i=0; i<missing.size(); i++) {
            String current = missing.get(i);
            String message = current + " header was missing";
            messages[i] = message;
        }
        return new MiddlewareFailure("There were missing headers with your request.", messages, 400);
    }
}
