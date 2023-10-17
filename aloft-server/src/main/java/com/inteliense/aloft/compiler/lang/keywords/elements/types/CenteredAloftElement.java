package com.inteliense.aloft.compiler.lang.keywords.elements.types;

import com.inteliense.aloft.compiler.lang.base.ElementMapper;
import com.inteliense.aloft.compiler.lang.keywords.AloftTheme;
import com.inteliense.aloft.compiler.lang.keywords.elements.base.AloftElement;
import com.inteliense.aloft.compiler.lang.keywords.elements.base.AloftElementSubtype;
import com.inteliense.aloft.compiler.lang.keywords.elements.base.TextAlign;
import com.inteliense.aloft.server.html.elements.HtmlElement;

import java.util.ArrayList;
import java.util.HashMap;

public class CenteredAloftElement extends AloftElement {

    public CenteredAloftElement() { super(); init(); }

    public void setTextAlign(TextAlign alignment) { this.vars.replace("text-align", alignment); }

    @Override
    public HtmlElement create(AloftTheme theme, ElementMapper mapper) {
        HtmlElement root = createElement("div");
        HtmlElement child = createElement("div");
        addAll(child, theme, mapper);
        root.addChild(child);
        TextAlign alignment = (TextAlign) this.vars.get("text-align");
        if(alignment == TextAlign.CENTER) child.addStyle("text-align", "center");
        if(alignment == TextAlign.LEFT) child.addStyle("text-align", "left");
        if(alignment == TextAlign.RIGHT) child.addStyle("text-align", "right");
        applyStyle("root", CenteredAloftElement.class, root, theme);
        applyStyle("child", CenteredAloftElement.class, child, theme);
        applyListeners(root);
        return root;
    }

    @Override
    protected String name() {
        return "__centered__";
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
        return true;
    }

    @Override
    protected void setupVariables(HashMap<String, Object> vars) {
        vars.put("text-align", TextAlign.CENTER);
    }

    @Override
    protected void subtypes(ArrayList<AloftElementSubtype> subtypes) { }

}
