package org.extendedweb.aloft.lib.lang.structure.elements.base.validation;

import org.extendedweb.aloft.lib.html.elements.js.JavaScriptObject;
import org.extendedweb.aloft.lib.html.elements.js.types.ElementRef;

public abstract class Validator {

    protected String value;

    public Validator(String value) {
        this.value = value;
    }

    public abstract JavaScriptObject validation(ElementRef ref);

}
