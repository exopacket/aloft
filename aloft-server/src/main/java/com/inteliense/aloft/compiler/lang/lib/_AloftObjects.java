package com.inteliense.aloft.compiler.lang.lib;

import com.inteliense.aloft.application.cache.RouteCache;
import com.inteliense.aloft.compiler.lang.lib.model._AloftModel;
import com.inteliense.aloft.server.http.supporting.Route;

import java.lang.reflect.Constructor;
import java.util.ArrayList;

public abstract class _AloftObjects {

    protected ArrayList<_AloftRoute> routes = new ArrayList<>();
    protected ArrayList<_AloftModel> models = new ArrayList<>();

    public void append(Class<?> c) throws Exception {
        Constructor<?> construct = c.getConstructor();
        _append(construct.newInstance());
    }

    public void append(Object instance) throws Exception {
        _append(instance);
    }

    private void _append(Object instance) {
        if(instance instanceof _AloftModel) __append((_AloftModel) instance);
        if(instance instanceof _AloftRoute) __append((_AloftRoute) instance);
    }

    protected void __append(_AloftModel model) {
        models.add(model);
    }

    protected void __append(_AloftRoute route) {
        routes.add(route);
    }

    public int findModel(String name) {
        for(int i=0; i<models.size(); i++) {
            if(models.get(i).getName().equals(name)) return i;
        }
        return -1;
    }

    public _AloftModel getModel(int index) {
        return models.get(index);
    }

    public RouteCache getRouteCache() {
        ArrayList<Route> arr = new ArrayList<Route>();
        for(_AloftRoute route : routes) {
            arr.add(route.getRoute());
        }
        return new RouteCache(arr);
    }

}
