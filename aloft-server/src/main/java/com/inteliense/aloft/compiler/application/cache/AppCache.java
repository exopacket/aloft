package com.inteliense.aloft.compiler.application.cache;

import com.inteliense.aloft.compiler.application.config.RouteList;
import com.inteliense.aloft.server.http.supporting.Route;

public class AppCache {

    RouteCache routeCache;

    public AppCache(RouteList routeList) {
        routeCache = new RouteCache(routeList);
    }

    public Route fetchRoute(String path, String requestType) {
        int[] range = this.routeCache.fetchRange(path, requestType);
        return this.routeCache.getAllRoutes().find(path, requestType, range[0], range[1]);
    }

}
