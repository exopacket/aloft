package org.extendedweb.aloft.server.compiler.compile.base.register;

import org.extendedweb.aloft.lib._AloftObjects;
import org.extendedweb.aloft.lib._AloftProject;
import org.extendedweb.aloft.lib.application.cache.RouteCache;
import org.extendedweb.aloft.lib.application.config.AppConfig;
import org.extendedweb.aloft.lib.http.supporting.Route;
import org.extendedweb.aloft.lib.lang.types.base.A;
import org.extendedweb.aloft.server.compiler.compile.base.objects.RouteGroupAloftObject;
import org.extendedweb.aloft.server.compiler.compile.supporting.AloftObject;
import org.extendedweb.aloft.server.compiler.compile.supporting.ContextContainer;
import org.extendedweb.aloft.server.compiler.exceptions.CompilerException;
import org.extendedweb.aloft.utils.global.__;

import java.util.ArrayList;
import java.util.HashMap;

public class CompiledObjectsRegister {

    private HashMap<Class<?>, HashMap<String, AloftObject>> register = new HashMap<>();
    private AppConfig config = null;
    private ComponentObjectRegister components;

    public CompiledObjectsRegister(String configPath, ComponentObjectRegister components) {
        config = parseConfig(configPath);
        this.components = components;
    }

    public CompiledObjectsRegister(AppConfig config, ComponentObjectRegister components) {
        this.config = config;
        this.components = components;
    }

    public ComponentObjectRegister getComponentsRegister() {
        return components;
    }

    public void register(Class<?> c, AloftObject instance, ContextContainer ctx) throws CompilerException {
        String identifier = instance.getName();
//        if(exists(c, identifier)) ctx.e("Duplicate object name", CompilerException.ExceptionType.CRITICAL);
        if(!register.containsKey(c)) register.put(c, new HashMap<>());
        register.get(c).put(identifier, instance);
        System.out.println("MADE IT THO" + c.getName());
    }

    public boolean existsInScope(String identifier) {
        for(Class<?> type : register.keySet())
            for(String id : register.get(type).keySet()) if(__.same(id, identifier)) return true;
        return false;
    }

    public boolean exists(Class<?> c, String identifier) {
        if(register.isEmpty() || !register.containsKey(c)) return false;
        return register.get(c).containsKey(identifier);
    }

    public AloftObject get(Class<?> c, String identifier) {
        if(!exists(c, identifier)) return null;
        HashMap<String, AloftObject> map = register.get(c);
        return map.get(identifier);
    }

    public AppConfig getConfig() {
        return config;
    }

    public RouteCache getRouteCache() {
        ArrayList<Route> routes = new ArrayList<>();
        HashMap<String, AloftObject> routeGroups = register.get(RouteGroupAloftObject.class);
        System.out.println(routeGroups.size());
        for(String key : routeGroups.keySet())
            routes.addAll(((RouteGroupAloftObject) routeGroups.get(key)).getRoutes(this));
        return new RouteCache(routes);
    }

    public _AloftProject buildProject() {
        return null;
    }

    private AppConfig parseConfig(String configPath) {
        return new AppConfig(configPath);
    }

}
