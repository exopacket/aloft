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

    public String getTagClassName() {
        if(className.contains(":")) return className.split(":")[0];
        return className;
    }

    public String getClassName() {
        return className;
    }

    public String css() {
        return style.css(className);
    }

    public int size() {
        return style.size();
    }

}
