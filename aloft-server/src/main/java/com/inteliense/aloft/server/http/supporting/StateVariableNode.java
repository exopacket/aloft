package com.inteliense.aloft.server.http.supporting;

import com.inteliense.aloft.compiler.lang.types.base.T;

public class StateVariableNode {

    private String key;
    private T type;
    private StateVariableValue value = null;

    public StateVariableNode(String key, T type) {
        this.key = key;
        this.type = type;
    }

    public StateVariableNode(String key, T type, Object value) {
        this.key = key;
        this.type = type;
        this.value = new StateVariableValue(value);
    }

    public String getString() {
        return value.getString();
    }

    private static class StateVariableValue {

        private boolean inTree = false;
        private Object v;

        public StateVariableValue(StateVariableNode v) {
            inTree = true;
            this.v = v;
        }

        public StateVariableValue(Object v) {
            this.v = v;
        }

        public String getString() {
            //FIXME add if == class check
            return (String) v;
        }

    }

}
