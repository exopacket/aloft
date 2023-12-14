package org.extendedweb.aloft.lib.lang.types.t;

import org.extendedweb.aloft.lib.lang.structure.components.AloftComponent;
import org.extendedweb.aloft.lib.lang.types.base.T;
import org.extendedweb.aloft.lib.lang.types.base.V;
import org.extendedweb.aloft.lib.lang.types.v.AloftComponentV;
import org.extendedweb.aloft.lib.lang.types.v.InstanceV;
import org.extendedweb.aloft.lib.lang.types.v.NullV;
import org.extendedweb.aloft.utils.global.__;

import java.lang.reflect.Constructor;
import java.util.HashMap;

public class AloftComponentT extends T {

    private Class<? extends AloftComponent> c = null;

    public AloftComponentT() { }

    public AloftComponentT(Class<? extends AloftComponent> c) { this.c = c; }

    public AloftComponentT setClass(Class<? extends AloftComponent> c) { this.c = c; return this; }

    @Override
    public V value(Object v) {
        return new NullV();
    }

    public V value(InstanceV v) {
        if(!__.isset(c)) return new NullV();
        HashMap<String, Object> properties = v.getMap();
        try {
            Constructor<?> construct = c.getConstructor(HashMap.class);
            AloftComponent component = (AloftComponent) construct.newInstance(properties);
            return new AloftComponentV(component);
        } catch (Exception e) {
            return new NullV();
        }
    }

    public V value(HashMap<String, Object> properties) {
        if(!__.isset(c)) return new NullV();
        try {
            Constructor<?> construct = c.getConstructor(HashMap.class);
            AloftComponent component = (AloftComponent) construct.newInstance(properties);
            return new AloftComponentV(component);
        } catch (Exception e) {
            return new NullV();
        }
    }

    public V value(Class<? extends AloftComponent> c, HashMap<String, Object> properties) {
        try {
            Constructor<?> construct = c.getConstructor(HashMap.class);
            AloftComponent component = (AloftComponent) construct.newInstance(properties);
            return new AloftComponentV(component);
        } catch (Exception e) {
            return new NullV();
        }
    }


    public V value(String subtype, HashMap<String, Object> properties) {
        if(!__.isset(c)) return new NullV();
        try {
            Constructor<?> construct = c.getConstructor(HashMap.class, String.class);
            AloftComponent component = (AloftComponent) construct.newInstance(properties, subtype);
            return new AloftComponentV(component);
        } catch (Exception e) {
            return new NullV();
        }
    }

    public V value(Class<? extends AloftComponent> c, String subtype, HashMap<String, Object> properties) {
        try {
            Constructor<?> construct = c.getConstructor(HashMap.class, String.class);
            AloftComponent component = (AloftComponent) construct.newInstance(properties, subtype);
            return new AloftComponentV(component);
        } catch (Exception e) {
            return new NullV();
        }
    }

    public V value(AloftComponent component) {
        return new AloftComponentV(component);
    }

}
