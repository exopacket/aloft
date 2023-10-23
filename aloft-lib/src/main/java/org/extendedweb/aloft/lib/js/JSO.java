package org.extendedweb.aloft.lib.js;

import org.extendedweb.aloft.lib.html.elements.js.JavaScriptObject;

public abstract class JSO {

    protected abstract JavaScriptObject build();

    public JavaScriptObject get() {
        return build();
    }



}
