package org.extendedweb.aloft.server.compiler.compile.base.functions.base;

public abstract class AloftFunctionObjectCollection {

    private AloftFunctionObjectCollectionType collectionType;

    protected abstract boolean serverSide();
    protected abstract boolean clientSide();

    public Class<? extends AloftFunctionObjectCollection> compile(AloftFunctionObjectCollectionType type) {
        this.collectionType = type;
        return null;
    }

    public AloftFunctionObjectCollectionType getCollectionType() {
        return collectionType;
    }
}
