package com.inteliense.aloft.compiler.lang.keywords.style.base;

import com.inteliense.aloft.utils.encryption.A32;
import com.inteliense.aloft.utils.global.__;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class AloftStyleClassBuilder {

    public AloftStyleClassBuilder() { }

    public ArrayList[] merge(ArrayList<AloftStyleClass> current, ArrayList<AloftStyleHashList> toMerge) {
        ArrayList<AloftStyleClass> classes = new ArrayList<>(current);
        ArrayList<AloftStyleClass> matches = new ArrayList<>();
        int size = toMerge.get(0).size();
        classes = sortAndSplice(size, classes);
        for(int i=0; i<toMerge.size(); i++) {
            String toMergeHash = toMerge.get(i).getHash();
            String currentHash = null;
            boolean match = false;
            for(int x=0; x<current.size(); x++) {
                currentHash = current.get(x).getStyle().getCombinedHash();
                match = __.same(currentHash, toMergeHash);
                 if(match) {
                     matches.add(current.get(x));
                     break;
                 }
            }
            if(!match) {
                AloftStyleClass newClass = new AloftStyleClass(A32.casified(toMergeHash), new AloftStyle(toMerge.get(i).getStyles()));
                classes.add(newClass);
                matches.add(newClass);
            }
        }
        return new ArrayList[]{matches, classes};
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
