package com.inteliense.aloft.compiler.lang.keywords.components;

import com.inteliense.aloft.compiler.lang.base.BuildsHtml;
import com.inteliense.aloft.compiler.lang.keywords.listeners.base.AloftListener;
import com.inteliense.aloft.compiler.lang.types.base.T;
import com.inteliense.aloft.server.html.elements.HtmlElement;
import com.inteliense.aloft.server.http.supporting.VariableNode;
import com.inteliense.aloft.server.http.supporting.VariableTree;
import com.inteliense.aloft.utils.global.__;

import java.util.ArrayList;

public class AloftComponent implements BuildsHtml {

    private ArrayList<AloftComponent> children = new ArrayList<>();
    private int currentIndex = 0;
    private String name = null;
    private VariableTree state = new VariableTree();

    protected ArrayList<AloftListener> listeners = new ArrayList<>();

    public AloftComponent() { this.name = getName(); }

    public AloftComponent(String name) { this.name = name; }

    public void addChild(AloftComponent component) {
//        VariableTree tree = this.getState().getByPath(component.getName()).getValue();
//        component.setState(tree);
        this.children.add(component);
    }

    public void setState(VariableTree tree) {
        if(!__.isset(tree)) return;
        this.state = tree;
    }

    public void appendState(String key, T t, Object v) {
        state.addNode(key, t, v);
    }

    public VariableTree getState() {
        return state;
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

    @Override
    public HtmlElement html() {
        if(this.children.size() == 1) {
            return children.get(0).html();
        } else if(this.children.size() > 1) {
            HtmlElement container = new HtmlElement() {
                @Override
                protected String getKey() {
                    return "div";
                }
            };
            for(int i=0; i< children.size(); i++) {
                container.addChild(children.get(i).html());
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
