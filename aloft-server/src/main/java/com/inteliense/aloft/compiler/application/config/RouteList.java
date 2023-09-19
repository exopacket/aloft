package com.inteliense.aloft.compiler.application.config;

import com.inteliense.aloft.server.http.supporting.Route;
import com.inteliense.aloft.utils.global.__;

import java.util.ArrayList;

public class RouteList {

    private ArrayList<Route> routes = new ArrayList<>();

    public Route find(String path, String requestType) {
        return find(path, requestType, 0);
    }

    public Route find(String path, String requestType, int startIndex) {
        return find(path, requestType, startIndex, routes.size() - 1);
    }

    public Route find(String path, String requestType, int startIndex, int endIndex) {
        return null;
    }

    public void updateSortedList(ArrayList<Route> routes) {
        this.routes = routes;
    }

    public ArrayList<Route> getAllByRequestType(String requestType) {
        ArrayList<Route> byRequestType = new ArrayList<>();
        for(int i=0; i< routes.size(); i++)
            if(__.same(routes.get(i).getRequestTypeString(), requestType)) byRequestType.add(routes.get(i));
        return byRequestType;
    }

}
