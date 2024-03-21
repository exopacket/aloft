package org.extendedweb.aloft.lib.application.cache;

import org.extendedweb.aloft.lib.application.config.*;
import org.extendedweb.aloft.lib.db.internal.connectors.RedisConnection;
import org.extendedweb.aloft.lib.lang.structure.elements.base.AloftElement;
import org.extendedweb.aloft.lib.lang.structure.elements.base.AloftElementExtension;
import org.extendedweb.aloft.lib.html.elements.css.Font;
import org.extendedweb.aloft.lib.html.elements.css.Stylesheet;
import org.extendedweb.aloft.lib.html.elements.js.JavaScript;
import org.extendedweb.aloft.lib.http.supporting.Route;
import org.extendedweb.aloft.utils.global.__;

import java.util.ArrayList;
import java.util.HashMap;

public class AppCache {

    private RouteCache routeCache;
    private HashMap<String, ArrayList<AloftElementExtension>> extensions = new HashMap<>();
    private RedisConnection redis;

    public AppCache(RouteCache routes) {
        this.routeCache = routes;
    }

    public void addStaticJavascript(JavaScriptEndpointList list) {
        for(int i=0; i<list.size(); i++) {
            JavaScript js = list.next();
            routeCache.getRouteList().appendRoute(new Route(js.getFile().getPath(), "GET"));
        }
    }

    public void addStaticStylesheets(StylesheetEndpointList list) {
        for(int i=0; i<list.size(); i++) {
            Stylesheet css = list.next();
            routeCache.getRouteList().appendRoute(new Route(css.getFile().getPath(), "GET"));
        }
    }

    public void addStaticFonts(FontEndpointList list) {
        for(int i=0; i<list.size(); i++) {
            Font font = list.next();
            routeCache.getRouteList().appendRoute(new Route(font.getPath(), "GET"));
        }
    }

    public Route fetchRoute(String path, String requestType) {
        int[] range = this.routeCache.fetchRange(path, requestType);
        return this.routeCache.getRouteList().find(path, requestType, range[0], range[1]);
    }

    public void createExtensions(AloftElement element) {
        String key = element.getClass().getName();
        if(!this.extensions.containsKey(key)) return;
        if(!__.isset(this.extensions.get(key))) return;
        AloftElementExtension[] arr = new AloftElementExtension[extensions.size()];
        this.extensions.get(key).toArray(arr);
        element.setupExtensions(arr);
    }

}
