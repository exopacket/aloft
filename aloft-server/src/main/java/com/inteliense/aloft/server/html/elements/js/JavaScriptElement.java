package com.inteliense.aloft.server.html.elements.js;

import com.inteliense.aloft.server.html.elements.HtmlElement;
import com.inteliense.aloft.server.html.elements.types.Content;

public class JavaScriptElement extends HtmlElement {

    protected String value = "";

    public JavaScriptElement() { }

    public JavaScriptElement(String v) {
        this.value = v;
        addChild(new Content(value, false));
    }

    @Override
    public String getKey() {
        return "script";
    }

    public String getValue() {
        return value;
    }

}
