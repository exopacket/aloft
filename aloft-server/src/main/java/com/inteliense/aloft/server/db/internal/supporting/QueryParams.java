package com.inteliense.aloft.server.db.internal.supporting;

import com.inteliense.aloft.server.db.internal.supporting.sql.*;

import java.util.ArrayList;

//QUERY PARAMS CLASS MAY BE UNNECESSARY
//HOWEVER, FOR CLEANLINESS OF CODE AND TO SEPARATE
//THE LOGIC FOR BUILDING QUERIES ACROSS MULTIPLE DB TYPES
//IT WILL BE USED
public class QueryParams {

    private String database;
    private String table;

    private int currSelect = -1;
    private ArrayList<Field> select = new ArrayList<Field>();
    private int currUpdate = -1;
    private ArrayList<Field> update = new ArrayList<Field>();
    private int currInsert = -1;
    private ArrayList<Field> insert = new ArrayList<Field>();
    private int currWhere = -1;
    private ArrayList<Condition> where = new ArrayList<Condition>();
    private int currJoin = -1;
    private ArrayList<Join> join = new ArrayList<Join>();

    private boolean all = false;
    private boolean delete = false;
    private boolean softDelete = false;

    private Column orderByColumn;
    private OrderBy orderByDirection;

    private Column groupByColumn;

    public QueryParams(
            String database,
            String table,
            boolean all,
            boolean delete,
            boolean softDelete,
            Column orderByColumn,
            OrderBy orderByDirection,
            Column groupByColumn,
            ArrayList<Field> select,
            ArrayList<Field> update,
            ArrayList<Field> insert,
            ArrayList<Condition> where,
            ArrayList<Join> join
    ) {
        this.database = database;
        this.table = table;
        this.all = all;
        this.delete = delete;
        this.softDelete = softDelete;
        this.orderByColumn = orderByColumn;
        this.orderByDirection = orderByDirection;
        this.groupByColumn = groupByColumn;
        this.select = select;
        this.update = update;
        this.insert = insert;
        this.where = where;
        this.join = join;
    }

    public boolean returns() {
        return all || !select.isEmpty();
    }

    public String database() {
        return database;
    }

    public String table() {
        return table;
    }

    public boolean all() {
        return all;
    }

    public ArrayList<Field> selectColumns() {
        return select;
    }

    public void resetIndexes() {
        currSelect = -1;
        currInsert = -1;
        currUpdate = -1;
        currWhere = -1;
        currJoin = -1;
    }

    public Field nextSelect() {
        currSelect++;
        if(currSelect < select.size()) return select.get(currSelect);
        return null;
    }

    public Field nextInsert() {
        currInsert++;
        if(currInsert < insert.size()) return insert.get(currInsert);
        return null;
    }

    public Field nextUpdate() {
        currUpdate++;
        if(currUpdate < update.size()) return update.get(currUpdate);
        return null;
    }

    public Condition nextWhere() {
        currWhere++;
        if(currWhere < where.size()) return where.get(currWhere);
        return null;
    }

    public Join nextJoin() {
        currJoin++;
        if(currJoin < join.size()) return join.get(currJoin);
        return null;
    }

    public int selectSize() {
        return select.size();
    }

    public int insertSize() {
        return insert.size();
    }

    public int updateSize() {
        return update.size();
    }

    public int whereSize() {
        return where.size();
    }

    public int joinSize() { return join.size(); }

}
