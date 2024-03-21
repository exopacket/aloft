package org.extendedweb.aloft.lib.model;

import org.extendedweb.aloft.lib._AloftModel;
import org.extendedweb.aloft.lib.lang.types.t.FieldT;

import java.util.ArrayList;
import java.util.Arrays;

public class AloftModelQuery {

    private AloftModelQueryType type;
    private String model;
    private AloftModelQuerySelect select;
    private AloftModelQueryUpdate update;
    private AloftModelQueryInsert insert;
    private AloftModelQueryWhere where;
    private _AloftModel parent;
    private int limit = -1;

    public AloftModelQuery(AloftModelQueryType type, _AloftModel model, FieldT[] fields) {
        this.type = type;
        this.model = model.getName();
        this.parent = model;
        this.select = new AloftModelQuerySelect(fields);
    }

    public AloftModelQuerySelect getSelect() {
        return select;
    }

    public String getModel() {
        return model;
    }

    public void limit(int num) {
        this.limit = num;
    }

}
