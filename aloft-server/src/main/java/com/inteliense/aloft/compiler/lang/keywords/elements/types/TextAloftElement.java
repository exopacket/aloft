package com.inteliense.aloft.compiler.lang.keywords.elements.types;

import com.inteliense.aloft.compiler.lang.keywords.elements.base.AloftElement;
import com.inteliense.aloft.compiler.lang.keywords.listeners.base.AloftListener;
import com.inteliense.aloft.server.html.elements.HtmlElement;
import com.inteliense.aloft.server.html.elements.types.Content;

import java.util.ArrayList;

public abstract class TextAloftElement extends AloftElement {

    private ArrayList<TextAloftElement> textSpans = new ArrayList<>();
    private String text = "";

    protected abstract AloftListener[] listeners();

    public TextAloftElement(String text) {
        super();
        this.text = text;
        init();
    }

    public TextAloftElement(String text, String friendlyId) {
        super();
        this.friendlyId = friendlyId;
        this.text = text;
        init();
    }

    public TextAloftElement(String text, String friendlyId, String uniqueId) {
        super();
        this.friendlyId = friendlyId;
        this.uniqueId = uniqueId;
        this.text = text;
        init();
    }

    public void addSpan(TextAloftElement element) {
        textSpans.add(element);
    }

    @Override
    public HtmlElement html() {
        HtmlElement root = createElement("p");
        Content rootContent = new Content(text);
        root.addChild(rootContent);
        for(int i=0; i<textSpans.size(); i++) {
            root.addChild(textSpans.get(i).html());
        }
        return root;
    }

    @Override
    protected String name() {
        return "Text";
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

}
