package com.inteliense.aloft.compiler.lang.keywords.elements.types;

import com.inteliense.aloft.compiler.lang.base.ElementMapper;
import com.inteliense.aloft.compiler.lang.keywords.AloftTheme;
import com.inteliense.aloft.compiler.lang.keywords.elements.base.AloftElement;
import com.inteliense.aloft.compiler.lang.keywords.elements.base.AloftElementSubtype;
import com.inteliense.aloft.server.html.elements.HtmlElement;
import com.inteliense.aloft.server.html.elements.types.Content;
import com.inteliense.aloft.utils.global.__;

import java.util.ArrayList;
import java.util.HashMap;

public class InputAloftElement extends AloftElement {

    public InputAloftElement() { super(); init(); }

    public InputAloftElement(String subtype) {
        super(subtype);
        init();
    }

    public void setPlaceholder(String placeholder) {
        this.vars.replace("placeholder", placeholder);
    }

    public void setLabel(String label) {
        this.vars.replace("label", label);
    }

    public void setHelpText(String helpText) {
        this.vars.replace("help-text", helpText);
    }

    @Override
    protected void subtypes(ArrayList<AloftElementSubtype> subtypes) {
        this.subtypes.add(new AloftElementSubtype(constructSubtype("__text_input__")) {
            @Override
            public HtmlElement create(AloftTheme theme, ElementMapper mapper) {
                HtmlElement root = createElement("div");
                HtmlElement group = createElement("div");
                HtmlElement below = createElement("span");

                if(__.isset(var("label"))) {
                    HtmlElement label = createElement("span");
                    Content labelTxt = new Content(var("label"));
                    label.addChild(labelTxt);
                    applyStyle("label", InputAloftElement.class, label, theme);
                    root.addChild(label);
                }

                if(__.isset(var("prepend-text"))) {
                    HtmlElement prepend = createElement("div");
                    HtmlElement prependChild = createElement("span");
                    Content prependText = new Content(var("prepend-text"));
                    prependChild.addChild(prependText);
                    applyStyle("prepend-text", InputAloftElement.class, prependChild, theme);
                    prepend.addChild(prependChild);
                    applyStyle("prepend-container", InputAloftElement.class, prepend, theme);
                    group.addChild(prepend);
                }

                HtmlElement input = createElement("input");
                applyStyle("text-input", InputAloftElement.class, input, theme);
                if(__.isset(var("placeholder"))) input.addAttribute("placeholder", var("placeholder"));
                applyListeners(input);
                group.addChild(input);

                if(__.isset(var("help-text"))) {
                    Content helpTxt = new Content(var("help-text"));
                    below.addChild(helpTxt);
                }

                applyStyle("help-text", InputAloftElement.class, below, theme);
                group.addChild(below);
                applyStyle("text-group", InputAloftElement.class, group, theme);
                root.addChild(group);
                applyStyle("root", InputAloftElement.class, root, theme);
                return root;
            }
            @Override
            public String getName() {
                return "__text_input__";
            }
        });
        this.subtypes.add(new AloftElementSubtype(constructSubtype("__textarea_input__")) {
            @Override
            public HtmlElement create(AloftTheme theme, ElementMapper mapper) {
                HtmlElement root = createElement("div");
                HtmlElement group = createElement("div");
                HtmlElement below = createElement("span");

                if(__.isset(var("label"))) {
                    HtmlElement label = createElement("span");
                    Content labelTxt = new Content(var("label"));
                    label.addChild(labelTxt);
                    applyStyle("label", InputAloftElement.class, label, theme);
                    root.addChild(label);
                }

                if(__.isset(var("prepend-text"))) {
                    HtmlElement prepend = createElement("div");
                    HtmlElement prependChild = createElement("span");
                    Content prependText = new Content(var("prepend-text"));
                    prependChild.addChild(prependText);
                    applyStyle("prepend-text", InputAloftElement.class, prependChild, theme);
                    prepend.addChild(prependChild);
                    applyStyle("prepend-container", InputAloftElement.class, prepend, theme);
                    group.addChild(prepend);
                }

                HtmlElement input = createElement("input");
                applyStyle("text-input", InputAloftElement.class, input, theme);
                if(__.isset(var("placeholder"))) input.addAttribute("placeholder", var("placeholder"));
                applyListeners(input);
                group.addChild(input);

                if(__.isset(var("help-text"))) {
                    Content helpTxt = new Content(var("help-text"));
                    below.addChild(helpTxt);
                }

                applyStyle("help-text", InputAloftElement.class, below, theme);
                group.addChild(below);
                applyStyle("text-group", InputAloftElement.class, group, theme);
                root.addChild(group);
                applyStyle("root", InputAloftElement.class, root, theme);
                return root;
            }
            @Override
            public String getName() {
                return "__text_input__";
            }
        });
    }

    @Override
    protected String name() {
        return "__input__";
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
        return true;
    }

    @Override
    protected boolean acceptsChild() {
        return false;
    }

    @Override
    protected void setupVariables(HashMap<String, Object> vars) {
        vars.put("placeholder", null);
        vars.put("label", null);
        vars.put("prepend-text", null);
        vars.put("help-text", null);
        vars.put("icon", null);
        vars.put("placement", null);

        vars.put("color", null);
        addOverride("color", "background-color");

        vars.put("pulse-shadow", null);
        vars.put("pulse-shadow-active", null);
        addOverride("pulse-shadow", "box-shadow", "after");
        addOverride("pulse-shadow-active", "box-shadow", "active", "after");

        vars.put("ring-color", null);
        addOverride("ring-color", "box-shadow", "hover");
        addOverride("ring-color", "box-shadow", "focus");

        vars.put("border-color", null);
        addOverride("border-color", "border");

        vars.put("active-color", null);
        addOverride("active-color", "background-color", "focus");
    }

}
