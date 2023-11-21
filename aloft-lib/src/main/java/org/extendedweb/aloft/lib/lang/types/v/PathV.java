package org.extendedweb.aloft.lib.lang.types.v;

import org.extendedweb.aloft.lib.lang.types.base.T;
import org.extendedweb.aloft.lib.lang.types.base.V;
import org.extendedweb.aloft.lib.lang.types.t.PathT;

public class PathV extends V {
    @Override
    public <Any> Any get() {
        return null;
    }

    @Override
    public T type() {
        return new PathT();
    }
}
