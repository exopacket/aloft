package com.inteliense.aloft.server.db.internal.supporting;

import com.inteliense.aloft.server.db.internal.Db;
import com.inteliense.aloft.server.db.internal.supporting.sql.Field;
import com.inteliense.aloft.server.db.internal.supporting.sql.Record;
import com.inteliense.aloft.server.db.internal.supporting.sql.SQLColumnOrFunction;
import com.inteliense.aloft.utils.exceptions.types.CriticalException;
import com.inteliense.aloft.utils.global.__;

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Schema {

    //TODO fix select all and create table (needs to include all columns)

    private static int updates = 0;

    public static String[] getColumns(DbConnection connection, String db, String table) {
        try {
            String sql = "SELECT * FROM `INFORMATION_SCHEMA`.`COLUMNS` " +
                    "WHERE `COLUMNS`.`TABLE_SCHEMA`=? " +
                    "AND `COLUMNS`.`TABLE_NAME`=? " +
                    "ORDER BY `COLUMNS`.`ORDINAL_POSITION` ASC";
            connection.changeDb("INFORMATION_SCHEMA");
            PreparedStatement stmt = conn(connection).prepareStatement(sql);
            stmt.setString(1, db);
            stmt.setString(2, table);
            ResultSet rs = stmt.executeQuery();
            ArrayList<String> cols = new ArrayList<>();
            while (rs.next()) {
                cols.add(rs.getString("COLUMN_NAME"));
            }
            String[] arr = new String[cols.size()];
            cols.toArray(arr);
            return arr;
        } catch(Exception e) {
            e.printStackTrace();
            return new String[0];
        } catch (CriticalException e) {
            throw new RuntimeException(e);
        }
    }

    public static int fresh(Db database, DbConnection connection, String db, String name, ArrayList<ColumnProperties> migration) throws Exception, CriticalException {
        Query q = database.query("INFORMATION_SCHEMA")
                .table("TABLES")
                .select("TABLE_NAME")
                .where("TABLE_SCHEMA", "=", db);
        QueryResults res = q.get();
        for(int i=0; i<res.size(); i++) {
            String table = __.str(res.next().val("TABLE_NAME"));
            String sql = "DROP TABLE " + table;
            Statement stmt = conn(connection).createStatement();
            stmt.executeUpdate(sql);
            updates++;
        }
        table(database, connection, db, name, migration);
        int ret = updates;
        updates = 0;
        return ret;
    }

    public static int table(Db database, DbConnection connection, String db, String name, ArrayList<ColumnProperties> migration) throws Exception, CriticalException {
        __.printPrettyLn("Creating table '" + name + "' in database '" + db + "' ...");
        String preparedSql = "CREATE TABLE IF NOT EXISTS " + name + " (temp int)";
        Statement stmt = conn(connection).createStatement();
        stmt.executeUpdate(preparedSql);

        checkForReplacements(connection, db, name, getProperties(database, db, name), migration);

        for(ColumnProperties column : migration) {
            column(database, connection, db, name, column, migration);
        }

        int ret = updates;
        updates = 0;
        return ret;
    }

    public static void column(Db database, DbConnection connection, String db, String table, ColumnProperties properties, ArrayList<ColumnProperties> migration) throws Exception, CriticalException {
        __.printPrettyLn("Creating column '" + properties.getName() + "' in table '" + db + "." + table + "' ...");
        ArrayList<ColumnProperties> props = getProperties(database, db, table);
        connection.changeDb(db);
        if(!checkColumnForCreate(properties, props)) {
            __.printPrettyLn("Column '" + properties.getName() + "' already exists... Verifying properties..");
            updateColumn(connection, props, properties, table);
        } else {
            createColumn(database, connection, db, table, properties);
        }
    }

    public static void createColumn(Db database, DbConnection connection, String db, String table, ColumnProperties props) throws SQLException {
        String sql = "ALTER TABLE " + table + " ADD COLUMN " + props.getName() + " " + props.getType() + " ";
        if(props.isPrimaryKey()) sql += "PRIMARY KEY";
        else if(!props.isNullable()) sql += "NOT NULL";
        if(__.isset(props.getColumnDefault())) sql += " DEFAULT '" + props.getColumnDefault() + "'";
        Statement stmt = conn(connection).createStatement();
        stmt.execute(sql);
        __.printPrettyLn("Column '" + props.getName() + "' created successfully!", __.ANSI_PURPLE);
        updates++;
    }

    public static void checkForReplacements(DbConnection connection, String db, String table, ArrayList<ColumnProperties> current, ArrayList<ColumnProperties> migration) throws Exception, CriticalException {

        ArrayList<ColumnProperties> removals = new ArrayList<>();
        ArrayList<ColumnProperties> replacements  = new ArrayList<>();

        for(ColumnProperties props : current) {
            boolean found = false;
            for(ColumnProperties migrate : migration) {
                if(__.same(migrate.getName(), props.getName())) {
                    found = true;
                    break;
                }
            }
            if(!found) removals.add(props);
        }

        for(ColumnProperties migrate : migration) {
            boolean found = false;
            for(ColumnProperties props : current) {
                if(__.same(migrate.getName(), props.getName())) {
                    found = true;
                    break;
                }
            }
            if(!found) replacements.add(migrate);
        }

        if(removals.isEmpty()) return;
        if(replacements.isEmpty()) {
            for(ColumnProperties properties : removals) {
                __.printPrettyLn("Deleting column '" + properties.getName() + "' from table '" + table + "'..");
                connection.changeDb(db);
                Statement stmt = conn(connection).createStatement();
                stmt.executeUpdate("ALTER TABLE " + table + " DROP COLUMN " + properties.getName());
                __.printPrettyLn("Column deleted successfully!", __.ANSI_PURPLE);
            }
            updates++;
            return;
        }

        Scanner scnr = new Scanner(System.in);
        __.printPrettyLn("There are columns in your migration that are not present in the current schema.\nSelect how you would like to proceed with the migration.", __.ANSI_RED);

        for(int i=0; i< removals.size(); i++) {
            while(true) {
                System.out.println();
                System.out.println(" [0] Delete column '" + removals.get(i).getName() + "'");
                for (int x = 0; x < replacements.size(); x++) {
                    System.out.println(" [" + (x + 1) + "] Rename '" + removals.get(i).getName() + "' to '" + replacements.get(x).getName() + "'");
                }
                System.out.print(" --> ");
                try {
                    int selection = __.num(scnr.nextLine());
                    if(selection == 0) {
                        __.printPrettyLn("Deleting column '" + removals.get(i).getName() + "' from table '" + table + "'..");
                        Statement stmt = conn(connection).createStatement();
                        stmt.executeUpdate("ALTER TABLE " + table + " DROP COLUMN " + removals.get(i).getName());
                        __.printPrettyLn("Column deleted successfully!", __.ANSI_PURPLE);
                    } else {
                        int index = selection - 1;
                        if(index >= replacements.size()) break;
                        __.printPrettyLn("Renaming column '" + removals.get(i).getName() + "' to '" + replacements.get(index).getName() + "' from table '" + table + "'..");
                        Statement stmt = conn(connection).createStatement();
                        stmt.executeUpdate("ALTER TABLE " + table + " RENAME COLUMN " + removals.get(i).getName() + " to " + replacements.get(index).getName());
                        replacements.remove(index);
                        __.printPrettyLn("Column renamed successfully!", __.ANSI_PURPLE);
                    }
                    updates++;
                } catch (Exception ignored) { }
                break;
            }
        }

    }

    public static void updateColumn(DbConnection connection, ArrayList<ColumnProperties> list, ColumnProperties passed, String table) throws SQLException {
        ColumnProperties current = getPropertiesFromList(list, passed.getName());
        if(current.equals(passed)) {
            __.printPrettyLn("Column '" + current.getName() + "' in migration is already present in table '" + table + "'");
        } else {
            __.printPrettyLn("Updating column '" + current.getName() + "' in '" + table + "' with new properties.");
            String sql = "ALTER TABLE " + table + " MODIFY COLUMN " + passed.getName() + " " + passed.getType() + " ";
            if(passed.isPrimaryKey()) sql += "PRIMARY KEY";
            else if(!passed.isNullable()) sql += "NOT NULL";
            if(__.isset(passed.getColumnDefault())) sql += " DEFAULT '" + passed.getColumnDefault() + "'";
            Statement stmt = conn(connection).createStatement();
            stmt.executeUpdate(sql);
            __.printPrettyLn("Column '" + passed.getName() + "' updated successfully!", __.ANSI_PURPLE);
            updates++;
        }
    }

    private static ColumnProperties getPropertiesFromList(ArrayList<ColumnProperties> props, String column) {
       for(ColumnProperties prop : props) if(__.same(column, prop.getName())) return prop;
       return null;
    }

    private static ArrayList<ColumnProperties> getProperties(Db database, String db, String table) {
        Query q = database.query("INFORMATION_SCHEMA")
                .table("COLUMNS")
                .select("IS_NULLABLE", "COLUMN_KEY", "COLUMN_DEFAULT", "DATA_TYPE", "COLUMN_NAME")
                .where("TABLE_SCHEMA", "=", db)
                .where("TABLE_NAME", "=", table);
        QueryResults res = q.get();
        if(!__.isset(res)) return new ArrayList<>();

        ArrayList<ColumnProperties> propsList = new ArrayList<>();

        for(int i=0; i<res.size(); i++) {
            Record r = res.next();
            ColumnProperties props = new ColumnProperties(String.valueOf(r.val("COLUMN_NAME")));
            if(__.same("YES", __.str(r.val("IS_NULLABLE")))) props.nullable();
            if(__.same("PRI", __.str(r.val("COLUMN_KEY")))) props.primaryKey();
            if(__.isset(r.val("COLUMN_DEFAULT"))) props.setColumnDefault(__.str(r.val("COLUMN_DEFAULT")));
            props.setType(__.str(r.val("DATA_TYPE")));

            QueryResults res2  = database.query("INFORMATION_SCHEMA")
                    .table("KEY_COLUMN_USAGE")
                    .select(
                            "TABLE_SCHEMA", "TABLE_NAME", "COLUMN_NAME",
                        "REFERENCED_TABLE_SCHEMA", "REFERENCED_TABLE_NAME", "REFERENCED_COLUMN_NAME"
                    )
                    .where("TABLE_SCHEMA", "=", db)
                    .where("TABLE_NAME", "=", table)
                    .where("COLUMN_NAME", "=", __.str(r.val("COLUMN_NAME")))
                    .whereSet("REFERENCED_TABLE_SCHEMA")
                    .get();

            if(res2.size() == 1) {
                Record r2 = res2.next();
                props.setForeignKey(__.str(r.val("REFERENCED_TABLE_NAME")), __.str(r.val("REFERENCED_COLUMN_NAME")));
            }

            propsList.add(props);

        }

        return propsList;
    }

    private static boolean checkColumnForCreate(ColumnProperties properties, ArrayList<ColumnProperties> list) {
        return !__.isset(getPropertiesFromList(list, properties.getName()));
    }

    private static Connection conn(DbConnection connection) {
        return (Connection) connection.getConn();
    }

    public static class ColumnProperties {

        private String name;
        private String type;
        private boolean nullable = false;
        private boolean primaryKey = false;
        private String foreignKey;
        private String foreignKeyTable;
        private String columnDefault = null;

        public ColumnProperties(String name) {
            this.name = name;
        }

        public boolean equals(ColumnProperties properties) {
            if(!(properties.isPrimaryKey() && this.primaryKey)) return false;
            if(!(properties.isNullable() && this.nullable)) return false;
            if(!properties.getType().equals(this.type)) return false;
            if(!properties.getForeignKey().equals(this.foreignKey)) return false;
            if(!properties.getForeignKeyTable().equals(this.foreignKeyTable)) return false;
            return properties.getColumnDefault().equals(this.columnDefault);
        }

        public void setType(String type) {
            this.type = type;
            if(__.same("id", type)) this.primaryKey = true;
        }

        public void setForeignKey(String table, String foreignKey) {
            this.foreignKeyTable = table;
            this.foreignKey = foreignKey;
        }

        public void setColumnDefault(String columnDefault) {
            this.columnDefault = columnDefault;
        }

        public void nullable() {
            this.nullable = true;
        }

        public void primaryKey() {
            this.primaryKey = true;
        }

        public String getName() {
            return name;
        }

        public String getType() {
            if(__.same("id", type)) return "varchar(40)";
            return type;
        }

        public String getColumnDefault() {
            return columnDefault;
        }

        public String getForeignKeyTable() {
            return foreignKeyTable;
        }

        public String getForeignKey() {
            return foreignKey;
        }

        public boolean isNullable() {
            return nullable;
        }

        public boolean isPrimaryKey() {
            return primaryKey;
        }
    }

}
