package com.inteliense.aloft.compiler.lang.lib;

import com.inteliense.aloft.server.html.elements.HtmlElement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class ModuleElementAttributes {

    private ArrayList<String> classes = new ArrayList<>();
    private ArrayList<String[]> styles = new ArrayList<String[]>();
    private HashMap<String, String> attributes = new HashMap<String, String>();
    private HashMap<String, String> subclasses = new HashMap<String, String>();

    public ModuleElementAttributes() { }

    public void apply(HtmlElement element) {
        apply(element, new String[0]);
    }

    public void apply(HtmlElement element, String[] subclasses) {
        for(int i=0; i<this.classes.size(); i++) element.addAttribute("class", this.classes.get(i));
        for(int i=0; i<subclasses.length; i++) element.addAttribute("class", this.subclasses.get(subclasses[i]));
        for(String attr : attributes.keySet()) element.addAttribute(attr, attributes.get(attr));
    }

    public void addClasses(String...classes) {
        this.classes.addAll(Arrays.asList(classes));
    }

    public void addStyles(String...styles) {
        if(styles.length % 2 == 1) return;
        String[] arr = new String[2];
        for(int i=0; i<styles.length; i++) {
            int index = i % 2;
            arr[index] = styles[i];
            if(index == 1) {
                this.styles.add(arr);
                arr = new String[2];
            }
        }
    }

    public void addSubclasses(String...subclasses) {
        if(subclasses.length % 2 == 1) return;
        String[] arr = new String[2];
        for(int i=0; i<subclasses.length; i++) {
            int index = i % 2;
            arr[index] = subclasses[i];
            if(index == 1) {
                this.subclasses.put(arr[0], arr[1]);
                arr = new String[2];
            }
        }
    }

    public void addAttributes(String...attributes) {
        if(attributes.length % 2 == 1) return;
        String[] arr = new String[2];
        for(int i=0; i<attributes.length; i++) {
            int index = i % 2;
            arr[index] = attributes[i];
            if(index == 1) {
                this.attributes.put(arr[0], arr[1]);
                arr = new String[2];
            }
        }
    }

}
