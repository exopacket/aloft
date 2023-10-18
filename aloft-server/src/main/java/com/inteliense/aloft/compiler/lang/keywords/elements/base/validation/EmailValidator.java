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
                ElementRef r = ref.getChild("input");
                child(r.build());
                JavaScriptVariableRef v = constant("val");
                variable(r.getId());
                chain(value);
                end();
                JavaScriptVariableRef res = constant("result");
                construct("RegExp", FunctionArg.raw("/^(([^<>()[\\]\\\\.,;:\\s@\"]+(\\.[^<>()[\\]\\\\.,;:\\s@\"]+)*)|.(\".+\"))@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$/"));
                chain( "test", FunctionArg.ref(v));
                end();
                variable(r.getId());
                chain("style", "boxShadow");
                set();
                str("rgba(255, 0, 0, 0.45) 0px 0px 0px 3px");
                end();
                variable(r.getId());
                chain("style", "border");
                set();
                str("solid 0.5px rgba(255, 0, 0, 0.7)");
                end();
                JavaScriptObject validObject = new JavaScriptObject() {
                    @Override
                    protected void create() {
                        ElementRef help = ref.getChild("help-text");
                        child(help.build());
                        variable(help.getId());
                        chain("innerHTML");
                        set();
                        str("VALID");
                    }
                }.build();
                JavaScriptObject invalidObject = new JavaScriptObject() {
                    @Override
                    protected void create() {
                        ElementRef help = ref.getChild("help-text");
                        child(help.build());
                        variable(help.getId());
                        chain("innerHTML");
                        set();
                        str("INVALID");
                    }
                }.build();

                ConditionGroup ifTrue = new ConditionGroup(Condition.truthy(res.get()));
                ConditionGroup ifFalse = ConditionGroup.createElse();
                ifTrue.setSlot(validObject);
                ifFalse.setSlot(invalidObject);
                condition(ifTrue, ifFalse);

                setVars();
            }
        };
    }
}
