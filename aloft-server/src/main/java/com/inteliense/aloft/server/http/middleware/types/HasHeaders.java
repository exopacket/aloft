package com.inteliense.aloft.server.http.middleware.types;

import com.inteliense.aloft.server.http.middleware.base.Middleware;
import com.inteliense.aloft.server.http.middleware.base.MiddlewareFailure;
import com.inteliense.aloft.server.http.middleware.base.MiddlewareResult;
import com.inteliense.aloft.server.http.supporting.RequestParams;
import org.json.simple.JSONObject;

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
        return new MiddlewareFailure(new JSONObject(), 500);
    }
}
