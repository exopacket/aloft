package org.extendedweb.aloft.server.compiler.compile.base.register;

import org.extendedweb.aloft.server.compiler.compile.base.builtin.RegisterElementClasses;
import org.extendedweb.aloft.server.compiler.compile.supporting.AloftComponentClass;

import java.util.ArrayList;

public class ObjectRegister {

    private ArrayList<AloftComponentClass> classes = new ArrayList<>();

    public ObjectRegister() {
        RegisterElementClasses.register(classes);
    }

    public void register(AloftComponentClass c) {
        classes.add(c);
    }

}
