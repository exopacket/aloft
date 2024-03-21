package org.extendedweb.aloft.server.compiler.compile.base.functions.base;

import org.extendedweb.aloft.lib.html.elements.js.JavaScriptObject;

public abstract class AloftClientFunctionObject extends AloftFunctionObject implements ReturnsClientSide {

    @Override
    protected boolean clientSide() {
        return true;
    }

    @Override
    protected boolean serverSide() {
        return false;
    }

}
