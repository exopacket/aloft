package com.inteliense.aloft.compiler.lang.keywords.elements.base.validation;

import com.inteliense.aloft.server.html.elements.js.JavaScriptObject;
import com.inteliense.aloft.server.html.elements.js.JavaScriptVariableRef;
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
                JavaScriptVariableRef v = constant("val");
                variable(ref.getId());
                chain(value);
                end();
                JavaScriptVariableRef res = constant("result");
                construct("RegExp", FunctionArg.raw("/^(([^<>()[\\]\\\\.,;:\\s@\"]+(\\.[^<>()[\\]\\\\.,;:\\s@\"]+)*)|.(\".+\"))@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$/"));
                chain( "test", FunctionArg.ref(v));
                end();
                setVars();
            }
        };
    }
}
