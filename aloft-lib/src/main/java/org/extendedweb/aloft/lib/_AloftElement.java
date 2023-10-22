package org.extendedweb.aloft.lib;

import org.extendedweb.aloft.lib.lang.structure.elements.base.AloftElement;

import java.util.HashMap;

public abstract class _AloftElement {
    public abstract AloftElement build(HashMap<String, Object> vars);
}
