package com.inteliense.aloft.compiler.lang.keywords.listeners;

import com.inteliense.aloft.compiler.lang.keywords.listeners.base.AloftListener;
import com.inteliense.aloft.compiler.lang.keywords.listeners.types.AloftOnClickListener;

public class Listen {

    public static AloftListener onClick() {
        return new AloftOnClickListener();
    }

}
