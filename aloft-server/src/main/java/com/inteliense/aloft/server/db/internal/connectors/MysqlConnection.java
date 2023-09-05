package com.inteliense.aloft.server.db.internal.connectors;

import com.inteliense.aloft.server.db.internal.supporting.*;
import com.inteliense.aloft.utils.exceptions.types.CriticalException;

import java.sql.*;

public class MysqlConnection extends DbConnection implements ExecutesQueries  {

    private Connection conn = null;
    private String db = "";

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
        String user = "root";
        String password = "secret";

        conn = DriverManager.getConnection(jdbc, user, password);
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
            for(int i=0;i< builder.preparedSize(); i++) {
                SQLBuilder.set(stmt, i + 1, builder.next());
            }
            ResultSet resultSet = stmt.executeQuery();
            return new QueryResults(resultSet, p.selectColumns());
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
            for(int i=0;i< builder.preparedSize(); i++) {
                SQLBuilder.set(stmt, i + 1, builder.next());
            }
            stmt.executeUpdate();
        } catch (Exception e) {
            onError(new CriticalException("Failed to execute query.", e));
        }

    }
}
