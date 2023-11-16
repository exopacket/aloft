package org.extendedweb.aloft.lib.lang.types.v;

import org.extendedweb.aloft.lib.lang.types.base.V;

public class DynamicV extends V {

    private V value;

    public DynamicV(V value) {
        this.value = value;
    }

    @Override
    public <Any> Any get() {
        return (Any) value;
    }

    public void set(V value) {
        this.value = value;
    }

}
