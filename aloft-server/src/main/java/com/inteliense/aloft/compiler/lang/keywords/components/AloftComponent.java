package com.inteliense.aloft.compiler.lang.keywords.components;

import com.inteliense.aloft.compiler.lang.base.BuildsCss;
import com.inteliense.aloft.compiler.lang.base.BuildsHtml;
import com.inteliense.aloft.compiler.lang.keywords.listeners.base.AloftListener;
import com.inteliense.aloft.compiler.lang.keywords.style.base.*;
import com.inteliense.aloft.compiler.lang.types.base.T;
import com.inteliense.aloft.server.html.elements.HtmlElement;
import com.inteliense.aloft.server.http.supporting.VariableNode;
import com.inteliense.aloft.server.http.supporting.VariableTree;
import com.inteliense.aloft.utils.encryption.A32;
import com.inteliense.aloft.utils.encryption.Rand;
import com.inteliense.aloft.utils.encryption.SHA;
import com.inteliense.aloft.utils.global.__;

import java.util.ArrayList;

public class AloftComponent implements BuildsHtml {

    private ArrayList<AloftComponent> children = new ArrayList<>();
    private int currentIndex = 0;
    private String name = null;
    private VariableTree state = new VariableTree();
    protected String veryUniqueId = null;

    protected ArrayList<AloftStyleClass> classes = new ArrayList<>();
    protected AloftStyle style = new AloftStyle();
    protected ArrayList<AloftListener> listeners = new ArrayList<>();

    public AloftComponent() {
        this.name = getName();
        veryUniqueId = createId(String.valueOf(System.currentTimeMillis()));
    }

    public AloftComponent(String name) {
        this.name = name;
        veryUniqueId = createId(String.valueOf(System.currentTimeMillis()));
    }

    public void addChild(AloftComponent component) {
//        VariableTree tree = this.getState().getByPath(component.getName()).getValue();
//        component.setState(tree);
        this.children.add(component);
        AloftStyle childStyle = component.getStyle();
//        int numDuplicates = AloftStyleClassBuilder.countDuplicates()
    }

    public void setState(VariableTree tree) {
        if(!__.isset(tree)) return;
        this.state = tree;
    }

    public AloftStyleCss appendCss(AloftStyleCss css) {
        for(int i=0; i< children.size(); i++) {
            AloftComponent component = children.get(i);
            ArrayList<AloftStyleClass> classes = component.getClasses();
            for(int x=0; x<classes.size(); x++) css.append(classes.get(x));
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

    public void setClasses(ArrayList<AloftStyleClass> classes) {
        this.classes = classes;
    }

    public ArrayList<AloftStyleClass> getClasses() {
        return this.classes;
    }

    public void addStyle(String property, String value) {
        this.style.addStyle(new AloftStylePair(property, value));
    }

    public AloftStyle getStyle() {
        return this.style;
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

    public String getName() {
        return this.name;
    }

    protected String createId(String seed) {
        String v = this.getClass().getName() + "_" + this.name + "_" + seed + "_" + __.hex(Rand.secure(32));
        String hash = SHA.getSha1(v);
        return A32.casified(hash);
    }

    @Override
    public HtmlElement html() {
        if(this.children.size() == 1) {
            HtmlElement element = children.get(0).html();
            element.addAttribute("data-aid", A32.casified(SHA.getSha1(getName())));
            return children.get(0).html();
        } else if(this.children.size() > 1) {
            HtmlElement container = new HtmlElement() {
                @Override
                protected String getKey() {
                    return "div";
                }
            };
            for(int i=0; i< children.size(); i++) {
                HtmlElement element = children.get(i).html();
                element.addAttribute("data-aid", A32.casified(SHA.getSha1(getName())));
                container.addChild(element);
            }
            container.addChild(listeners.get(0).getObject().getJs());
            return container;
        }
        return null;
    }

    public void addListener(AloftListener listener) {
        this.listeners.add(listener);
    }

}
