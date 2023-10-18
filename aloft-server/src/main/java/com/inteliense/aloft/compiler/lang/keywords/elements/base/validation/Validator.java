package com.inteliense.aloft.compiler.lang.keywords.elements.base.validation;

import com.inteliense.aloft.server.html.elements.js.JavaScriptObject;
import com.inteliense.aloft.server.html.elements.js.types.ElementRef;

public abstract class Validator {

    protected String value;

    public Validator(String value) {
        this.value = value;
    }

    public abstract JavaScriptObject validation(ElementRef ref);

}
