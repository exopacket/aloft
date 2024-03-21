package org.extendedweb.aloft.server.compiler.compile.base.functions.base;

public abstract class AloftMutualFunctionObject extends AloftFunctionObject implements ReturnsClientSide, ReturnsServerSide {

    @Override
    protected boolean clientSide() {
        return true;
    }

    @Override
    protected boolean serverSide() {
        return true;
    }

}
