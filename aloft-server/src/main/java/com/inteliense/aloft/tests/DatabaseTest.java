package com.inteliense.aloft.tests;

import com.inteliense.aloft.server.db.internal.Db;
import com.inteliense.aloft.server.db.internal.supporting.DbType;

public class DatabaseTest {

    public static void main(String[] args) {
        Db people = new Db(DbType.MYSQL, "root", "secretpass", "aloft_test");
        people.query().table("people").insert("name", "Ryan").run();
    }

}
