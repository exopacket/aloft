package org.extendedweb.aloft.lib.lang.structure.components;

import org.extendedweb.aloft.lib.lang.structure.elements.types.FilledAloftElement;
import org.extendedweb.aloft.lib.lang.supporting.MountableComponent;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;

public class AloftRoot extends MountableComponent {

    public AloftRoot(AloftComponent component) {
        super(container(component));
    }

    private static AloftComponent container(AloftComponent component) {
        FilledAloftElement container = new FilledAloftElement();
        container.addStyle("background-repeat", "no-repeat");
        container.addStyle("background-size", "cover");
        container.useViewSize();
        container.addChild(component);
        return container;
    }

    @Override
    protected ArrayList<AloftComponent> build() throws InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        System.out.println("size == " + this.children.size());
        return this.children;
    }

    @Override
    public void addChild(AloftComponent component) { }

    @Override
    public String getName() {
        return "__root__";
    }


}
