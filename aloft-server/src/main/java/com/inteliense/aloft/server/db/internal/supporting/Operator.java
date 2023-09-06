package com.inteliense.aloft.server.db.internal.supporting;

import com.inteliense.aloft.utils.exceptions.types.CommonException;

public enum Operator {
    EQUALS,
    NOT_EQUAL,
    GREATER_THAN,
    LESS_THAN,
    GREATER_THAN_OR_EQUAL,
    LESS_THAN_OR_EQUAL,
    TRUE,
    FALSE,
    NULL,
    NOT_NULL,
    SOFT_DELETED;

    public static Operator parse(Object o) throws CommonException {
        if(o == null) return Operator.NULL;
        if(o.getClass() == String.class) return fromString((String) o);
        if(o.getClass() == Boolean.class) {
            boolean b = (boolean) o;
            if(b == true) return Operator.TRUE;
            if(b == false) return Operator.FALSE;
        }
        if(o.getClass() == Integer.class) {
            int i = (int) o;
            if(!(i == 0 || i == 1)) throw new CommonException("boolean must be 1 or 0");
            boolean b = false;
            if(i == 1) b = true;
            if(b == true) return Operator.TRUE;
            if(b == false) return Operator.FALSE;
        }
        throw new CommonException("Unknown where operator.");
    }

    private static Operator fromString(String str) {
        str = str.trim();
        if(str.equals("!=") || str.equals("<>")) return Operator.NOT_EQUAL;
        if(str.equals(">")) return Operator.GREATER_THAN;
        if(str.equals("<")) return Operator.LESS_THAN;
        if(str.equals(">=")) return Operator.GREATER_THAN_OR_EQUAL;
        if(str.equals("<=")) return Operator.LESS_THAN_OR_EQUAL;
        if(str.equals("==") || str.equals("=") || str.equals("===")) return Operator.EQUALS;
        if(str.equals("!")) return Operator.NOT_NULL;
        if(str.isEmpty() || str == null) return Operator.NULL;
        if(str.toLowerCase().equals("true")) return Operator.TRUE;
        if(str.toLowerCase().equals("false")) return Operator.FALSE;
        return null;
    }

}


