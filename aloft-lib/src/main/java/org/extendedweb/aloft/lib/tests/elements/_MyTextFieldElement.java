package org.extendedweb.aloft.lib.tests.elements;

import org.extendedweb.aloft.lib.lang.structure.elements.base.AloftElement;
import org.extendedweb.aloft.lib.lang.structure.elements.types.InputAloftElement;
import org.extendedweb.aloft.lib._AloftElement;

import java.util.HashMap;

public class _MyTextFieldElement extends _AloftElement {

    private HashMap<String, Object> data = new HashMap<>();

    @Override
    public AloftElement build(HashMap<String, Object> vars) {
        this.data = vars;
        InputAloftElement input = new InputAloftElement("__text_input__");
        input.setLabel("Email");
        input.setPlaceholder("Enter your email...");
        input.setHelpText("Please enter a valid email.");
        return input;
    }

}
