package org.extendedweb.aloft.lib.lang.types.v;

import org.extendedweb.aloft.lib.lang.types.base.T;
import org.extendedweb.aloft.lib.lang.types.base.V;
import org.extendedweb.aloft.lib.lang.types.t.FieldT;
import org.extendedweb.aloft.lib.lang.types.t.ObjectT;
import org.extendedweb.aloft.utils.global.__;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;

public class ModelV extends V {

    private ArrayList<FieldT> fields = new ArrayList<>();
    private HashMap<String, V> values = new HashMap<>();

    public ModelV(FieldT[] fields) {
        this.fields.addAll(Arrays.asList(fields));
        for(FieldT field : fields) values.put(field.getName(), V.nothing());
    }

    public ModelV(FieldT[] fields, HashMap<String, V> values) {
        this.fields.addAll(Arrays.asList(fields));
        for(FieldT field : fields) values.put(field.getName(), V.nothing());
        setAll(values);
    }

    public void set(String name, V value) {
        this.values.replace(name, value);
    }

    public void setAll(HashMap<String, V> values) {
        for(String key : values.keySet()) {
            for (FieldT field : fields) {
                if(__.same(field.getName(), key)) {
                    this.values.replace(key, field.value(values.get(key)));
                    break;
                }
            }
        }
    }

    @Override
    public <Any> Any get() {
        return (Any) values;
    }

    @Override
    public T type() {
        return new ObjectT();
    }

}
