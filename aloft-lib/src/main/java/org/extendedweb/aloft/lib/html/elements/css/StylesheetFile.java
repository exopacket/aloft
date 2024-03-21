package org.extendedweb.aloft.lib.html.elements.css;

import org.extendedweb.aloft.lib.html.elements.HtmlElement;

public class StylesheetFile extends HtmlElement {

    private String value;
    private String path;

    @Override
    public String getKey() {
        return "link";
    }

    public StylesheetFile(String endpoint, String css) {
        addAttribute("rel", "stylesheet");
        addAttribute("href", endpoint);
        path = endpoint;
        value = css;
    }

    public String getValue() {
        return value;
    }

    public String getPath() {
        return path;
    }

}
