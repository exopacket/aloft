package com.inteliense.aloft.server.db.internal.supporting.sql;

import com.inteliense.aloft.server.db.internal.supporting.QueryParams;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.util.Date;

public class SQLBuilder {

    private int preparedSize = 0;
    QueryParams p;

    public SQLBuilder(QueryParams params) {

        this.p = params;
        preparedSize = params.selectSize()
                + (params.insertSize() * 2)
                + (params.updateSize() * 2)
                + (params.whereSize() * 2)
                + (params.joinSize() * 2);

    }

    public String getPreparedString() {

        //TODO add support for sql functions, delete, order by, group by, and LIKE

        String sql = "";

        if(p.selectSize() > 0 || p.all()) {
            if(p.all()) {
                sql += "SELECT * FROM " + p.table() + " ";
            } else {
                sql += "SELECT";
                for(int i=0; i<p.selectSize(); i++) {
                    sql += (i > 0) ? ", " : " ";
                    sql += p.nextSelect().column().full();
                }
                sql += "FROM " + p.table() + " ";
            }
        } else if(p.insertSize() > 0) {
            sql += "INSERT INTO " + p.table() + " (";
            for(int i=0; i<p.insertSize(); i++) {
                sql += (i > 0) ? ", " : "";
                sql += p.nextInsert().column().full();
            }
            sql += ") VALUES (";
            for(int i=0; i<p.insertSize(); i++) {
                sql += (i > 0) ? ", " : "";
                sql += "?";
            }
            sql += ")";
            p.resetIndexes();
            return sql;
        }

        return "";
    }

    public Object next() {
        Object v;
        v = p.nextSelect();
        if(v != null) return v;
        v = p.nextInsert();
        if(v != null) return v;
        v = p.nextUpdate();
        if(v != null) return v;
        v = p.nextJoin();
        if(v != null) return v;
        v = p.nextWhere();
        if(v != null) return v;
        return null;
    }

    public int preparedSize() {
        return preparedSize;
    }

    public static void set(PreparedStatement stmt, int pos, Object value) throws SQLException {
        if(value.getClass() == String.class) stmt.setString(pos, (String) value);
        else if(value.getClass() == Integer.class) stmt.setInt(pos, (Integer) value);
        else if(value.getClass() == Float.class) stmt.setFloat(pos, (Float) value);
        else if(value.getClass() == Double.class) stmt.setDouble(pos, (Double) value);
        else if(value.getClass() == Boolean.class) stmt.setBoolean(pos, (Boolean) value);
        else if(value.getClass() == LocalDate.class) stmt.setDate(pos, getDate((LocalDate) value));
        else if(value.getClass() == Date.class) stmt.setTimestamp(pos, getDateTime((Date) value));
        else if(value.getClass() == LocalDateTime.class) stmt.setTimestamp(pos, getDateTime((LocalDateTime) value));
        else if(value.getClass() == LocalTime.class) stmt.setTime(pos, getTime((LocalTime) value));
    }

    private static java.sql.Date getDate(LocalDate ld) {
        return new java.sql.Date(ld.getLong(ChronoField.MILLI_OF_SECOND));
    }

    private static java.sql.Date getDate(Date d) {
        return new java.sql.Date(d.getTime());
    }

    private static java.sql.Timestamp getDateTime(LocalDateTime ldt) {
        return new java.sql.Timestamp(ldt.getLong(ChronoField.MILLI_OF_SECOND));
    }

    private static java.sql.Timestamp getDateTime(Date d) {
        return new java.sql.Timestamp(d.getTime());
    }

    private static java.sql.Time getTime(LocalTime lt) {
        return new java.sql.Time(lt.getLong(ChronoField.MILLI_OF_SECOND));
    }

}
