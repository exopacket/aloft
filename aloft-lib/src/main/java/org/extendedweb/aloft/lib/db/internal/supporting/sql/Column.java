package org.extendedweb.aloft.lib.db.internal.supporting.sql;

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
        return this.name;
    }

    public Class getType() {
        return Column.class;
    }

    public String getTypeString() {
        return "Column";
    }
}
