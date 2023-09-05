package com.inteliense.aloft.server.db.internal.supporting;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.util.Date;

public class SQLBuilder {

    private int preparedSize = 0;

    public SQLBuilder(QueryParams params) {

        preparedSize = params.selectSize()
                + (params.insertSize() * 2)
                + (params.updateSize() * 2)
                + (params.whereSize() * 2);

    }

    public String getPreparedString() {
        return "";
    }

    public Object next() {
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
