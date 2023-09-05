package com.inteliense.aloft.server.db.internal.supporting;

import com.inteliense.aloft.server.db.internal.supporting.qtypes.QueryTypes;

import java.util.ArrayList;

//QUERY PARAMS CLASS MAY BE UNNECESSARY
//HOWEVER, FOR CLEANLINESS OF CODE AND TO SEPARATE
//THE LOGIC FOR BUILDING QUERIES ACROSS MULTIPLE DB TYPES
//IT WILL BE USED
public class QueryParams {

    private String database;
    private String table;
    private boolean all = false;
    private ArrayList<Field> select = new ArrayList<Field>();
    private ArrayList<Field> update = new ArrayList<Field>();
    private ArrayList<Field> insert = new ArrayList<Field>();
    private ArrayList<Field> where = new ArrayList<Field>();
    private QueryTypes type;

    public QueryParams(
            String database,
            String table,
            boolean all,
            ArrayList<Field> select,
            ArrayList<Field> update,
            ArrayList<Field> insert,
            ArrayList<Field> where,
            QueryTypes type
    ) {
        this.database = database;
        this.table = table;
        this.all = all;
        this.select = select;
        this.update = update;
        this.insert = insert;
        this.where = where;
        this.type = type;
    }

    public boolean returns() {
        return all || !select.isEmpty() || type == QueryTypes.SELECT;
    }

}
