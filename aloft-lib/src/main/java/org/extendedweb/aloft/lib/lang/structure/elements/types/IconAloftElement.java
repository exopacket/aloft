package org.extendedweb.aloft.lib.lang.structure.elements.types;

import org.extendedweb.aloft.lib.lang.base.ElementMapper;
import org.extendedweb.aloft.lib.lang.structure.AloftTheme;
import org.extendedweb.aloft.lib.lang.structure.components.AloftObjectProperties;
import org.extendedweb.aloft.lib.lang.structure.elements.base.AloftElement;
import org.extendedweb.aloft.lib.lang.structure.elements.base.AloftElementSubtype;
import org.extendedweb.aloft.lib.html.elements.HtmlElement;
import org.extendedweb.aloft.utils.global.__;

import java.util.ArrayList;

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
        icon.addAttribute("class", theme.getStyleModule().icon(var("icon")));
        if(__.isset(vars.get("color"))) icon.addStyle("color", var("color"));
        if(__.isset(vars.get("size"))) icon.addStyle("font-size", (var("size") + "px"));
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
    protected void setupProperties(AloftObjectProperties vars) {
        this.vars.put("icon", null);
        this.vars.put("size", null);
        this.vars.put("color", null);
    }

    @Override
    protected void subtypes(ArrayList<AloftElementSubtype> subtypes) {

    }

}
