package org.extendedweb.aloft.lib.lang.structure.elements.base;

import org.extendedweb.aloft.lib.lang.base.ElementMapper;
import org.extendedweb.aloft.lib.lang.structure.AloftTheme;
import org.extendedweb.aloft.lib.lang.structure.components.AloftComponent;
import org.extendedweb.aloft.lib.lang.structure.components.AloftObjectProperties;
import org.extendedweb.aloft.lib.lang.structure.components.AloftObjectProperty;
import org.extendedweb.aloft.lib.lang.structure.style.AloftStyleClass;
import org.extendedweb.aloft.lib.ModuleElementAttributes;
import org.extendedweb.aloft.lib.html.elements.HtmlElement;
import org.extendedweb.aloft.lib.lang.types.base.V;
import org.extendedweb.aloft.utils.global.__;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public abstract class AloftElement extends AloftComponent {

    protected String name = null;

//    protected ArrayList<AloftElement> children = new ArrayList<>();

    protected boolean acceptsIterator = false;
    protected AloftIterator iterator;

    protected boolean acceptsBuilder = false;
    protected boolean requiresBuilder = false;
    protected AloftBuilder builder = null;

    protected boolean isExtensible = false;
    protected ArrayList<AloftElementExtension> extensions = new ArrayList<>();
    protected HashMap<String, String> requiredElements = new HashMap<>();

    protected boolean hasMultipleSubtypes;
    protected ArrayList<AloftElementSubtype> subtypes = new ArrayList<>();
    protected AloftElementSubtype subtype = null;

    protected HashMap<String, ArrayList<String[]>> overrides = new HashMap<>();

    public AloftElement() {
        super();
    }

    public AloftElement(String subtype) {
        super();
        setSubtype(subtype);
    }

    public AloftElement(HashMap<String, Object> properties) {
        super(properties);
        this.subtype.resetProperties(properties);
    }

    public AloftElement(HashMap<String, Object> properties, String subtype) {
        super(properties);
        setSubtype(subtype);
        this.subtype.resetProperties(properties);
    }

    protected void init() {
        refresh();
    }

    protected abstract String name();
    protected abstract boolean acceptsIterator();
    protected abstract boolean acceptsBuilder();
    protected abstract boolean requiresBuilder();
    protected abstract boolean isExtensible();
    protected abstract boolean hasMultipleSubtypes();
    protected abstract boolean acceptsChild();
    protected abstract void setupProperties(AloftObjectProperties vars);
    protected abstract void subtypes(ArrayList<AloftElementSubtype> subtypes);

    protected String id() {
        return this.uniqueId;
    }

    protected void appendChild(AloftElement child) {
        if(acceptsChild()) addChild(child);
    }

    protected void applyStyle(String key, Class<?> c, HtmlElement element, AloftTheme theme) {
        if(__.isset(subtype)) subtype.applyStyle(key, c, element, theme);
        theme.getStyleModule().get(c).fromKey(key).apply(element, this.getModuleSubclasses());
        applyStyle(element, theme);
    }


    protected void applyStyle(HtmlElement element, AloftTheme theme) {
//        setClasses(theme.mergeByHash(getStyle().getHashes()), theme);
        for(int i=0; i<classes.size(); i++) element.addAttribute("class", classes.get(i).getTagClassName());
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
                this.moduleSubclasses,
                this.overrides,
                this.style
        };
    }

    public void applyOverrides() {
        try {
            for (String key : overrides.keySet()) {
                for (String[] arr : overrides.get(key)) {
                    String variable = null;
                    String property = arr[0];
                    if(property.contains(":")) {
                        String[] parts = property.split(":");
                        property = parts[0];
                        variable = parts[1];
                    }
                    String value = arr[1];
                    if (!__.isset(value)) value = var(variable);
                    if (!__.isset(value)) continue;
                    String[] psuedo = new String[arr.length - 2];
                    int x = 0;
                    for (int i = 2; i < arr.length; i++) {
                        psuedo[x] = arr[i];
                        x++;
                    }
                    if (psuedo.length == 0) addStyle(property, value, true);
                    else addStyle(property, value, psuedo, true);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void setClasses(ArrayList<AloftStyleClass> classes, AloftTheme theme) {
        this.classes = classes;
        if(__.isset(subtype)) {
            subtype.applyOverrides();
            subtype.setClasses(classes, theme);
            for(int i=0; i< subtype.children.size(); i++) {
                subtype.children.get(i).applyOverrides();
                subtype.children.get(i).setClasses(theme.mergeByHash(subtype.getStyle().getHashes()), theme);
            }
        } else {
            for(int i=0; i< children.size(); i++) {
                children.get(i).applyOverrides();
                children.get(i).setClasses(theme.mergeByHash(children.get(i).getStyle().getHashes()), theme);
            }
        }
    }

    public void setSubtype(String subtype) {
        if(!hasMultipleSubtypes()) return;
        refresh();
        subtypes(this.subtypes);
        for(int i = 0; i< subtypes.size(); i++)
            if(__.same(subtypes.get(i).getName(), subtype)) {
                this.subtype = subtypes.get(i);
                break;
            }
    }

    public void addSubclass(String subclass) {
        this.moduleSubclasses.add(subclass);
        if(__.isset(this.subtype)) this.subtype.addSubclass(subclass);
    }

    protected void addAll(HtmlElement element, AloftTheme theme, ElementMapper mapper) {
        for (AloftComponent child : children) element.addChild(child.html(theme, mapper));
    }

    protected void addProperty(String variable, Object v) {

    }

    protected void addOverride(String variable, String property) {
        if(!overrides.containsKey("\34")) overrides.put("\34", new ArrayList<>());
        ArrayList<String[]> list = overrides.get("\34");
        list.add(new String[]{property + ":" + variable, null});
        overrides.replace("\34", list);
    }

    protected void addOverride(String[] subtypes, String variable, String property) {
        if(!overrides.containsKey("\34")) overrides.put("\34", new ArrayList<>());
        ArrayList<String[]> list = overrides.get("\34");
        list.add(new String[]{property + ":" + variable, null});
        overrides.replace("\34", list);
    }

    protected void addOverride(String[] subtypes, String variable, String property, String...events) {
        String key = "";
        for(int i=0; i<events.length; i++) key += ":" + events[i];
        if(!overrides.containsKey(key)) overrides.put(key, new ArrayList<>());
        ArrayList<String[]> list = overrides.get(key);
        String[] arr = new String[events.length + 2];
        arr[0] = property + ":" + variable;
        arr[1] = null;
        int x = 0;
        for(int i=2; i<arr.length; i++) { arr[i] = events[x]; x++; }
        list.add(arr);
        overrides.replace(key, list);
    }

    protected void addOverride(String variable, String property, String...events) {
        String key = "";
        for(int i=0; i<events.length; i++) key += ":" + events[i];
        if(!overrides.containsKey(key)) overrides.put(key, new ArrayList<>());
        ArrayList<String[]> list = overrides.get(key);
        String[] arr = new String[events.length + 2];
        arr[0] = property + ":" + variable;
        arr[1] = null;
        int x = 0;
        for(int i=2; i<arr.length; i++) { arr[i] = events[x]; x++; }
        list.add(arr);
        overrides.replace(key, list);
    }

    protected void addFlaggedOverride(String flag, String property, String value, String...events) {
        if(!__.isset(var(flag))) return;
        if(!((boolean) var(flag))) return;
        String key = "";
        for(int i=0; i<events.length; i++) key += ":" + events[i];
        if(!overrides.containsKey(flag)) overrides.put(flag, new ArrayList<>());
        ArrayList<String[]> list = overrides.get(flag);
        String[] arr = new String[events.length + 2];
        arr[0] = property;
        arr[1] = value;
        int x = 0;
        for(int i=2; i<arr.length; i++) { arr[i] = events[x]; x++; }
        list.add(arr);
        overrides.replace(flag, list);
    }

    protected void addFlaggedOverride(String flag, String property, String value) {
        if(!__.isset(var(flag))) return;
        if(!((boolean) var(flag))) return;
        if(!overrides.containsKey("\34")) overrides.put("\34", new ArrayList<>());
        ArrayList<String[]> list = overrides.get("\34");
        list.add(new String[]{property, value});
        overrides.replace("\34", list);
    }

    protected void addFlaggedOverride(String[] subtypes, String flag, String property, String value, String...events) {
        if(!__.isset(var(flag))) return;
        if(!((boolean) var(flag))) return;
        String key = "";
        for(int i=0; i<events.length; i++) key += ":" + events[i];
        if(!overrides.containsKey(flag)) overrides.put(flag, new ArrayList<>());
        ArrayList<String[]> list = overrides.get(flag);
        String[] arr = new String[events.length + 2];
        arr[0] = property;
        arr[1] = value;
        int x = 0;
        for(int i=2; i<arr.length; i++) { arr[i] = events[x]; x++; }
        list.add(arr);
        overrides.replace(flag, list);
    }

    protected void addFlaggedOverride(String[] subtypes, String flag, String property, String value) {
        if(!__.isset(var(flag))) return;
        if(!((boolean) var(flag))) return;
        if(!overrides.containsKey("\34")) overrides.put("\34", new ArrayList<>());
        ArrayList<String[]> list = overrides.get("\34");
        list.add(new String[]{property, value});
        overrides.replace("\34", list);
    }

    public void addSubclasses(String...classes) {
        this.moduleSubclasses.addAll(Arrays.asList(classes));
    }

    private void setupExtensions() {
        this.isExtensible = isExtensible();
    }

    public void setupExtensions(AloftElementExtension... extensions) {
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

    protected void requiredElements(HashMap<String, String> requirements) {  }

    @Override
    public HtmlElement html(AloftTheme theme, ElementMapper mapper) {
        if(__.isset(mapper)) mapper.addElementExtensions(this);
        return super.html(theme, mapper);
    }

    @Override
    public HtmlElement create(AloftTheme theme, ElementMapper mapper) {
        if(!__.isset(subtype)) return null;
        if(!listeners.isEmpty()) subtype.setListeners(listeners);
        String[] arr = new String[moduleSubclasses.size()];
        this.moduleSubclasses.toArray(arr);
        subtype.addSubclasses(arr);
//        subtype.applyOverrides();
        return subtype.html(theme, mapper);
    }

    protected void registerBuilder(AloftBuilder builder) { }

    protected void registerSubtypes(ArrayList<AloftElementSubtype> subtypes) { }

    protected HtmlElement createElement(String key, ModuleElementAttributes attributes) {
        HtmlElement element = createElement(key, createId(String.valueOf(System.currentTimeMillis())), this.getName());
        attributes.apply(element);
        return element;
    }

    protected HtmlElement createElement(String key) {
        return createElement(key, this.uniqueId, this.getName());
    }

    protected static HtmlElement createElement(String key, String id, String name) {
        HtmlElement el = new HtmlElement(id) {
            @Override
            public String getKey() {
                return key;
            }
        };
        el.setParentComponent(name);
        return el;
    }

    protected <Any> Any var(String key) {
        AloftObjectProperty property = null;
        if(__.isset(vars.get(getName(), key))) property = vars.get(getName(), key);
        else return null;
        return property.value().get();
    }

    public void builder(String key, String[]...vars) {
        builder.add(key, vars);
        build();
    }

    protected void build() {
        for(int i=0; i< builder.size(); i++) addChild(builder.get(i));
    }

    public void refresh() {
        setupExtensions();
        if(this.isExtensible) assert !this.requiredElements.isEmpty();
        setupProperties(this.vars);
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
