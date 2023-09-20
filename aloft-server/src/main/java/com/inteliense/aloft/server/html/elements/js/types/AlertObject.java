package com.inteliense.aloft.server.html.elements.js.types;

import com.inteliense.aloft.server.html.elements.js.JavaScriptObject;

public class AlertObject extends JavaScriptObject {

    private String text;

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public void create() {
        call(new String[]{""}, "alert", text);
    }
}
