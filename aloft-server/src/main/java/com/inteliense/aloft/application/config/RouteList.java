package com.inteliense.aloft.application.config;

import com.inteliense.aloft.server.http.supporting.Route;
import com.inteliense.aloft.utils.global.__;

import java.util.*;

public abstract class RouteList {

    private ArrayList<Route> routes = new ArrayList<>();

    private final String[] requestTypeOrder = new String[]{
            "GET",
            "POST",
            "PUT",
            "PATCH",
            "DELETE",
            "OPTIONS"
    };

    public abstract void onUpdate(ArrayList<Route> routes);

    public RouteList() { }

    public RouteList(ArrayList<Route> routes) {
        this.routes = routes;
        sort(false);
    }

    public RouteList(Route[] routes) {
        this.routes.addAll(Arrays.asList(routes));
        sort(false);
    }

    public Route find(String path, String requestType) {
        return find(path, requestType, 0);
    }

    public Route find(String path, String requestType, int startIndex) {
        return find(path, requestType, startIndex, routes.size() - 1);
    }

    public Route find(String path, String requestType, int startIndex, int endIndex) {
        for(int i=startIndex; i<endIndex; i++) {
            Route route = this.routes.get(i);
            if(route.getPath().matches(path)) return route;
        }
        return null;
    }

    public ArrayList<Route> getAllRoutes() { return routes; }

    public void appendRoute(Route route) {
        routes.add(route);
        sort(true);
    }

    public void dumpList() {
        for (Route route : routes) System.out.println(" [ " + route.getRequestTypeString() + " ] " + route.getPath());
    }

    private ArrayList<Route> getAllByRequestType(String requestType) {
        ArrayList<Route> byRequestType = new ArrayList<>();
        for(int i=0; i< routes.size(); i++)
            if(__.same(routes.get(i).getRequestTypeString(), requestType)) byRequestType.add(routes.get(i));
        return byRequestType;
    }

    private String trimPath(String path) {
        return path;
    }

    private void sort(boolean callback) {
        HashMap<String, List<Route>> collection = new HashMap<>();
        for (String s : requestTypeOrder) {
            List<Route> byTypeList = getAllByRequestType(s);
            byTypeList.sort(new Comparator<Route>() {
                @Override
                public int compare(Route o1, Route o2) {
                    return trimPath(o1.getPath().getPathString()).compareTo(trimPath(o2.getPath().getPathString()));
                }
            });
            collection.put(s, byTypeList);
        }
        routes.clear();
        for (String requestType : requestTypeOrder) {
            List<Route> current = collection.get(requestType);
            routes.addAll(current);
        }
        if(callback) onUpdate(routes);
    }

}
