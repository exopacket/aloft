package org.extendedweb.aloft.lib.lang.types.base;

import org.extendedweb.aloft.lib._AloftModel;
import org.extendedweb.aloft.lib.lang.structure.elements.base.AloftInstance;
import org.extendedweb.aloft.lib.lang.structure.elements.base.AloftStyleInstance;
import org.extendedweb.aloft.lib.lang.types.t.*;
import org.extendedweb.aloft.lib.lang.types.v.NullV;
import org.extendedweb.aloft.utils.global.__;

public class A {

    public enum Scope {
        SERVER_SIDE,
        MUTUAL,
        CLIENT_SIDE
    }

    private Scope scope;

    public A(Scope scope) {
        this.scope = scope;
    }

    public Scope getScope() {
        return this.scope;
    }

}
