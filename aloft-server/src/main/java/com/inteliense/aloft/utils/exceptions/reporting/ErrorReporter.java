package com.inteliense.aloft.utils.exceptions.reporting;

import com.inteliense.exceptions.reporting.types.*;
import com.inteliense.lot.exceptions.reporting.types.*;
import com.inteliense.lot.exceptions.types.ReportedException;

public class ErrorReporter {

    private static boolean emailEnabled = true;
    private static boolean gmailEnabled = true;
    private static boolean httpEndpointEnabled = true;
    private static boolean logfileEnabled = true;
    private static boolean pushoverEnabled = true;
    private static boolean smsEnabled = true;
    private static boolean mysqlEnabled = true;
    private static boolean sqliteEnabled = true;

    private static boolean lockConfig = false;

    private static boolean initialized = false;

    public static boolean report(ReportedException e) {

        if(!initialized) checkConfigurations();

        boolean res = true;

        if(emailEnabled) EmailReporter.report(e);
        if(gmailEnabled) GmailReporter.report(e);
        if(httpEndpointEnabled) HttpEndpointReporter.report(e);
        if(logfileEnabled) LogFileReporter.report(e);
        if(mysqlEnabled) MySQLReporter.report(e);
        if(pushoverEnabled) PushoverReporter.report(e);
        if(smsEnabled) SMSReporter.report(e);
        if(sqliteEnabled) SQLiteReporter.report(e);

        return res;

    }

    public static void initialize() {
        checkConfigurations();
    }

    private static void checkConfigurations() {
        if(lockConfig) return;
        if(!SMSReporter.hasConfiguration()) smsEnabled = false;
        if(!EmailReporter.hasConfiguration()) emailEnabled = false;
        if(!GmailReporter.hasConfiguration()) gmailEnabled = false;
        if(!HttpEndpointReporter.hasConfiguration()) httpEndpointEnabled = false;
        if(!LogFileReporter.hasConfiguration()) logfileEnabled = false;
        if(!MySQLReporter.hasConfiguration()) mysqlEnabled = false;
        if(!PushoverReporter.hasConfiguration()) pushoverEnabled = false;
        if(!SQLiteReporter.hasConfiguration()) sqliteEnabled = false;
        lockConfig = true;
    }

}
