package com.inteliense.aloft.compiler.lang.keywords.elements.base.validation;

import com.inteliense.aloft.server.html.elements.js.JSOV;
import com.inteliense.aloft.server.html.elements.js.JavaScriptObject;
import com.inteliense.aloft.server.html.elements.js.types.ElementRef;

public class EmailValidator extends Validator {

    public EmailValidator(String value) {
        super(value);
    }

    @Override
    public JavaScriptObject validation(ElementRef ref) {
        return new JavaScriptObject() {
            @Override
            protected void create() {
                child(ref.build());
                declare("val", true);
                variable(ref.getId());
                chain(value);
                end();
                setVars();
                call("alert", FunctionArg.raw("val"));
                end();
            }
        };
    }
}
