package org.extendedweb.aloft.lib.lang.types.v;

import org.extendedweb.aloft.lib.lang.types.base.V;

public class NullV extends V {
    @Override
    public <Any> Any get() {
        return null;
    }
}
