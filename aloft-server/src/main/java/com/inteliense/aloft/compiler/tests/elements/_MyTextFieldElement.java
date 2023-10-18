package com.inteliense.aloft.compiler.tests.elements;

import com.inteliense.aloft.compiler.lang.keywords.elements.base.AloftElement;
import com.inteliense.aloft.compiler.lang.keywords.elements.types.InputAloftElement;
import com.inteliense.aloft.compiler.lang.lib._AloftElement;

import java.util.HashMap;

public class _MyTextFieldElement extends _AloftElement {

    private HashMap<String, Object> data = new HashMap<>();

    @Override
    public AloftElement build(HashMap<String, Object> vars) {
        this.data = vars;
        InputAloftElement input = new InputAloftElement("__text_input__");
        input.setLabel("Label");
        input.setPlaceholder("Placeholder...");
        input.setHelpText("Write something");
        return input;
    }

}
