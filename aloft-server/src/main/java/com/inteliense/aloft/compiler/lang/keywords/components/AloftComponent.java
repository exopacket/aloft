package com.inteliense.aloft.compiler.lang.keywords.components;

import com.inteliense.aloft.compiler.lang.base.BuildsAppJavascript;
import com.inteliense.aloft.compiler.lang.base.BuildsHtml;
import com.inteliense.aloft.compiler.lang.base.ElementMapper;
import com.inteliense.aloft.compiler.lang.keywords.AloftTheme;
import com.inteliense.aloft.compiler.lang.keywords.listeners.base.AloftListener;
import com.inteliense.aloft.compiler.lang.keywords.style.base.*;
import com.inteliense.aloft.compiler.lang.types.base.T;
import com.inteliense.aloft.server.html.elements.HtmlElement;
import com.inteliense.aloft.server.html.elements.js.AppJavaScript;
import com.inteliense.aloft.server.html.elements.js.JavaScript;
import com.inteliense.aloft.server.html.elements.js.JavaScriptBuilder;
import com.inteliense.aloft.server.html.elements.js.JavaScriptWriterType;
import com.inteliense.aloft.server.html.elements.js.types.ElementRef;
import com.inteliense.aloft.server.http.supporting.VariableNode;
import com.inteliense.aloft.server.http.supporting.VariableTree;
import com.inteliense.aloft.utils.encryption.A32;
import com.inteliense.aloft.utils.encryption.Rand;
import com.inteliense.aloft.utils.encryption.SHA;
import com.inteliense.aloft.utils.global.__;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

public class AloftComponent implements BuildsHtml, BuildsAppJavascript {

    protected ArrayList<AloftComponent> children = new ArrayList<>();
    private int currentIndex = 0;
    private String name = null;
    private VariableTree state = new VariableTree();
    protected String veryUniqueId = null;
    protected String uniqueId = "";

    protected ArrayList<String> moduleSubclasses = new ArrayList<>();
    protected ArrayList<AloftStyleClass> classes = new ArrayList<>();
    protected AloftStyle style = new AloftStyle();
    protected ArrayList<AloftListener> listeners = new ArrayList<>();
    public HashMap<String, Object> vars = new HashMap<>();
    protected JavaScriptBuilder jsBuilder = new JavaScriptBuilder();
    protected JavaScript scripts = null;

    public AloftComponent() {
        this.name = getName();
        setIds("__root__");
    }

    public void addChild(AloftComponent component) {
        this.children.add(component);
        setIds();
    }

    public void setIds() {
        for(int i=0; i< children.size(); i++) children.get(i).setIds(this.uniqueId + "_" + i);
    }

    public void setIds(String parent) {
        this.uniqueId = A32.casified(SHA.getHmac256(parent, getName()));
        for(int i=0; i< children.size(); i++) children.get(i).setIds(this.uniqueId + "_" + i);
    }

    public void setState(VariableTree tree) {
        if(!__.isset(tree)) return;
        this.state = tree;
    }

    public AloftStyleCss appendCss(AloftStyleCss css) {
        ArrayList<AloftStyleClass> c = getAloftClasses();
        for(int x=0; x<c.size(); x++) {
            css.append(c.get(x));
        }
        for(int i=0; i< children.size(); i++) {
            AloftComponent component = children.get(i);
            css = component.appendCss(css);
        }
        return css;
    }

    public void appendState(String key, T t, Object v) {
        state.addNode(key, t, v);
    }

    public VariableTree getState() {
        return state;
    }

    public void setClasses(ArrayList<AloftStyleClass> classes, AloftTheme theme) {
//        applyOverrides();
        this.classes = classes;
        for(int i=0; i< children.size(); i++) {
//            children.get(i).applyOverrides();
            children.get(i).setClasses(theme.mergeByHash(children.get(i).getStyle().getHashes()), theme);
        }
    }

    public void applyOverrides() {  }

    public ArrayList<AloftStyleClass> getAloftClasses() {
        return this.classes;
    }

    public void addStyle(String property, String value) {
        this.style.addStyle(new AloftStylePair(property, value));
    }

    public void addStyle(String property, String value, boolean important) {
        AloftStylePair style = new AloftStylePair(property, value, important);
        this.style.addStyle(style);
    }

    public void addStyle(String property, String value, String[] psuedo, boolean important) {
        StringBuilder builder = new StringBuilder();
        for(int i=0; i< psuedo.length; i++) builder.append(":").append(psuedo[i]);
        AloftStylePair style = new AloftStylePair(property, value, builder.toString(), important);
        this.style.addStyle(style);
    }

    public void addStyleWithinElement(String property, String value, AloftTheme theme) {
        this.style.addStyle(new AloftStylePair(property, value));
    }

    public AloftStyle getStyle() {
        return this.style;
    }

    public String getId() {
        return this.uniqueId;
    }

    protected String[] getModuleSubclasses() {
        String[] arr = new String[moduleSubclasses.size()];
        moduleSubclasses.toArray(arr);
        return arr;
    }

    public void appendState(String path, String key, T t, Object v) {
        VariableNode node = state.getByPath(path + "." + key);
        boolean create = false;
        if(!__.isset(node)) {
            node = state.getByPath(path);
            if(!__.isset(node)) return;
            create = true;
        }
        if(node.getValue().getClass() == VariableTree.class && !create) {
            ((VariableTree) node.getValue()).addNode(key, t, v);
        } else {
            node.setValue(v);
        }
    }

    public AloftComponent next() {
        if(currentIndex == children.size()) return null;
        AloftComponent component = children.get(currentIndex);
        currentIndex++;
        return component;
    }

    public void addSubclass(String key) {
        this.moduleSubclasses.add(key);
    }

    public String getName() {
        return this.name;
    }

    protected String createId(String seed) {
        String v = this.getClass().getName() + "_" + this.name + "_" + seed + "_" + __.hex(Rand.secure(32));
        String hash = SHA.getSha1(v);
        return A32.casified(hash);
    }

    @Override
    public HtmlElement html(AloftTheme theme, ElementMapper mapper) {
        HtmlElement root = create(theme, mapper);
        System.out.println(this.uniqueId);
        root.createUniqueId(this.uniqueId, true);
        return root;
    }

    @Override
    public HtmlElement create(AloftTheme theme, ElementMapper mapper) {
        if(this.children.size() == 1) {
            HtmlElement element = children.get(0).html(theme, mapper);
            element.addAttribute("data-aid", A32.casified(SHA.getSha1(getName())));
            return element;
        } else if(this.children.size() > 1) {
            HtmlElement container = new HtmlElement(this.uniqueId) {
                @Override
                protected String getKey() {
                    return "div";
                }
            };
            for(int i=0; i< children.size(); i++) {
                HtmlElement element = children.get(i).html(theme, mapper);
                element.addAttribute("data-aid", A32.casified(SHA.getSha1(getName())));
                container.addChild(element);
            }
            container.addChild(listeners.get(0).getObject().getJs());
            return container;
        }
        return null;
    }

    public ElementRef ref() {
        ElementRef ref = new ElementRef(A32.casified(SHA.getSha1(this.uniqueId)));
        ElementRef.Selector selector = ElementRef.Selector.byId(this.uniqueId);
        ref.addRef(selector, ElementRef.Type.SINGLE);
        return ref;
    }

    public ElementRef ref(String override) {
        ElementRef ref = new ElementRef(override);
        ElementRef.Selector selector = ElementRef.Selector.byId(this.uniqueId);
        ref.addRef(selector, ElementRef.Type.SINGLE);
        return ref;
    }

    public void addListener(AloftListener listener) {
        listener.setRef("ref", ref());
        this.jsBuilder.addObject(listener.getObject());
        this.listeners.add(listener);
    }

    @Override
    public void javascript(AtomicReference<AppJavaScript> js) {
        if(this.jsBuilder.empty()) {
            for(int i=0; i<this.children.size(); i++) this.children.get(i).javascript(js);
            return;
        }
        AppJavaScript appJs = js.get();
        this.scripts = appJs.apply(new JavaScript(JavaScriptWriterType.ELEMENT, this.jsBuilder));
        js.set(appJs);
        for(int i=0; i<this.children.size(); i++) this.children.get(i).javascript(js);
    }
}
