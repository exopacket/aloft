package org.extendedweb.aloft.server.compiler.compile.supporting;

import org.extendedweb.aloft.lib.lang.structure.components.AloftComponent;
import org.extendedweb.aloft.lib.lang.structure.components.AloftObjectProperties;
import org.extendedweb.aloft.lib.lang.structure.components.AloftObjectProperty;
import org.extendedweb.aloft.lib.lang.structure.elements.base.AloftElement;
import org.extendedweb.aloft.lib.lang.types.base.A;
import org.extendedweb.aloft.lib.lang.types.base.V;
import org.extendedweb.aloft.server.compiler.compile.base.register.CompiledObjectsRegister;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

public class AloftComponentClass {

    private Class<?> c;
    private AloftComponent component;
    private ArrayList<AloftVariable> variables;

    public AloftComponentClass(Class<? extends AloftElement> c) {
        try {
            this.c = c;
            Constructor<? extends AloftElement> construct = c.getConstructor();
            AloftElement el = construct.newInstance();
            this.variables = parseVariables(el.getProperties().get());
            this.component = el;
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
            AloftElement el = construct.newInstance(subtype);
            this.variables = parseVariables(el.getProperties().getList(subtype));
            this.component = el;
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

    public AloftComponentClass(AloftComponentBuilder component, CompiledObjectsRegister register, ArrayList<AloftVariable> variables) {
        this.c = AloftComponent.class;
        this.component = component.get(register, variables);
        this.variables = variables;
    }

    public ArrayList<AloftVariable> getVariables() {
        return variables;
    }

    public AloftComponent getComponent() {
        return this.component;
    }

    private static ArrayList<AloftVariable> parseVariables(ArrayList<AloftObjectProperty> properties) {
        ArrayList<AloftVariable> vars = new ArrayList<>();
        for(AloftObjectProperty prop : properties) {
            if(prop.isRequired()) {
                AloftVariable var = new AloftVariable(AloftAccess.AloftAccessType.PUBLIC_REQUIRED, prop.getName(), prop.type(), V.unset());
                vars.add(var);
            } else {
                AloftVariable var = new AloftVariable(AloftAccess.AloftAccessType.PUBLIC, prop.getName(), prop.type(), V.unset());
                vars.add(var);
            }
        }
        return vars;
    }

}
