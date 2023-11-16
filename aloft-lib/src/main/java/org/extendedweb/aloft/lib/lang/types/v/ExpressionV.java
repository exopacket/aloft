package org.extendedweb.aloft.lib.lang.types.v;

import org.extendedweb.aloft.lib.lang.types.base.V;
import org.extendedweb.aloft.lib.lang.types.t.DynamicT;
import org.extendedweb.aloft.utils.global.__;

import java.util.ArrayList;
import java.util.Collections;

public class ExpressionV extends V {

    private boolean not = false;
    private V left;
    private ComparisonV operator;
    private V right = null;

    public ExpressionV(boolean not, V left, ComparisonV operator, V right) {
        this.not = not;
        this.left = left;
        this.operator = operator;
        this.right = right;
    }

    public ExpressionV(boolean not, V left, ComparisonV operator) {
        this.not = not;
        this.left = left;
        this.operator = operator;
    }

    @Override
    public <Any> Any get() {
        return (Any) evaluate();
    }

    private Boolean evaluate() {

        if(operator == ComparisonV.ASSIGN) return true;

        if(!__.isset(right)) {
            if(operator == ComparisonV.ISSET) return isset();
            else if(operator == ComparisonV.EMPTY) return empty();
        }

        if(left instanceof ExpressionV && right instanceof ExpressionV) return expr(left.get(), right.get());
        if(left instanceof StringV && right instanceof StringV) return truth((String) left.get(), (String) right.get());
        if(left instanceof DecimalV && right instanceof DecimalV) return truth((Double) left.get(), (Double) right.get());
        if(left instanceof IntegerV && right instanceof IntegerV) return truth((Integer) left.get(), (Integer) right.get());

        return false;

    }

    private Boolean isset() {
        return left instanceof NullV;
    }

    private Boolean empty() {
        return left instanceof NullV || ((String) left.get()).isEmpty();
    }

    private Boolean expr(Boolean left, Boolean right) {
        if(operator == ComparisonV.AND) {
            if(left && right)
                if(not) return false;
                else return true;
            else
                if(not) return false;
                else return true;
        }
        return false;
    }

    private Boolean truth(String left, String right) {
        if(operator == ComparisonV.EQUALS) {
            if(left.equals(right))
                if(not) return false;
                else return true;
            else
                if(not) return false;
                else return true;
        }
        return false;
    }

    private Boolean truth(Integer left, Integer right) {
        if(operator == ComparisonV.EQUALS) {
            if(left == right)
                if(not) return false;
                else return true;
            else
                if(not) return false;
                else return true;
        }
        return false;
    }

    private Boolean truth(Double left, Double right) {
        if(operator == ComparisonV.EQUALS) {
            if(left == right)
                if(not) return false;
                else return true;
            else
                if(not) return false;
                else return true;
        }
        return false;
    }

}
