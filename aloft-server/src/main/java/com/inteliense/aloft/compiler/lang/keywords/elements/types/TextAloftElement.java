package com.inteliense.aloft.compiler.lang.keywords.elements.types;

import com.inteliense.aloft.compiler.lang.keywords.elements.base.AloftElement;
import com.inteliense.aloft.compiler.lang.keywords.elements.base.AloftHtml;
import com.inteliense.aloft.compiler.lang.keywords.elements.base.AloftListener;
import com.inteliense.aloft.compiler.lang.keywords.elements.base.AloftStyle;

public abstract class TextAloftElement extends AloftElement {

    protected abstract String friendlyId();

    protected abstract String uniqueId();

    protected String name() {
        return "Text";
    }

    @Override
    protected boolean acceptsIterator() {
        return true;
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
    protected AloftHtml html() {
        return null;
    }

}
