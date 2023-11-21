package org.extendedweb.aloft.lib.lang.types.v;

import org.extendedweb.aloft.lib.lang.types.base.T;
import org.extendedweb.aloft.lib.lang.types.base.V;
import org.extendedweb.aloft.lib.lang.types.t.DynamicT;
import org.extendedweb.aloft.utils.global.__;

public class DynamicV extends V {

    private V value = new NullV();

    public DynamicV(V value) {
        set(value);
    }

    public DynamicV(Object value) {
        set(value);
    }

    @Override
    public V get() {
        return value;
    }

    @Override
    public T type() {
        return new DynamicT();
    }

    public void set(V value) {
        this.value = value;
    }

    public void set(Object value) { if(__.isset(T.type(value))) this.value = T.type(value).value(value); }

}
