package org.extendedweb.aloft.lib.lang.structure.listeners.types;

import org.extendedweb.aloft.lib.lang.structure.listeners.base.AloftListener;
import org.extendedweb.aloft.lib.html.elements.js.JavaScriptObject;
import org.extendedweb.aloft.lib.html.elements.js.JSOV;

import java.util.ArrayList;

public class AloftOnClickListener extends AloftListener {

    public AloftOnClickListener(JSOV...variables) {
        super(variables);
    }

    @Override
    protected JavaScriptObject create() {
        return buildBase("click");
    }

    @Override
    protected ArrayList<String> required(ArrayList<String> vars) {
        vars.add("function");
        vars.add("function-slot");
        return vars;
    }
}
