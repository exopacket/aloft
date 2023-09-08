package com.inteliense.aloft.server.db.internal.supporting;

import com.inteliense.aloft.server.db.internal.supporting.sql.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Query {

    private String database;
    private String table;

    private ArrayList<Field> select = new ArrayList<Field>();
    private ArrayList<Field> update = new ArrayList<Field>();
    private ArrayList<Field> insert = new ArrayList<Field>();
    private ArrayList<Condition> where = new ArrayList<Condition>();
    private ArrayList<Join> join = new ArrayList<Join>();

    private boolean all = false;
    private boolean delete = false;
    private boolean softDelete = false;
    private boolean setTimestamps = false;

    private Column orderByColumn;
    private OrderBy orderByDirection;

    private Column groupByColumn;

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

//    public Query database(String database, boolean create) {
//        this.database = table;
//        if(create) {
//
//        }
//        return this;
//    }

//    public Query table(String table, String[] fields) {
//        this.table = table;
//        if(fields.length > 0) {
//
//        }
//        return this;
//    }

    public Query select() {
        all = true;
        return this;
    }

    public Query select(String... columns) {
        for(String column: columns) {
            select.add(new Field(makeColumn(column), null));
        }
        return this;
    }

    public Query insert(HashMap<String, Object> toInsert) {

        for(String key : toInsert.keySet()) {
            Object value = toInsert.get(key);
            insert(key, value);
        }

        return this;
    }

    public Query insert(String column, Object value) {

        Field field = new Field(makeColumn(column), value);
        insert.add(field);
        return this;
    }

    public Query update(HashMap<String, Object> toUpdate) {

        for(String key : toUpdate.keySet()) {
            Object value = toUpdate.get(key);
            update(key, value);
        }

        return this;
    }

    public Query update(String column, Object value) {

        Field field = new Field(makeColumn(column), value);
        update.add(field);
        return this;
    }

    public Query addJoin(Join join) {
        this.join.add(join);
        return this;
    }

    public Query timestamps() {
        setTimestamps = true;
        return this;
    }

    public Join join(JoinTypes type) {
        return new Join(this, type);
    }

    public Join join(JoinTypes type, String table) {
        Join j = new Join(this, type);
        j.table(makeTable(table));
        return j;
    }

    public SQLFunction func(String name, Object... args) {
        return SQLFunction.create(name, args);
    }

    public SQLFunction func(String name, String storeAs, Object... args) {
        return SQLFunction.createWithStoreAs(name, storeAs, args);
    }
    
    private void addAllWhere(List<Condition> conditions) {
        if(join.isEmpty()) for (Condition condition : conditions) condition.notForJoin();
        else for (Condition condition : conditions) condition.forJoin();
        where.addAll(conditions);
    }
    
    private void addWhere(Condition condition) {
        if(join.isEmpty()) condition.notForJoin();
        else condition.forJoin();
        where.add(condition);
    }

    public Query where(ArrayList<Condition> conditions) {
        addAllWhere(conditions);
        return this;
    }

    public Query where(Condition[] conditions) {
        addAllWhere(Arrays.asList(conditions));
        return this;
    }

    public Query where(Condition value) {
        addWhere(value);
        return this;
    }

    public Query orWhere(ArrayList<Condition> conditions) {
        for(Condition condition : conditions) {
            condition.or();
        }
        addAllWhere(conditions);
        return this;
    }

    public Query orWhere(Condition[] conditions) {
        for(Condition condition : conditions) {
            condition.or();
        }
        addAllWhere(Arrays.asList(conditions));
        return this;
    }

    public Query orWhere(Condition value) {
        value.or();
        addWhere(value);
        return this;
    }

    public Query whereNull(String column) {
        Column col = makeColumn(column);
        Condition c = new Condition(col, null);
        addWhere(c);
        return this;
    }

    public Query orWhereNull(String column) {
        Column col = makeColumn(column);
        Condition c = new Condition(col, null);
        c.or();
        addWhere(c);
        return this;
    }

    public Query whereSet(String column) {
        Column col = makeColumn(column);
        Condition c = new Condition(col, Operator.V.NOT_NULL);
        addWhere(c);
        return this;
    }

    public Query orWhereSet(String column) {
        Column col = makeColumn(column);
        Condition c = new Condition(col, Operator.V.NOT_NULL);
        c.or();
        addWhere(c);
        return this;
    }

    public Query whereDeleted(String column) {
        Column col = makeColumn(column);
        Condition c = new Condition(col, Operator.V.SOFT_DELETED);
        addWhere(c);
        return this;
    }

    public Query orWhereDeleted(String column) {
        Column col = makeColumn(column);
        Condition c = new Condition(col, Operator.V.SOFT_DELETED);
        c.or();
        addWhere(c);
        return this;
    }

    public Query whereLike(String column, String match) {
        Column col = makeColumn(column);
        Condition c = new Condition(col, Operator.V.LIKE, match);
        addWhere(c);
        return this;
    }

    public Query orWhereLike(String column, String match) {
        Column col = makeColumn(column);
        Condition c = new Condition(col, Operator.V.LIKE, match);
        c.or();
        addWhere(c);
        return this;
    }

    public Query whereNotLike(String column, String match) {
        Column col = makeColumn(column);
        Condition c = new Condition(col, Operator.V.NOT_LIKE, match);
        addWhere(c);
        return this;
    }

    public Query orWhereNotLike(String column, String match) {
        Column col = makeColumn(column);
        Condition c = new Condition(col, Operator.V.NOT_LIKE, match);
        c.or();
        addWhere(c);
        return this;
    }

    public Query orderBy(String column) {
        return orderBy(column, OrderBy.ASC);
    }

    public Query orderBy(String column, OrderBy direction) {
        this.orderByColumn = makeColumn(column);
        this.orderByDirection = direction;
        return this;
    }

    public Query groupBy(String column) {
        this.groupByColumn = makeColumn(column);
        return this;
    }

    public Query beginGroup() {
        where.add(Condition.GROUP_BEGIN());
        return this;
    }

    public Query closeGroup() {
        where.add(Condition.GROUP_END());
        return this;
    }

    public void delete() {
        this.delete = true;
        run();
    }

    public void softDelete() {
        this.softDelete = true;
        run();
    }

    public QueryResults get() {
        QueryAdapter qa = new QueryAdapter(connection);
        return qa.q(this);
    }

    public void run() {
        QueryAdapter qa = new QueryAdapter(connection);
        qa.q(this);
    }

    private String stripColumnChars(String input) {
        return input.replaceAll("[`'\"]", "");
    }

    private Column makeColumn(String table, String column) {
        table = stripColumnChars(table);
        column = stripColumnChars(column);
        return new Column(table, column);
    }

    private Column makeColumn(String input) {
        if(input.contains(".")) {
            String[] split = input.split("\\.");
            if(split.length == 2) return makeColumn(split[0], split[1]);
            else return null;
        } else {
            input = stripColumnChars(input);
            return new Column(table, input);
        }
    }

    private String makeTable(String input) {
        return "`" + table + "`";
    }

    public QueryParams p() {
        return new QueryParams(
                database,
                table,
                all,
                delete,
                softDelete,
                orderByColumn,
                orderByDirection,
                groupByColumn,
                select,
                update,
                insert,
                where,
                join,
                setTimestamps
        );
    }

}
