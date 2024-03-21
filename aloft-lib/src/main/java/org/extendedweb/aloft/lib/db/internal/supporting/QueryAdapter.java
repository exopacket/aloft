package org.extendedweb.aloft.lib.db.internal.supporting;

public class QueryAdapter {

    private DbConnection connection;

    public QueryAdapter(DbConnection connection) {
        this.connection = connection;
    }

    public QueryResults q(Query query) {
        QueryParams params = query.p();
        if(params.returns()) {
            return connection.execute(params);
        } else {
            connection.executeUpdate(params);
            return null;
        }
    }

}
