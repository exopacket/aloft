package com.inteliense.aloft.compiler.lang.keywords.elements.types;

import com.inteliense.aloft.compiler.lang.keywords.AloftTheme;
import com.inteliense.aloft.compiler.lang.keywords.elements.base.AloftElement;
import com.inteliense.aloft.compiler.lang.keywords.elements.base.AloftElementSubtype;
import com.inteliense.aloft.compiler.lang.keywords.style.base.AloftStylePair;
import com.inteliense.aloft.server.html.elements.HtmlElement;

import java.util.ArrayList;
import java.util.HashMap;

public class FilledAloftElement extends AloftElement {

    public FilledAloftElement() { super(); init(); }

    public void setScrollbar(boolean x, boolean y) {
        this.vars.replace("scrollbar-x", x);
        this.vars.replace("scrollbar-y", y);
        if(x) addStyle("overflow-x", "scroll");
        if(y) addStyle("overflow-y", "scroll");
    }

    public void useFullSize() {
        this.vars.replace("use-view", false);
        addStyle("width", "100%");
        addStyle("height", "100%");
    }

    public void useViewSize() {
        this.vars.replace("use-view", true);
        addStyle("width", "100vw");
        addStyle("height", "100vh");
    }

    @Override
    public HtmlElement html(AloftTheme theme) {
        HtmlElement root = createElement("div");
        addAll(root, theme);
        applyStyle(root, theme);
        return root;
    }

    @Override
    protected String name() {
        return "__filled__";
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
        vars.put("scrollbar-y", false);
        vars.put("scrollbar-x", false);
        vars.put("use-view", false);
    }

    @Override
    protected void subtypes(ArrayList<AloftElementSubtype> subtypes) {

    }
}
