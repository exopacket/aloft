package com.inteliense.aloft.compiler.lang.keywords.elements.types;

import com.inteliense.aloft.compiler.lang.base.ElementMapper;
import com.inteliense.aloft.compiler.lang.keywords.AloftTheme;
import com.inteliense.aloft.compiler.lang.keywords.elements.base.AloftElement;
import com.inteliense.aloft.compiler.lang.keywords.elements.base.AloftElementSubtype;
import com.inteliense.aloft.server.html.elements.HtmlElement;
import com.inteliense.aloft.utils.global.__;

import java.util.ArrayList;
import java.util.HashMap;

public class IconAloftElement extends AloftElement {

    public IconAloftElement() { super(); init(); }

    public void setIcon(String icon) {
        this.vars.replace("icon", icon);
    }

    public void setColor(String color) {
        this.vars.replace("color", color);
    }

    public void setSize(int size) {
        this.vars.replace("size", size);
    }

    @Override
    public HtmlElement create(AloftTheme theme, ElementMapper mapper) {
        HtmlElement icon = createElement("i");
        icon.addAttribute("class", theme.getStyleModule().icon((String) vars.get("icon")));
        if(__.isset(vars.get("color"))) icon.addStyle("color", (String) vars.get("color"));
        if(__.isset(vars.get("size"))) icon.addStyle("font-size", String.valueOf(vars.get("size")) + "px");
        applyListeners("icon", icon);
        return icon;
    }

    @Override
    protected String name() {
        return "__icon__";
    }

    @Override
    protected boolean acceptsIterator() {
        return false;
    }

    @Override
    protected boolean acceptsBuilder() {
        return false;
    }

    @Override
    protected boolean requiresBuilder() {
        return false;
    }

    @Override
    protected boolean isExtensible() {
        return false;
    }

    @Override
    protected boolean hasMultipleSubtypes() {
        return false;
    }

    @Override
    protected boolean acceptsChild() {
        return false;
    }

    @Override
    protected void setupVariables(HashMap<String, Object> vars) {
        vars.put("icon", null);
        vars.put("size", null);
        vars.put("color", null);
    }

    @Override
    protected void subtypes(ArrayList<AloftElementSubtype> subtypes) {

    }

}
