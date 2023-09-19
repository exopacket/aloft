package com.inteliense.aloft.application.cache;

import com.inteliense.aloft.application.config.RouteList;
import com.inteliense.aloft.server.http.supporting.Route;
import com.inteliense.aloft.utils.global.__;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class RouteCache {

    private RouteList routes;
    private HashMap<String, int[]> cacheByRequestType = new HashMap<>();
    private HashMap<String, int[][]> combinedCache = new HashMap<>();

    private final String[] requestTypeOrder = new String[]{
        "GET",
        "POST",
        "PUT",
        "PATCH",
        "DELETE",
        "OPTIONS"
    };

    public RouteCache(RouteList routes) {
        this.routes = routes;
        cacheByRequestType.put("GET", new int[]{0,0});
        cacheByRequestType.put("POST", new int[]{0,0});
        cacheByRequestType.put("PUT", new int[]{0,0});
        cacheByRequestType.put("PATCH", new int[]{0,0});
        cacheByRequestType.put("DELETE", new int[]{0,0});
        cacheByRequestType.put("OPTIONS", new int[]{0,0});
    }

    public RouteList getAllRoutes() {
        return this.routes;
    }

    public int[] fetchRange(String path, String requestType) {
        int order = -1;
        for(int i=0;i<requestTypeOrder.length; i++) if(__.same(requestTypeOrder[i], requestType)) order = i;
        if(order < 0) return null;
        int[][] arr = combinedCache.get(trimPath(path));
        return arr[order];
    }

    private String trimPath(String path) {
        return path;
    }

    private void iterate() {
        //FIXME
        HashMap<String, List<String>> collection = new HashMap<>();
        for(int i=0; i<requestTypeOrder.length; i++) {
            ArrayList<Route> byTypeList = this.routes.getAllByRequestType(requestTypeOrder[i]);
            String[] paths = new String[byTypeList.size()];
            for(int x=0; x<paths.length; x++) paths[x] = trimPath(byTypeList.get(x).getPath());
            Arrays.sort(paths);
            collection.put(requestTypeOrder[i], Arrays.asList(paths));
        }
    }

    private void appendRoute(Route route) {
        int[] requestTypeRange = getRequestTypeRange(route);
        //FIXME
        requestTypeRange[1]++;
        cacheByRequestType.replace(route.getRequestTypeString(), requestTypeRange);
    }

    private int[] getRequestTypeRange(Route route) {
        return cacheByRequestType.get(route.getRequestTypeString());
    }

    private void sortAndCombine() {

    }

}
