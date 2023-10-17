package com.inteliense.aloft.compiler.lang.lib;

import com.inteliense.aloft.compiler.lang.keywords.elements.types.*;
import com.inteliense.aloft.compiler.lang.lib.colors.Colors;

import java.util.HashMap;
import java.util.Map;

public abstract class StyleModule {

    protected Map<Class<?>, ModuleElement> map;
    protected HashMap<String, String> vars = new HashMap<>();
    private IconsModule icons;

    public StyleModule() {
        map = new HashMap<Class<?>, ModuleElement>() {{
            put(ButtonAloftElement.class, buttonAloftElement(new ModuleElement()));
            put(AlertAloftElement.class, alertAloftElement(new ModuleElement()));
            put(CenteredAloftElement.class, centeredAloftElement(new ModuleElement()));
            put(ColumnAloftElement.class, columnAloftElement(new ModuleElement()));
            put(InputAloftElement.class, inputAloftElement(new ModuleElement()));
        }};
    }

    public String rootVars() {
        StringBuilder builder = new StringBuilder();
        builder.append(":root {").append(" ");
        for(String key : vars.keySet()) {
            String v = vars.get(key);
            builder.append("--").append(key).append(": ").append(v).append("; ");
        }
        builder.append("}");
        return builder.toString();
    }

    public String icon(String key) {
        return icons.v(key);
    }

    public ModuleElement get(Class<?> c) {
        return map.get(c);
    }

    public void setIcons(IconsModule icons) {
        this.icons = icons;
    }

    protected abstract void registerVariables();
    protected abstract void registerFonts();
    public abstract void registerColors(Colors colors);

    protected abstract ModuleElement buttonAloftElement(ModuleElement element);
    protected abstract ModuleElement alertAloftElement(ModuleElement element);
    protected abstract ModuleElement centeredAloftElement(ModuleElement element);
    protected abstract ModuleElement columnAloftElement(ModuleElement element);
    protected abstract ModuleElement inputAloftElement(ModuleElement element);

}
