package org.extendedweb.aloft.server.compiler.compile.base;

import org.extendedweb.aloft.lib.html.elements.js.JavaScriptObject;
import org.extendedweb.aloft.lib.lang.base.BuildsJavascript;
import org.extendedweb.aloft.server.compiler.compile.supporting.BuildsJava;

public abstract class AloftBuiltInFunction implements BuildsJava, BuildsJavascript {

    protected JavaScriptObject js;
    protected AloftServerCode server;

    @Override
    public JavaScriptObject getObject() {
        return js;
    }

    @Override
    public AloftServerCode server() {
        return server;
    }

    public void merge(AloftServerCode collection) {
        collection.merge(server);
    }

}
