package org.extendedweb.aloft.lib.db.internal.supporting.redis;

import org.extendedweb.aloft.lib.db.internal.supporting.DbConnection;
import org.extendedweb.aloft.lib.db.internal.supporting.Query;

public class RedisAdapter extends Query {

    public RedisAdapter(DbConnection connection) {
        super(connection);
    }

}
