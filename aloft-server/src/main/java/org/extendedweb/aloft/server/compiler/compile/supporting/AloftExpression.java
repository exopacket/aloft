package org.extendedweb.aloft.server.compiler.compile.supporting;

import org.extendedweb.aloft.lib.lang.types.base.V;
import org.extendedweb.aloft.lib.lang.types.v.ComparisonV;
import org.extendedweb.aloft.lib.lang.types.v.ExpressionV;
import org.extendedweb.aloft.lib.lang.types.v.NullV;

public class AloftExpression {

    private boolean not = false;
    private Object left;
    private ComparisonV operator;
    private Object right;

    public AloftExpression(boolean not, Object left, ComparisonV operator, Object right) {
        this.left = left;
        this.operator = operator;
        this.right = right;
    }

    public boolean evaluate() {
        return this.getValue().get();
    }

    private ExpressionV getValue() {
        V left = new NullV();
        V right = new NullV();
        if(this.left instanceof AloftVariable) left = ((AloftVariable) this.left).value();
        else if(this.left instanceof V) left = (V) this.left;
        if(this.right instanceof AloftVariable) left = ((AloftVariable) this.right).value();
        else if(this.right instanceof V) right = (V) this.right;
        return new ExpressionV(not, left, operator, right);
    }

}
