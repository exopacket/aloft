package org.extendedweb.aloft.lib.js;

import org.extendedweb.aloft.lib.html.elements.js.JavaScriptObject;
import org.extendedweb.aloft.utils.global.__;

public class ConditionExpression {

    private boolean not = false;
    private String left = null;
    private String right = null;
    private String operator = null;
    private JavaScriptObject.Compare comparison = null;

    public ConditionExpression(String left, String operator, String right) {
        this.left = left;
        this.operator = operator;
        this.right = right;
    }

    public ConditionExpression(boolean not, String value) {
        this.left = value;
        this.not = not;
    }

    public ConditionExpression(boolean or) {
        if(or) comparison = JavaScriptObject.Compare.OR;
        else comparison = JavaScriptObject.Compare.AND;
    }

    public JavaScriptObject.Condition get() {
        if(__.isset(comparison)) return JavaScriptObject.Condition.compare(comparison);
        if(!__.isset(operator) && !__.isset(right)) {
            if(not) return JavaScriptObject.Condition.not(left);
            else return JavaScriptObject.Condition.truthy(left);
        }
        return JavaScriptObject.Condition.create(left, operator, right);
    }
}
