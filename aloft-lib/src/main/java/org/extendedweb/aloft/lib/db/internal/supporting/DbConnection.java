package org.extendedweb.aloft.lib.db.internal.supporting;

import org.extendedweb.aloft.lib.db.internal.connectors.details.DbConnectionDetails;
import org.extendedweb.aloft.utils.exceptions.types.CriticalException;

public abstract class DbConnection implements ExecutesQueries {

    protected DbConnectionDetails details;

    public DbConnection(DbConnectionDetails details) {
        this.details = details;
        try {
            connect();
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
//    public abstract void changeDb(DbConnectionDetails details) throws Exception, CriticalException;


}
