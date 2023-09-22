package com.inteliense.aloft.server.html.elements.css;

import com.inteliense.aloft.server.html.elements.HtmlElement;

public class StylesheetFile extends HtmlElement {

    private String value;
    private String path;

    @Override
    protected String getKey() {
        return "link";
    }

    public StylesheetFile(String endpoint, String js) {
        addAttribute("rel", "stylesheet");
        addAttribute("href", endpoint);
        path = endpoint;
        value = js;
    }

    public String getValue() {
        return value;
    }

    public String getPath() {
        return path;
    }

}
