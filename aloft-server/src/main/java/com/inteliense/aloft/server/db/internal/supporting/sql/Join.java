package com.inteliense.aloft.server.db.internal.supporting.sql;

import com.inteliense.aloft.server.db.internal.supporting.Query;
import com.inteliense.aloft.server.db.internal.supporting.QueryParams;

import java.util.ArrayList;

public class Join {

    private int currCondition = -1;
    private ArrayList<Condition> conditions = new ArrayList<>();
    private JoinTypes type;
    private Query q;
    private String table;

    public Join(Query q, JoinTypes type) {
        this.type = type;
        this.q = q;
    }

    public Join table(String table) {
        this.table = table;
        return this;
    }

    public Join on(Object left, Object operator, Object right) {
        this.conditions.add(new Condition(left, operator, right));
        return this;
    }

    public Join orOn(Object left, Object operator, Object right) {
        Condition c = new Condition(left, operator, right);
        c.or();
        this.conditions.add(c);
        return this;
    }

    public Query end() {
        q.addJoin(this);
        return q;
    }

    public int conditionsSize() {
        return conditions.size();
    }

    public String getType() {
        if(type == JoinTypes.DEFAULT_JOIN) return "JOIN";
        if(type == JoinTypes.INNER_JOIN) return "INNER JOIN";
        if(type == JoinTypes.LEFT_JOIN) return "LEFT JOIN";
        if(type == JoinTypes.RIGHT_JOIN) return "RIGHT JOIN";
        if(type == JoinTypes.FULL_JOIN) return "FULL JOIN";
        return "JOIN";
    }

    public Condition nextCondition() {
        currCondition++;
        if(currCondition < conditions.size()) return conditions.get(currCondition);
        return null;
    }

    public String getTable() {
        return table;
    }

}
