package com.inteliense.aloft.compiler.lang.keywords.elements.base;

import com.inteliense.aloft.compiler.lang.base.BuildsHtml;
import com.inteliense.aloft.compiler.lang.keywords.components.AloftComponent;
import com.inteliense.aloft.compiler.lang.keywords.listeners.base.AloftListener;
import com.inteliense.aloft.compiler.lang.lib.ModuleElementAttributes;
import com.inteliense.aloft.compiler.lang.lib.StyleModule;
import com.inteliense.aloft.server.html.elements.HtmlElement;
import com.inteliense.aloft.utils.global.__;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public abstract class AloftElement extends AloftComponent implements BuildsHtml {

    protected String veryUniqueId = null;
    protected String friendlyId = null;
    protected String name = null;

//    protected ArrayList<AloftElement> children = new ArrayList<>();

    protected boolean acceptsIterator = false;
    protected AloftIterator iterator;

    protected boolean acceptsBuilder = false;
    protected boolean requiresBuilder = false;
    protected AloftBuilder builder = null;

    protected boolean isExtensible = false;
    protected ArrayList<AloftElementExtension> extensions = new ArrayList<>();

    protected boolean hasMultipleSubtypes;
    protected ArrayList<AloftElementSubtype> subtypes = new ArrayList<>();
    protected AloftElementSubtype subtype = null;

    public AloftElement() {
        super();
    }

    public AloftElement(String subtype) {
        super();
        setSubtype(subtype);
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
    protected abstract void setupVariables(HashMap<String, Object> vars);
    protected abstract void subtypes(ArrayList<AloftElementSubtype> subtypes);

    protected String id() {
        return this.uniqueId;
    }

    protected void appendChild(AloftElement child) {
        if(acceptsChild()) addChild(child);
    }

    protected void applyStyle(String key, Class<?> c, HtmlElement element, StyleModule module) {
        module.get(c).fromKey(key).apply(element, this.getModuleSubclasses());
        applyStyle(element);
    }

    protected void applyStyle(HtmlElement element) {
        for(int i=0; i<classes.size(); i++) element.addAttribute("class", classes.get(i).getClassName());
    }

    protected void applyListeners(HtmlElement element) {
        for(int i=0; i< listeners.size(); i++) {
            AloftListener listener = listeners.get(i);
            listener.setRef("ref", ref());
            element.addChild(listener.getObject().getJs());
        }
    }

    private void setupSubtypes() {
        this.hasMultipleSubtypes = hasMultipleSubtypes();
    }

    protected Object[] constructSubtype(String name) {
        return new Object[]{
                name,
                acceptsIterator(),
                acceptsBuilder(),
                requiresBuilder(),
                isExtensible(),
                acceptsChild(),
                this.vars,
                this.moduleSubclasses
        };
    }

    public void setSubtype(String subtype) {
        if(!hasMultipleSubtypes()) return;
        subtypes(this.subtypes);
        for(int i = 0; i< subtypes.size(); i++)
            if(__.same(subtypes.get(i).getName(), subtype)) {
                this.subtype = subtypes.get(i);
                break;
            }
    }

    public void addSubclass(String subclass) {
        this.moduleSubclasses.add(subclass);
    }

    public void addSubclasses(String...classes) {
        this.moduleSubclasses.addAll(Arrays.asList(classes));
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
    protected void setupBuilder() {
        this.requiresBuilder = requiresBuilder();
        this.acceptsBuilder = this.requiresBuilder || acceptsBuilder();
    }

    protected void setupBuilder(AloftBuilder builder) {
        this.requiresBuilder = requiresBuilder();
        this.acceptsBuilder = this.requiresBuilder || acceptsBuilder();
        if(this.requiresBuilder || this.acceptsBuilder) {
            registerBuilder(builder);
            this.builder = builder;
        }
    }

    @Override
    public HtmlElement html(StyleModule module) {
        if(!__.isset(subtype)) return null;
        if(!listeners.isEmpty()) subtype.setListeners(listeners);
        String[] arr = new String[moduleSubclasses.size()];
        this.moduleSubclasses.toArray(arr);
        subtype.addSubclasses(arr);
        return subtype.html(module);
    }

    protected void registerBuilder(AloftBuilder builder) { }

    protected void registerSubtypes(ArrayList<AloftElementSubtype> subtypes) { }

    protected HtmlElement createElement(String key, ModuleElementAttributes attributes) {
        HtmlElement element = createElement(key, createId(String.valueOf(System.currentTimeMillis())));
        attributes.apply(element);
        return element;
    }

    protected HtmlElement createElement(String key) {
        return createElement(key, this.uniqueId);
    }

    protected static HtmlElement createElement(String key, String id) {
        return new HtmlElement(id) {
            @Override
            protected String getKey() {
                return key;
            }
        };
    }

    public void addVar(String key, String value) {
        if(vars.containsKey(key)) vars.replace(key, value);
        else vars.put(key, value);
    }

    protected <Any> Any var(String key) {
        return (Any) vars.get(key);
    }

    public void builder(String key, String[]...vars) {
        builder.add(key, vars);
        build();
    }

    protected void build() {
        for(int i=0; i< builder.size(); i++) addChild(builder.get(i));
    }

    public void refresh() {
        setupVariables(this.vars);
        setupBuilder();
        if(this.requiresBuilder || this.acceptsBuilder) setupBuilder(new AloftBuilder());
        setupIterator();
        if(this.requiresBuilder || this.acceptsBuilder) build();
    }

    @Override
    public String getName() {
        return name();
    }

}
