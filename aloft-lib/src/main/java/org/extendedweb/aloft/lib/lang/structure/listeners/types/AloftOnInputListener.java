package org.extendedweb.aloft.lib.lang.structure.listeners.types;

import org.extendedweb.aloft.lib.lang.structure.elements.base.validation.Validator;
import org.extendedweb.aloft.lib.lang.structure.listeners.base.AloftListener;
import org.extendedweb.aloft.lib.html.elements.js.JSOV;
import org.extendedweb.aloft.lib.html.elements.js.JavaScriptObject;
import org.extendedweb.aloft.lib.html.elements.js.JavaScriptRefMapper;

import java.util.ArrayList;

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
