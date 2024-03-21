package org.extendedweb.aloft.lib.db.internal.connectors.details;

import org.extendedweb.aloft.lib.lang.types.base.T;
import org.extendedweb.aloft.lib.lang.types.base.V;
import org.extendedweb.aloft.lib.db.internal.supporting.DbType;

import java.util.HashMap;

public abstract class DbConnectionDetails {

    protected DbType type;
    protected HashMap<String, DbDetailsPair> values = new HashMap<String, DbDetailsPair>();

    public DbConnectionDetails(DbType type) {
        this.type = type;
    }

    protected abstract void build();

    public V get(String key) {
        if(!values.containsKey(key)) return V.nothing();
        return values.get(key).get();
    }

    public DbType getType() {
        return type;
    }

    protected void append(String key, T type, Object value) {
        values.put(key, new DbDetailsPair(type, value));
    }

    public static class DbDetailsPair {

        private T type;
        private Object v;

        public DbDetailsPair(T type, Object v) {
            this.type = type;
            this.v = v;
        }

        public V get() {
            return type.value(v);
        }

    }

}
