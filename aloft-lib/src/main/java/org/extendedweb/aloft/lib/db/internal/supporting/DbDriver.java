package org.extendedweb.aloft.lib.db.internal.supporting;

import org.extendedweb.aloft.lib.db.internal.connectors.MysqlConnection;
import org.extendedweb.aloft.lib.db.internal.connectors.RedisConnection;
import org.extendedweb.aloft.lib.db.internal.connectors.SqliteConnection;
import org.extendedweb.aloft.lib.db.internal.connectors.details.DbConnectionDetails;
import org.extendedweb.aloft.lib.db.internal.connectors.details.DbConnectionMysqlDetails;
import org.extendedweb.aloft.lib.db.internal.supporting.redis.RedisAdapter;

public class DbDriver {

    private DbType type;
    private DbConnection connection;

    public DbDriver(DbConnectionDetails details) {
        this.type = details.getType();
        if(type == DbType.REDIS) this.connection = new RedisConnection(details);
        else if(type == DbType.MYSQL) this.connection = new MysqlConnection((DbConnectionMysqlDetails) details);
        else if(type == DbType.SQLITE) this.connection = new SqliteConnection(details);
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
