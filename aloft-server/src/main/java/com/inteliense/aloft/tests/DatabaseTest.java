package com.inteliense.aloft.tests;

import com.inteliense.aloft.server.db.internal.Db;
import com.inteliense.aloft.server.db.internal.supporting.DbType;
import com.inteliense.aloft.server.db.internal.supporting.Query;
import com.inteliense.aloft.server.db.internal.supporting.QueryResults;
import com.inteliense.aloft.server.db.internal.supporting.sql.Record;
import com.inteliense.aloft.utils.data.JSON;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.util.Arrays;

public class DatabaseTest {

    public static void main(String[] args) {
        Db db = new Db(DbType.MYSQL, "root", "secretpass", "aloft_test");
        db.query().table("people").allRows().delete();
        db.query().table("people").insert("name", "Ryan").run();
        QueryResults results = db.query().table("people").select("id", "name").where("name", "=", "Ryan").get();
        System.out.println(results.size());
        Record record = results.next();
        System.out.println(record.toString());
        System.out.println(record.json());

    }

}
