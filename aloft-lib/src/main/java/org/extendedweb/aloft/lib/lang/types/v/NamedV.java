package org.extendedweb.aloft.lib.lang.types.v;

import org.extendedweb.aloft.lib.lang.types.base.T;
import org.extendedweb.aloft.lib.lang.types.base.V;
import org.extendedweb.aloft.lib.lang.types.t.NamedT;
import org.extendedweb.aloft.lib.lang.types.t.StringT;

public class NamedV extends V {

    private String value;

    public NamedV(String value) { this.value = value; }

    @Override
    public <Any> Any get() {
        return (Any) value;
    }

    @Override
    public T type() {
        return new NamedT();
    }

}
