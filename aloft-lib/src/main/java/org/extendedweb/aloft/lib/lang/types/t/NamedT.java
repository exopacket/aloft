package org.extendedweb.aloft.lib.lang.types.t;

import org.extendedweb.aloft.lib.lang.types.base.T;
import org.extendedweb.aloft.lib.lang.types.base.V;
import org.extendedweb.aloft.lib.lang.types.v.NamedV;
import org.extendedweb.aloft.lib.lang.types.v.NullV;
import org.extendedweb.aloft.lib.lang.types.v.StringV;

public class NamedT extends T {

    String named;

    @Override
    public V value(Object v) {
        if(v.getClass() != String.class) return new NullV();
        String str = String.valueOf(v);
        return new NamedV(str);
    }

}
