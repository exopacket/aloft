package org.extendedweb.aloft.server.compiler.compile.base;

import org.extendedweb.aloft.lib.html.elements.js.JavaScriptObject;
import org.extendedweb.aloft.lib.lang.base.BuildsJavascript;
import org.extendedweb.aloft.server.compiler.compile.supporting.BuildsJava;

public class AloftFunction implements BuildsJava, BuildsJavascript {
    @Override
    public JavaScriptObject getObject() {
        return null;
    }

    @Override
    public AloftServerCode serverCode() {
        return null;
    }
}
