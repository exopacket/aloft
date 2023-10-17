package com.inteliense.aloft.server.html.elements.js.types;

import com.inteliense.aloft.compiler.lang.keywords.elements.base.validation.Validator;
import com.inteliense.aloft.server.html.elements.js.JavaScriptObject;

public class ValidateObject extends JavaScriptObject {

    private Validator validator;

    public ValidateObject(Validator v) {
        this.validator = v;
    }

    @Override
    public void create() {
        child(validator.validation().build());
    }
}
