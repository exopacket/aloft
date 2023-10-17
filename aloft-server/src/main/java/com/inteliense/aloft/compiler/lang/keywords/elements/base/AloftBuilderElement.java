package com.inteliense.aloft.compiler.lang.keywords.elements.base;

import com.inteliense.aloft.compiler.lang.base.ElementMapper;
import com.inteliense.aloft.compiler.lang.keywords.AloftTheme;
import com.inteliense.aloft.server.html.elements.HtmlElement;

public class AloftBuilderElement {

    private String key;
    private AloftElement element;

    public AloftBuilderElement(String key, AloftElement element) {
        this.key = key;
        this.element = element;
    }

    public String getKey() {
        return key;
    }

    public AloftElement getElement() {
        return element;
    }

    public HtmlElement create(AloftTheme theme, ElementMapper mapper) {
        return this.element.html(theme, mapper);
    }

}
