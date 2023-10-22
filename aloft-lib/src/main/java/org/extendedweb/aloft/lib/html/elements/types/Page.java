package org.extendedweb.aloft.lib.html.elements.types;

import org.extendedweb.aloft.lib.html.elements.HtmlElement;


public class Page extends HtmlElement {

    public Page() {
        this.prependHtml = "<!DOCTYPE html>";
    }

    @Override
    public String getKey() {
        return "html";
    }

}
