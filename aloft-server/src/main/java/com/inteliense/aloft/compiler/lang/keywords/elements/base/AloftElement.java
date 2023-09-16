package com.inteliense.aloft.compiler.lang.keywords.elements.base;

import com.inteliense.aloft.compiler.lang.base.BuildsHtml;
import com.inteliense.aloft.compiler.lang.keywords.listeners.base.AloftListener;
import com.inteliense.aloft.server.html.elements.HtmlElement;
import com.inteliense.aloft.utils.encryption.Rand;
import com.inteliense.aloft.utils.encryption.SHA;
import com.inteliense.aloft.utils.global.__;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class AloftElement implements BuildsHtml {

    protected String friendlyId = null;
    protected String uniqueId = null;
    protected String name = null;

    protected ArrayList<AloftElement> children = new ArrayList<>();

    protected boolean acceptsIterator = false;
    protected AloftIterator iterator;

    protected boolean acceptsBuilder = false;
    protected boolean requiresBuilder = false;
    protected AloftBuilder builder = null;

    protected boolean isExtensible = false;
    protected ArrayList<AloftElementExtension> extensions;

    protected boolean hasMultipleSubtypes;
    protected ArrayList<AloftElementSubtype> subtypes;

    protected void init() {
        uniqueId = (uniqueId == null) ? createId(String.valueOf(System.currentTimeMillis())) : uniqueId;
        refresh();
    }

    protected abstract String name();
    protected abstract boolean acceptsIterator();
    protected abstract boolean acceptsBuilder();
    protected abstract boolean requiresBuilder();
    protected abstract boolean isExtensible();
    protected abstract boolean hasMultipleSubtypes();
    protected abstract boolean acceptsChild();

    protected abstract AloftListener[] listeners();

    protected String id() {
        return this.friendlyId == null ? this.uniqueId : this.friendlyId;
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

    private String createId(String seed) {
        String v = this.getClass().getName() + "_" + this.name + "_" + seed + "_" + __.hex(Rand.secure(32));
        String hash = SHA.getSha1(v);
        return Rand.caseify(hash);
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

}
