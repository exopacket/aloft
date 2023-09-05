package com.inteliense.aloft.server.db.internal.supporting;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;

public class Query {

    private String database;
    private String table;
    private ArrayList<String> select = new ArrayList<String>();
    private ArrayList<String[]> update = new ArrayList<String[]>();
    private ArrayList<String[]> insert = new ArrayList<String[]>();
    private boolean delete = false;

    private DbConnection connection;

    public Query(DbConnection connection) {
        this.connection = connection;
    }

    public Query database(String database) {
        this.database = database;
        return this;
    }

    public Query table(String table) {
        this.table = table;
        return this;
    }

    public Query database(String database, boolean create) {
        this.database = table;
        return this;
    }

    public Query table(String table, boolean create) {
        this.table = table;
        return this;
    }

    public Query select(String... columns) {
        for(String column: columns) {
            select.add(column);
        }
        return this;
    }

    public Query insert(HashMap<String, Object> toInsert) {
        return this;
    }

    public Query insert(String column, String value) {
        return this;
    }

    public Query insert(String column, int value) {
        return this;
    }

    public Query insert(String column, boolean value) {
        return this;
    }

    public Query insert(String column, LocalDateTime value) {
        return this;
    }

    public Query insert(String column, LocalDate value) {
        return this;
    }

    public Query update(HashMap<String, Object> toInsert) {
        return this;
    }

    public Query update(String column, String value) {
        return this;
    }

    public Query update(String column, int value) {
        return this;
    }

    public Query update(String column, boolean value) {
        return this;
    }

    public Query update(String column, LocalDateTime value) {
        return this;
    }

    public Query update(String column, LocalDate value) {
        return this;
    }

    public Query delete() {
        return this;
    }

    public QueryResults get() {
        return new QueryResults();
    }

    public void exec() {

    }

}
