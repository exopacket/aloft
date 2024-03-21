package org.extendedweb.aloft.lib.lang.structure.elements.base;

import org.extendedweb.aloft.lib.lang.structure.style.AloftStyle;
import org.extendedweb.aloft.lib.lang.structure.style.AloftStylePair;
import org.extendedweb.aloft.lib.lang.types.base.V;
import org.extendedweb.aloft.lib.lang.types.t.InstanceT;
import org.extendedweb.aloft.lib.lang.types.v.InstanceV;

import java.util.ArrayList;
import java.util.HashMap;

public abstract class AloftInstance extends InstanceV {

    public AloftInstance(String name) {
        super(name);
    }

    public AloftInstance(String name, HashMap<String, V> properties) {
        super(name, properties);
    }

    public AloftInstance(String name, AloftInstanceConstant constant) {
        super(name, constant.getProperties());
    }

}
