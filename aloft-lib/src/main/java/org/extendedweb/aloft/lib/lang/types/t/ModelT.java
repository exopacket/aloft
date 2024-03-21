package org.extendedweb.aloft.lib.lang.types.t;

import org.extendedweb.aloft.lib._AloftModel;
import org.extendedweb.aloft.lib.lang.types.base.T;
import org.extendedweb.aloft.lib.lang.types.base.V;
import org.extendedweb.aloft.lib.lang.types.v.ModelV;
import org.extendedweb.aloft.lib.lang.types.v.NullV;
import org.extendedweb.aloft.lib.lang.types.v.StringV;
import org.extendedweb.aloft.utils.encryption.A32;
import org.extendedweb.aloft.utils.global.__;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;

public class ModelT extends T {

    private String name;
    private String path;
    private String id;
    private ArrayList<FieldT> fields = new ArrayList<>();

    public ModelT(String name, _AloftModel model) {
        this.name = name;
        this.path = name;
        this.id = A32.get(name);
        reloadFromModel(model);
    }

    public ModelT(String name, HashMap<String, T> fields) {
        this.name = name;
        this.path = name;
        this.id = A32.get(name);
        for(String key : fields.keySet()) {
            this.fields.add(new FieldT(this, key, fields.get(key)));
        }
    }

    public ModelT(String name, String path, HashMap<String, T> fields) {
        this.name = name;
        this.path = path + "." + name;
        this.id = A32.get(name);
        for(String key : fields.keySet()) {
            this.fields.add(new FieldT(this, key, fields.get(key)));
        }
    }

    public void changePath(String path) {
        this.path = path + "." + name;
    }

    public void appendPath(String path) {
        this.path = this.path + "." + path + "." + name;
    }

    public String getPath() {
        return path;
    }

    public void reloadFromModel(_AloftModel model) {
        this.fields.clear();
//        this.fields.addAll(model.getFields());
    }

    public ModelT(String name, FieldT...fields) {
        this.name = name;
        this.id = A32.get(name);
        this.fields.addAll(Arrays.asList(fields));
    }

    public V value() {
        ArrayList<String> names = new ArrayList<>();
        for(FieldT field : fields) {
            names.add(field.getName());
        }
        return value((String[]) names.toArray());
    }

    @Override
    public V value(Object v) {
        ArrayList<String> names = new ArrayList<>();
        for(FieldT field : fields) {
            names.add(field.getFullyQualifiedName());
        }
        return value((String[]) names.toArray());
    }

    public V value(String[] fields) {
        FieldT[] arr = new FieldT[fields.length];
        for(int i=0; i< fields.length; i++) {
            String name = fields[i];
            for(FieldT field : this.fields) {
                if(__.same(name, field.getFullyQualifiedName())) {
                    arr[i] = field;
                }
            }
        }
        return new ModelV(arr);
    }

    public V value(String[] fields, HashMap<String, Object> values) {
        FieldT[] arr = new FieldT[fields.length];
        HashMap<String, V> list = new HashMap<>();
        for(int i=0; i< fields.length; i++) {
            String name = fields[i];
            for(FieldT field : this.fields) {
                if(__.same(name, field.getFullyQualifiedName())) {
                    arr[i] = field;
                    if(values.containsKey(name)) {
                        list.put(name, field.value(values.get(name)));
                    } else {
                        list.put(name, V.nothing());
                    }
                }
            }
        }
        return new ModelV(arr, list);
    }

}
