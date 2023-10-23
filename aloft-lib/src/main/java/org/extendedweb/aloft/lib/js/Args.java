package org.extendedweb.aloft.lib.js;

public class Args {

    private String[] values = new String[0];

    public Args(String...args) {
        this.values = args;
    }

    public String[] getArray() {
        return values;
    }

    public static Args none() {
        return new Args();
    }

    public static Args define(String...args) {
        return new Args(args);
    }

}
