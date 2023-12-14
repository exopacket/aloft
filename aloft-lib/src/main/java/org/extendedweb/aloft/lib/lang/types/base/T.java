package org.extendedweb.aloft.lib.lang.types.base;

import org.extendedweb.aloft.lib.lang.structure.elements.base.AloftInstance;
import org.extendedweb.aloft.lib.lang.structure.elements.base.AloftStyleInstance;
import org.extendedweb.aloft.lib.lang.types.t.*;
import org.extendedweb.aloft.lib.lang.types.v.NullV;
import org.extendedweb.aloft.utils.global.__;

public abstract class T {

    public abstract V value(Object v);

    public static T string() {
        return new StringT();
    }

    public static T number() {
        return new NumberT();
    }

    public static T array() {
        return new ArrayT();
    }

    public static T array(T type) {
        return new ArrayT(type);
    }

    public static T dynamic() {
        return new DynamicT();
    }

    public static T bool() {
        return new BooleanT();
    }

    public static T path() {
        return new PathT();
    }

    public static T object() {
        return new ObjectT();
    }

    public static T instance() {
        return new InstanceT();
    }

    public static T style() {
        return new InstanceT(AloftStyleInstance.class);
    }

    public static T child() {
        return new AloftComponentT();
    }

    public static T children() {
        return new ArrayT(new AloftComponentT());
    }

    public static T instance(Class<? extends AloftInstance> instanceType) {
        return new InstanceT(instanceType);
    }

    public static T instance(String property) {
        return new InstanceT(property);
    }

    public static T instance(String property, T... types) {
        return new InstanceT(property, types);
    }

    public static T instance(T type) {
        return new InstanceT(null, type);
    }

    public static T type(Object v) {
        return type(v, false);
    }

    public static T type(Object v, boolean excludeStrings) {
        if(v instanceof V) return ((V) v).type();
        if(isset(getValue(new ArrayT(), v))) return new ArrayT();
        if(isset(getValue(new NumberT(), v))) return new NumberT();
        if(isset(getValue(new BooleanT(), v))) return new BooleanT();
        if(!excludeStrings) if(isset(getValue(new StringT(), v))) return new StringT();
        return null;
    }
    
    private static boolean isset(V v) {
        return __.isset(v) && !(v instanceof NullV);
    }
    
    private static V getValue(T t, Object v) {
        return t.value(v);
    }

}
