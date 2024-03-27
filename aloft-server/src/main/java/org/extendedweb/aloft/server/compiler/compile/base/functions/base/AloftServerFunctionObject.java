package org.extendedweb.aloft.server.compiler.compile.base.functions.base;

import org.extendedweb.aloft.lib.lang.types.base.V;

public abstract class AloftServerFunctionObject extends AloftFunctionObject implements ReturnsServerSide {

    public AloftServerFunctionObject(Type type, V... args) {
        super(type, args);
    }

    @Override
    protected boolean clientSide() {
        return false;
    }

    @Override
    protected boolean serverSide() {
        return true;
    }

}
