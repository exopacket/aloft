package com.inteliense.aloft.compiler.lang.keywords.elements.base.validation;

import com.inteliense.aloft.compiler.lang.keywords.listeners.base.AloftListener;
import com.inteliense.aloft.server.html.elements.js.JavaScriptObject;
import com.inteliense.aloft.server.html.elements.js.types.ElementRef;

public abstract class Validator {

    private AloftListener[] listeners;
    protected ElementRef ref;
    protected String value;

    public Validator(ElementRef ref, String value, AloftListener... listeners) {
        this.ref = ref;
        this.value = value;
        this.listeners = listeners;
    }

    public abstract JavaScriptObject validation();

}
