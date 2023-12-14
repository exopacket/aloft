package org.extendedweb.aloft.lib.lang.types.v;

import org.extendedweb.aloft.lib.html.elements.HtmlElement;
import org.extendedweb.aloft.lib.lang.structure.components.AloftComponent;
import org.extendedweb.aloft.lib.lang.types.base.T;
import org.extendedweb.aloft.lib.lang.types.base.V;
import org.extendedweb.aloft.lib.lang.types.t.AloftComponentT;

public class AloftComponentV extends V {

    private AloftComponent component = null;

    public AloftComponentV() { }

    public AloftComponentV(AloftComponent component) {
        this.component = component;
    }

    @Override
    public <Any> Any get() {
        return (Any) component;
    }

    @Override
    public T type() {
        return new AloftComponentT();
    }
}
