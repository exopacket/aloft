package com.inteliense.aloft.compiler.lang.lib;

import com.inteliense.aloft.compiler.lang.keywords.elements.types.ButtonAloftElement;

import java.util.HashMap;
import java.util.Map;

public abstract class StyleModule {

    protected Map<Class<?>, ModuleElementAttributes> map;

    public StyleModule() {
        map = new HashMap<Class<?>, ModuleElementAttributes>() {{
            put(ButtonAloftElement.class, buttonAloftElement());
        }};
    }

    public ModuleElementAttributes get(Class<?> c) {
        return map.get(c);
    }

    protected abstract ModuleElementAttributes buttonAloftElement();

}
