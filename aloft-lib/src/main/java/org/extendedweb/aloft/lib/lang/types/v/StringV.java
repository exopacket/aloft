package org.extendedweb.aloft.lib.lang.types.v;

import org.extendedweb.aloft.lib.lang.types.base.T;
import org.extendedweb.aloft.lib.lang.types.base.V;
import org.extendedweb.aloft.lib.lang.types.t.StringT;

public class StringV extends V {

    private String value;

    public StringV(String value) { this.value = value; }

    @Override
    public <Any> Any get() {
        return (Any) value;
    }

    @Override
    public T type() {
        return new StringT();
    }

}
