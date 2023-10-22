package org.extendedweb.aloft.cli.fs;

import org.extendedweb.aloft.utils.data.JSON;
import org.json.simple.JSONObject;

import java.io.File;
import java.io.PrintWriter;

public class Print {
    
    private static PrintWriter pw;

    public static boolean setPrinter(File file) {
        try {
            pw = new PrintWriter(file);
            return true;
        } catch (Exception ignored) {
            return false;
        }
    }

    public static void reset() {
        pw.close();
        pw.flush();
        pw = null;
    }

    public static void ln(int tabs, String text) {
        if(tabs > 0) tab(tabs);
        ln(text);
    }

    public static void ln(String text) {
        pw.println(text);
    }

    public static void nl() {
        pw.print("\n");
    }

    public static void txt(String text) {
        pw.print(text);
    }

    public static void tab() {
        pw.print("\t");
    }

    public static void tab(int num) {
        for(int i=0; i<num; i++) {
            tab();
        }
    }

    public static void json(JSONObject json) {
        txt(JSON.getString(json, true));
    }

}
