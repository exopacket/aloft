package com.inteliense.aloft.cli.fs;

import java.io.PrintWriter;

public class Print {

    public static void ln(int tabs, String text, PrintWriter pw) {
        if(tabs > 0) tab(tabs, pw);
        ln(text, pw);
    }

    public static void ln(String text, PrintWriter pw) {
        pw.println(text);
    }

    public static void nl(PrintWriter pw) {
        pw.print("\n");
    }

    public static void txt(String text, PrintWriter pw) {
        pw.print(text);
    }

    public static void tab(PrintWriter pw) {
        pw.print("\n");
    }

    public static void tab(int num, PrintWriter pw) {
        for(int i=0; i<num; i++) {
            tab(pw);
        }
    }

}
