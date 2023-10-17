package com.inteliense.aloft.compiler.lang.keywords.elements.base.validation;

import com.inteliense.aloft.server.html.elements.js.JavaScriptObject;
import com.inteliense.aloft.server.html.elements.js.types.ElementRef;

public class EmailValidator extends Validator {


    public EmailValidator(ElementRef ref, String value) {
        super(ref, value);
    }

    @Override
    public JavaScriptObject validation() {
        return new JavaScriptObject() {
            @Override
            protected void create() {
                declare("val", true);
                child(ref.build());
                chain(value);
                end();
                call("alert", FunctionArg.preset("val"));
                end();
            }
        };
    }
}
