package com.inteliense.aloft.utils.data;

public class Case {

    public static String camelToSnake(String str) {
        String regex = "([a-z])([A-Z]+)";
        String replacement = "$1_$2";
        str = str.replaceAll(regex, replacement).toLowerCase();
        return str;
    }

    public static String classToSnake(String str) {
        String regex = "([A-Z]+[a-z]+)";
        String replacement = "_$1";
        str = str.replaceAll(regex, replacement).toLowerCase().substring(1);
        return str;
    }

}
