package org.extendedweb.aloft.lib.http.supporting;

import org.extendedweb.aloft.lib.lang.types.base.T;
import org.extendedweb.aloft.utils.global.__;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VariableTree extends ReturnsVariableNodes {

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

    @Override
    public VariableNode getByPath(String path) {
        boolean multiple = path.contains(".");
        String[] parents;
        if(!multiple) parents = new String[]{path};
        else parents = path.split("\\.");
        VariableNode node = null;
        for(int i=0; i< nodes.size(); i++) {
            if(__.same(path, nodes.get(i).getKey())) {
                node = nodes.get(i);
                break;
            }
        }
        if(!__.isset(node)) return null;
        List<String> list = Arrays.asList(parents);
        list.remove(0);
        if(list.isEmpty()) return node;
        String next = "";
        for(int i=0; i<list.size(); i++) {
            if(i > 0) next += ".";
            next += list.get(i);
        }
        return node.getByPath(next);
    }

    public VariableNode getByIndex(int index) {
        return nodes.get(index);
    }

    public VariableNode getFromRoot(String key) {
        return null;
    }

    public int size() { return nodes.size(); }

}
