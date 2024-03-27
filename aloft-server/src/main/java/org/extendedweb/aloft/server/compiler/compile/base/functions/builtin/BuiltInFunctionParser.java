package org.extendedweb.aloft.server.compiler.compile.base.functions.builtin;

import org.extendedweb.aloft.server.compiler.compile.base.AloftBuiltInFunction;
import org.extendedweb.aloft.server.grammar.antlr.AloftParser;

public class BuiltInFunctionParser {

    public static AloftBuiltInFunction check(String name, AloftParser.Function_callContext ctx) {
        if(name.equals("alert")) return new AlertFunction(ctx);
        return null;
    }

}
