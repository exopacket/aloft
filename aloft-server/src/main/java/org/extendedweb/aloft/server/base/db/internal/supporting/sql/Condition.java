package org.extendedweb.aloft.server.base.db.internal.supporting.sql;

import org.extendedweb.aloft.utils.exceptions.types.CommonException;

public class Condition {

    private Object left = null;
    private Object right = null;
    private Operator.V operator = null;
    private boolean or = false;
    private int valuePos = 0;

    private boolean notForJoin = false;
    private boolean forJoin = false;

    private int groupIndex = -2;

    private String matchStr = null;

    private boolean singleValue = false;

    public Condition(Object left, Object operator, Object right) {
        if(!(left instanceof SQLColumnOrFunction || right instanceof SQLColumnOrFunction))
            new CommonException("At least one side of the condition must be a column object.").report();
        if(!(left instanceof SQLColumnOrFunction)) valuePos = -1;
        if(!(right instanceof SQLColumnOrFunction)) valuePos = 1;
        this.left = left;
        try {
            this.operator = (operator.getClass() == Operator.V.class) ? (Operator.V) operator : Operator.parse(operator);
        } catch (CommonException e) {
            e.report();
        }
        this.right = right;
    }

    public Condition(Object column, Object v) {
        this.valuePos = -1;
        this.left = column;
        try {
            this.operator = (v.getClass() == Operator.V.class) ? (Operator.V) v : Operator.parse(v);
        } catch (CommonException e) {
            e.report();
        }
    }

    public Condition(String value) {
        this.singleValue = true;
        this.left = value;
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

    public boolean isSingleValue() {
        return singleValue;
    }

    public boolean isDualColumns() {
        return valuePos == 0;
    }

    public Object value() {
        if(valuePos == -1) return left;
        if(valuePos == 1) return right;
        return new SQLColumnOrFunction[]{(SQLColumnOrFunction) left, (SQLColumnOrFunction) right};
    }
}
