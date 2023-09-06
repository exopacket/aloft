package com.inteliense.aloft.server.db.internal.supporting;

import java.util.ArrayList;

public class Join {

    private ArrayList<Condition> conditions = new ArrayList<>();
    private JoinTypes type;
    private Query q;

    public Join(Query q, Object left, Object operator, Object right, JoinTypes type) {
        this.conditions.add(new Condition(left, operator, right));
        this.type = type;
        this.q = q;
    }

    public Join(Query q, JoinTypes type) {
        this.type = type;
        this.q = q;
    }

    public Join on(Object left, Object operator, Object right) {
        this.conditions.add(new Condition(left, operator, right));
        return this;
    }

    public Query endJoin() {
        q.addJoin(this);
        return q;
    }

}
