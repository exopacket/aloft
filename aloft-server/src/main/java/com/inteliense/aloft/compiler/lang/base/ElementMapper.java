package com.inteliense.aloft.compiler.lang.base;

import com.inteliense.aloft.compiler.lang.keywords.AloftPage;
import com.inteliense.aloft.compiler.lang.keywords.components.AloftComponent;
import com.inteliense.aloft.server.html.elements.HtmlElement;
import com.inteliense.aloft.utils.global.__;

public class ElementMapper {

    private ElementNode root = null;
    private ElementNode active = null;
    private boolean debug = false;

    public ElementMapper(boolean debug) {
        this.debug = debug;
    }

    public void iterate(HtmlElement el) {
        if(!__.isset(this.active)) {
            this.root = new ElementNode(el, debug);
            this.active = this.root;
        }
        this.active = this.active.iterate(el, debug);
    }

}
