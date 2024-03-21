package org.extendedweb.aloft.lib.lang.structure.components;

import org.extendedweb.aloft.lib.lang.types.base.T;
import org.extendedweb.aloft.lib.lang.types.base.V;
import org.extendedweb.aloft.lib.lang.types.t.DynamicT;
import org.extendedweb.aloft.lib.lang.types.v.DynamicV;
import org.extendedweb.aloft.lib.lang.types.v.NullV;
import org.extendedweb.aloft.utils.global.__;

public class AloftObjectProperty {

    private String name;
    private T type = null;
    private V value = null;
    private boolean required = false;

    public AloftObjectProperty(String name, boolean required) {
        this.name = name;
        this.required = required;
    }

    public AloftObjectProperty(String name, V v) {
        this.name = name;
        set(v);
    }

    public AloftObjectProperty(String name, T type, boolean required) {
        this.type = type;
        this.name = name;
        this.required = required;
    }

    public AloftObjectProperty(String name, T type, Object value) {
        this.type = type;
        this.name = name;
        set(value);
    }

    public boolean replace(Object v) {
        return set(v);
    }

    public boolean replace(T type, Object v) {
        if(__.isset(this.type) && this.type instanceof DynamicT) return set(v);
        else if(__.isset(this.type) && type.getClass().equals(this.type.getClass())) return set(v);
        else if(!__.isset(this.type)) return set(v);
        else return false;
    }

    private boolean set(T type, Object v) {
        if(__.isset(this.type) && this.type instanceof DynamicT) return set(v);
        else if(__.isset(this.type) && type.getClass().equals(this.type.getClass())) return set(v);
        else return false;
    }

    private boolean set(Object v) {
        if(!__.isset(v) || v instanceof NullV) this.value = new NullV();
        else if(__.isset(type) && type instanceof DynamicT && v instanceof DynamicV) this.value = (DynamicV) v;
        else if(__.isset(type) && type instanceof DynamicT) this.value = type.value(v);
        else if(__.isset(type) && v instanceof V && ((V) v).type().getClass().equals(type.getClass())) this.value = (V) v;
        else if(__.isset(type)) this.value = type.value(v);
        else if(v instanceof V) this.value = (V) v;
        else if(__.isset(T.type(v))) this.value = T.type(v).value(v);
        else { this.value = new NullV(); return false; }
        return true;
    }

    public boolean isRequired() {
        return required;
    }

    public String getName() {
        return this.name;
    }

    public V value() {
        if(!__.isset(value)) return new NullV();
        return value;
    }

    public T type() {
        return type;
    }

}
