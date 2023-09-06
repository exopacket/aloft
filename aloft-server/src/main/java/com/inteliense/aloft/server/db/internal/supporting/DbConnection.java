package com.inteliense.aloft.server.db.internal.supporting;

import com.inteliense.aloft.utils.exceptions.types.CriticalException;

public abstract class DbConnection implements ExecutesQueries {

    protected String db = null;
    protected String username;
    protected String password;

    public DbConnection(String username, String password) {
        this.username = username;
        this.password = password;
        try {
            if(db != null) connect();
        } catch(Exception | CriticalException e) {
            if(e instanceof CriticalException) {
                onError((CriticalException) e);
                return;
            }
            onError(new CriticalException("Failed to connect to database", e));
        }
    }

    public abstract Object getConn();
    public abstract void onError(CriticalException e);
    protected abstract void connect() throws Exception, CriticalException;
    public abstract void close() throws Exception;
    public abstract void changeDb(String database) throws Exception, CriticalException;


}
