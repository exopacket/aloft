package com.inteliense.aloft.server.db.internal;

public class DB {

    private DatabaseDriver driver;
    private String database;

    public DB(DbType type) {
        this.driver = new DatabaseDriver(type);
    }

    public DB(String database, DbType type) {
        this.driver = new DatabaseDriver(type);
        this.database = dbName(database);
    }

    public void setDatabase(String database) {
        this.database = dbName(database);
    }

    public Query query() {
        return this.driver.buildQuery(dbName(database));
    }

    public Query query(String database) {
        return this.driver.buildQuery(dbName(database));
    }

    private String dbName(String db) {
        return db;
    }

}
