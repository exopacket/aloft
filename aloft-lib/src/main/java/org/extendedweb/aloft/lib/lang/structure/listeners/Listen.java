package org.extendedweb.aloft.lib.lang.structure.listeners;

import org.extendedweb.aloft.lib.lang.structure.listeners.base.AloftListener;
import org.extendedweb.aloft.lib.lang.structure.listeners.types.AloftOnClickListener;

public class Listen {

    public static AloftListener onClick() {
        return new AloftOnClickListener();
    }

}
