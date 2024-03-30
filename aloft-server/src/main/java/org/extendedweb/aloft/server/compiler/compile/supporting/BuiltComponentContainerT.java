package org.extendedweb.aloft.server.compiler.compile.supporting;

import org.extendedweb.aloft.lib.lang.structure.components.AloftComponent;
import org.extendedweb.aloft.lib.lang.types.base.T;
import org.extendedweb.aloft.lib.lang.types.base.V;
import org.extendedweb.aloft.lib.lang.types.t.AloftComponentT;
import org.extendedweb.aloft.server.compiler.compile.base.register.CompiledObjectsRegister;
import org.extendedweb.aloft.server.compiler.exceptions.CompilerException;

import java.util.ArrayList;

public class BuiltComponentContainerT extends AloftComponentT {

    @Override
    public V value(Object o) {
        return V.nothing();
    }

    public V value(ContextContainer ctx, CompiledObjectsRegister register, ArrayList<AloftVariable> vars) {
        try {
            return new AloftComponentBuilder(ctx, register);
        } catch (CompilerException e) {
            e.handle();
            return null;
        }
    }

}
