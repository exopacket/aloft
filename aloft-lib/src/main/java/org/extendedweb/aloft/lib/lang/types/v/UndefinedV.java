package org.extendedweb.aloft.lib.lang.types.v;

import org.extendedweb.aloft.lib.lang.types.base.T;
import org.extendedweb.aloft.lib.lang.types.base.V;

public class UndefinedV extends V {

    @Override
    public <Any> Any get() {
        return null;
    }

    @Override
    public T type() {
        return null;
    }
}
