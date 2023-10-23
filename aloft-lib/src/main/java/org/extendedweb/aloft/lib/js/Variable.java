package org.extendedweb.aloft.lib.js;

import org.extendedweb.aloft.lib.html.elements.js.JavaScriptObject;

public class Variable extends JSO {

    private boolean constant = false;
    private String name;
    private JSO value;

    public Variable(String name, JSO value) {
        this.name = name;
        this.value = value;
    }

    public Variable(boolean constant, String name, JSO value) {
        this.constant = constant;
        this.name = name;
        this.value = value;
    }

    @Override
    protected JavaScriptObject build() {
        return new JavaScriptObject() {
            @Override
            protected void create() {
                declare(name, constant);
                child(value.get());
            }
        };
    }
}
