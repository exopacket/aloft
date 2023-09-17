package com.inteliense.aloft.server.html.elements.js;

import com.inteliense.aloft.server.html.elements.HtmlElement;

public class JavaScriptFile extends HtmlElement {

    private String value;

    @Override
    protected String getKey() {
        return "script";
    }

    public JavaScriptFile(String js, String endpoint) {
        addAttribute("type", "application/javascript");
        addAttribute("src", endpoint);
        value = js;
    }

    public String getValue() {
        return value;
    }

}
