package com.inteliense.aloft.server.db.internal.supporting.sql;

public class Column extends SQLColumnOrFunction {

    private String table;
    private String name;

    public Column(String table, String name) {
        this.table = table;
        this.name = name;
    }

    public String full() {
        return "`" + this.table + "`.`" + this.name + "`";
    }

    public String name() {
        return "`" + this.name + "`";
    }

    @Override
    public Class getType() {
        return Column.class;
    }

    @Override
    public String getTypeString() {
        return "Column";
    }
}
