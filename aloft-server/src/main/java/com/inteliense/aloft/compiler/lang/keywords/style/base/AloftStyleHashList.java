package com.inteliense.aloft.compiler.lang.keywords.style.base;

import java.util.ArrayList;

public class AloftStyleHashList {

    private String hash;
    private ArrayList<AloftStylePair> styles;

    public AloftStyleHashList(String hash, ArrayList<AloftStylePair> styles) {
        this.hash = hash;
        this.styles = styles;
    }

    public int size() {
        return this.styles.size();
    }

    public String getHash() {
        return this.hash;
    }

    public ArrayList<AloftStylePair> getStyles() {
        return this.styles;
    }

}
