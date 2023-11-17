package org.extendedweb.aloft.server.compiler.compile.supporting;

import org.extendedweb.aloft.lib.lang.types.base.V;
import org.extendedweb.aloft.server.compiler.exceptions.CompilerException;

public class AloftComponentDefinition extends V {

    private AloftComponentNode root;

    public AloftComponentDefinition(ContextContainer container) throws CompilerException {
        this.root = new AloftComponentNode(container);
    }

    @Override
    public <Any> Any get() {
        return (Any) root;
    }
}
