package org.extendedweb.aloft.server.compiler.compile.supporting;

import org.extendedweb.aloft.utils.global.__;

import java.util.ArrayList;

public abstract class AloftComponentProperty {

    private ArrayList<ComponentClassValue> values = new ArrayList<>();

    public AloftComponentProperty() { }

    public Object get(String key) {
        return null;
    }

    public void add(AloftComponentClass c, Object v) {
        values.add(new ComponentClassValue(c, v));
    }

    private static class ComponentClassValue {
        private AloftComponentClass c;
        private Object v;
        public ComponentClassValue(AloftComponentClass c, Object v) {
            this.c = c;
            this.v = v;
        }
        public AloftComponentClass getComponentClass() {
            return c;
        }
        public Object getValue() {
            return v;
        }
    }

}
