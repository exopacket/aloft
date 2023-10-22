package org.extendedweb.aloft.lib.js;

import org.extendedweb.aloft.lib.html.elements.js.JavaScriptObject;

public class Raw extends JSO {

    private String value;

    public Raw(String value) { this.value = value; }

    public static JSO v(String value) {
        return new Raw(value);
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
