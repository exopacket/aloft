package org.extendedweb.aloft.lib.lang.types.v;

import org.extendedweb.aloft.lib.lang.types.base.V;

public abstract class NumberV extends V {

    public static NumberV parse(String value) {
        if(value.matches("^[0-9]+\\.[0-9]+$")) return new DecimalV(Double.parseDouble(value));
        if(value.matches("^[0-9]+$")) return new IntegerV(Integer.parseInt(value));
        return null;
    }

}
