package org.extendedweb.aloft.server.compiler.compile.base.builtin;

import org.extendedweb.aloft.lib.lang.structure.components.AloftComponent;
import org.extendedweb.aloft.lib.lang.structure.components.AloftObjectProperties;
import org.extendedweb.aloft.lib.lang.structure.components.AloftObjectProperty;
import org.extendedweb.aloft.lib.lang.structure.elements.types.ButtonAloftElement;
import org.extendedweb.aloft.lib.lang.structure.elements.types.CenteredAloftElement;
import org.extendedweb.aloft.lib.lang.structure.elements.types.ColumnAloftElement;
import org.extendedweb.aloft.lib.lang.structure.elements.types.TextAloftElement;
import org.extendedweb.aloft.lib.lang.types.base.T;
import org.extendedweb.aloft.server.compiler.compile.base.register.CompiledObjectsRegister;
import org.extendedweb.aloft.server.compiler.compile.supporting.AloftAccess;
import org.extendedweb.aloft.server.compiler.compile.supporting.AloftBuiltInComponentClass;
import org.extendedweb.aloft.server.compiler.compile.supporting.AloftComponentClass;
import org.extendedweb.aloft.server.compiler.compile.supporting.AloftVariable;
import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.HashMap;

public class RegisterElementClasses {

    public static void register(HashMap<String, AloftComponentClass> list, CompiledObjectsRegister register) {
//        put("Button", new AloftBuiltInComponentClass(ButtonAloftElement.class), list, register, "__buton_default__");
        put("Text", new AloftBuiltInComponentClass(TextAloftElement.class), list, register);
//        put("Column", new AloftBuiltInComponentClass(ColumnAloftElement.class), list, register);
        put("Centered", new AloftBuiltInComponentClass(CenteredAloftElement.class), list, register);
    }

    private static void put(String name, AloftBuiltInComponentClass c, HashMap<String, AloftComponentClass> list, CompiledObjectsRegister register, String subtype) {
        list.put(name, c);
    }

    private static void put(String name, AloftBuiltInComponentClass c, HashMap<String, AloftComponentClass> list, CompiledObjectsRegister register) {
        list.put(name, c);
    }

}
