package com.inteliense.aloft.server.db.internal.supporting;

public class Field {

    private String column;
    private Object value;

    public Field(String column, Object value) {
        this.column = column;
        this.value = value;
    }

    public String column() {
        return column;
    }

    public <Any> Any get() {
        if(value.getClass() == String.class) return (Any) ((String) value);
        else if(value.getClass() == Integer.class) return (Any) ((Integer) (int) value);
        else if(value.getClass() == Boolean.class) return (Any) ((Boolean)(boolean) value);
        else if(value.getClass() == Float.class) return (Any) ((Float) (float) value);
        else return (Any) value;
    }

}
