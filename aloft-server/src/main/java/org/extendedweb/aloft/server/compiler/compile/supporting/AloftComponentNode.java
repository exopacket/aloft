package org.extendedweb.aloft.server.compiler.compile.supporting;

public class AloftComponentNode {

    private AloftComponentNode child = null;

    public AloftComponentNode() { }

    public AloftComponentNode append(AloftComponentNode...children) {
        AloftComponentNode v = this;
        for(AloftComponentNode node : children) v = v.append(node);
        return v;
    }

}
