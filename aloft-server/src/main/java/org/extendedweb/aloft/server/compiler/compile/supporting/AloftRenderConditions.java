package org.extendedweb.aloft.server.compiler.compile.supporting;

import org.extendedweb.aloft.lib.lang.types.base.V;
import org.extendedweb.aloft.lib.lang.types.v.NullV;
import org.extendedweb.aloft.utils.global.__;

import java.util.ArrayList;
import java.util.HashMap;

public class AloftRenderConditions {

    private HashMap<String, AloftRenderConditions> propertyConditions;
    private ArrayList<AloftRenderConditions> childConditions;
    private ArrayList<AloftRenderConditionGroup> conditions;
    private V def = null;

    public AloftRenderConditions() { }

    public AloftRenderConditions(V def) {
        if(!(def instanceof NullV || !__.isset(def))) this.def = def;
    }

    public V val() {
        V v = V.nothing();
        boolean res = true;
        for(AloftRenderConditionGroup group : conditions) {
            if(group.test()) {
                v = group.get();
                if(group.exit()) break;
                continue;
            }
            res = false;
            break;
        }
        if(!res && __.isset(def)) return def;
        else if(!res) return V.nothing();
        return v;
    }

    public AloftRenderConditions getChild(int index) {
        return childConditions.get(index);
    }

    public AloftRenderConditions getProperty(String key) {
        return propertyConditions.get(key);
    }

}
