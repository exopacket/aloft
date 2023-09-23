package com.inteliense.aloft.server.html.elements.js.types;

import com.inteliense.aloft.server.html.elements.js.JavaScriptObject;

public class ShowAlertObject extends JavaScriptObject {

    private String id;

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public void create() {
//        call(true, new String[]{this.id}, "toggle");
    }
}
