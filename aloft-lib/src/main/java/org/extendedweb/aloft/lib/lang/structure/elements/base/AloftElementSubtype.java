package org.extendedweb.aloft.lib.lang.structure.elements.base;

import org.extendedweb.aloft.lib.lang.structure.components.AloftObjectProperties;
import org.extendedweb.aloft.lib.lang.structure.listeners.base.AloftListener;
import org.extendedweb.aloft.lib.lang.structure.style.AloftStyle;

import java.util.ArrayList;
import java.util.HashMap;

public class AloftElementSubtype extends AloftElement {

    private String _name;
    private boolean _acceptsIterator;
    private boolean _acceptsBuilder;
    private boolean _requiresBuilder;
    private boolean _isExtensible;
    private boolean _acceptsChild;
    private AloftObjectProperties _properties;

    public AloftElementSubtype() { super();}

    @Override
    public AloftObjectProperties getProperties() {
        return _properties;
    }

    public AloftElementSubtype(String name,
                               boolean acceptsIterator,
                               boolean acceptsBuilder,
                               boolean requiresBuilder,
                               boolean isExtensible,
                               boolean acceptsChild,
                               AloftObjectProperties vars,
                               ArrayList<String> subclasses,
                               HashMap<String, ArrayList<String[]>> overrides,
                               AloftStyle style
    ) {
        super();
        this._name = name;
        this._acceptsIterator = acceptsIterator;
        this._acceptsBuilder = acceptsBuilder;
        this._requiresBuilder = requiresBuilder;
        this._isExtensible = isExtensible;
        this._acceptsChild = acceptsChild;
        this.vars = vars;
        this.moduleSubclasses = subclasses;
        this.overrides = overrides;
        this.style = style;
    }

    public AloftElementSubtype(Object[] args) {
        super();
        this._name = (String) args[0];
        this._acceptsIterator = (boolean) args[1];
        this._acceptsBuilder = (boolean) args[2];
        this._requiresBuilder = (boolean) args[3];
        this._isExtensible = (boolean) args[4];
        this._acceptsChild = (boolean) args[5];
        this.vars = (AloftObjectProperties) args[6];
        this.moduleSubclasses = (ArrayList<String>) args[7];
        this.overrides = (HashMap<String, ArrayList<String[]>>) args[8];
        this.style = (AloftStyle) args[9];
    }

    public void setListeners(ArrayList<AloftListener> listeners) {
        this.listeners = listeners;
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
    protected void setupProperties(AloftObjectProperties vars) { }

    @Override
    protected void subtypes(ArrayList<AloftElementSubtype> subtypes) { }

}
