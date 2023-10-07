package com.inteliense.aloft.server.db.internal;

import com.inteliense.aloft.server.db.internal.supporting.DbDriver;
import com.inteliense.aloft.server.db.internal.supporting.DbType;
import com.inteliense.aloft.server.db.internal.supporting.Query;
import com.inteliense.aloft.utils.exceptions.types.CommonException;
import com.inteliense.aloft.utils.exceptions.types.CriticalException;
import com.inteliense.aloft.utils.exceptions.types.ReportedException;

public class Db {

    private DbDriver driver;
    private String database = null;

    public Db(DbType type, String username, String password) {
        this.driver = new DbDriver(type, username, password);
    }

    public Db(DbType type, String username, String password, String database) {
        this.driver = new DbDriver(type, username, password);
        try {
            setDatabase(database);
        } catch (CriticalException | Exception e) {
            new ReportedException("Failed to set db table.", e);
        }
    }

    public void setDatabase(String database) throws CriticalException, Exception {
        this.database = dbName(database);
        this.driver.conn().changeDb(database);
    }

    public Query query() {
        if(database == null) return null;
        return this.driver.buildQuery(dbName(database));
    }

    public Query query(String database) {
        try {
            setDatabase(database);
            return this.driver.buildQuery(dbName(database));
        } catch (Exception | CriticalException e) { e.printStackTrace(); }
        return null;
    }

    private String dbName(String db) {
        return db;
    }

    public DbDriver getRawDriver() {
        return this.driver;
    }

}
