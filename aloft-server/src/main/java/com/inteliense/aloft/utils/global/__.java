package com.inteliense.aloft.utils.global;

import com.inteliense.aloft.server.db.internal.supporting.sql.Operator;
import com.inteliense.aloft.utils.data.BaseX;
import com.inteliense.aloft.utils.data.Hex;
import com.inteliense.aloft.utils.encryption.Rand;
import com.inteliense.aloft.utils.encryption.SHA;

import java.nio.charset.StandardCharsets;
import java.util.regex.Pattern;

public class __ {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static void printPrettyLn(String output) {
        System.out.println(ANSI_CYAN + output + ANSI_RESET);
    }

    public static void printPrettyLn(String output, String color) {
        System.out.println(color + output + ANSI_RESET);
    }

    public static void printPretty(String output) {
        System.out.print(ANSI_CYAN + output + ANSI_RESET);
    }

    public static void printPretty(String output, String color) {
        System.out.print(color + output + ANSI_RESET);
    }

    public static void log(String output) {
        System.out.println(output);
    }

    public static void error(String output) {
        System.err.println(output);
    }

    public static boolean empty(String input) {
        return !isset(input) || same("", input.replace(" ", "").trim());
    }

    public static boolean isset(Object input) {
        return input != null;
    }

    public static String hex(byte[] arr) {
        return Hex.getHex(arr);
    }

    public static String b64(byte[] arr) {
        return BaseX.encode64(arr);
    }

    public static byte[] bites(String str) {
        final Pattern textPattern = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).+$");
        boolean isBase64 = textPattern.matcher(str).matches();
        try {
            byte[] arr = null;
            if(isBase64) arr = BaseX.bytesFrom64(str);
            if(arr == null) arr = Hex.fromHex(str);
            if(arr == null) arr = str.getBytes(StandardCharsets.UTF_8);
            return arr;
        } catch (Exception e) {
            return null;
        }
    }

    public static String id() {
        return id(String.valueOf(System.nanoTime()), hex(Rand.secure(32)), Rand.str(32));
    }

    public static String id(String... seeds) {
        String full = "";
        for(int i=0; i< seeds.length; i++) {
            if(i > 0) full += "_";
            full += seeds[i];
        }
        full += String.valueOf(System.currentTimeMillis());
        return Rand.randomCase(b64(SHA.Bites.getSha1(full)).replaceAll("[/=+]", ""));
    }

    public static Object nothing() {
        return null;
    }

    public static boolean same(String str1, String str2) {
        return str1.equals(str2);
    }

    public static Operator.V isset() {
        return Operator.V.NOT_NULL;
    }

    public static Operator.V notset() {
        return Operator.V.NULL;
    }

}
