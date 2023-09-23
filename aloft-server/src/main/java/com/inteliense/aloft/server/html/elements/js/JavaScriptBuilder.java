package com.inteliense.aloft.server.html.elements.js;

import com.inteliense.aloft.utils.global.__;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
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

    public JavaScriptElement getElement() {
        return null;
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