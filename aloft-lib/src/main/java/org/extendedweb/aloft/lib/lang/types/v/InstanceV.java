package org.extendedweb.aloft.lib.lang.types.v;

import org.extendedweb.aloft.lib.lang.types.base.T;
import org.extendedweb.aloft.lib.lang.types.base.V;
import org.extendedweb.aloft.lib.lang.types.t.InstanceT;
import org.extendedweb.aloft.utils.global.__;

import java.util.HashMap;

public class InstanceV extends V {

    private String name;
    protected HashMap<String, V> properties = new HashMap<>();
    protected V value = null;

    public InstanceV(String name) {
        this.name = name;
    }

    public InstanceV(String name, HashMap<String, V> properties) {
        this.name = name;
        this.properties = properties;
    }

    @Override
    public V get() {
        if(__.isset(value)) return value;
        return this;
    }

    @Override
    public T type() {
        return new InstanceT();
    }

    public String[] keys() {
        if(__.isset(value)) return new String[]{null};
        String[] keys = new String[properties.size()];
        properties.keySet().toArray(keys);
        return keys;
    }

    public String getName() {
        return name;
    }

    public V get(String property) {
        if(!__.isset(property)) return value;
        if(!__.isset(properties.get(property))) return V.nothing();
        return properties.get(property);
    }

    public HashMap<String, Object> getMap() {
        HashMap<String, Object> ret = new HashMap<>();
        for(String key : keys()) {
            ret.put(key, properties.get(key));
            if(!__.isset(key)) break;
        }
        return ret;
    }

}
