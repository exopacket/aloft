package org.extendedweb.aloft.lib.lang.types.v;

import org.extendedweb.aloft.lib.lang.types.base.V;

public class StringV extends V {

    private String value;

    public StringV(String value) { this.value = value; }

    @Override
    public <Any> Any get() {
        return (Any) value;
    }

}
