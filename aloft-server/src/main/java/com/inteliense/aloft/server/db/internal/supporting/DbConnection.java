package com.inteliense.aloft.server.db.internal.supporting;

public abstract class DbConnection {


    public DbConnection() {

    }

    public abstract void connect() throws Exception;


}
