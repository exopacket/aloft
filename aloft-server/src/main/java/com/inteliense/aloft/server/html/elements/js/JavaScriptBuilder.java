package com.inteliense.aloft.server.html.elements.js;

import com.inteliense.aloft.utils.global.__;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class JavaScriptBuilder {

    private String id;
    private File file;

    private ArrayList<JavaScriptObject> objects = new ArrayList<>();


    public JavaScriptBuilder() {
        this.id = getId();
    }

    public JavaScriptBuilder(File file) {
        this.file = file;
        this.id = getId();
    }

    public void addObject(JavaScriptObject object) {
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
            return new JavaScriptFile(id, builder.toString());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private String getId() {
        return "bootstrap";
    }

}
