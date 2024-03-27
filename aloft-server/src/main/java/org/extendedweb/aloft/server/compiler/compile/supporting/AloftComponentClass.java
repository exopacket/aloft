package org.extendedweb.aloft.server.compiler.compile.supporting;

import org.extendedweb.aloft.lib.lang.structure.components.AloftComponent;
import org.extendedweb.aloft.lib.lang.structure.elements.base.AloftElement;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class AloftComponentClass {

    private Class<?> c;
    private AloftComponent component;

    public AloftComponentClass(Class<? extends AloftElement> c) {
        try {
            this.c = c;
            Constructor<? extends AloftElement> construct = c.getConstructor();
            component = construct.newInstance();
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    public AloftComponentClass(Class<? extends AloftElement> c, String subtype) {
        try {
            this.c = c;
            Constructor<? extends AloftElement> construct = c.getConstructor(String.class);
            component = construct.newInstance(subtype);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    public AloftComponentClass(AloftComponent component) {
        this.c = AloftComponent.class;
        this.component = component;
    }

    public AloftComponent getComponent() {
        return this.component;
    }

}
