package com.inteliense.aloft.server.http.supporting;

import com.inteliense.aloft.compiler.lang.types.base.T;
import com.inteliense.aloft.utils.global.__;

public class VariableNode {

    private String key;
    private StateVariableValue value = null;

    public VariableNode(String key, T type) {
        this.key = key;
        this.value = new StateVariableValue(type);
    }

    public VariableNode(String key, T type, Object value) {
        this.key = key;
        this.value = new StateVariableValue(value, type);
    }

    public void setValue(Object v) {;
        if(!__.isset(v)) return;
        this.value.setValue(v);
    }

    public String getKey() {
        return key;
    }

    public <Any> Any getValue() {
        if(!__.isset(value)) return null;
        return value.get();
    }

    private static class StateVariableValue {

        private boolean inTree = false;
        private Object v;
        private T t;

        public StateVariableValue(VariableNode v) {
            inTree = true;
            this.v = v;
        }

        public StateVariableValue(T type) {
            this.t = type;
        }

        public StateVariableValue(Object v, T t) {
            this.v = v;
            this.t = t;
        }

        public void setValue(Object v) {
            this.v = v;
        }

        public <Any> Any get() {
            return this.t.value(this.v);
        }

    }

}
