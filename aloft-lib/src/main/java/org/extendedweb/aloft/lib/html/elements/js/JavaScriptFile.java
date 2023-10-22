package org.extendedweb.aloft.lib.html.elements.js;

import org.extendedweb.aloft.lib.html.elements.HtmlElement;

public class JavaScriptFile extends HtmlElement {

    private String value;
    private String path;

    @Override
    public String getKey() {
        return "script";
    }

    public JavaScriptFile(String endpoint, String js) {
        addAttribute("type", "application/javascript");
        addAttribute("src", endpoint);
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
