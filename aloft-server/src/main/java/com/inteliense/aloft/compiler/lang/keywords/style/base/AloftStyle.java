package com.inteliense.aloft.compiler.lang.keywords.style.base;

import com.inteliense.aloft.compiler.lang.base.BuildsCss;
import com.inteliense.aloft.utils.encryption.SHA;

import java.util.ArrayList;
import java.util.Arrays;

public class AloftStyle implements BuildsCss {

    private ArrayList<AloftStylePair> styles = new ArrayList<>();

    public String getCombinedHash() {
        String[] hashes = new String[styles.size()];
        if(hashes.length == 0) return null;
        for(int i=0; i<hashes.length; i++) hashes[i] = styles.get(i).getHash();
        Arrays.sort(hashes);
        StringBuilder combined = new StringBuilder();
        for (String hash : hashes) combined.append(hash);
        return SHA.get512(combined.toString());
    }

}
