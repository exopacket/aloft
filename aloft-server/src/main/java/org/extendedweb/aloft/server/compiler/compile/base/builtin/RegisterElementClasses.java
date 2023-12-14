package org.extendedweb.aloft.server.compiler.compile.base.builtin;

import org.extendedweb.aloft.lib.lang.structure.elements.types.ButtonAloftElement;
import org.extendedweb.aloft.server.compiler.compile.supporting.AloftBuiltInComponentClass;
import org.extendedweb.aloft.server.compiler.compile.supporting.AloftComponentClass;

import java.util.ArrayList;
import java.util.HashMap;

public class RegisterElementClasses {

    public static void register(HashMap<String, AloftComponentClass> list) {
        AloftBuiltInComponentClass c = new AloftBuiltInComponentClass(ButtonAloftElement.class);
        list.put("Button", c);
    }

}
