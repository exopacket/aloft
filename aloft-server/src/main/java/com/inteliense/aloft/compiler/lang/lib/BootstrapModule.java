package com.inteliense.aloft.compiler.lang.lib;

public class BootstrapModule extends StyleModule {

    public BootstrapModule() { super(); }

    @Override
    protected ModuleElementAttributes buttonAloftElement() {
        ModuleElementAttributes attributes = new ModuleElementAttributes();
        attributes.addClasses("btn");
        attributes.addAttributes("type", "button");
        attributes.addSubclasses("primary", "btn-primary");
        attributes.addSubclasses("secondary", "btn-secondary");
        return attributes;
    }
}
