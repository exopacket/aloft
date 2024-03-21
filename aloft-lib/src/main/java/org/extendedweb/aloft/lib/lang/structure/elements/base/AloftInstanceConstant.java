package org.extendedweb.aloft.lib.lang.structure.elements.base;

import org.extendedweb.aloft.lib.lang.types.base.V;
import org.extendedweb.aloft.lib.lang.types.v.InstanceV;

import java.util.HashMap;

public class AloftInstanceConstant extends InstanceV {

    public AloftInstanceConstant(String name) {
        super(name);
    }

    public HashMap<String, V> getProperties() {
        return properties;
    }

    public void setV(String prop, V value) {
        properties.put(prop, value);
    }

}
