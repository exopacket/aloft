package com.inteliense.aloft.compiler.lang.keywords.elements.base;

import com.inteliense.aloft.compiler.lang.base.BuildsHtml;
import com.inteliense.aloft.compiler.lang.keywords.components.AloftComponent;
import com.inteliense.aloft.compiler.lang.keywords.listeners.base.AloftListener;
import com.inteliense.aloft.server.html.elements.HtmlElement;
import com.inteliense.aloft.utils.encryption.Rand;
import com.inteliense.aloft.utils.encryption.SHA;
import com.inteliense.aloft.utils.global.__;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class AloftElement extends AloftComponent implements BuildsHtml {

    protected String friendlyId = null;
    protected String name = null;

    protected ArrayList<AloftElement> children = new ArrayList<>();

    protected boolean acceptsIterator = false;
    protected AloftIterator iterator;

    protected boolean acceptsBuilder = false;
    protected boolean requiresBuilder = false;
    protected AloftBuilder builder = null;

    protected boolean isExtensible = false;
    protected ArrayList<AloftElementExtension> extensions = new ArrayList<>();

    protected boolean hasMultipleSubtypes;
    protected ArrayList<AloftElementSubtype> subtypes = new ArrayList<>();

    public AloftElement() {
        super();
    }

    public AloftElement(String name) {
        super(name);
    }

    protected void init() {
        veryUniqueId = (veryUniqueId == null) ? createId(String.valueOf(System.currentTimeMillis())) : veryUniqueId;
        refresh();
    }

    protected abstract String name();
    protected abstract boolean acceptsIterator();
    protected abstract boolean acceptsBuilder();
    protected abstract boolean requiresBuilder();
    protected abstract boolean isExtensible();
    protected abstract boolean hasMultipleSubtypes();
    protected abstract boolean acceptsChild();

    protected String id() {
        return this.friendlyId == null ? this.veryUniqueId : this.friendlyId;
    }

    protected void appendChild(AloftElement child) {
        if(acceptsChild()) this.children.add(child);
    }

    private void setupSubtypes() {
        this.hasMultipleSubtypes = hasMultipleSubtypes();
    }

    protected void setupSubtypes(AloftElementSubtype... subtypes) {
        this.hasMultipleSubtypes = hasMultipleSubtypes();
        if(this.hasMultipleSubtypes) this.subtypes = new ArrayList<>(Arrays.asList(subtypes));
    }

    private void setupExtensions() {
        this.isExtensible = isExtensible();
    }

    protected void setupExtensions(AloftElementExtension... extensions) {
        this.isExtensible = isExtensible();
        if(this.isExtensible) this.extensions = new ArrayList<>(Arrays.asList(extensions));
    }

    private void setupIterator() {
        this.acceptsIterator = acceptsIterator();
    }

    protected void setupIterator(AloftIterator iterator) {
        this.acceptsIterator = acceptsIterator();
        if(this.acceptsIterator) this.iterator = iterator;
    }

    private void setupBuilder() {
        this.requiresBuilder = requiresBuilder();
        this.acceptsBuilder = this.requiresBuilder || acceptsBuilder();
    }

    protected void setupBuilder(AloftBuilder builder) {
        this.requiresBuilder = requiresBuilder();
        this.acceptsBuilder = this.requiresBuilder || acceptsBuilder();
        if(this.requiresBuilder || this.acceptsBuilder) this.builder = builder;
    }

    protected HtmlElement createElement(String key) {
        return createElement(key, id());
    }

    protected HtmlElement createElement(String key, String id) {
        return new HtmlElement(id) {
            @Override
            protected String getKey() {
                return key;
            }
        };
    }

    public void refresh() {
        setupBuilder();
        setupIterator();
    }

    @Override
    public String getName() {
        return name();
    }

}
