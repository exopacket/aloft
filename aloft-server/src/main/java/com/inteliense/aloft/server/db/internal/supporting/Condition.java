package com.inteliense.aloft.server.db.internal.supporting;

import com.inteliense.aloft.utils.exceptions.types.CommonException;

public class Condition {

    private Object left = null;
    private Object right = null;
    private Operator operator = null;
    private boolean or = false;
    private int groupIndex = 0;

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

    public Condition(Object column, Object v) {
        if(!(left.getClass() == String.class || right.getClass() == String.class))
            new CommonException("At least one side of the condition must be a column name as a string.").report();
        this.left = column;
        try {
            this.operator = (operator.getClass() == Operator.class) ? (Operator) v : Operator.parse(v);
        } catch (CommonException e) {
            e.report();
        }
    }

    public Condition(boolean closeGroup) {
        if(closeGroup) groupIndex = 1;
        groupIndex = -1;
    }

    public static Condition GROUP_BEGIN() {
        return new Condition(false);
    }

    public static Condition GROUP_END() {
        return new Condition(true);
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

    public void or() {
        or = true;
    }

}
