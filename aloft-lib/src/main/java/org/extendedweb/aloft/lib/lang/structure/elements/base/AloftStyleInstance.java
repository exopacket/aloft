package org.extendedweb.aloft.lib.lang.structure.elements.base;

import org.extendedweb.aloft.lib.lang.structure.style.AloftStyle;
import org.extendedweb.aloft.lib.lang.structure.style.AloftStylePair;
import org.extendedweb.aloft.lib.lang.types.base.V;
import org.extendedweb.aloft.lib.lang.types.v.InstanceV;
import org.extendedweb.aloft.utils.global.__;

import java.util.ArrayList;
import java.util.HashMap;

public class AloftStyleInstance extends AloftInstance {

    private String key = null;
    private HashMap<String, Object> values;

    public AloftStyleInstance(InstanceV v) {
        super("style");
        values = v.getMap();
    }

    public AloftStyleInstance(String key, InstanceV v) {
        super(key);
        this.key = key;
        values = v.getMap();
    }

    public ArrayList<AloftStylePair> pairs() {
        ArrayList<AloftStylePair> styles = new ArrayList<>();
        for(String key : values.keySet()) {
            Object object = values.get(key);
            if(object instanceof InstanceV) {
                V v = ((InstanceV) object).get();
                if(v instanceof AloftInstance) {
                    AloftStyleInstance instance = getInstance(key, (InstanceV) v);
                    styles.addAll(instance.pairs());
                } else {
                    Object str = v.get();
                    if(!__.isset(str)) continue;
                    String value = String.valueOf(str);
                    styles.add(new AloftStylePair(key, value));
                }

            } else {
                String str = null;
                if (object instanceof V) {
                    Object value = ((V) object).get();
                    if(!__.isset(value)) continue;
                    str = String.valueOf(value);
                } else {
                    if(!__.isset(object)) continue;
                    str = String.valueOf(object);
                }
                styles.add(new AloftStylePair(key, str));
            }
        }
        return styles;
    }

    public AloftStyle getStyle() {
        return new AloftStyle(pairs());
    }

    private AloftStyleInstance getInstance(String key, InstanceV v) {
        return new AloftStyleInstance(key, v);
    }

}
