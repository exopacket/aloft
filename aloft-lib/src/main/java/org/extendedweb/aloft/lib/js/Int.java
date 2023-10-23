package org.extendedweb.aloft.lib.js;

import org.extendedweb.aloft.lib.html.elements.js.JavaScriptObject;

public class Int extends JSO {

    private String value;

    public Int(String value) { this.value = value; }

    public static JSO v(int v) {
        return new Int(String.valueOf(v));
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
