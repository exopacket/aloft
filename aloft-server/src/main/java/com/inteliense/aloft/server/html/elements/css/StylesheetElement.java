package com.inteliense.aloft.server.html.elements.css;

import com.inteliense.aloft.server.html.elements.HtmlElement;
import com.inteliense.aloft.server.html.elements.types.Content;

public class StylesheetElement extends HtmlElement {

    protected String value = "";

    public StylesheetElement() { }

    public StylesheetElement(String v) {
        this.value = v;
        addChild(new Content(value, false));
    }

    @Override
    protected String getKey() {
        return "style";
    }

    public String getValue() {
        return value;
    }

}
