package com.inteliense.aloft.compiler.lang.keywords.elements.types;

import com.inteliense.aloft.compiler.lang.keywords.elements.base.AloftBuilder;
import com.inteliense.aloft.compiler.lang.keywords.elements.base.AloftElement;
import com.inteliense.aloft.compiler.lang.lib.StyleModule;
import com.inteliense.aloft.server.html.elements.HtmlElement;
import com.inteliense.aloft.server.html.elements.js.JavaScriptObject;
import com.inteliense.aloft.server.html.elements.types.Content;
import com.inteliense.aloft.utils.encryption.A32;
import com.inteliense.aloft.utils.encryption.Rand;
import com.inteliense.aloft.utils.encryption.SHA;

import java.util.ArrayList;
import java.util.HashMap;

public class TextAloftElement extends AloftElement {

    private ArrayList<TextAloftElement> textSpans = new ArrayList<>();

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
        textSpans.add(element);
    }

    @Override
    public HtmlElement html(StyleModule module) {
        HtmlElement root = createElement("p");
        root.addAttribute("data-aid", A32.casified(SHA.getSha1(getName())));
        Content rootContent = new Content(var("text"));
        root.addChild(rootContent);
        for(int i=0; i<textSpans.size(); i++) {
            HtmlElement element = textSpans.get(i).html(module);
            root.addChild(element);
        }
        for(int i=0; i< listeners.size(); i++) {
            root.addChild(listeners.get(i).getObject().getJs());
        }
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
    protected void setupVariables(HashMap<String, String> vars) {
        vars.put("text", null);
    }

}
