package org.extendedweb.aloft.lib.lang.base;

import org.extendedweb.aloft.lib.application.config.AppConfig;
import org.extendedweb.aloft.lib.lang.structure.elements.base.AloftElement;
import org.extendedweb.aloft.lib.html.elements.HtmlElement;
import org.extendedweb.aloft.utils.global.__;

public class ElementMapper {

    private ElementNode root = null;
    private ElementNode active = null;
    private boolean debug = false;
    private AppConfig config;

    public ElementMapper(boolean debug, AppConfig config) {
        this.debug = debug;
        this.config = config;
    }

    public void iterate(HtmlElement el) {
        if(!__.isset(this.active)) {
            this.root = new ElementNode(el, debug);
            this.active = this.root;
        }
        this.active = this.active.iterate(el, debug);
    }

    public void addElementExtensions(AloftElement element) {
        if(!__.isset(config)) return;
        this.config.addElementExtensions(element);;
    }

}
