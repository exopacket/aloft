package org.extendedweb.aloft.lib.lang.types.t;

import org.extendedweb.aloft.lib.lang.structure.elements.base.AloftInstance;
import org.extendedweb.aloft.lib.lang.types.base.T;
import org.extendedweb.aloft.lib.lang.types.base.V;
import org.extendedweb.aloft.lib.lang.types.v.InstanceV;
import org.extendedweb.aloft.lib.lang.types.v.NullV;
import org.extendedweb.aloft.utils.global.__;

import java.util.HashMap;

public class InstanceT extends T {

    private Class<? extends AloftInstance> instanceType = null;
    private String property = "";
    private T[] innerTypes = null;

    public InstanceT() { }

    public InstanceT(Class<? extends AloftInstance> instanceType) { }

    public InstanceT(String property) {
        this.property = property;
    }

    public InstanceT(String property, T... innerTypes) {
        this.property = property;
        this.innerTypes = innerTypes;
    }

    public InstanceT(Class<? extends AloftInstance> instanceType, String property) {
        this.property = property;
    }

    public InstanceT(Class<? extends AloftInstance> instanceType, String property, T... innerTypes) {
        this.property = property;
        this.innerTypes = innerTypes;
    }

    public V value(InstanceV v) {
        if(!__.empty(property) && __.isset(v.get(property))) {
            V val = v.get(property);
            if(__.isset(innerTypes) && val instanceof InstanceV && allowed(val)) {
                InstanceT type = getInstanceType();
                return type.value(v).get();
            }
            if(__.isset(innerTypes) && allowed(val)) return val.get();
            else if(__.isset(innerTypes)) return V.nothing();
            else return val.get();
        } else if(__.isset(property) && !__.isset(v.get(property))) return V.nothing();
        return v;
    }

    private boolean allowed(V v) {
        for(T type : innerTypes) {
            if(type.getClass().equals(v.type().getClass())) return true;
        }
        return false;
    }

    @Override
    public V value(Object v) {
        return new NullV();
    }

    public V value(String name, HashMap<String, V> properties) {
        InstanceV val = new InstanceV(name, properties);
        if(__.isset(property)) return value(val);
        return val;
    }

    private InstanceT getInstanceType() {
        for(T type : innerTypes) if(type instanceof InstanceT) return (InstanceT) type;
        return new InstanceT();
    }

}
