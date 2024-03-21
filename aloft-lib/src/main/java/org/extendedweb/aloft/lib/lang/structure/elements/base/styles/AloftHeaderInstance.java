package org.extendedweb.aloft.lib.lang.structure.elements.base.styles;

import org.extendedweb.aloft.lib.lang.structure.elements.base.AloftInstance;
import org.extendedweb.aloft.lib.lang.structure.elements.base.AloftInstanceConstant;
import org.extendedweb.aloft.lib.lang.types.base.T;
import org.extendedweb.aloft.lib.lang.types.base.V;
import org.extendedweb.aloft.lib.lang.types.v.InstanceV;
import org.extendedweb.aloft.utils.global.__;

import java.lang.reflect.Method;
import java.util.HashMap;

public class AloftHeaderInstance extends AloftInstance {

    public AloftHeaderInstance() {
        super("Header", h1());
    }

    public AloftHeaderInstance(String type) {
        super("Header");
        if(!__.isset(type)) return;
    }

    @Override
    public InstanceV get() {
        return null;
    }

    public static AloftInstanceConstant h1() {
        AloftInstanceConstant constant = new AloftInstanceConstant("h1");
        constant.setV("bold", T.string().value("bolder"));
        return constant;
    }

}
