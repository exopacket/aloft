package org.extendedweb.aloft.server.compiler.compile.supporting;

public class AloftAccess {

    public enum AloftAccessType {
        PUBLIC,
        REQUIRED,
        STATIC,
        PRIVATE,
        PUBLIC_REQUIRED,
        PUBLIC_STATIC,
        PRIVATE_REQUIRED,
        PRIVATE_STATIC,
        FUNCTION_ARG
    }

    public AloftAccess(AloftAccessType type) {

    }

    public AloftAccessType getType() {
        return null;
    }

    public static AloftAccessType getFunctionType(boolean isStatic, boolean isPrivate) {
        if(isPrivate && isStatic) return AloftAccessType.PRIVATE_STATIC;
        if(isPrivate & !isStatic) return AloftAccessType.PRIVATE;
        if(isStatic) return AloftAccessType.STATIC;
        return AloftAccessType.PUBLIC;
    }

}