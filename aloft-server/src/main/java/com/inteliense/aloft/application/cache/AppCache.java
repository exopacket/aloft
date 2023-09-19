package com.inteliense.aloft.application.cache;

import com.inteliense.aloft.application.config.RouteList;
import com.inteliense.aloft.server.http.supporting.Route;

import java.util.ArrayList;

public class AppCache {

    RouteCache routeCache;

    public AppCache() {
        ArrayList<Route> routes = new ArrayList<>();
        routes.add(new Route("/images", "POST"));
        routes.add(new Route("/images", "GET"));
        routes.add(new Route("/api", "GET"));
        routeCache = new RouteCache(routes);
    }

    public Route fetchRoute(String path, String requestType) {
        int[] range = this.routeCache.fetchRange(path, requestType);
        System.out.println("[0]=" + range[0]);
        System.out.println("[1]=" + range[1]);
        return this.routeCache.getRouteList().find(path, requestType, range[0], range[1]);
    }

}
