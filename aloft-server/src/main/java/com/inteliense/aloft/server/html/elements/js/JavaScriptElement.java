package com.inteliense.aloft.server.html.elements.js;

import com.inteliense.aloft.server.html.elements.HtmlElement;

public abstract class JavaScriptElement extends HtmlElement {
    @Override
    protected String getKey() {
        return "script";
    }
}
