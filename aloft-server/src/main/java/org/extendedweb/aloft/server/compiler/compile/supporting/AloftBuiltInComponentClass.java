package org.extendedweb.aloft.server.compiler.compile.supporting;

import org.extendedweb.aloft.lib.lang.structure.elements.base.AloftElement;

import java.util.ArrayList;

public class AloftBuiltInComponentClass extends AloftComponentClass {

    private Class<? extends AloftElement> builtin;

    public AloftBuiltInComponentClass(Class<? extends AloftElement> c) {
        builtin = c;
    }

}
