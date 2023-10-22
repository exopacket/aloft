package org.extendedweb.aloft.lib.lang.structure.elements.base;

import org.extendedweb.aloft.utils.global.__;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;

public class AloftBuilder {

    private HashMap<String, ComponentRequirement> components = new HashMap<>();
    private ArrayList<AloftBuilderElement> elements = new ArrayList<>();

    public AloftBuilder() { }

    public int size() {
        return elements.size();
    }

    public AloftElement get(String key) {
        for(int i=0; i<elements.size(); i++)
            if(__.same(key, elements.get(i).getKey())) return elements.get(i).getElement();
        return null;
    }

    public AloftElement get(int index) {
        return elements.get(index).getElement();
    }

    public void add(String key, String[]...vars) {
        ComponentRequirement req = components.get(key);
        AloftElement element = createInstance(req.getType());
        if(!__.isset(element)) return;
        for(int i=0; i<vars.length; i++) element.addVar(vars[i][0], vars[i][1]);
        elements.add(new AloftBuilderElement(key, element));
    }

    public void addRequirement(String key, Class<?> c, String...vars) {
        this.components.put(key, new ComponentRequirement(key, c, vars,false, false));
    }

    public void addArrayRequirement(String key, Class<?> c, String...vars) {
        this.components.put(key, new ComponentRequirement(key, c, vars,true, false));
    }

    public void addOptional(String key, Class<?> c, String...vars) {
        this.components.put(key, new ComponentRequirement(key, c, vars, false, true));
    }

    public void addArrayOptional(String key, Class<?> c, String...vars) {
        this.components.put(key, new ComponentRequirement(key, c, vars, true, true));
    }

    private static <T extends AloftElement> AloftElement createInstance(Class<?> c) {
        try {
            Constructor<?> constructor = c.getConstructor();
            return (AloftElement) constructor.newInstance();
        } catch (Exception e) { e.printStackTrace(); }
        return null;
    }

    private static class ComponentRequirement {

        private String key;
        private Class<?> type;
        private boolean array;
        private boolean optional;
        private String[] vars;

        public ComponentRequirement(String key, Class<?> c, String[] vars, boolean arr, boolean optional) {
            this.key = key;
            this.type = c;
            this.array = arr;
            this.optional = optional;
        }

        public Class<?> getType() {
            return type;
        }

    }

}
