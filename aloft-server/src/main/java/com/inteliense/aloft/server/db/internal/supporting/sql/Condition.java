package com.inteliense.aloft.server.db.internal.supporting.sql;

import com.inteliense.aloft.utils.exceptions.types.CommonException;

public class Condition {

    private Object left = null;
    private Object right = null;
    private Operator.V operator = null;
    private boolean or = false;

    private boolean notForJoin = false;
    private boolean forJoin = false;

    private int groupIndex = 0;

    public Condition(Object left, Object operator, Object right) {
        if(!(left.getClass() == Column.class || right.getClass() == Column.class))
            new CommonException("At least one side of the condition must be a column object.").report();
        this.left = left;
        try {
            this.operator = (operator.getClass() == Operator.V.class) ? (Operator.V) operator : Operator.parse(operator);
        } catch (CommonException e) {
            e.report();
        }
        this.right = right;
    }

    public Condition(Object column, Object v) {
        if(!(left.getClass() == Column.class || right.getClass() == Column.class))
            new CommonException("At least one side of the condition must be a column object.").report();
        this.left = column;
        try {
            this.operator = (operator.getClass() == Operator.V.class) ? (Operator.V) v : Operator.parse(v);
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

    public Operator.V operator() {
        return this.operator;
    }

    public void or() {
        or = true;
    }

    public boolean isGroup() {
        return groupIndex == 0;
    }

    public boolean isClose() {
        return groupIndex == 1;
    }

    public boolean isOpen() {
        return groupIndex == -1;
    }

    public boolean isOr() {
        return or;
    }

    public void notForJoin() {
        notForJoin = true;
    }

    public void forJoin() {
        forJoin = true;
    }

    public boolean isForJoin() {
        return forJoin;
    }

    public boolean isNotForJoin() {
        return notForJoin;
    }
}
