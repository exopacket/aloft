package org.extendedweb.aloft.lib.lang.types.t;

import org.extendedweb.aloft.lib.lang.types.base.T;
import org.extendedweb.aloft.lib.lang.types.base.V;
import org.extendedweb.aloft.lib.lang.types.v.ArrayV;
import org.extendedweb.aloft.lib.lang.types.v.NullV;
import org.extendedweb.aloft.utils.global.__;

public class ArrayT extends T {

    private T type = null;

    public ArrayT() { }

    public ArrayT(T type) {
        this.type = type;
    }

    @Override
    public V value(Object v) {
        if(__.isset(type)) {
            if(v instanceof V[]) {
                V[] vv = (V[]) v;
                for(int i=0; i<vv.length; i++) {
                    if(!vv[i].type().getClass().equals(type.getClass())) return V.nothing();
                }
                return new ArrayV(vv);
            }
            if(v instanceof V) {
                if(!((V) v).type().getClass().equals(type.getClass())) return V.nothing();
                return new ArrayV(new V[]{(V) v});
            }
        }
        else if(v instanceof V[]) return new ArrayV((V[]) v);
        else if(v instanceof V) return new ArrayV(new V[]{(V) v});
        return new NullV();
    }
}
