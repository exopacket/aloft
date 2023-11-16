package org.extendedweb.aloft.lib.lang.types.v;

import org.extendedweb.aloft.lib.lang.types.base.V;
import org.extendedweb.aloft.lib.lang.types.t.DynamicT;

public class ArrayV extends V {

    private V[] arr;

    public ArrayV(V[] v) {
        V[] arr = new V[v.length];
        for(int i=0; i<v.length; i++) {
            arr[i] = new DynamicT().value(v[i]);
        }
        this.arr = arr;
    }

    @Override
    public <Any> Any get() {
        return (Any) arr;
    }

    public int size() {
        return arr.length;
    }

    public V get(int index) {
        return arr[index];
    }

}
