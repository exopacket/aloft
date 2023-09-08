package com.inteliense.aloft.server.db.internal.supporting.sql;

import com.inteliense.aloft.utils.exceptions.types.CommonException;

public class Operator {
    public enum V {
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
        SOFT_DELETED
    }

    public static boolean hasRight(V v) {
        switch(v) {
            case EQUALS, NOT_EQUAL, GREATER_THAN,
                    LESS_THAN, GREATER_THAN_OR_EQUAL,
                    LESS_THAN_OR_EQUAL -> {
                return true;
            }
            default -> {
                return false;
            }
        }
    }

    public static String get(V v) {
        switch(v) {
            case EQUALS -> {
                return "=";
            }
            case NOT_EQUAL -> {
                return "<>";
            }
            case GREATER_THAN -> {
                return ">";
            }
            case LESS_THAN -> {
                return "<";
            }
            case GREATER_THAN_OR_EQUAL -> {
                return ">=";
            }
            case LESS_THAN_OR_EQUAL -> {
                return "<=";
            }
            case TRUE -> {
                return "=1";
            }
            case FALSE -> {
                return "=0";
            }
            case NULL -> {
                return "IS NULL";
            }
            case NOT_NULL, SOFT_DELETED -> {
                return "IS NOT NULL";
            }
            default -> {
                return "";
            }
        }
    }

    public static V parse(Object o) throws CommonException {
        if(o == null) return V.NULL;
        if(o.getClass() == String.class) return fromString((String) o);
        if(o.getClass() == Boolean.class) {
            boolean b = (boolean) o;
            if(b == true) return V.TRUE;
            if(b == false) return V.FALSE;
        }
        if(o.getClass() == Integer.class) {
            int i = (int) o;
            if(!(i == 0 || i == 1)) throw new CommonException("boolean must be 1 or 0");
            boolean b = false;
            if(i == 1) b = true;
            if(b == true) return V.TRUE;
            if(b == false) return V.FALSE;
        }
        throw new CommonException("Unknown where operator.");
    }

    private static V fromString(String str) {
        str = str.trim();
        if (str.equals("!=") || str.equals("<>")) return V.NOT_EQUAL;
        if (str.equals(">")) return V.GREATER_THAN;
        if (str.equals("<")) return V.LESS_THAN;
        if (str.equals(">=")) return V.GREATER_THAN_OR_EQUAL;
        if (str.equals("<=")) return V.LESS_THAN_OR_EQUAL;
        if (str.equals("==") || str.equals("=") || str.equals("===")) return V.EQUALS;
        if (str.equals("!")) return V.NOT_NULL;
        if (str.isEmpty() || str == null) return V.NULL;
        if (str.toLowerCase().equals("true")) return V.TRUE;
        if (str.toLowerCase().equals("false")) return V.FALSE;
        return null;
    }

}



