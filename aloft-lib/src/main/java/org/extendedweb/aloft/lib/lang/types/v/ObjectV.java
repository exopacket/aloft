package org.extendedweb.aloft.lib.lang.types.v;

import org.extendedweb.aloft.lib.lang.types.base.T;
import org.extendedweb.aloft.lib.lang.types.base.V;
import org.extendedweb.aloft.lib.lang.types.t.ObjectT;

public class ObjectV extends V {

    private String value;

    public ObjectV(String value) { this.value = value; }

    @Override
    public <Any> Any get() {
        return (Any) value;
    }

    @Override
    public T type() {
        return new ObjectT();
    }

}
