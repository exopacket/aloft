package com.inteliense.aloft.compiler.lang.types.t;

import com.inteliense.aloft.compiler.lang.types.base.T;

public class StringT extends T {
    @Override
    public String value(Object v) {
        return ((String) v);
    }
}
