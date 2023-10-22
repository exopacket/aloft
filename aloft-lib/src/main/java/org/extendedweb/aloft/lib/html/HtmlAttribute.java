package org.extendedweb.aloft.lib.html;

public class HtmlAttribute {
    private String key;
    private String value;

    public HtmlAttribute(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }
}
