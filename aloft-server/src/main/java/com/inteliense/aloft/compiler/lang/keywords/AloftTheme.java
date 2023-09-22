package com.inteliense.aloft.compiler.lang.keywords;

import com.inteliense.aloft.compiler.lang.base.BuildsCss;
import com.inteliense.aloft.compiler.lang.base.BuildsJava;
import com.inteliense.aloft.compiler.lang.keywords.style.base.AloftStyleClass;
import com.inteliense.aloft.compiler.lang.keywords.style.base.AloftStyleClassBuilder;
import com.inteliense.aloft.compiler.lang.keywords.style.base.AloftStyleHashList;

import java.util.ArrayList;

// add 'default MyElement.color: #ff000' to syntax

public class AloftTheme implements BuildsJava, BuildsCss {

    private AloftStyleClassBuilder classBuilder = new AloftStyleClassBuilder();
    private ArrayList<AloftStyleClass> classes = new ArrayList<>();

    public AloftTheme() {

    }

    public ArrayList<AloftStyleClass> mergeByHash(ArrayList<AloftStyleHashList> hashes) {
            ArrayList[] v = this.classBuilder.merge(this.classes, hashes);
            this.classes = v[1];
            return v[0];
    }

}
