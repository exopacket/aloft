package org.extendedweb.aloft.lib.lang.types.t;

import org.extendedweb.aloft.lib.lang.types.base.T;
import org.extendedweb.aloft.lib.lang.types.base.V;
import org.extendedweb.aloft.lib.lang.types.v.DecimalV;
import org.extendedweb.aloft.lib.lang.types.v.IntegerV;
import org.extendedweb.aloft.lib.lang.types.v.NullV;
import org.extendedweb.aloft.lib.lang.types.v.NumberV;

public class NumberT extends T {
    @Override
    public V value(Object v) {
        if(v.getClass() == String.class) return NumberV.parse((String) v);
        if(v.getClass() == Integer.class) return new IntegerV((int) v);
        if(v.getClass() == Double.class) return new DecimalV((double) v);
        return new NullV();
    }
}
