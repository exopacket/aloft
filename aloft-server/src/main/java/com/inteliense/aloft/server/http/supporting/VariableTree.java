package com.inteliense.aloft.server.http.supporting;

import com.inteliense.aloft.compiler.lang.types.base.T;
import com.inteliense.aloft.compiler.lang.types.base.V;

import java.util.ArrayList;

public class VariableTree {

    private ArrayList<VariableNode> nodes = new ArrayList<>();

    public VariableTree() { }

    public void addNode(VariableNode node) {
        nodes.add(node);
    }

    public void addNode(String key, T type) {
        nodes.add(new VariableNode(key, type));
    }

    public void addNode(String key, T type, Object v) {
        nodes.add(new VariableNode(key, type, v));
    }

    public VariableNode getByPath(String path) {
        return null;
    }

    public VariableNode getByIndex(int index) {
        return nodes.get(index);
    }

    public VariableNode getFromRoot(String key) {
        return null;
    }

    public int size() { return nodes.size(); }

}
