package org.extendedweb.aloft.lib.html.elements.js;

import org.extendedweb.aloft.lib.html.elements.js.types.ElementRef;
import org.extendedweb.aloft.utils.global.__;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class JavaScriptBuilder {

    private File file;

    private ArrayList<JavaScriptObject> objects = new ArrayList<>();
    private String path;

    public JavaScriptBuilder(String path, File file) {
        this.file = file;
        this.path = path;
    }

    public JavaScriptBuilder() { }

    public boolean empty() {
        return this.objects.isEmpty();
    }

    public void addObject(JavaScriptObject object, String...vars) {
        object.setVars(vars);
        objects.add(object);
    }

    public void addRef(ElementRef ref) {
        objects.add(ref);
    }

    public void addRefs(ElementRef...ref) {
        objects.addAll(Arrays.asList(ref));
    }

    public JavaScriptElement getElement() {
        if(objects.isEmpty()) {
            JavaScriptElement el = new JavaScriptElement();
            el.addAttribute("src", path);
            return el;
        }
        return new JavaScriptObject() {
            @Override
            protected void create() {
                for(JavaScriptObject object : objects) child(object);
            }
        }.build().getJs();
    }

    public JavaScriptFile getFile() {
        if(!__.isset(file)) return null;
        if(!file.exists()) return null;
        try {
            Scanner scnr = new Scanner(file);
            StringBuilder builder = new StringBuilder();
            while(scnr.hasNext()) {
                builder.append(scnr.nextLine() + "\n");
            }
            return new JavaScriptFile(path, builder.toString());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
