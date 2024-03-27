package org.extendedweb.aloft.server.compiler.compile.base.register;

import org.extendedweb.aloft.lib.lang.types.base.A;
import org.extendedweb.aloft.server.compiler.compile.base.builtin.RegisterElementClasses;
import org.extendedweb.aloft.server.compiler.compile.base.objects.ComponentAloftObject;
import org.extendedweb.aloft.server.compiler.compile.supporting.AloftComponentClass;
import org.extendedweb.aloft.server.compiler.compile.supporting.AloftObject;

import java.util.ArrayList;
import java.util.HashMap;

public class ComponentFunctionRegister {

    private HashMap<Class<?>, HashMap<String, Boolean[]>> functions = new HashMap<>();

    public ComponentFunctionRegister() {
        addGlobalComponentFunctions();
    }

    private void addGlobalComponentFunctions() {
        HashMap<String, Boolean[]> functions = new HashMap<>();
        functions.put("hide", _privateStatic(true));
        functions.put("show", _privateStatic(true));
        functions.put("mount", _privateStatic(true));
        functions.put("goto", _privateStatic(true));
        this.functions.put(ComponentAloftObject.class, functions);
    }

    public static Boolean[] _privateStatic() {
        return new Boolean[]{true, true};
    }

    public static Boolean[] _private() {
        return new Boolean[]{true, false};
    }

    public static Boolean[] _static() {
        return new Boolean[]{false, true};
    }

    public static Boolean[] _public() {
        return new Boolean[]{false, false};
    }

    public static Boolean[] _privateStatic(boolean updateOnly) {
        return new Boolean[]{true, true, updateOnly};
    }

    public static Boolean[] _private(boolean updateOnly) {
        return new Boolean[]{true, false, updateOnly};
    }

    public static Boolean[] _static(boolean updateOnly) {
        return new Boolean[]{false, true, updateOnly};
    }

    public static Boolean[] _public(boolean updateOnly) {
        return new Boolean[]{false, false, updateOnly};
    }

    public boolean exists(Class<?> aloftObject, String identifier) {
        return false;
    }

}
