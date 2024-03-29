package org.extendedweb.aloft.lib.html.elements.css;

import org.extendedweb.aloft.lib.html.elements.HtmlElement;
import org.extendedweb.aloft.lib.html.elements.types.Content;

public class StylesheetElement extends HtmlElement {

    protected String value = null;

    public StylesheetElement() { }

    public StylesheetElement(String v) {
        this.value = v;
        addChild(new Content(value, false));
    }

    @Override
    public String getKey() {
        return "link";
    }

    public String getValue() {
        return value;
    }

}
