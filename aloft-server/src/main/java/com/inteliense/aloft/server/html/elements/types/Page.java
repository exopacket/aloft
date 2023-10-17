package com.inteliense.aloft.server.html.elements.types;

import com.inteliense.aloft.server.html.elements.HtmlElement;


public class Page extends HtmlElement {

    public Page() {
        this.prependHtml = "<!DOCTYPE html>";
    }

    @Override
    public String getKey() {
        return "html";
    }

}
