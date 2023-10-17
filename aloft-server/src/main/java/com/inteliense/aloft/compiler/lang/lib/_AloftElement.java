package com.inteliense.aloft.compiler.lang.lib;

import com.inteliense.aloft.compiler.lang.keywords.elements.base.AloftElement;

import java.util.HashMap;

public abstract class _AloftElement {
    public abstract AloftElement build(HashMap<String, Object> vars);
}
