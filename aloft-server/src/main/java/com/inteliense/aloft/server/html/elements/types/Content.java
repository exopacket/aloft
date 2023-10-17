package com.inteliense.aloft.server.html.elements.types;

import com.inteliense.aloft.server.html.elements.HtmlElement;

public class Content extends HtmlElement {

    private String value;

    public Content(String value) {
        super();
        value = value.replaceAll("\n", "<br>");
        this.value = value;
    }

    public Content(String value, boolean replaceLineBreaks) {
        super();
        if(replaceLineBreaks) value = value.replaceAll("\n", "<br>");
        this.value = value;
    }

    @Override
    public String getKey() {
        return null;
    }

    @Override
    public String getHtml() {
        return value;
    }

}
