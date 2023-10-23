package org.extendedweb.aloft.lib.js;

import org.extendedweb.aloft.lib.html.elements.js.JavaScriptObject;

public class Bool extends JSO {

    private String value;

    public Bool(String value) { this.value = value; }

    public static JSO t() {
        return new Bool("true");
    }

    public static JSO f() {
        return new Bool("false");
    }

    @Override
    protected JavaScriptObject build() {
        return new JavaScriptObject() {
            @Override
            protected void create() {
                add(value);
            }
        };
    }
}
