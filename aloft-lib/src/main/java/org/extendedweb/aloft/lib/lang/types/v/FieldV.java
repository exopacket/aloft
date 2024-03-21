package org.extendedweb.aloft.lib.lang.types.v;

import org.extendedweb.aloft.lib.lang.types.base.T;
import org.extendedweb.aloft.lib.lang.types.base.V;
import org.extendedweb.aloft.lib.lang.types.t.ObjectT;

public class FieldV extends V {

    private V value;

    public FieldV(T type, Object v) { this.value = type.value(v); }

    @Override
    public <Any> Any get() {
        return (Any) value;
    }

    @Override
    public T type() {
        return new ObjectT();
    }

}
