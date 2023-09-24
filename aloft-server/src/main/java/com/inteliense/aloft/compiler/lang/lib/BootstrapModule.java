package com.inteliense.aloft.compiler.lang.lib;

public class BootstrapModule extends StyleModule {

    public BootstrapModule() { super(); }

    @Override
    protected ModuleElement buttonAloftElement(ModuleElement element) {
        element.addClasses("button","btn");
        element.addAttributes("button","type", "button");

        //COLORS
        element.addSubclasses("button","primary", "btn-primary");
        element.addSubclasses("button","secondary", "btn-secondary");

        //SIZE
        element.addSubclasses("button","lg", "btn-lg");
        return element;
    }

    @Override
    protected ModuleElement alertAloftElement(ModuleElement element) {
        element.addClasses("root", "modal", "fade");
        element.addAttributes("root",
            "data-bs-backdrop", "static",
                "data-bs-keyboard", "false",
                "tabindex", "-1",
                "aria-labeledby", "staticBackdropLabel",
                "aria-hidden", "true"
        );
        element.addClasses("dialog", "modal-dialog");
        element.addClasses("content", "modal-content");
        element.addClasses("header", "modal-header");
        element.addClasses("title", "modal-title");
        element.addAttributes("title" , "id", "staticBackdropLabel");
        return element;
    }
}
