package com.inteliense.aloft.compiler.lang.keywords.elements.types;

import com.inteliense.aloft.compiler.lang.keywords.elements.base.AloftElement;
import com.inteliense.aloft.server.html.elements.HtmlElement;
import com.inteliense.aloft.server.html.elements.js.JavaScriptObject;
import com.inteliense.aloft.server.html.elements.types.Content;
import com.inteliense.aloft.utils.encryption.Rand;
import com.inteliense.aloft.utils.encryption.SHA;

import java.util.ArrayList;

public class TextAloftElement extends AloftElement {

    private ArrayList<TextAloftElement> textSpans = new ArrayList<>();
    protected String veryUniqueId = null;
    private String text = "";

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
        this.veryUniqueId = uniqueId;
        this.text = text;
        init();
    }

    public void addSpan(TextAloftElement element) {
        textSpans.add(element);
    }

    @Override
    public HtmlElement html() {
        HtmlElement root = createElement("p");
        root.addAttribute("data-aid", Rand.caseify(SHA.getSha1(getName())));
        Content rootContent = new Content(text);
        root.addChild(rootContent);
        for(int i=0; i<textSpans.size(); i++) {
            HtmlElement element = textSpans.get(i).html();
            element.addAttribute("data-aid", Rand.caseify(SHA.getSha1(getName())));
            root.addChild(element);
        }
        root.addChild(listeners.get(0).getObject().getJs());
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

}
