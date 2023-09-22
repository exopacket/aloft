package com.inteliense.aloft.compiler.lang.keywords.style.base;

import com.inteliense.aloft.compiler.lang.base.BuildsCss;
import com.inteliense.aloft.utils.encryption.SHA;

public class AloftStylePair implements BuildsCss {

    private String property;
    private String value;
    private boolean important = false;

    public AloftStylePair(String property, String value, boolean important) {
        this.property = property;
        this.value = value;
        this.important = important;
    }

    public AloftStylePair(String property, String value) {
        this.property = property;
        this.value = value;
    }

    public String getProperty() {
        return property;
    }

    public String getValue() {
        return value;
    }

    public void setImportant() {
        this.important = true;
    }

    public boolean isImportant() {
        return important;
    }

    public String css() {
        return property + ":" + value + ((important) ? " !important" : "") + ";";
    }

    public String getHash() {
        return SHA.get256(css());
    }
}
