package com.inteliense.aloft.compiler.lang.lib;

import com.inteliense.aloft.compiler.lang.lib.model._AloftModel;
import com.inteliense.aloft.server.http.supporting.Route;
import com.inteliense.aloft.server.http.supporting.VariableTree;
import com.inteliense.aloft.utils.global.__;

import java.lang.reflect.Constructor;
import java.util.ArrayList;

public class _AloftRoute {

    private String path = null;
    private String requestType = null;
    private VariableTree vars = null;
    private Class<?> c = null;

    public _AloftRoute(String path, String requestType, Class<?> c) {
        this.path = path;
        this.requestType = requestType;
        this.c = c;
    }

    public _AloftRoute(String path, String requestType, VariableTree vars) {
        this.path = path;
        this.requestType = requestType;
        this.vars = vars;
    }

    public Route getRoute() {
        if(__.isset(this.vars)) return new Route(this.path, this.requestType, this.vars, this.c);
        return new Route(this.path, this.requestType, this.c);
    }

}
