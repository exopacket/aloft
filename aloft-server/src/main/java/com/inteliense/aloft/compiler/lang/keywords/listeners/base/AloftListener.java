package com.inteliense.aloft.compiler.lang.keywords.listeners.base;

import com.inteliense.aloft.compiler.lang.base.BuildsJavascript;
import com.inteliense.aloft.server.html.elements.js.JavaScriptObject;

public abstract class AloftListener implements BuildsJavascript {

    protected JavaScriptObject buildBase(String method, String functionName, JavaScriptObject functionSlot) {
        JavaScriptObject base = new JavaScriptObject() {
            @Override
            public void create() {
                this.call(false, new String[]{""}, "document.querySelector('p').addEventListener", "\"" + method + "\"", functionName);
                this.slot();
            }
        };
        base.build();
        JavaScriptObject function = JavaScriptObject.function("myAlert", null);
        function.build();
        function.setSlot(functionSlot);
        base.setSlot(function);
        return base;
    }

}
