package org.extendedweb.aloft.lib.lang.structure.style;

import org.extendedweb.aloft.lib.lang.base.BuildsCss;

import java.util.ArrayList;

public class AloftStyleCss implements BuildsCss {

    private ArrayList<AloftStyleClass> classes = new ArrayList<>();

    public AloftStyleCss() { }

    public void append(AloftStyleClass input) {
        if(!exists(input.getClassName())) classes.add(input);
    }

    public void append(ArrayList<AloftStyleClass> input) {
        for(int i=0; i<input.size(); i++) append(input.get(i));
    }

    public int size() {
        return this.classes.size();
    }

    public String css(String className) {
        String v = "";
        for(int i=0; i<size(); i++) {
            v += this.classes.get(i).css();
        }
        return v;
    }

    public boolean exists(String name) {
        for(int i=0; i<classes.size(); i++) {
            if (classes.get(i).getClassName().equals(name)) {
                return true;
            }
        }
        return false;
    }

}
