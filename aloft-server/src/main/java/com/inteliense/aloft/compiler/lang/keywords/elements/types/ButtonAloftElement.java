package com.inteliense.aloft.compiler.lang.keywords.elements.types;

import com.inteliense.aloft.compiler.lang.keywords.elements.base.AloftElement;
import com.inteliense.aloft.compiler.lang.keywords.elements.base.AloftElementSubtype;
import com.inteliense.aloft.compiler.lang.keywords.elements.base.AloftIconPlacement;
import com.inteliense.aloft.compiler.lang.lib.StyleModule;
import com.inteliense.aloft.server.html.elements.HtmlElement;
import com.inteliense.aloft.server.html.elements.types.Content;

import java.util.ArrayList;
import java.util.HashMap;

public class ButtonAloftElement extends AloftElement {

    public ButtonAloftElement() { super(); init(); }

    public ButtonAloftElement(String subtype) {
        super(subtype);
        init();
    }

    public void setText(String text) { this.vars.replace("text", text); }

    public void setIcon(IconAloftElement icon, AloftIconPlacement placement) {
        this.vars.replace("icon", icon);
        this.vars.replace("placement", placement);
    }

    @Override
    protected void subtypes(ArrayList<AloftElementSubtype> subtypes) {
        //NAMES ARE IN THIS FORMAT UNTIL FURTHER WORK
        this.subtypes.add(new AloftElementSubtype(constructSubtype("__button_default__")) {
            @Override
            public HtmlElement html(StyleModule module) {
                HtmlElement root = createElement("button");
                Content content = new Content(var("text"));
                root.addChild(content);
                applyStyle("button", ButtonAloftElement.class, root, module);
                applyListeners(root);
                return root;
            }
            @Override
            public String getName() {
                return "__button_default__";
            }
        });
        this.subtypes.add(new AloftElementSubtype(constructSubtype("__button_with_icon__")) {
            @Override
            public HtmlElement html(StyleModule module) {
                return createElement("button");
            }
            @Override
            public String getName() {
                return "__button_with_icon__";
            }
        });
        this.subtypes.add(new AloftElementSubtype(constructSubtype("__icon_button__")) {
            @Override
            public HtmlElement html(StyleModule module) {
                return createElement("button");
            }
            @Override
            public String getName() {
                return "__icon_button__";
            }
        });
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
    protected void setupVariables(HashMap<String, Object> vars) {
        vars.put("text", null);
        vars.put("icon", null);
        vars.put("placement", null);
    }
}
