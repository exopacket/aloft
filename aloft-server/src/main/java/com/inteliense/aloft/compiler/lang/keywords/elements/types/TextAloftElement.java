package com.inteliense.aloft.compiler.lang.keywords.elements.types;

import com.inteliense.aloft.compiler.lang.keywords.elements.base.AloftElement;
import com.inteliense.aloft.compiler.lang.keywords.elements.base.AloftElementHtml;
import com.inteliense.aloft.compiler.lang.keywords.elements.base.AloftListener;
import com.inteliense.aloft.compiler.lang.keywords.elements.base.AloftStyle;

public abstract class TextAloftElement extends AloftElement {

    protected abstract String friendlyId();

    protected abstract String uniqueId();

    protected abstract Object value();

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

    protected abstract AloftStyle style();

    protected abstract AloftListener[] listeners();

    @Override
    protected AloftElementHtml base() {
        AloftElementHtml obj = new AloftElementHtml();
        return obj;
    }

}
