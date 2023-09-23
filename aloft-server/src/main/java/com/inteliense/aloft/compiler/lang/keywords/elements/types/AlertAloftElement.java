package com.inteliense.aloft.compiler.lang.keywords.elements.types;

import com.inteliense.aloft.compiler.lang.base.BuildsHtml;
import com.inteliense.aloft.compiler.lang.keywords.components.AloftComponent;
import com.inteliense.aloft.compiler.lang.keywords.elements.base.AloftBuilder;
import com.inteliense.aloft.compiler.lang.keywords.elements.base.AloftElement;
import com.inteliense.aloft.compiler.lang.keywords.elements.base.AloftElementSubtype;
import com.inteliense.aloft.compiler.lang.lib.ModuleElement;
import com.inteliense.aloft.compiler.lang.lib.StyleModule;
import com.inteliense.aloft.server.html.elements.HtmlElement;

import java.util.ArrayList;
import java.util.HashMap;

public class AlertAloftElement extends AloftElement {

    public AlertAloftElement() { super(); init();  }

    @Override
    public HtmlElement html(StyleModule module) {
        ModuleElement m = module.get(this.getClass());
        HtmlElement root = createElement("div", m.fromKey("root"));
        addVar("modal-id", root.getId());
        HtmlElement dialog = createElement("div", m.fromKey("dialog"));
        root.addChild(dialog);
        HtmlElement content = createElement("div", m.fromKey("content"));
        dialog.addChild(content);
        HtmlElement header = createElement("div", m.fromKey("header"));
//        HtmlElement title = createElement("h5", m.fromKey("title"));
        HtmlElement title = builder.get("title").html(module);
        header.addChild(title);
        content.addChild(header);
        return root;
    }

    @Override
    protected void registerBuilder(AloftBuilder builder) {
        builder.addRequirement("title", TextAloftElement.class, "text");
        builder.addRequirement("body", TextAloftElement.class, "text");
        builder.addArrayRequirement("actions", ButtonAloftElement.class);
    }

    @Override
    protected void registerSubtypes(ArrayList<AloftElementSubtype> subtypes) { }

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
        vars.put("modal-id", null);
    }

}
