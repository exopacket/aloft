package com.inteliense.aloft.application.cache;

import com.inteliense.aloft.application.config.RouteList;
import com.inteliense.aloft.server.http.supporting.Route;
import com.inteliense.aloft.utils.global.__;
import org.apache.logging.log4j.core.util.ArrayUtils;

import java.util.*;

public class RouteCache {

    private RouteList routes;
    //FIXME UNUSED FOR NOW { cacheByRequestType }
    private HashMap<String, int[]> cacheByRequestType = new HashMap<>();
    private HashMap<String, ArrayList<CacheEntry>> combinedCache = new HashMap<>();

    private final String[] requestTypeOrder = new String[]{
        "GET",
        "POST",
        "PUT",
        "PATCH",
        "DELETE",
        "OPTIONS"
    };

    public RouteCache(ArrayList<Route> routes) {
        this.routes = new RouteList(routes) {
            @Override
            public void onUpdate(ArrayList<Route> routes) {
                createCache(routes);
            }
        };
        cacheByRequestType.put("GET", new int[]{0,0});
        cacheByRequestType.put("POST", new int[]{0,0});
        cacheByRequestType.put("PUT", new int[]{0,0});
        cacheByRequestType.put("PATCH", new int[]{0,0});
        cacheByRequestType.put("DELETE", new int[]{0,0});
        cacheByRequestType.put("OPTIONS", new int[]{0,0});

        combinedCache.put("GET", new ArrayList<>());
        combinedCache.put("POST", new ArrayList<>());
        combinedCache.put("PUT", new ArrayList<>());
        combinedCache.put("PATCH", new ArrayList<>());
        combinedCache.put("DELETE", new ArrayList<>());
        combinedCache.put("OPTIONS", new ArrayList<>());
        createCache(routes);
    }

    public RouteList getRouteList() {
        return this.routes;
    }

    public void printCache() {
        this.routes.dumpList();
    }

    public int[] fetchRange(String path, String requestType) {
        int order = -1;
        for(int i=0;i<requestTypeOrder.length; i++) if(__.same(requestTypeOrder[i], requestType)) order = i;
        if(order < 0) return new int[]{0,0};
        ArrayList<CacheEntry> entries = combinedCache.get(requestType);
        for(int i=0; i<entries.size(); i++) {
            CacheEntry entry = entries.get(i);
            if(entry.match(trimPath(path))) return entry.range();
        }
        return new int[]{0,0};
    }

    private int getOrder(String type) {
        for(int i=0; i< requestTypeOrder.length; i++) if(__.same(type, requestTypeOrder[i])) return i;
        return 0;
    }

    private void createCache(ArrayList<Route> routes) {
        cacheByRequestType.clear();
        combinedCache.clear();
        int currentRequestType = 0;
        int reqTypeStart = 0;
        int pathStart = 0;
        String currentPath = routes.get(0).getPath();
        ArrayList<CacheEntry> entries = new ArrayList<>();
        boolean wasLast = false;
        int i;
        for(i=0; i<routes.size(); i++) {
            wasLast = false;
            Route route = routes.get(i);
            String path = trimPath(route.getPath());
            String reqType = route.getRequestTypeString();
            if(!__.same(currentPath, path) || !__.same(reqType, requestTypeOrder[currentRequestType])) {
                entries.add(new CacheEntry(currentPath, new int[]{ pathStart, i }));
                pathStart = i;
                currentPath = path;
            }
            if(!__.same(reqType, requestTypeOrder[currentRequestType])) {
                ArrayList<CacheEntry> current = combinedCache.get(requestTypeOrder[currentRequestType]);
                if(!__.isset(current)) combinedCache.put(requestTypeOrder[currentRequestType], new ArrayList<>());
                for(int x=0; x<entries.size(); x++) {
                    combinedCache.get(requestTypeOrder[currentRequestType]).add(entries.get(x));
                }
                entries.clear();
                cacheByRequestType.put(requestTypeOrder[currentRequestType], new int[] { reqTypeStart, i });
                reqTypeStart = i;
                currentPath = routes.get(routes.size() - 1).getPath();
                currentRequestType = getOrder(reqType);
                wasLast = true;
            }
        }
        if(wasLast) {
            ArrayList<CacheEntry> current = combinedCache.get(requestTypeOrder[currentRequestType]);
            if(!__.isset(current)) combinedCache.put(requestTypeOrder[currentRequestType], new ArrayList<>());
            for(int x=0; x<entries.size(); x++) {
                combinedCache.get(requestTypeOrder[currentRequestType]).add(entries.get(x));
            }
            entries.clear();
            cacheByRequestType.put(requestTypeOrder[currentRequestType], new int[] { reqTypeStart, i });
        }
    }

    private String trimPath(String path) {
        return path;
    }

    private int[] getRequestTypeRanges(Route route) {
        return cacheByRequestType.get(route.getRequestTypeString());
    }

    private class CacheEntry {
        private String path;
        private int[] range;

        public CacheEntry(String path, int[] range) {
            this.path = path;
            this.range = range;
        }

        public boolean match(String path) { return __.same(path, this.path); }

        public int[] range() {
            return range;
        }

    }

}