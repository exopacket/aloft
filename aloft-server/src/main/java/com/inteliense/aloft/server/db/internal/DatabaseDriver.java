package com.inteliense.aloft.server.db.internal;

public class DatabaseDriver {

    private DbType type;

    public DatabaseDriver(DbType type) {
        this.type = type;
    }

    public Query buildQuery() {
        if(type == DbType.REDIS) return new RedisAdapter();
        else return new Query();
    }

    public Query buildQuery(String db) {
        if(db == null) return buildQuery();
        if(type == DbType.REDIS) return new RedisAdapter().database(db);
        else return new Query().database(db);
    }

    public DbType getType() {
        return type;
    }
}
