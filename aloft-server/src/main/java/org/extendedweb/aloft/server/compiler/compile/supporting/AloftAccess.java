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

    public AloftAccess(AloftAccessType type, boolean ss, boolean cs) {

    }

}