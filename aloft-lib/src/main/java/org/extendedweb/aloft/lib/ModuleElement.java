package org.extendedweb.aloft.lib;

import java.util.HashMap;

public class ModuleElement {

    private HashMap<String, ModuleElementAttributes> attributes = new HashMap<>();

    public ModuleElement() { }

    public ModuleElementAttributes fromKey(String key) { return attributes.get(key); }

    public void addClasses(String key, String...classes) {
        if(!attributes.containsKey(key)) attributes.put(key, new ModuleElementAttributes());
        attributes.get(key).addClasses(classes);
    }

    public void addStyles(String key, String...styles) {
        if(!attributes.containsKey(key)) attributes.put(key, new ModuleElementAttributes());
        attributes.get(key).addStyles(styles);
    }

    public void addSubclasses(String key, String...subclasses) {
        if(!attributes.containsKey(key)) attributes.put(key, new ModuleElementAttributes());
        attributes.get(key).addSubclasses(subclasses);
    }

    public void addAttributes(String key, String...attributes) {
        if(!this.attributes.containsKey(key)) this.attributes.put(key, new ModuleElementAttributes());
        this.attributes.get(key).addAttributes(attributes);
    }

}
