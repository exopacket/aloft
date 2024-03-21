package org.extendedweb.aloft.lib.html.elements.js;

import org.extendedweb.aloft.lib.html.elements.HtmlElement;
import org.extendedweb.aloft.lib.html.elements.types.Content;

public class JavaScriptElement extends HtmlElement {

    protected String value = null;

    public JavaScriptElement() { }

    public JavaScriptElement(String v) {
        this.value = v;
        addChild(new Content(v));
    }

    @Override
    public String getKey() {
        return "script";
    }

    public String getValue() {
        return value;
    }

}
