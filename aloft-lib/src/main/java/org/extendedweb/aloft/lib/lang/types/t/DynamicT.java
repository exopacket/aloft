package org.extendedweb.aloft.lib.lang.types.t;

import org.extendedweb.aloft.lib.lang.types.base.T;
import org.extendedweb.aloft.lib.lang.types.base.V;
import org.extendedweb.aloft.lib.lang.types.v.*;
import org.extendedweb.aloft.utils.global.__;

public class DynamicT extends T {

    @Override
    public V value(Object v) {
        if(v instanceof DynamicV) return ((DynamicV) v).get();
        if(v instanceof V) return new DynamicV((V) v);
        return new DynamicV(v);
    }

}
