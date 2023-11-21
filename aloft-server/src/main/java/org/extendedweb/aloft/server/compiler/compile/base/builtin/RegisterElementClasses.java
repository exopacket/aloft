package org.extendedweb.aloft.server.compiler.compile.base.builtin;

import org.extendedweb.aloft.lib.lang.structure.elements.types.ButtonAloftElement;
import org.extendedweb.aloft.server.compiler.compile.supporting.AloftBuiltInComponentClass;
import org.extendedweb.aloft.server.compiler.compile.supporting.AloftComponentClass;

import java.util.ArrayList;

public class RegisterElementClasses {

    public static void register(ArrayList<AloftComponentClass> list) {
        list.add(new AloftBuiltInComponentClass(ButtonAloftElement.class));
    }

}
