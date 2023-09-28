package com.inteliense.aloft.compiler.lang.keywords.style.base;

import com.inteliense.aloft.utils.global.__;

import java.util.ArrayList;
import java.util.HashMap;

public class AloftStyleHashList {

    private String hash;
    private ArrayList<AloftStylePair> styles = new ArrayList<>();
    private ArrayList<String> psuedo = new ArrayList<>();

    public AloftStyleHashList(String hash, ArrayList<AloftStylePair> styles) {
        this.hash = hash;
        this.styles = styles;
    }

    public AloftStyleHashList(String hash, HashMap<String, ArrayList<AloftStylePair>> styles) {
        this.hash = hash;
        for(String key : styles.keySet()) {
            this.psuedo.add(key);
            ArrayList<AloftStylePair> pairs = styles.get(key);
            this.styles.addAll(pairs);
        }
    }

    public int size() {
        return this.styles.size();
    }

    public boolean hasSelectors() {
        return !psuedo.isEmpty();
    }

    public ArrayList<String> getSelectors() {
        return psuedo;
    }

    public String getHash() {
        return this.hash;
    }

    public ArrayList<AloftStylePair> getStyles() {
        if(this.hasSelectors()) {
            ArrayList<AloftStylePair> pairs = new ArrayList<>();
            for(int i=0; i< styles.size(); i++) if(!styles.get(i).hasSelectors()) pairs.add(styles.get(i));
            return pairs;
        }
        return styles;
    }

    public ArrayList<AloftStylePair> getStyles(String selectors) {
        ArrayList<AloftStylePair> pairs = new ArrayList<>();
        for(int i=0; i< styles.size(); i++) if(styles.get(i).getPsuedo().equals(selectors)) pairs.add(styles.get(i));
        return pairs;
    }

}
