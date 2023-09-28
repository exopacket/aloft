package com.inteliense.aloft.compiler.lang.keywords.style.base;

import com.inteliense.aloft.utils.encryption.A32;
import com.inteliense.aloft.utils.encryption.SHA;
import com.inteliense.aloft.utils.global.__;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class AloftStyleClassBuilder {

    private ArrayList<String> classes = new ArrayList<>();

    public AloftStyleClassBuilder() { }

    public ArrayList<AloftStyleClass> merge(ArrayList<AloftStyleClass> current, ArrayList<AloftStyleHashList> toMerge, String key) {
        ArrayList<AloftStyleClass> classes = new ArrayList<>(current);
        ArrayList<AloftStyleClass> matches = new ArrayList<>();

        int size = toMerge.get(0).size();
//        classes = sortAndSplice(size, classes);
        for(int i=0; i<toMerge.size(); i++) {
            String toMergeHash = toMerge.get(i).getHash();
            String currentHash = null;
            boolean match = false;
            if(!toMerge.get(i).hasSelectors()) {
                for (int x = 0; x < current.size(); x++) {
                    currentHash = classes.get(x).getStyle().getCombinedHash();
                    match = __.same(currentHash, toMergeHash);
                    if (match) {
                        matches.add(classes.get(x));
                        break;
                    }
                }
            }
            if(match) {
                match = false;
                continue;
            }
            if(!match) {
                String className = A32.casified(toMergeHash);
                if(toMerge.get(i).hasSelectors()) {
                    ArrayList<String> selectors = toMerge.get(i).getSelectors();
                    for(int x=0; x<selectors.size(); x++) {
                        String selector = selectors.get(x);
                        if(__.same(selector, "default")) continue;
                        String classNameWithSelector = className + selector;
                        AloftStyleClass newClass = new AloftStyleClass(classNameWithSelector, new AloftStyle(toMerge.get(i).getStyles(selector)));
                        matches.add(newClass);
                    }
                    AloftStyleClass newClass = new AloftStyleClass(className, new AloftStyle(toMerge.get(i).getStyles()));
                    matches.add(newClass);
                } else {
                    AloftStyleClass newClass = new AloftStyleClass(className, new AloftStyle(toMerge.get(i).getStyles()));
                    matches.add(newClass);
                }
                break;
            }
        }
        return matches;
    }

    public void appendGlobalClass(AloftStyleClass c) {
        if(!globalExists(c));
        classes.add(c.getClassName());
    }

    public boolean globalExists(AloftStyleClass c) {
        return this.classes.contains(c.getClassName());
    }

    public void dumpClasses() {
        for(String c : classes) __.printPrettyLn(c);
    }

    private ArrayList<AloftStyleClass> sortAndSplice(int size, ArrayList<AloftStyleClass> input) {
        ArrayList<AloftStyleClass> classes = new ArrayList<>(input);
        Collections.sort(classes, Collections.reverseOrder(new Comparator<AloftStyleClass>() {
            @Override
            public int compare(AloftStyleClass o1, AloftStyleClass o2) {
                return Integer.compare(o1.getStyle().getHashes().size(), o2.getStyle().getHashes().size());
            }
        }));
        Predicate<AloftStyleClass> predicate = item -> item.getStyle().getHashes().size() <= size;
        return (ArrayList<AloftStyleClass>) classes.stream().filter(predicate).collect(Collectors.toList());
    }

}
