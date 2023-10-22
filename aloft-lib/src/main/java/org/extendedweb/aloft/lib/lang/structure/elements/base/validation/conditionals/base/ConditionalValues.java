package org.extendedweb.aloft.lib.lang.structure.elements.base.validation.conditionals.base;

import org.extendedweb.aloft.lib.html.elements.js.JavaScriptObject;
import org.extendedweb.aloft.lib.html.elements.js.types.ElementRef;

import java.util.ArrayList;
import java.util.HashMap;

public class ConditionalValues {

    private HashMap<String, ArrayList<ConditionalValueObject>> values = new HashMap<>();

    public ConditionalValues() { }

    public void add(String conditionalKey, String groupId, ConditionalValueType type, ConditionalValueSet values, String elementKey) {
        ConditionalValueObject object = new ConditionalValueObject(conditionalKey, groupId, type, values, elementKey);
        if(!this.values.containsKey(conditionalKey)) {
            this.values.put(conditionalKey, new ArrayList<>());
        }
        this.values.get(conditionalKey).add(object);
    }

    public void add(String conditionalKey, String groupId, ConditionalValueType type, ConditionalValueSet values) {
        ConditionalValueObject object = new ConditionalValueObject(conditionalKey, groupId, type, values);
        if(!this.values.containsKey(conditionalKey)) {
            this.values.put(conditionalKey, new ArrayList<>());
        }
        this.values.get(conditionalKey).add(object);
    }

    public void add(String conditionalKey, String groupId, ConditionalValueType type, ConditionalValueSet values, String elementKey, ElementRef ref) {
        ConditionalValueObject object = new ConditionalValueObject(conditionalKey, groupId, type, values, elementKey, ref);
        if(!this.values.containsKey(conditionalKey)) {
            this.values.put(conditionalKey, new ArrayList<>());
        }
        this.values.get(conditionalKey).add(object);
    }

    public void setRef(ElementRef ref) {
        for(String key : values.keySet()) {
            ArrayList<ConditionalValueObject> objects = values.get(key);
            for(ConditionalValueObject object : objects) object.setRef(ref);
        }
    }

    public JavaScriptObject[] getValue(String conditionalKey, String groupId, Conditions condition) {
        if(!values.containsKey(conditionalKey)) return new JavaScriptObject[0];
        ArrayList<ConditionalValueObject> list = values.get(conditionalKey);
        ArrayList<JavaScriptObject> v = new ArrayList<>();
        for(ConditionalValueObject entry : list) if(entry.match(groupId)) v.add(entry.getJs(condition));
        JavaScriptObject[] arr = new JavaScriptObject[v.size()];
        v.toArray(arr);
        return arr;
    }

}
