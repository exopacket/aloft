package org.extendedweb.aloft.lib.lang.structure.elements.types;

import org.extendedweb.aloft.lib.lang.base.ElementMapper;
import org.extendedweb.aloft.lib.lang.structure.AloftTheme;
import org.extendedweb.aloft.lib.lang.structure.components.AloftObjectProperties;
import org.extendedweb.aloft.lib.lang.structure.elements.base.AloftElement;
import org.extendedweb.aloft.lib.lang.structure.elements.base.AloftElementSubtype;
import org.extendedweb.aloft.lib.lang.structure.elements.base.TextAlign;
import org.extendedweb.aloft.lib.html.elements.HtmlElement;
import org.extendedweb.aloft.lib.lang.types.base.T;

import java.util.ArrayList;

public class CenteredAloftElement extends AloftElement {

    public CenteredAloftElement() { super(); init(); }

    @Override
    public HtmlElement create(AloftTheme theme, ElementMapper mapper) {
        HtmlElement root = createElement("div");
        HtmlElement container = createElement("div");
        container.addChild(var("child"));
        addAll(container, theme, mapper);
        root.addChild(container);
        container.addStyle("text-align", "center");
        applyStyle("root", CenteredAloftElement.class, root, theme);
        applyStyle("child", CenteredAloftElement.class, container, theme);
        return root;
    }

    @Override
    protected String name() {
        return "__centered__";
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
    protected void setupProperties(AloftObjectProperties vars) {

    }

    @Override
    protected void subtypes(ArrayList<AloftElementSubtype> subtypes) { }

    @Override
    public AloftObjectProperties getProperties() {
        return properties();
    }

    public static AloftObjectProperties properties() {
        AloftObjectProperties props = new AloftObjectProperties();
        props.put("child", T.child(), true);
        return props;
    }

}
