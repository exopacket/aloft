package org.extendedweb.aloft.lib.db.internal.supporting.sql;

public abstract class SQLColumnOrFunction {

    public abstract Class getType();
    public abstract String getTypeString();
    public abstract String full();
    public abstract String name();

}
