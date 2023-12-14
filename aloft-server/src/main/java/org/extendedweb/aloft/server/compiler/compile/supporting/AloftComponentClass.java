package org.extendedweb.aloft.server.compiler.compile.supporting;

import org.extendedweb.aloft.lib.lang.structure.elements.base.AloftElement;

public abstract class AloftComponentClass {

    private Class<?> c;

    public AloftComponentClass(Class<? extends AloftElement> c) {
        this.c = c;
    }

    public Class<?> getObjectClass() {
        return this.c;
    }

}
