package com.inteliense.aloft.server.html.elements.js;

import com.inteliense.aloft.utils.data.JSON;

public class JSOV {

    private String key;
    private Object v;
    private Class<?> c;
    private String quotes = "";

    public JSOV(String key, Object o, String quotes) {
        this.key = key;
        set(o);
        this.quotes = quotes;
    }

    public JSOV(String key, Object o) {
        this.key = key;
        set(o);
    }

    public JSOV(String key, Class<?> c) {
        this.key = key;
        this.c = c;
    }

    //FIXME testing only
    public static Object empty() {
       return new Object();
    }

    public static JSOV v(String key, String val, boolean quotes) {
        if(quotes) return new JSOV(key, val, "\"");
        return new JSOV(key, val);
    }

    public static JSOV v(String key, Object val) {
        return new JSOV(key, val);
    }

    public String key() {
        return this.key;
    }

    public String getString() {
        return quotes + get() + quotes;
    }

    public <Any> Any get() {
        return (Any) v;
    }

    public Class<?> type() {
        return c;
    }

    public void set(Object v) {
        this.v = v;
        this.c = v.getClass();
    }

}
