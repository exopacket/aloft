package org.extendedweb.aloft.lib.lang.structure.listeners.types;

import org.extendedweb.aloft.lib.lang.structure.listeners.base.AloftListener;
import org.extendedweb.aloft.lib.html.elements.js.JavaScriptObject;

import java.util.ArrayList;

public class AloftOnBlurListener extends AloftListener {

    public AloftOnBlurListener() {
        super();
    }

    @Override
    protected JavaScriptObject create() {
        return buildBase("click");
    }

    @Override
    protected ArrayList<String> required(ArrayList<String> vars) {
        vars.add("sticky");
        vars.add("function");
        vars.add("function-slot");
        return vars;
    }
}
