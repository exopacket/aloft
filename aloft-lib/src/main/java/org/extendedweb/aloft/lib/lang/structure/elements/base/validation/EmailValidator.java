package org.extendedweb.aloft.lib.lang.structure.elements.base.validation;

import org.extendedweb.aloft.lib.lang.structure.elements.base.validation.conditionals.base.ConditionalValues;
import org.extendedweb.aloft.lib.lang.structure.elements.base.validation.conditionals.base.Conditions;
import org.extendedweb.aloft.lib.html.elements.js.JavaScriptObject;
import org.extendedweb.aloft.lib.html.elements.js.JavaScriptVariableRef;
import org.extendedweb.aloft.lib.html.elements.js.types.ElementRef;

public class EmailValidator extends Validator {

    private ConditionalValues conditionalValues;

    public EmailValidator(String valueSelector, ConditionalValues values) {
        super(valueSelector);
        this.conditionalValues = values;
    }

    @Override
    public JavaScriptObject validation(ElementRef ref) {
        this.conditionalValues.setRef(ref);
        return new JavaScriptObject() {
            @Override
            protected void create() {
                ElementRef r = ref.getChild("input");
                placeRef(r);
                JavaScriptVariableRef v = constant("val");
                variable(r.getId());
                chain(value);
                end();
                JavaScriptVariableRef res = constant("result");
                construct("RegExp", FunctionArg.raw("/^(([^<>()[\\]\\\\.,;:\\s@\"]+(\\.[^<>()[\\]\\\\.,;:\\s@\"]+)*)|.(\".+\"))@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$/"));
                chain( "test", FunctionArg.ref(v));
                end();
                JavaScriptObject[] validValues = conditionalValues.getValue("input", "text-input-validation", Conditions.ACTIVATE);
                JavaScriptObject[] invalidValues = conditionalValues.getValue("input", "text-input-validation", Conditions.INACTIVE);
                JavaScriptObject validObject = JavaScriptObject.builder(validValues);
                JavaScriptObject invalidObject = JavaScriptObject.builder(invalidValues);

                ConditionGroup ifTrue = createCondition(Condition.truthy(res.get()));
                ConditionGroup ifFalse = createElse();
                ifTrue.setSlot(validObject);
                ifFalse.setSlot(invalidObject);
                condition(ifTrue, ifFalse);
                setVars();
            }
        };
    }
}
