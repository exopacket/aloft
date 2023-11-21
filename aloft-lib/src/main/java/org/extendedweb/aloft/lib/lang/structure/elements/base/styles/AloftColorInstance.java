package org.extendedweb.aloft.lib.lang.structure.elements.base.styles;

import org.extendedweb.aloft.lib.lang.types.base.V;
import org.extendedweb.aloft.lib.lang.types.t.ArrayT;
import org.extendedweb.aloft.lib.lang.types.t.StringT;
import org.extendedweb.aloft.lib.lang.types.v.ArrayV;
import org.extendedweb.aloft.lib.lang.types.v.InstanceV;
import org.extendedweb.aloft.lib.lang.types.v.StringV;

import java.util.HashMap;

public class AloftColorInstance extends InstanceV {

    public AloftColorInstance(String name, HashMap<String, V> properties) {
        super(name, properties);
        this.value = getValue(properties);
    }

    public AloftColorInstance(String name, V v) {
        super(name);
        this.value = getValue(v);
    }

    private V getValue(HashMap<String, V> properties) {
        return V.nothing();
    }

    private V getValue(V v) {
        if(v instanceof ArrayV) {
            ArrayV arr = (ArrayV) v;
            if(arr.size() == 3 || arr.size() == 4) {
                V first = arr.get(0);
                V second = arr.get(1);
                V third = arr.get(2);
                return new StringT().value("rgba(0, 0, 0, 0)");
            }
        }
        if(v instanceof StringV) return v;
        return V.nothing();
    }

}
