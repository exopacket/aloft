package org.extendedweb.aloft.server.compiler.compile.base.register;

import org.extendedweb.aloft.server.compiler.compile.base.builtin.RegisterElementClasses;
import org.extendedweb.aloft.server.compiler.compile.supporting.AloftComponentClass;

import java.util.ArrayList;
import java.util.HashMap;

public class ComponentObjectRegister {

    private HashMap<String, AloftComponentClass> classes = new HashMap<>();

    public ComponentObjectRegister() {
        RegisterElementClasses.register(classes);
    }

    public void register(String name, AloftComponentClass c) {
        classes.put(name, c);
    }

}
