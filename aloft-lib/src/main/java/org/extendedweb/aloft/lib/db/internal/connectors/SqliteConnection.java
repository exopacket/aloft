package org.extendedweb.aloft.lib.db.internal.connectors;

import org.extendedweb.aloft.lib.db.internal.connectors.details.DbConnectionDetails;
import org.extendedweb.aloft.lib.db.internal.supporting.sql.Condition;
import org.extendedweb.aloft.lib.db.internal.supporting.sql.Field;
import org.extendedweb.aloft.lib.db.internal.supporting.sql.SQLBuilder;
import org.extendedweb.aloft.utils.exceptions.types.CriticalException;
import org.extendedweb.aloft.lib.db.internal.supporting.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SqliteConnection extends org.extendedweb.aloft.lib.db.internal.supporting.DbConnection implements ExecutesQueries  {

    private Connection conn = null;

    public SqliteConnection(DbConnectionDetails details) {
        super(details);
    }

    @Override
    public Object getConn() {
        return conn;
    }

    @Override
    public void onError(CriticalException e) {
        e.report();
    }

    @Override
    protected void connect() throws Exception, CriticalException {

        String jdbc = "jdbc:sqlite:" + "db";

        conn = DriverManager.getConnection(jdbc);
        if(conn == null) throw new CriticalException("Failed to connect to sqlite.");

    }

    @Override
    public void close() throws Exception {
        if(conn != null) conn.close();
    }

    @Override
    public void changeDb(String database) throws Exception, CriticalException {
    }

    @Override
    public QueryResults execute(QueryParams p) {

        try {
            SQLBuilder builder = new SQLBuilder(p);
            String preparedSql = builder.getPreparedString();
            PreparedStatement stmt = conn.prepareStatement(preparedSql);
            for(int i=0;i< builder.valueSize(); i++) {
                Object v = builder.next();
                if(v == null) break;
                if(v.getClass() == Field.class) v = ((Field) v).get();
                if(v.getClass() == Condition.class) v = ((Condition) v).value();
                SQLBuilder.set(stmt, i + 1, v);
            }
            ResultSet resultSet = stmt.executeQuery();
            return new QueryResults(resultSet, p.selectColumns(), p.tableName());
        } catch (Exception e) {
            onError(new CriticalException("Failed to execute query.", e));
        }

        return null;
    }

    @Override
    public void executeUpdate(QueryParams p) {

        try {
            SQLBuilder builder = new SQLBuilder(p);
            String preparedSql = builder.getPreparedString();
            PreparedStatement stmt = conn.prepareStatement(preparedSql);
            for(int i=0;i< builder.valueSize(); i++) {
                Object v = builder.next();
                if(v.getClass() == Field.class) v = ((Field) v).get();
                if(v.getClass() == Condition.class) v = ((Condition) v).value();
                if(v == null) break;
                SQLBuilder.set(stmt, i + 1, v);
            }
            stmt.executeUpdate();
        } catch (Exception e) {
            onError(new CriticalException("Failed to execute query.", e));
        }

    }
}
