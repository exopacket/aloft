package com.inteliense.aloft.compiler.lang.keywords.style.base;

import com.inteliense.aloft.utils.encryption.SHA;

public class AloftStylePair {

    private String property;
    private String value;

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

    public String getCss() {
        return property + ":" + value + ";";
    }

    public String getHash() {
        return SHA.get256(getCss());
    }
}