package com.inteliense.aloft.compiler.lang.keywords.style.base;

public class AloftStyleClass {

    private AloftStyle style;
    private String className;

    public AloftStyleClass(String className, AloftStyle style) {
        this.className = className;
        this.style = style;
    }

    public AloftStyle getStyle() {
        return style;
    }

    public String getClassName() {
        return this.className;
    }

    public String css() {
        String v = "." + className + " { ";
        v += style.css();
        v += "} ";
        return v;
    }

}
