package org.extendedweb.aloft.server.compiler.compile.base.functions.base;

import org.extendedweb.aloft.lib.html.elements.js.JavaScriptObject;
import org.extendedweb.aloft.lib.lang.types.base.V;

public abstract class AloftClientFunctionObject extends AloftFunctionObject implements ReturnsClientSide {

    public AloftClientFunctionObject(Type type, V... args) {
        super(type, args);
    }

    @Override
    protected boolean clientSide() {
        return true;
    }

    @Override
    protected boolean serverSide() {
        return false;
    }

}
