package org.extendedweb.aloft.lib.lang.structure.style;

import org.extendedweb.aloft.lib.lang.base.BuildsCss;
import org.extendedweb.aloft.utils.encryption.SHA;
import org.extendedweb.aloft.utils.global.__;

public class AloftStylePair implements BuildsCss {

    private String property;
    private String value;
    private String psuedo = null;
    private boolean important = false;

    public AloftStylePair(String property, String value, boolean important) {
        this.property = property;
        this.value = value;
        this.important = important;
    }

    public AloftStylePair(String property, String value, String psuedo, boolean important) {
        this.property = property;
        this.value = value;
        this.important = important;
        this.psuedo = psuedo;
    }

    public AloftStylePair(String property, String value) {
        this.property = property;
        this.value = value;
    }

    public AloftStylePair(String property, String value, String psuedo) {
        this.property = property;
        this.value = value;
    }

    public String getPsuedo() {
        return __.isset(psuedo) ? psuedo : "default";
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

    public String css(String className) {
        return property + ":" + value + ((important) ? " !important" : "") + ";";
    }

    public boolean hasSelectors() {
        return __.isset(psuedo);
    }

    public String getHash() {
        return SHA.get256(css(null));
    }
}
