package org.extendedweb.aloft.server.compiler.compile.base.register;

import org.extendedweb.aloft.lib._AloftObjects;
import org.extendedweb.aloft.lib._AloftProject;
import org.extendedweb.aloft.lib.application.config.AppConfig;
import org.extendedweb.aloft.server.compiler.compile.supporting.AloftObject;
import org.extendedweb.aloft.server.compiler.compile.supporting.ContextContainer;
import org.extendedweb.aloft.server.compiler.exceptions.CompilerException;
import org.extendedweb.aloft.utils.global.__;

import java.util.ArrayList;
import java.util.HashMap;

public class CompiledObjectsRegister {

    private HashMap<Class<?>, HashMap<String, AloftObject>> register = new HashMap<>();
    private AppConfig config = null;
    private ComponentObjectRegister components;

    public CompiledObjectsRegister(String configPath, ComponentObjectRegister components) {
        config = parseConfig(configPath);
        this.components = components;
    }

    public void register(Class<?> c, AloftObject instance, ContextContainer ctx) throws CompilerException {
        String identifier = instance.getName();
        if(exists(c, identifier)) ctx.e("Duplicate object name", CompilerException.ExceptionType.CRITICAL);
        if(!register.containsKey(c)) register.put(c, new HashMap<>());
        register.get(c).put(identifier, instance);
    }

    //TODO
    public boolean existsInScope(String identifier) {
        return false;
    }

    private boolean exists(Class<?> c, String identifier) {
        if(register.isEmpty() || !register.containsKey(c)) return false;
        return register.get(c).containsKey(identifier);
    }

    public _AloftProject buildProject() {
        return null;
    }

    private AppConfig parseConfig(String configPath) {
        return new AppConfig(configPath);
    }

}
