package org.extendedweb.aloft.lib;

import org.extendedweb.aloft.lib.application.cache.RouteCache;
import org.extendedweb.aloft.lib.model._AloftModel;
import org.extendedweb.aloft.lib.http.supporting.Route;

import java.lang.reflect.Constructor;
import java.util.ArrayList;

public class _AloftObjects {

    protected ArrayList<_AloftPage> pages = new ArrayList<>();
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
        if(instance instanceof _AloftPage) __append((_AloftPage) instance);
    }

    protected void __append(_AloftModel model) {
        models.add(model);
    }

    protected void __append(_AloftRoute route) {
        routes.add(route);
    }

    protected void __append(_AloftPage page) {
        Class<? extends _AloftPage> c = page.getClass();
        routes.add(new _AloftRoute(page.getPath(), "GET", c));
        pages.add(page);
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
