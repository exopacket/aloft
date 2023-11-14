package org.extendedweb.aloft.server.compiler.compile.base.register;

import org.extendedweb.aloft.lib._AloftObjects;
import org.extendedweb.aloft.lib._AloftProject;
import org.extendedweb.aloft.lib.application.config.AppConfig;
import org.extendedweb.aloft.utils.global.__;

import java.util.ArrayList;
import java.util.HashMap;

public class CompiledObjectsRegister {

    private HashMap<Class<?>, ArrayList<String>> registered = new HashMap<>();
    private HashMap<Class<?>, ArrayList<String>> queued = new HashMap<>();
    private _AloftObjects objects = new _AloftObjects();
    private AppConfig config = null;

    public CompiledObjectsRegister(String configPath) {
        config = parseConfig(configPath);
    }

    public void register(Class<?> c, String identifier, Object instance) {

    }

    //TODO
    public boolean existsInScope(String identifier) {
        return false;
    }

    public void exists(Class<?> c, String identifier) {
        if(registered.isEmpty() || !registered.containsKey(c)) {
            if(queued.isEmpty() || !queued.containsKey(c)) {
                queued.put(c, new ArrayList<>());
            }
            queued.get(c).add(identifier);
        } else {
            ArrayList<String> list = registered.get(c);
            boolean found = false;
            for(String id : list) {
                if(__.same(id, identifier)) {
                    found = true;
                    break;
                }
            }
            if(!found) {
                if(queued.isEmpty() || !queued.containsKey(c)) {
                    queued.put(c, new ArrayList<>());
                }
                queued.get(c).add(identifier);
            }
        }
    }

    public _AloftProject buildProject() {
        return null;
    }

    private AppConfig parseConfig(String configPath) {
        return new AppConfig(configPath);
    }

}
