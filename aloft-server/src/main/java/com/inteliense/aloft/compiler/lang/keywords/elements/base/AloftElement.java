package com.inteliense.aloft.compiler.lang.keywords.elements.base;

import com.inteliense.aloft.utils.encryption.Rand;
import com.inteliense.aloft.utils.encryption.SHA;
import com.inteliense.aloft.utils.global.__;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class AloftElement {

    protected String friendlyId;
    protected String uniqueId;
    protected String name;

    protected boolean acceptsIterator;
    protected AloftIterator iterator;

    protected boolean requiresBuilder;
    protected AloftBuilder builder = null;

    protected boolean isExtensible;
    protected ArrayList<AloftElementExtension> extensions;

    protected boolean hasMultipleSubtypes;
    protected ArrayList<AloftElementSubtype> subtypes;

    public AloftElement() {
        uniqueId = uniqueId();
        uniqueId = (uniqueId == null) ? createId(String.valueOf(System.currentTimeMillis())) : uniqueId;
        friendlyId = friendlyId() == null ? uniqueId : friendlyId();
        setupBuilder();
        setupIterator();
    }

    protected abstract String friendlyId();
    protected abstract String uniqueId();
    protected abstract String name();
    protected abstract boolean acceptsIterator();
    protected abstract boolean requiresBuilder();
    protected abstract boolean isExtensible();
    protected abstract boolean hasMultipleSubtypes();

    protected abstract AloftStyle style();
    protected abstract AloftListener[] listeners();
    protected abstract AloftHtml html();

    private void setupSubtypes() {
        this.hasMultipleSubtypes = hasMultipleSubtypes();
    }

    protected void setupSubtypes(AloftElementSubtype... subtypes) {
        this.subtypes = new ArrayList<>(Arrays.asList(subtypes));
    }

    private void setupExtensions() {
        this.isExtensible = isExtensible();
    }

    protected void setupExtensions(AloftElementExtension... extensions) {
        this.extensions = new ArrayList<>(Arrays.asList(extensions));
    }

    private void setupIterator() {
        this.acceptsIterator = acceptsIterator();
    }

    protected void setupIterator(AloftIterator iterator) {
        if(this.acceptsIterator) this.iterator = iterator;
    }

    private void setupBuilder() {
        this.requiresBuilder = requiresBuilder();
    }

    protected void setupBuilder(AloftBuilder builder) {
        this.requiresBuilder = requiresBuilder();
        if(this.requiresBuilder) this.builder = builder;
    }

    private String createId(String seed) {
        String v = this.getClass().getName() + "_" + this.name + "_" + seed + "_" + __.hex(Rand.secure(32));
        String hash = SHA.getSha1(v);
        return Rand.caseify(hash);
    }

}
