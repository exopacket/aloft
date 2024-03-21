package org.extendedweb.aloft.lib.model;

import org.extendedweb.aloft.lib.lang.types.t.FieldT;
import org.extendedweb.aloft.utils.encryption.A32;

import java.util.ArrayList;
import java.util.Arrays;

public class AloftModelQuerySelect {

    private ArrayList<FieldT> fields = new ArrayList<>();

    public AloftModelQuerySelect(FieldT[] fields) {
        this.fields.addAll(Arrays.asList(fields));
    }

    public String[] names() {
        String[] arr = new String[fields.size()];
        for(int i=0; i<arr.length; i++) arr[i] = fields.get(i).getName();
        return arr;
    }

    public String[] ids() {
        String[] arr = new String[fields.size()];
        for(int i=0; i<arr.length; i++) arr[i] = A32.get(fields.get(i).getName());
        return arr;
    }

}
