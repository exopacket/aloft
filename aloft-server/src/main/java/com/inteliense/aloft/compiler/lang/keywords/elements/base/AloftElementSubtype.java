package com.inteliense.aloft.compiler.lang.keywords.elements.base;

import java.util.HashMap;

public class AloftElementSubtype extends AloftElement {

    private String _name;

    public AloftElementSubtype(String name, boolean acceptsIterator, boolean acceptsBuilder) {
        this._name = name;
    }

    @Override
    protected String name() {
        return _name;
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
        return false;
    }

    @Override
    protected void setupVariables(HashMap<String, String> vars) {

    }
}
