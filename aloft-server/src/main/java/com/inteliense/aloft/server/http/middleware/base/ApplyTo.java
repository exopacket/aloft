package com.inteliense.aloft.server.http.middleware.base;

import com.inteliense.aloft.server.http.supporting.Route;
import com.inteliense.aloft.utils.global.__;

public class ApplyTo {

    private Route[] routes = new Route[0];
    private ApplyToType type;

    public ApplyTo(ApplyToType type) {
        this.type = type;
    }

    public ApplyTo(ApplyToType type, Route[] routes) {
        this.type = type;
        this.routes = routes;
    }

    public boolean isAllRoutes() {
        return routes.length == 0;
    }

    public void setRoutes(Route[] routes) {
        this.routes = routes;
    }

    public int routeSize() {
        return this.routes.length;
    }

    public ApplyToType getType() {
        return type;
    }

    public boolean isEqual(ApplyTo applyTo) {
        if(routeSize() != applyTo.routeSize()) return false;
        if(routeSize() == 0 && applyTo.getType() == type) return true;
        int equalRoutes = 0;
        for(int i=0; i<routes.length; i++) {
            if(applies(this.type, routes[i])) equalRoutes++;
        }
        return equalRoutes == routeSize();
    }

    private boolean contains(Route route) {
        if(routes.length == 0) return true;
        String routeId = route.getId();
        for(int i=0; i<routes.length; i++) if(__.same(routes[i].getId(), routeId)) return true;
        return false;
    }

    public boolean applies(ApplyToType type, Route route) {
        return this.type == type && contains(route);
    }

}
