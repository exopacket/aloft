package com.inteliense.aloft.tests;

import com.inteliense.aloft.server.db.internal.Db;
import com.inteliense.aloft.server.db.internal.supporting.DbType;
import com.inteliense.aloft.server.db.internal.supporting.QueryResults;
import com.inteliense.aloft.server.db.internal.supporting.sql.Record;

public class DatabaseTest {

    public static void main(String[] args) {
        Db db = new Db(DbType.MYSQL, "root", "secretpass", "aloft_test");
        db.query().table("people").allRows().delete();
        db.query().table("people").insert("name", "Ryan").run();
        db.query().table("people").update("name", "Ryan Fitzgerald").where("name", "=", "Ryan").run();
        QueryResults results = db.query().table("people").select("id", "name").where("name", "=", "Ryan Fitzgerald").get();
        System.out.println(results.size());
        Record record = results.next();
        System.out.println(record.toString());
        System.out.println(record.json());
        QueryResults results2 = db.query().table("people").select("id", "name").whereLike("name", "Ryan%").get();
        System.out.println(results2.size());
        Record record2 = results2.next();
        System.out.println(record2.toString());
        System.out.println(record2.json());
    }

}
