package com.inteliense.aloft.server.db.internal.supporting.redis;

import com.inteliense.aloft.server.db.internal.supporting.DbConnection;
import com.inteliense.aloft.server.db.internal.supporting.Query;

public class RedisAdapter extends Query {

    public RedisAdapter(DbConnection connection) {
        super(connection);
    }

}
