package org.extendedweb.aloft.lib.lang.structure.elements.types;

import org.extendedweb.aloft.lib.lang.base.ElementMapper;
import org.extendedweb.aloft.lib.lang.structure.AloftTheme;
import org.extendedweb.aloft.lib.lang.structure.elements.base.AloftElement;
import org.extendedweb.aloft.lib.lang.structure.elements.base.AloftElementSubtype;
import org.extendedweb.aloft.lib.html.elements.HtmlElement;
import org.extendedweb.aloft.lib.html.elements.types.Content;

import java.util.ArrayList;
import java.util.HashMap;

public class TextAloftElement extends AloftElement {

    public TextAloftElement() { super(); init(); }

    public TextAloftElement(String text) {
        super();
        init();
        vars.replace("text", text);
    }

    public TextAloftElement(String text, String friendlyId) {
        super();
        this.friendlyId = friendlyId;
        init();
        vars.replace("text", text);
    }

    public TextAloftElement(String text, String friendlyId, String uniqueId) {
        super();
        this.friendlyId = friendlyId;
        this.veryUniqueId = uniqueId;
        init();
        vars.replace("text", text);
    }

    public void addSpan(TextAloftElement element) {
        addChild(element);
    }

    @Override
    public HtmlElement create(AloftTheme theme, ElementMapper mapper) {
        HtmlElement root = createElement("p", this.uniqueId, this.getName());
        Content rootContent = new Content(var("text"));
        root.addChild(rootContent);
        this.addAll(root, theme, mapper);
        this.applyStyle(root, theme);
        this.applyListeners("text", root);
        return root;
    }

    @Override
    protected String name() {
        return "__text__";
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
        return true;
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
        vars.put("text", null);
    }

    @Override
    protected void subtypes(ArrayList<AloftElementSubtype> subtypes) {

    }

}