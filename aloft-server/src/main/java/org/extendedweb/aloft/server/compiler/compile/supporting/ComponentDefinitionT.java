package org.extendedweb.aloft.server.compiler.compile.supporting;

import org.extendedweb.aloft.lib.lang.types.base.T;
import org.extendedweb.aloft.lib.lang.types.base.V;
import org.extendedweb.aloft.server.compiler.exceptions.CompilerException;

public class ComponentDefinitionT extends T {
    @Override
    public V value(Object o) {
        if(o instanceof ContextContainer) {
            try {
                return new AloftComponentDefinition((ContextContainer) o);
            } catch (CompilerException e) {
                e.handle();
            }
        }
        return null;
    }
}
