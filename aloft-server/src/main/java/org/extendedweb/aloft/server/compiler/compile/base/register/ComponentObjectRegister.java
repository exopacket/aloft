package org.extendedweb.aloft.server.compiler.compile.base.register;

import org.extendedweb.aloft.lib.lang.structure.components.AloftComponent;
import org.extendedweb.aloft.lib.lang.structure.elements.types.ButtonAloftElement;
import org.extendedweb.aloft.lib.lang.structure.elements.types.CenteredAloftElement;
import org.extendedweb.aloft.lib.lang.structure.elements.types.ColumnAloftElement;
import org.extendedweb.aloft.lib.lang.structure.elements.types.TextAloftElement;
import org.extendedweb.aloft.server.compiler.compile.base.builtin.RegisterElementClasses;
import org.extendedweb.aloft.server.compiler.compile.supporting.AloftBuiltInComponentClass;
import org.extendedweb.aloft.server.compiler.compile.supporting.AloftComponentClass;

import java.util.ArrayList;
import java.util.HashMap;

public class ComponentObjectRegister {

    private HashMap<String, AloftComponentClass> classes = new HashMap<>();

    public ComponentObjectRegister() {
    }

    public void registerBuiltin(CompiledObjectsRegister register) {
        registerBuiltin(classes, register);
    }

    public void registerBuiltin(HashMap<String, AloftComponentClass> list, CompiledObjectsRegister register) {
//        put("Button", new AloftBuiltInComponentClass(ButtonAloftElement.class), list, register, "__buton_default__");
        put("Text", new AloftBuiltInComponentClass(TextAloftElement.class), list, register);
//        put("Column", new AloftBuiltInComponentClass(ColumnAloftElement.class), list, register);
        put("Centered", new AloftBuiltInComponentClass(CenteredAloftElement.class), list, register);
    }

    private void put(String name, AloftBuiltInComponentClass c, HashMap<String, AloftComponentClass> list, CompiledObjectsRegister register, String subtype) {
        classes.put(name, c);
    }

    private void put(String name, AloftBuiltInComponentClass c, HashMap<String, AloftComponentClass> list, CompiledObjectsRegister register) {
        classes.put(name, c);
    }

    public void register(String name, AloftComponentClass c) {
        classes.put(name, c);
    }

    public AloftComponentClass get(String name) {
        return classes.get(name);
    }

    public AloftComponent getComponent(String named) {
        return classes.get(named).getComponent();
    }

    public boolean exists(String named) {
        return classes.containsKey(named);
    }

}
