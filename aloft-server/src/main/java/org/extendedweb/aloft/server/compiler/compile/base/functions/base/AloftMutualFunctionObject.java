package org.extendedweb.aloft.server.compiler.compile.base.functions.base;

import org.extendedweb.aloft.lib.lang.types.base.V;

public abstract class AloftMutualFunctionObject extends AloftFunctionObject implements ReturnsClientSide, ReturnsServerSide {

    public AloftMutualFunctionObject(Type type, V... args) {
        super(type, args);
    }

    @Override
    protected boolean clientSide() {
        return true;
    }

    @Override
    protected boolean serverSide() {
        return true;
    }

}
