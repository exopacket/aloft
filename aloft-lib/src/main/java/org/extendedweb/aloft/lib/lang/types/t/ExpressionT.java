package org.extendedweb.aloft.lib.lang.types.t;

import org.extendedweb.aloft.lib.lang.types.base.T;
import org.extendedweb.aloft.lib.lang.types.base.V;
import org.extendedweb.aloft.lib.lang.types.v.ExpressionV;

public class ExpressionT extends T {
    @Override
    public V value(Object v) {
        if(v instanceof ExpressionV) return new BooleanT().value(((ExpressionV) v).get());
        return new BooleanT().value(false);
    }
}
