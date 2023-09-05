package com.inteliense.aloft.server.db.internal.supporting;

public class DbDriver {

    private DbType type;

    private DbConnection connection;

    public DbDriver(DbType type) {
        this.type = type;
    }

    public Query buildQuery() {
        if(type == DbType.REDIS) return new RedisAdapter(connection);
        else return new Query(connection);
    }

    public Query buildQuery(String db) {
        if(db == null) return buildQuery();
        if(type == DbType.REDIS) return new RedisAdapter(connection).database(db);
        else return new Query(connection).database(db);
    }

    public DbType getType() {
        return type;
    }
}
