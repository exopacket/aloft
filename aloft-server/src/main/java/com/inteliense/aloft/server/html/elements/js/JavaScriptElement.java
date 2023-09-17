package com.inteliense.aloft.server.html.elements.js;

import com.inteliense.aloft.server.html.elements.HtmlElement;

public abstract class JavaScriptElement extends HtmlElement {

    protected String value = "";

    @Override
    protected String getKey() {
        return "script";
    }

    public String getValue() {
        return value;
    }

}
