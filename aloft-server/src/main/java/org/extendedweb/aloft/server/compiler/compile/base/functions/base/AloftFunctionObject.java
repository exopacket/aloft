package org.extendedweb.aloft.server.compiler.compile.base.functions.base;

import org.extendedweb.aloft.lib.html.elements.js.JavaScriptObject;
import org.extendedweb.aloft.lib.lang.base.BuildsJavascript;
import org.extendedweb.aloft.server.compiler.compile.base.AloftServerCode;
import org.extendedweb.aloft.server.compiler.compile.supporting.BuildsJava;

public abstract class AloftFunctionObject {

    protected abstract boolean serverSide();
    protected abstract boolean clientSide();

    public Class<? extends AloftFunctionObject> compile() {
        return null;
    }

}
