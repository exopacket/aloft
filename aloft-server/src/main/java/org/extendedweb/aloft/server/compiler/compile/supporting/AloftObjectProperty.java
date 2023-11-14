package org.extendedweb.aloft.server.compiler.compile.supporting;

import org.extendedweb.aloft.lib.lang.types.base.T;
import org.extendedweb.aloft.lib.lang.types.base.V;

public class AloftObjectProperty {

    private String name;
    private boolean required;
    private T type;
    private Object value;

    public AloftObjectProperty(String name, boolean required) {
        this.name = name;
        this.required = required;
    }

    public AloftObjectProperty(String name, T type, boolean required) {
        this.name = name;
        this.type = type;
        this.required = required;
    }

    public AloftObjectProperty cloneProperty(T type, Object value) {
        AloftObjectProperty property = new AloftObjectProperty(this.name, this.required);
        property.set(type, value);
        return property;
    }

    public AloftObjectProperty cloneProperty(Object value) {
        AloftObjectProperty property = new AloftObjectProperty(this.name, this.required);
        property.set(type, value);
        return property;
    }

    public void set(T type, Object value) {
        this.type = type;
        this.value = value;
    }

    public String getName() {
        return name;
    }
}
