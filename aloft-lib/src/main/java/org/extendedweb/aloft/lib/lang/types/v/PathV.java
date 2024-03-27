package org.extendedweb.aloft.lib.lang.types.v;

import org.extendedweb.aloft.lib.lang.types.base.T;
import org.extendedweb.aloft.lib.lang.types.base.V;
import org.extendedweb.aloft.lib.lang.types.t.PathT;

public class PathV extends V {

    private String value;

    public PathV(String value) {
        this.value = value;
    }

    @Override
    public <Any> Any get() {
        return (Any) this.value;
    }

    @Override
    public T type() {
        return new PathT();
    }
}
