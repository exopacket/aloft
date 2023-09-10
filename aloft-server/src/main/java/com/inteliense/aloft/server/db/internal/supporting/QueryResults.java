package com.inteliense.aloft.server.db.internal.supporting;

import com.inteliense.aloft.server.db.internal.supporting.sql.Field;
import com.inteliense.aloft.server.db.internal.supporting.sql.Record;
import com.inteliense.aloft.server.db.internal.supporting.sql.SQLColumnOrFunction;
import com.inteliense.aloft.utils.exceptions.types.CriticalException;

import java.sql.ResultSet;
import java.util.ArrayList;

public class QueryResults {

    private int currRecord = 0;
    private ArrayList<Record> records = new ArrayList<Record>();

    public QueryResults(ResultSet rs, ArrayList<Field> select, String table) {
        try {
            while(rs.next()) {
                ArrayList<Field> fields = new ArrayList<Field>();
                for(int i=0; i<select.size(); i++) {
                    SQLColumnOrFunction col = select.get(i).column();
                    fields.add(new Field(col, rs.getObject(i + 1)));
                }
                records.add(new Record(fields, table));
            }
        } catch (Exception e) {
            new CriticalException("Failed to get results from query.", e).report();
        }
    }

    public ArrayList<Record> getList() {
        return records;
    }

    public Record next() {
        if(currRecord == records.size()) return null;
        Record r = records.get(currRecord);
        currRecord++;
        return r;
    }

    public int size() {
        return records.size();
    }

}
