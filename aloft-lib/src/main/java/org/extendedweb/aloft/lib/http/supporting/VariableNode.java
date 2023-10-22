package org.extendedweb.aloft.lib.http.supporting;

import org.extendedweb.aloft.lib.lang.types.base.T;
import org.extendedweb.aloft.utils.global.__;

import java.util.Arrays;
import java.util.List;

public class VariableNode extends ReturnsVariableNodes {

    private String key;
    private VariableValue value = null;

    public VariableNode(String key, T type) {
        this.key = key;
        this.value = new VariableValue(type);
    }

    public VariableNode(String key, T type, Object value) {
        this.key = key;
        this.value = new VariableValue(value, type);
    }

    public void setValue(Object v) {;
        if(!__.isset(v)) return;
        this.value.setValue(v);
    }

    public String getKey() {
        return key;
    }

    public <Any> Any getValue() {
        if (!__.isset(value)) return null;
        return value.get();
    }

    @Override
    public VariableNode getByPath(String path) {
        boolean multiple = path.contains(".");
        String[] parents;
        if(!multiple) parents = new String[]{path};
        else parents = path.split("\\.");
        if(!multiple && __.same(parents[0], key)) return this;
        List<String> list = Arrays.asList(parents);
        list.remove(0);
        if(list.isEmpty()) return null;
        String next = "";
        for(int i=0; i<list.size(); i++) {
            if(i > 0) next += ".";
            next += list.get(i);
        }
        return this.getByPath(next);
    }

    private static class VariableValue {

        private boolean inTree = false;
        private Object v;
        private T t;

        public VariableValue(VariableTree v) {
            inTree = true;
            this.v = v;
        }

        public VariableValue(T type) {
            this.t = type;
        }

        public VariableValue(Object v, T t) {
            this.v = v;
            this.t = t;
        }

        public boolean isInTree() {
            return inTree;
        }

        public void setValue(Object v) {
            this.v = v;
        }

        public <Any> Any get() {
            return this.t.value(this.v);
        }

    }

}
