package com.inteliense.aloft.server.db.internal.supporting.sql;

import com.inteliense.aloft.server.db.internal.supporting.sql.Field;

import java.util.ArrayList;
import java.util.Arrays;

public class Record {

    Field[] fields;
    private int currField = 0;

    public Record(ArrayList<Field> fields) {
        this.fields = new Field[fields.size()];
        this.fields = fields.toArray(this.fields);
    }

    public Object[] pair(int index) {
        Field current = fields[index];
        if(current.getType() == Column.class) return new Object[]{column(index), val(index)};
        return new String[]{};
    }

    public Object[][] toArray() {
        Object[][] arr = new Object[fields.length][2];
        for(int i=0; i<fields.length; i++) {
            arr[i] = pair(i);
        }
        return arr;
    }

    public String toString() {
        return Arrays.deepToString(toArray());
    }

    public String column(int index) {
        return fields[index].column().name();
    }

    public String function(int index) {
        return fields[index].function().name();
    }

    public Object val(int index) {
        return fields[index].get();
    }

}
