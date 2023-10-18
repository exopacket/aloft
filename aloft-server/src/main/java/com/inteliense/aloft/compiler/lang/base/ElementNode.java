package com.inteliense.aloft.compiler.lang.base;

import com.inteliense.aloft.server.html.elements.HtmlElement;
import com.inteliense.aloft.utils.data.Hex;
import com.inteliense.aloft.utils.encryption.A32;
import com.inteliense.aloft.utils.encryption.Rand;
import com.inteliense.aloft.utils.encryption.SHA;
import com.inteliense.aloft.utils.global.__;

import java.util.ArrayList;

public class ElementNode {

    private String name;
    private String type;
    private String friendlyId;
    private String uniqueId;
    private String veryUniqueId;
    private String aid;
    private int depth;
    private String path;
    private ArrayList<ElementNode> children = new ArrayList<>();

    public ElementNode(HtmlElement el, boolean debug) {
        this.depth = 0;
        this.path = "";
        setIdentifiers(el, debug);
    }

    public ElementNode(HtmlElement el, int depth, String path, boolean debug) {
        this.depth = depth;
        this.path = path;
        setIdentifiers(el, debug);
    }

    private void setIdentifiers(HtmlElement el, boolean debug) {
        String componentName = el.getParentComponent();
        String elementKey = el.getKey();
        if(__.empty(componentName)) componentName = ".";
        if(__.empty(elementKey)) elementKey = "*";
        this.name = componentName + elementKey + ((elementKey.equals("*")) ? "" : "__");
        this.type = elementKey;
        this.friendlyId = "";
        this.veryUniqueId = this.createId(String.valueOf(System.currentTimeMillis()));
        this.aid = A32.casified(SHA.getSha1(componentName));
        this.path += "/" + this.name;
        this.uniqueId = A32.casified(SHA.getSha1(this.path));
        el.setIdentifiers(this.friendlyId, this.uniqueId, this.veryUniqueId, this.aid, debug);
    }

    private String createId(String seed) {
        return A32.casified(SHA.getHmac256(seed, Hex.getHex(Rand.secure(32))));
    }

    public ElementNode iterate(HtmlElement el, boolean debug) {
        int i = 0;
        for(HtmlElement e : el.getChildren()) {
            String path = this.path + "[" + i + "]";
            ElementNode node = new ElementNode(e, depth + 1, path, debug);
            node.iterate(e, debug);
            this.children.add(node);
            i++;
        }
        return this;
    }

}
