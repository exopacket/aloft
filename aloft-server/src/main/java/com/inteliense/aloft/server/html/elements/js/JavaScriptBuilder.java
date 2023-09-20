package com.inteliense.aloft.server.html.elements.js;

import java.util.ArrayList;

public class JavaScriptBuilder {

    private ArrayList<JavaScriptObject> objects = new ArrayList<>();

    public void addObject(JavaScriptObject object) {
        objects.add(object);
    }

    public JavaScriptElement getElement() {
        return null;
    }

    public JavaScriptFile getFile() {
        return null;
    }

}
