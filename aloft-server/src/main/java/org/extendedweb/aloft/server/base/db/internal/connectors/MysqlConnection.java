package org.extendedweb.aloft.server.base.db.internal.connectors;

import org.extendedweb.aloft.server.base.db.internal.supporting.DbConnection;
import org.extendedweb.aloft.server.base.db.internal.supporting.ExecutesQueries;
import org.extendedweb.aloft.server.base.db.internal.supporting.QueryParams;
import org.extendedweb.aloft.server.base.db.internal.supporting.QueryResults;
import org.extendedweb.aloft.server.base.db.internal.supporting.sql.Condition;
import org.extendedweb.aloft.server.base.db.internal.supporting.sql.Field;
import org.extendedweb.aloft.server.base.db.internal.supporting.sql.SQLBuilder;
import org.extendedweb.aloft.utils.exceptions.types.CriticalException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MysqlConnection extends DbConnection implements ExecutesQueries  {

    private Connection conn = null;

    public MysqlConnection(String username, String password) {
        super(username, password);
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

        String jdbc = "jdbc:mysql://localhost:3306/" + db;

        conn = DriverManager.getConnection(jdbc, username, password);
        if(conn == null) throw new CriticalException("Failed to connect to mysql.");

    }

    @Override
    public void close() throws Exception {
        if(conn != null) conn.close();
    }

    @Override
    public void changeDb(String database) throws Exception, CriticalException {
        if(database.equals(db)) return;
        this.db = database;
        this.close();
        this.connect();
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
            e.printStackTrace();
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
            e.printStackTrace();
            onError(new CriticalException("Failed to execute query.", e));
        }

    }
}