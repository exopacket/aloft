package org.extendedweb.aloft.server.compiler.compile.base;

import org.extendedweb.aloft.lib.html.elements.js.JavaScriptObject;
import org.extendedweb.aloft.lib.lang.base.BuildsJavascript;
import org.extendedweb.aloft.server.compiler.compile.supporting.BuildsJava;

public class AloftFunction implements BuildsJava, BuildsJavascript {

    private JavaScriptObject js;
    private AloftServerCode server;

    public AloftFunction(AloftFunctionContainer container) {
//        this.js = container.js()[0];
        this.server = container.server();
    }

    @Override
    public JavaScriptObject getObject() {
        return js;
    }

    @Override
    public AloftServerCode server() {
        return server;
    }

}
