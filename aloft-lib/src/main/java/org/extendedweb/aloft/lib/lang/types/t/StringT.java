package org.extendedweb.aloft.lib.lang.types.t;

import org.extendedweb.aloft.lib.lang.types.base.T;
import org.extendedweb.aloft.lib.lang.types.base.V;
import org.extendedweb.aloft.lib.lang.types.v.NullV;
import org.extendedweb.aloft.lib.lang.types.v.StringV;
import org.extendedweb.aloft.utils.global.__;

public class StringT extends T {
    @Override
    public V value(Object v) {
        if(v.getClass() != String.class) return new NullV();
        String str = String.valueOf(v);
        if(str.matches("^\".*\"$")) return new StringV(str.replace("\"", ""));
        if(!__.isset(type(v, true))) return new StringV(str);
        return new NullV();
    }

}
