package org.extendedweb.aloft.lib.lang.types.base;

import org.extendedweb.aloft.lib.lang.types.v.NullV;
import org.extendedweb.aloft.lib.lang.types.v.UndefinedV;

public abstract class V {

    public abstract <Any> Any get();
    public abstract T type();

    public static V nothing() {
        return new NullV();
    }

    public static V unset() { return new UndefinedV(); }

}
