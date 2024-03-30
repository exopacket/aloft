package org.extendedweb.aloft.lib.lang.structure.components;

import org.extendedweb.aloft.lib.lang.types.base.T;
import org.extendedweb.aloft.lib.lang.types.base.V;
import org.extendedweb.aloft.utils.global.__;

import java.util.ArrayList;
import java.util.HashMap;

public class AloftObjectProperties {

    private HashMap<String, ArrayList<AloftObjectProperty>> collection = new HashMap<>();

    public AloftObjectProperties() { }

    public ArrayList<AloftObjectProperty> base() {
        if(!collection.containsKey("*")) return new ArrayList<>();
        return collection.get("*");
    }

    public ArrayList<AloftObjectProperty> all() {
        ArrayList<AloftObjectProperty> all = new ArrayList<>();
        for(String key : collection.keySet()) all.addAll(collection.get(key));
        return all;
    }

    public ArrayList<AloftObjectProperty> get() {
        return base();
    }

    public ArrayList<AloftObjectProperty> getList(String subtype) {
        ArrayList<AloftObjectProperty> list = new ArrayList<>();
        list.addAll(base());
        if(!collection.containsKey(subtype)) return list;
        list.addAll(collection.get(subtype));
        return list;
    }

    public AloftObjectProperty get(String property) {
        ArrayList<AloftObjectProperty> list = get();
        for(AloftObjectProperty prop : list) {
            if(__.same(prop.getName(), property)) return prop;
        }
        return null;
    }

    public AloftObjectProperty get(String subtype, String property) {
        ArrayList<AloftObjectProperty> list = getList(subtype);
        for(AloftObjectProperty prop : list) {
            if(__.same(prop.getName(), property)) return prop;
        }
        return null;
    }

    public boolean replace(String name, Object v) {
        boolean success = true;
        ArrayList<String> occurrences = containedIn(name);
        for(String key : occurrences) {
            if(!put(collection.get(key), name, v) && success) success = false;
        }
        return success;
    }

    public boolean replace(String name, Object v, String subtype) {
        if(!collection.containsKey(subtype)) return false;
        return put(collection.get(subtype), name, v);
    }

//    public boolean replace(AloftObjectProperty prop, String getList) {
//        if(!collection.containsKey(getList)) return false;
//        return put(collection.get(getList), prop);
//    }
//
//    public boolean replace(AloftObjectProperty prop) {
//        if(!collection.containsKey("*")) return false;
//        return put(collection.get("*"), prop);
//    }


    public void put(String name, T type) {
        put(name, type, V.nothing());
    }

    public void put(String name, T type, boolean required) {
        AloftObjectProperty prop = new AloftObjectProperty(name, type, required);
        if(!collection.containsKey("*")) collection.put("*", new ArrayList<>());
        put(collection.get("*"), prop);
    }

    public void put(String name, T type, boolean required, String...subtypes) {
        AloftObjectProperty prop = new AloftObjectProperty(name, type, required);
        for(String subtype : subtypes) {
            if (!collection.containsKey(subtype)) collection.put(subtype, new ArrayList<>());
            put(collection.get(subtype), prop);
        }
    }

    public void put(String name, Object v, String... subtypes) {
        for(String subtype : subtypes) {
            if (!collection.containsKey(subtype)) collection.put(subtype, new ArrayList<>());
            put(collection.get(subtype), name, v);
        }
    }

    public void put(String name, T type, Object value) {
        AloftObjectProperty prop = new AloftObjectProperty(name, type, value);
        if(!collection.containsKey("*")) collection.put("*", new ArrayList<>());
        put(collection.get("*"), prop);
    }

    public void put(String name, T type, Object value, String... subtypes) {
        AloftObjectProperty prop = new AloftObjectProperty(name, type, value);
        for(String subtype : subtypes) {
            if (!collection.containsKey(subtype)) collection.put(subtype, new ArrayList<>());
            put(collection.get(subtype), prop);
        }
    }

    private boolean put(ArrayList<AloftObjectProperty> current, AloftObjectProperty property) {
        for(AloftObjectProperty prop : current) {
            if(__.same(prop.getName(), property.getName())) {
                return prop.replace(property.type(), property.value());
            }
        }
        current.add(property);
        return true;
    }

    private boolean put(ArrayList<AloftObjectProperty> current, String propName, Object propValue) {
        for(AloftObjectProperty prop : current) {
            if(__.same(prop.getName(), propName)) {
                return prop.replace(propValue);
            }
        }
        return true;
    }

    private ArrayList<String> containedIn(String name) {
        ArrayList<String> list = new ArrayList<>();
        for(String key : collection.keySet()) {
            if(containedIn(name, key)) list.add(key);
        }
        return list;
    }

    private boolean containedIn(String name, String subtype) {
        if(!collection.containsKey(subtype)) return false;
        ArrayList<AloftObjectProperty> current = collection.get(subtype);
        for(AloftObjectProperty prop : current) {
            if(__.same(prop.getName(), name)) return true;
        }
        return false;
    }

}
