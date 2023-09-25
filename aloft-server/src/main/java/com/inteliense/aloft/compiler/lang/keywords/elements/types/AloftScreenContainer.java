package com.inteliense.aloft.compiler.lang.keywords.elements.types;

import com.inteliense.aloft.compiler.lang.keywords.components.AloftComponent;
import com.inteliense.aloft.compiler.lang.keywords.elements.base.AloftElement;
import com.inteliense.aloft.compiler.lang.keywords.elements.base.AloftElementSubtype;
import com.inteliense.aloft.compiler.lang.keywords.listeners.base.AloftListener;
import com.inteliense.aloft.compiler.lang.lib.StyleModule;
import com.inteliense.aloft.server.html.elements.HtmlElement;
import com.inteliense.aloft.server.html.elements.types.Content;

import java.util.ArrayList;
import java.util.HashMap;

public class AloftScreenContainer extends AloftElement {

    public AloftScreenContainer() {
        super();
        init();
    }

    @Override
    public HtmlElement html(StyleModule styleModule) {
        HtmlElement root = createElement("div");
        root.addAttribute("style", "width:100vw; height: 100vh; background-color: #e8f0fc;");
        for(int i=0;i<children.size(); i++) {
            root.addChild(children.get(i).html(styleModule));
        }
        applyStyle(root);
        return root;
    }

    @Override
    protected String name() {
        return "__root__";
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

    }

    @Override
    protected void subtypes(ArrayList<AloftElementSubtype> subtypes) {

    }

}
