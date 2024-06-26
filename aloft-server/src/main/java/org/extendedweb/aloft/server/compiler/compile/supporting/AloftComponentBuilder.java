package org.extendedweb.aloft.server.compiler.compile.supporting;

import org.extendedweb.aloft.lib.lang.structure.components.AloftComponent;
import org.extendedweb.aloft.lib.lang.types.base.T;
import org.extendedweb.aloft.lib.lang.types.base.V;
import org.extendedweb.aloft.server.compiler.compile.base.register.CompiledObjectsRegister;
import org.extendedweb.aloft.server.compiler.exceptions.CompilerException;

import java.util.ArrayList;

public class AloftComponentBuilder extends V {

    private AloftComponentNode root;

    public AloftComponentBuilder(ContextContainer container, CompiledObjectsRegister register) throws CompilerException {
        this.root = new AloftComponentNode(container, register);
    }

    @Override
    public <Any> Any get() {
        return (Any) root.component();
    }

    public <Any> Any get(CompiledObjectsRegister compiledObjectsRegister, ArrayList<AloftVariable> variables) {
        return (Any) root.build(compiledObjectsRegister, variables);
    }

    @Override
    public T type() {
        return null;
    }
}
