package org.extendedweb.aloft.lib.lang.types.t;

import org.extendedweb.aloft.lib.lang.types.base.T;
import org.extendedweb.aloft.lib.lang.types.base.V;
import org.extendedweb.aloft.lib.lang.types.v.ArrayV;
import org.extendedweb.aloft.lib.lang.types.v.NullV;

public class ArrayT extends T {
    @Override
    public V value(Object v) {
        if(v instanceof V[]) return new ArrayV((V[]) v);
        if(v instanceof V) return new ArrayV(new V[]{(V) v});
        return new NullV();
    }
}
