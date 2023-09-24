package com.inteliense.aloft.compiler.lang.keywords.elements.base;

import java.util.ArrayList;
import java.util.HashMap;

public class AloftElementSubtype extends AloftElement {

    private String _name;
    private boolean _acceptsIterator;
    private boolean _acceptsBuilder;
    private boolean _requiresBuilder;
    private boolean _isExtensible;
    private boolean _acceptsChild;
    private ArrayList<String> _subclasses;

    public AloftElementSubtype() { super();}

    public AloftElementSubtype(String name,
                               boolean acceptsIterator,
                               boolean acceptsBuilder,
                               boolean requiresBuilder,
                               boolean isExtensible,
                               boolean acceptsChild,
                               HashMap<String, Object> vars,
                               ArrayList<String> subclasses
    ) {
        super();
        this._name = name;
        this._acceptsIterator = acceptsIterator;
        this._acceptsBuilder = acceptsBuilder;
        this._requiresBuilder = requiresBuilder;
        this._isExtensible = isExtensible;
        this._acceptsChild = acceptsChild;
        this.vars = vars;
        this._subclasses = subclasses;
    }

    public AloftElementSubtype(Object[] args) {
        super();
        this._name = (String) args[0];
        this._acceptsIterator = (boolean) args[1];
        this._acceptsBuilder = (boolean) args[2];
        this._requiresBuilder = (boolean) args[3];
        this._isExtensible = (boolean) args[4];
        this._acceptsChild = (boolean) args[5];
        this.vars = (HashMap<String, Object>) args[6];
        this._subclasses = (ArrayList<String>) args[7];
    }

    @Override
    protected String name() {
        return _name;
    }

    @Override
    protected boolean acceptsIterator() {
        return _acceptsIterator;
    }

    @Override
    protected boolean acceptsBuilder() {
        return _acceptsBuilder;
    }

    @Override
    protected boolean requiresBuilder() {
        return _requiresBuilder;
    }

    @Override
    protected boolean isExtensible() {
        return _isExtensible;
    }

    @Override
    protected boolean hasMultipleSubtypes() {
        return false;
    }

    @Override
    protected boolean acceptsChild() {
        return _acceptsChild;
    }

    @Override
    protected void setupVariables(HashMap<String, Object> vars) { }

    @Override
    protected void subtypes(ArrayList<AloftElementSubtype> subtypes) { }

}
