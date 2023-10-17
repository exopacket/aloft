package com.inteliense.aloft.application.cache;

import com.inteliense.aloft.application.config.*;
import com.inteliense.aloft.compiler.lang.types.base.V;
import com.inteliense.aloft.compiler.lang.types.t.StringT;
import com.inteliense.aloft.server.html.elements.css.Font;
import com.inteliense.aloft.server.html.elements.css.Stylesheet;
import com.inteliense.aloft.server.html.elements.js.JavaScript;
import com.inteliense.aloft.server.http.supporting.Route;
import com.inteliense.aloft.server.http.supporting.VariableTree;

import java.util.ArrayList;

public class AppCache {

    RouteCache routeCache;

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

}
