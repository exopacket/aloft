package org.extendedweb.aloft.lib.lang.structure.style;

import org.extendedweb.aloft.lib.lang.base.BuildsCss;
import org.extendedweb.aloft.utils.encryption.SHA;

import java.util.*;

public class AloftStyle implements BuildsCss {

    private ArrayList<AloftStylePair> styles = new ArrayList<>();
    private boolean hasSelectors = false;

    public AloftStyle() { }

    public AloftStyle(ArrayList<AloftStylePair> styles) {
        this.styles = styles;
    }

    public void addStyle(AloftStylePair pair) {
        if(pair.hasSelectors()) this.hasSelectors = true;
        styles.add(pair);
    }

    public boolean hasSelectors() {
        return hasSelectors;
    }

    public int size() {
        return styles.size();
    }

    public int test() {
        int counter = 0;
        for(int i=0; i<styles.size(); i++) {
            if(styles.get(i).hasSelectors()) counter++;
        }
        return counter;
    }

    public HashMap<String, ArrayList<AloftStyleHashList>> getHashes() {
        Collections.sort(styles, new Comparator<AloftStylePair>() {
            @Override
            public int compare(AloftStylePair o1, AloftStylePair o2) {
                return o1.getHash().compareTo(o2.getHash());
            }
        });
        HashMap<String, ArrayList<AloftStyleHashList>> hashes = new HashMap<>();
        HashMap<String, ArrayList<AloftStylePair>> pairs = new HashMap<>();

        ArrayList<String> selectors = new ArrayList<>();

        for(int i=0; i<styles.size(); i++) {
            if(styles.get(i).hasSelectors() && !selectors.contains(styles.get(i).getPsuedo())) {
                selectors.add(styles.get(i).getPsuedo());
            }
        }

        if(!selectors.isEmpty()) selectors.add("default");

        if(!selectors.isEmpty()) {
            HashMap<String, ArrayList<AloftStylePair>> map = new HashMap<>();
            String all = "";
            for(int i=0; i<selectors.size(); i++) {
                String key = selectors.get(i);
                if (!pairs.containsKey(key)) pairs.put(key, new ArrayList<>());
                if (!map.containsKey(key)) map.put(key, new ArrayList<>());
                for(int x=0; x<styles.size(); x++) {
                    if(styles.get(x).getPsuedo().equals(key) || (!styles.get(x).hasSelectors() && key.equals("default"))) {
                        pairs.get(key).add(styles.get(x));
                        map.replace(key, pairs.get(key));
                        all += styles.get(x).getHash();
                    }
                }
            }
            hashes.put(SHA.getSha1(all), new ArrayList<AloftStyleHashList>(Collections.singleton(new AloftStyleHashList(SHA.get256(all), map))));
        }

        int v1 = 0;
        int v2 = 0;
        //TODO extract selectors and forget about hashing them the traditional way (we don't need to combine these in css)
        for (int i = v1; i < styles.size(); i++) {
            String appended = styles.get(i).getHash();
            String key = "default";
            if (!selectors.isEmpty()) {
                break;
            }
            if (!pairs.containsKey(key)) pairs.put(key, new ArrayList<>());
            if (!hashes.containsKey(key)) hashes.put(key, new ArrayList<>());
            pairs.get(key).add(styles.get(i));
            hashes.get(key).add(new AloftStyleHashList(SHA.get256(styles.get(i).getHash()), pairs.get(key)));
            pairs.replace(key, new ArrayList<>());
            for (int k = v2; k < styles.size(); k++) {
                if (k == i) continue;
                appended += styles.get(k).getHash();
                pairs.get(key).add(styles.get(k));
                String hash1 = SHA.get256(appended);
                hashes.get(key).add(new AloftStyleHashList(hash1, pairs.get(key)));
            }
            pairs.replace(key, new ArrayList<>());
            v2++;
            if (v2 == styles.size()) {
                v1++;
                v2 = 0;
            }
        }
        for (String key : hashes.keySet()) {
            if(!selectors.isEmpty()) break;
            String all = "";
            pairs.put(key, new ArrayList<>());
            for (int i = 0; i < styles.size(); i++) {
                if(styles.get(i).hasSelectors()) continue;
                all += styles.get(i).getHash();
                pairs.get(key).add(styles.get(i));
            }
            hashes.put(key, new ArrayList<>());
            hashes.get(key).add(new AloftStyleHashList(SHA.get256(all), pairs.get(key)));
            Collections.sort(hashes.get(key), Collections.reverseOrder(new Comparator<AloftStyleHashList>() {
                @Override
                public int compare(AloftStyleHashList o1, AloftStyleHashList o2) {
                    return Integer.compare(o1.size(), o2.size());
                }
            }));
        }
        return hashes;
    }

    public String getCombinedHash() {
        String all = "";
        for(int i=0; i<styles.size(); i++) {
            all += styles.get(i).getHash();
        }
        return SHA.get256(all);
    }

    public String css(String className) {
        HashMap<String, String> map = new HashMap<>();
        for(int i=0;i<styles.size(); i++) {
            if(!map.containsKey(className)) map.put(className, styles.get(i).css(null));
            else map.put(className, map.get(className) + styles.get(i).css(null));
        }
        StringBuilder builder = new StringBuilder();
        for(String key : map.keySet()) {
            builder.append(".").append(key).append(" { ");
            builder.append(map.get(key));
            builder.append(" } ");
        }
        return builder.toString();
    }

}
