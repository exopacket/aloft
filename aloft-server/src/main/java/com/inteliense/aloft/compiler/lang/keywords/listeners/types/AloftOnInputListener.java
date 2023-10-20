package com.inteliense.aloft.compiler.lang.keywords.listeners.types;

import com.inteliense.aloft.compiler.lang.keywords.elements.base.validation.Validator;
import com.inteliense.aloft.compiler.lang.keywords.listeners.base.AloftListener;
import com.inteliense.aloft.server.html.elements.js.JSOV;
import com.inteliense.aloft.server.html.elements.js.JavaScriptObject;
import com.inteliense.aloft.server.html.elements.js.JavaScriptRefMapper;

import java.util.ArrayList;
import java.util.HashMap;

public class AloftOnInputListener extends AloftListener {

    public AloftOnInputListener(Validator validator, JavaScriptRefMapper mapper, JSOV...variables) {
        super(validator, mapper, variables);
    }

    public AloftOnInputListener(Validator validator, JSOV...variables) {
        super(validator, null, variables);
    }

    @Override
    protected JavaScriptObject create() {
        return buildBase("keyup");
    }

    @Override
    protected ArrayList<String> required(ArrayList<String> vars) {
        vars.add("function");
        vars.add("function-slot");
        return vars;
    }
}
