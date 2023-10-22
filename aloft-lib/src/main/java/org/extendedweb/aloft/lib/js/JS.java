package org.extendedweb.aloft.lib.js;

import org.extendedweb.aloft.lib.html.elements.js.JavaScriptObject;

import java.util.ArrayList;

public class JS {

    ArrayList<JSO> jsObjects = new ArrayList<>();

    protected void js(JSO jso) {
        jsObjects.add(jso);
    }

    protected void var(boolean constant, JSO jso) {

    }

    public JavaScriptObject get() {
        return new JavaScriptObject() {
            @Override
            protected void create() {
                for(JSO jso : jsObjects) child(jso.get());
            }
        };
    }

}
