package org.extendedweb.aloft.lib.js;

import org.extendedweb.aloft.lib.html.elements.js.JavaScriptObject;

public class Str extends JSO {

    private String value;

    public Str(String value) { this.value = value; }

    public static JSO v(String value) {
        return new Str(value);
    }

    @Override
    protected JavaScriptObject build() {
        return new JavaScriptObject() {
            @Override
            protected void create() {
                str(value);
            }
        };
    }
}
