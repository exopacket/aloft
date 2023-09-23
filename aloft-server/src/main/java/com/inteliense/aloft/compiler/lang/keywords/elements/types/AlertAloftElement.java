package com.inteliense.aloft.compiler.lang.keywords.elements.types;

import com.inteliense.aloft.compiler.lang.base.BuildsHtml;
import com.inteliense.aloft.compiler.lang.keywords.components.AloftComponent;
import com.inteliense.aloft.compiler.lang.keywords.elements.base.AloftBuilder;
import com.inteliense.aloft.compiler.lang.keywords.elements.base.AloftElement;
import com.inteliense.aloft.compiler.lang.keywords.elements.base.AloftElementSubtype;
import com.inteliense.aloft.compiler.lang.lib.StyleModule;
import com.inteliense.aloft.server.html.elements.HtmlElement;

import java.util.ArrayList;
import java.util.HashMap;

public class AlertAloftElement extends AloftElement {

    public AlertAloftElement() { super(); init();  }

    @Override
    protected void registerBuilder(AloftBuilder builder) {
        builder.addRequirement("title", TextAloftElement.class, "text");
        builder.addRequirement("body", TextAloftElement.class, "text");
        builder.addArrayRequirement("actions", ButtonAloftElement.class);
    }

    @Override
    protected void registerSubtypes(ArrayList<AloftElementSubtype> subtypes) {
    }

    @Override
    public HtmlElement html(StyleModule module) {
        return builder.get("title").html(module);
    }

    @Override
    protected String name() {
        return "__alert__";
    }

    @Override
    protected boolean acceptsIterator() {
        return false;
    }

    @Override
    protected boolean acceptsBuilder() {
        return true;
    }

    @Override
    protected boolean requiresBuilder() {
        return true;
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
