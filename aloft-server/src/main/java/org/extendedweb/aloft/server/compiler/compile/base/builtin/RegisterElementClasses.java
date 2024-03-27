package org.extendedweb.aloft.server.compiler.compile.base.builtin;

import org.extendedweb.aloft.lib.lang.structure.elements.types.ButtonAloftElement;
import org.extendedweb.aloft.lib.lang.structure.elements.types.TextAloftElement;
import org.extendedweb.aloft.server.compiler.compile.supporting.AloftBuiltInComponentClass;
import org.extendedweb.aloft.server.compiler.compile.supporting.AloftComponentClass;
import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.HashMap;

public class RegisterElementClasses {

    public static void register(HashMap<String, AloftComponentClass> list) {
        list.put("Button", new AloftBuiltInComponentClass(ButtonAloftElement.class));
        list.put("Text", new AloftBuiltInComponentClass(TextAloftElement.class));
    }

}
