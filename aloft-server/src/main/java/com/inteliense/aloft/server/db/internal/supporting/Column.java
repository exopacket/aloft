package com.inteliense.aloft.server.db.internal.supporting;

public class Column {

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

}
