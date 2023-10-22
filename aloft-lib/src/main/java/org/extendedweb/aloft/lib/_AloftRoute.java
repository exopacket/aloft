package org.extendedweb.aloft.lib;

import org.extendedweb.aloft.lib.http.supporting.Route;
import org.extendedweb.aloft.lib.http.supporting.VariableTree;
import org.extendedweb.aloft.utils.global.__;

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
