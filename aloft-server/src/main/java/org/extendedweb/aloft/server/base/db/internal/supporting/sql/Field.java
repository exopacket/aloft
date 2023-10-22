package org.extendedweb.aloft.server.base.db.internal.supporting.sql;

import org.extendedweb.aloft.server.base.db.internal.supporting.sql.Column;

public class Field {

    private SQLColumnOrFunction key;
    private Object value;

    public Field(SQLColumnOrFunction key, Object value) {
        this.key = key;
        this.value = value;
    }

    public Class getType() {
        return key.getType();
    }

    public Column column() {
        return (Column) key;
    }

    public SQLFunction function() {
        return (SQLFunction) key;
    }

    public String name() {
        if(key.getType() == Column.class) return column().name();
        else if(key.getType() == SQLFunction.class) return function().full();
        return null;
    }

    public String label() {
        return name();
    }

    public <Any> Any get() {
        if(value == null) return null;
        if(value.getClass() == String.class) return (Any) ((String) value);
        else if(value.getClass() == Integer.class) return (Any) ((Integer) (int) value);
        else if(value.getClass() == Boolean.class) return (Any) ((Boolean)(boolean) value);
        else if(value.getClass() == Float.class) return (Any) ((Float) (float) value);
        else return (Any) value;
    }

    public <Any> Any value() {
        return get();
    }

}
