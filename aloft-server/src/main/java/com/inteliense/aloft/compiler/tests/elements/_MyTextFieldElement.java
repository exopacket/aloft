package com.inteliense.aloft.compiler.tests.elements;

import com.inteliense.aloft.compiler.lang.keywords.AloftTheme;
import com.inteliense.aloft.compiler.lang.keywords.elements.base.AloftElement;
import com.inteliense.aloft.compiler.lang.keywords.elements.base.AloftElementSubtype;
import com.inteliense.aloft.compiler.lang.keywords.elements.base.validation.EmailValidator;
import com.inteliense.aloft.compiler.lang.keywords.elements.types.InputAloftElement;
import com.inteliense.aloft.compiler.lang.keywords.listeners.types.AloftOnInputListener;
import com.inteliense.aloft.compiler.lang.lib._AloftElement;
import com.inteliense.aloft.server.html.elements.HtmlElement;
import com.inteliense.aloft.server.html.elements.js.JSOV;
import com.inteliense.aloft.server.html.elements.js.types.ValidateObject;

import java.util.ArrayList;
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
        ValidateObject validation = new ValidateObject(new EmailValidator(input.ref(), "value"));
        input.addListener(new AloftOnInputListener(JSOV.v("function", "v"), JSOV.v("function-slot", validation)));
        return input;
    }

}
