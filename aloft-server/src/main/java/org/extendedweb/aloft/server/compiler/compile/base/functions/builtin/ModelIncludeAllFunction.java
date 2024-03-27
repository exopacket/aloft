package org.extendedweb.aloft.server.compiler.compile.base.functions.builtin;

import org.extendedweb.aloft.server.compiler.compile.base.AloftBuiltInFunction;
import org.extendedweb.aloft.server.grammar.antlr.AloftParser;

public class ModelIncludeAllFunction extends AloftBuiltInFunction {

    public ModelIncludeAllFunction(AloftParser.Function_callContext ctx) {
        super(ctx);
    }

    @Override
    protected boolean serverSide() {
        return false;
    }

    @Override
    protected boolean clientSide() {
        return false;
    }
}
