package com.inteliense.aloft.compiler.lang.lib;

import com.inteliense.aloft.compiler.lang.keywords.elements.types.AlertAloftElement;
import com.inteliense.aloft.compiler.lang.keywords.elements.types.ButtonAloftElement;
import com.inteliense.aloft.compiler.lang.keywords.elements.types.CenteredAloftElement;

import java.util.HashMap;
import java.util.Map;

public abstract class StyleModule {

    protected Map<Class<?>, ModuleElement> map;
    private IconsModule icons;

    public StyleModule() {
        map = new HashMap<Class<?>, ModuleElement>() {{
            put(ButtonAloftElement.class, buttonAloftElement(new ModuleElement()));
            put(AlertAloftElement.class, alertAloftElement(new ModuleElement()));
            put(CenteredAloftElement.class, centeredAloftElement(new ModuleElement()));
        }};
    }

    public void setIcons(IconsModule icons) {
        this.icons = icons;
    }

    public String icon(String key) {
        return icons.v(key);
    }

    public ModuleElement get(Class<?> c) {
        return map.get(c);
    }

    protected abstract ModuleElement buttonAloftElement(ModuleElement element);
    protected abstract ModuleElement alertAloftElement(ModuleElement element);
    protected abstract ModuleElement centeredAloftElement(ModuleElement element);

}
