package org.extendedweb.aloft.lib.lang.types.t;

import org.extendedweb.aloft.lib.lang.types.base.T;

public class StringT extends T {
    @Override
    public String value(Object v) {
        return ((String) v);
    }
}
