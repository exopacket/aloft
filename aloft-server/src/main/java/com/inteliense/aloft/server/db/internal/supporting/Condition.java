package com.inteliense.aloft.server.db.internal.supporting;

import com.inteliense.aloft.utils.exceptions.types.CommonException;

public class Condition {

    private Object left;
    private Object right;
    private Operator operator;

    public Condition(Object left, Object operator, Object right) {
        if(!(left.getClass() == String.class || right.getClass() == String.class))
            new CommonException("At least one side of the condition must be a column name as a string.").report();
        this.left = left;
        try {
            this.operator = (operator.getClass() == Operator.class) ? (Operator) operator : Operator.parse(operator);
        } catch (CommonException e) {
            e.report();
        }
        this.right = right;
    }

    public Object left() {
        return this.left;
    }

    public Object right() {
        return this.right;
    }

    public Operator operator() {
        return this.operator;
    }

}
