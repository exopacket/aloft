package org.extendedweb.aloft.server.compiler.compile.supporting;

import org.extendedweb.aloft.lib.lang.types.base.T;
import org.extendedweb.aloft.lib.lang.types.base.V;
import org.extendedweb.aloft.server.compiler.compile.base.register.CompiledObjectsRegister;
import org.extendedweb.aloft.server.compiler.exceptions.CompilerException;

public class BuiltComponentContainerT extends T {

    @Override
    public V value(Object o) {
        return V.nothing();
    }

    public V value(Object o, CompiledObjectsRegister register) {
        if(o instanceof ContextContainer) {
            try {
                return new AloftComponentBuilder((ContextContainer) o, register);
            } catch (CompilerException e) {
                e.handle();
            }
        }
        System.out.println(o.getClass());
        System.exit(5);
        return null;
    }

}
