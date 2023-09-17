package com.inteliense.aloft.server.html.elements.types;

import com.inteliense.aloft.server.html.elements.HtmlElement;
import com.inteliense.aloft.server.html.elements.js.JavaScriptElement;
import com.inteliense.aloft.server.html.elements.js.JavaScriptFile;

public class Head extends HtmlElement {

    @Override
    protected String getKey() {
        return "head";
    }

    public void addJs(JavaScriptElement element) {
        addChild(element);
    }

    public void addJs(JavaScriptFile file) {
        addChild(file);
    }

}
