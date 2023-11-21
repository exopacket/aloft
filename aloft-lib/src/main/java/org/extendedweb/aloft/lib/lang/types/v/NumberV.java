package org.extendedweb.aloft.lib.lang.types.v;

import org.extendedweb.aloft.lib.lang.types.base.T;
import org.extendedweb.aloft.lib.lang.types.base.V;
import org.extendedweb.aloft.lib.lang.types.t.NumberT;

public abstract class NumberV extends V {

    public static NumberV parse(String value) {
        if(value.matches("^[0-9]+\\.[0-9]+$")) return new DecimalV(Double.parseDouble(value));
        if(value.matches("^[0-9]+$")) return new IntegerV(Integer.parseInt(value));
        return null;
    }

    @Override
    public T type() {
        return new NumberT();
    }
}
