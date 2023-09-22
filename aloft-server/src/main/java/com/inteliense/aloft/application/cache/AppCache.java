package com.inteliense.aloft.application.cache;

import com.inteliense.aloft.application.config.RouteList;
import com.inteliense.aloft.compiler.lang.types.base.V;
import com.inteliense.aloft.compiler.lang.types.t.StringT;
import com.inteliense.aloft.server.http.supporting.Route;
import com.inteliense.aloft.server.http.supporting.VariableTree;

import java.util.ArrayList;

public class AppCache {

    RouteCache routeCache;

    public AppCache() {
        ArrayList<Route> routes = new ArrayList<>();
        VariableTree vars = new VariableTree();
        vars.addNode("text", new StringT());
        routes.add(new Route("/images", "POST"));
        routes.add(new Route("/images", "GET"));
        routes.add(new Route("/api/*", "GET", vars));
        routes.add(new Route("/", "GET"));
        routes.add(new Route("/js/bootstrap.js", "GET"));
        routeCache = new RouteCache(routes);
    }

    public Route fetchRoute(String path, String requestType) {
        int[] range = this.routeCache.fetchRange(path, requestType);
        return this.routeCache.getRouteList().find(path, requestType, range[0], range[1]);
    }

}
