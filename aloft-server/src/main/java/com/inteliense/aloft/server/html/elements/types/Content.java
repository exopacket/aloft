package com.inteliense.aloft.server.html.elements.types;

import com.inteliense.aloft.server.html.elements.HtmlElement;

public class Content extends HtmlElement {

    private String raw;

    @Override
    protected String getKey() {
        return null;
    }

    @Override
    public String getHtml() {
        return raw;
    }

    public void setContent(String raw) {
        this.raw = raw;
    }

}
