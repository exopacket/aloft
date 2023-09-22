package com.inteliense.aloft.compiler.lang.keywords.style.base;

import com.inteliense.aloft.compiler.lang.base.BuildsCss;
import com.inteliense.aloft.utils.encryption.SHA;
import com.inteliense.aloft.utils.global.__;
import org.jibx.binding.def.IContextObj;

import java.util.*;

public class AloftStyle implements BuildsCss {

    private ArrayList<AloftStylePair> styles = new ArrayList<>();

    public AloftStyle() { }

    public AloftStyle(ArrayList<AloftStylePair> styles) {
        this.styles = styles;
    }

    public void addStyle(AloftStylePair pair) {
        styles.add(pair);
    }

    public ArrayList<AloftStyleHashList> getHashes() {
        Collections.sort(styles, new Comparator<AloftStylePair>() {
            @Override
            public int compare(AloftStylePair o1, AloftStylePair o2) {
                return o1.getHash().compareTo(o2.getHash());
            }
        });
        ArrayList<AloftStyleHashList> hashes =  new ArrayList<>();
        ArrayList<AloftStylePair> pairs = new ArrayList<>();
        int v1 = 0;
        int v2 = 0;
        for(int i=v1; i<styles.size(); i++) {
            String appended = styles.get(i).getHash();
            pairs.add(styles.get(i));
            hashes.add(new AloftStyleHashList(SHA.get256(styles.get(i).getHash()), pairs));
            pairs = new ArrayList<>();
            for(int k=v2; k<styles.size(); k++) {
                if(k == i) continue;
                appended += styles.get(k).getHash();
                pairs.add(styles.get(k));
                String hash1 = SHA.get256(appended);
                hashes.add(new AloftStyleHashList(hash1, pairs));
            }
            pairs = new ArrayList<>();
            v2++;
            if(v2 == styles.size()) {
                v1++;
                v2 = 0;
            }
        }
        String all = "";
        for(int i=0; i<styles.size(); i++) {
            all += styles.get(i).getHash();
        }
        pairs.addAll(styles);
        hashes.add(new AloftStyleHashList(SHA.get256(all), pairs));
        Collections.sort(hashes, Collections.reverseOrder(new Comparator<AloftStyleHashList>() {
            @Override
            public int compare(AloftStyleHashList o1, AloftStyleHashList o2) {
                return Integer.compare(o1.size(), o2.size());
            }
        }));
        return hashes;
    }

    public String getCombinedHash() {
        String all = "";
        for(int i=0; i<styles.size(); i++) {
            all += styles.get(i).getHash();
        }
        return SHA.get256(all);
    }

    public String css() {
        String v = "";
        for(int i=0;i<styles.size(); i++) {
            v += styles.get(i).getCss() + " ";
        }
        return v;
    }

}
