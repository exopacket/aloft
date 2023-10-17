package com.inteliense.aloft.compiler.lang.keywords.listeners.types;

import com.inteliense.aloft.compiler.lang.keywords.listeners.base.AloftListener;
import com.inteliense.aloft.server.html.elements.js.JSOV;
import com.inteliense.aloft.server.html.elements.js.JavaScriptObject;

import java.util.ArrayList;

public class AloftOnBlurListener extends AloftListener {

    public AloftOnBlurListener(JSOV...variables) {
        super(variables);
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