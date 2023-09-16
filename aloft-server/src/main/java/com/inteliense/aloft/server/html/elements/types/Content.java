package com.inteliense.aloft.server.html.elements.types;

import com.inteliense.aloft.server.html.elements.HtmlElement;

public class Content extends HtmlElement {

    private String value;

    public Content(String value) {
        super();
        value = value.replaceAll("\n", "<br>");
        this.value = value;
    }

    @Override
    protected String getKey() {
        return null;
    }

    @Override
    public String getHtml() {
        return value;
    }

}
