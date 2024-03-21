package org.extendedweb.aloft.lib.db.internal;

import org.extendedweb.aloft.lib.db.internal.connectors.details.DbConnectionDetails;
import org.extendedweb.aloft.lib.db.internal.connectors.details.DbConnectionMysqlDetails;
import org.extendedweb.aloft.lib.db.internal.supporting.DbDriver;
import org.extendedweb.aloft.lib.db.internal.supporting.DbType;
import org.extendedweb.aloft.lib.db.internal.supporting.Query;
import org.extendedweb.aloft.utils.exceptions.types.CommonException;
import org.extendedweb.aloft.utils.exceptions.types.CriticalException;
import org.extendedweb.aloft.utils.exceptions.types.ReportedException;

public class Db {

    private DbDriver driver;
    private String database = null;

    public Db(DbConnectionDetails details) {
        this.driver = new DbDriver(details);
        this.database = details.get("name").get();
    }

    public static Db mysql(String db, String host, int port, String username, String password) {
        DbConnectionMysqlDetails details = new DbConnectionMysqlDetails(db, host, port, username, password);
        return new Db(details);
    }

    public void setDatabase(String database) throws CriticalException, Exception {
        this.database = dbName(database);
        this.driver.conn().changeDb(database);
    }

    public Query query() {
        if(database == null) return null;
        return this.driver.buildQuery(dbName(database));
    }

    public Query query(String database) {
        try {
            setDatabase(database);
            return this.driver.buildQuery(dbName(database));
        } catch (Exception | CriticalException e) { e.printStackTrace(); }
        return null;
    }

    private String dbName(String db) {
        return db;
    }

    public DbDriver getRawDriver() {
        return this.driver;
    }

}
