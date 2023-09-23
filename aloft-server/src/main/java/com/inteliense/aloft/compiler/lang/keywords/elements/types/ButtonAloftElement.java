package com.inteliense.aloft.compiler.lang.keywords.elements.types;

import com.inteliense.aloft.compiler.lang.keywords.elements.base.AloftElement;
import com.inteliense.aloft.compiler.lang.keywords.elements.base.AloftIconPlacement;
import com.inteliense.aloft.compiler.lang.lib.ModuleElementAttributes;
import com.inteliense.aloft.compiler.lang.lib.StyleModule;
import com.inteliense.aloft.server.html.elements.HtmlElement;
import com.inteliense.aloft.server.html.elements.types.Content;

import java.util.HashMap;

public class ButtonAloftElement extends AloftElement {

    private String text;
    private IconAloftElement icon;
    private AloftIconPlacement iconPlacement;

    public ButtonAloftElement(String text) { super(); this.text = text; init(); }

    public void setText(String text) { this.text = text; }

    public void setIcon(IconAloftElement icon, AloftIconPlacement placement) {
        this.icon = icon;
        this.iconPlacement = placement;
    }

    @Override
    public HtmlElement html(StyleModule module) {
        HtmlElement root = createElement("button");
        Content content = new Content(this.text);
        root.addChild(content);
        module.get(this.getClass()).apply(root, getModuleSubclasses());
        for(int i=0; i< listeners.size(); i++) {
            root.addChild(listeners.get(i).getObject().getJs());
        }
        return root;
    }

    @Override
    protected String name() {
        return "__button__";
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
        return true;
    }

    @Override
    protected boolean acceptsChild() {
        return true;
    }

    @Override
    protected void setupVariables(HashMap<String, String> vars) {

    }
}
