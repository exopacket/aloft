package com.inteliense.aloft.server.db.internal.supporting.sql;

import com.inteliense.aloft.server.db.internal.supporting.sql.Field;

import java.util.ArrayList;

public class Record {

    Field[] fields;

    public Record(ArrayList<Field> fields) {
        this.fields = new Field[fields.size()];
        this.fields = fields.toArray(this.fields);
    }

}
