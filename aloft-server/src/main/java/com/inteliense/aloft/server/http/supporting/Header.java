package com.inteliense.aloft.server.http.supporting;

import java.util.ArrayList;
import java.util.List;

public class Header {

    private String key;
    private String[] values;
    private int maxValues;
    private int currentIndex = 0;

    public Header(String key, String value) {
        this.key = key;
        ArrayList<String> values = new ArrayList<>();
        values.add(value);
        setVars(key, values, 1);
    }

    public Header(String key, List<String> values) {
        setVars(key, values, 1);
    }

    public Header(String key, List<String> values, int maxValues) {
        setVars(key, values, maxValues);
    }

    private void setVars(String key, List<String> values, int maxValues) {
        this.key = key;
        this.values = listToArray(values);
        this.maxValues = maxValues;
    }

    public String next() {
        if(hasNext()) {
            String val = values[currentIndex];
            currentIndex++;
            return val;
        }
        return null;
    }

    public String getKey() {
        return key;
    }

    public String[] getArray() {
        return values;
    }

    public int size() {
        return values.length;
    }

    public boolean hasNext() {
        return currentIndex < Math.min(values.length, maxValues);
    }

    private String[] listToArray(List<String> values) {
        String[] arr = new String[values.size()];
        int limit = Math.min(values.size(), maxValues);
        for(int i=0; i<limit; i++) arr[i] = values.get(i);
        return arr;
    }

}
