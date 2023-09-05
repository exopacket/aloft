package com.inteliense.aloft.server.db.internal.connectors;

import com.inteliense.aloft.server.db.internal.supporting.DbConnection;
import com.inteliense.aloft.utils.exceptions.types.CriticalException;
import redis.clients.jedis.Jedis;


public class RedisConnection extends DbConnection {

    private Jedis conn = null;
    private String db = "";

    @Override
    public Object getConn() {
        return conn;
    }

    @Override
    public void onError(CriticalException e) {
        e.report();
    }

    @Override
    protected void connect() throws Exception, CriticalException {

        conn = new Jedis();
        if(!conn.isConnected()) throw new CriticalException("Failed to connect to redis.");

    }

    @Override
    public void close() throws Exception {
        if(conn != null && conn.isConnected()) conn.close();
    }

    @Override
    public void changeDb(String database) throws Exception, CriticalException {
        if(database.equals(db)) return;
        this.db = database;
    }
}
