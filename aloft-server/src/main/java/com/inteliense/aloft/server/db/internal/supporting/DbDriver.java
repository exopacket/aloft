package com.inteliense.aloft.server.db.internal.supporting;

import com.inteliense.aloft.server.db.internal.connectors.MysqlConnection;
import com.inteliense.aloft.server.db.internal.connectors.RedisConnection;
import com.inteliense.aloft.server.db.internal.connectors.SqliteConnection;

public class DbDriver {

    private DbType type;

    private DbConnection connection;

    public DbDriver(DbType type, String username, String password) {
        this.type = type;
        if(type == DbType.REDIS) this.connection = new RedisConnection(username, password);
        else if(type == DbType.MYSQL) this.connection = new MysqlConnection(username, password);
        else if(type == DbType.SQLITE) this.connection = new SqliteConnection(username, password);
    }

    public DbConnection conn() {
        return connection;
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
