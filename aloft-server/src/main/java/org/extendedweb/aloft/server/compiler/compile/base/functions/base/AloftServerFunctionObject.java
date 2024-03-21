package org.extendedweb.aloft.server.compiler.compile.base.functions.base;

public abstract class AloftServerFunctionObject extends AloftFunctionObject implements ReturnsServerSide {

    @Override
    protected boolean clientSide() {
        return false;
    }

    @Override
    protected boolean serverSide() {
        return true;
    }

}
