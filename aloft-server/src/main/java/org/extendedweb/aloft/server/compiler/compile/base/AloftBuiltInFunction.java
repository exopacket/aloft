package org.extendedweb.aloft.server.compiler.compile.base;

import org.extendedweb.aloft.lib.html.elements.js.JavaScriptObject;
import org.extendedweb.aloft.lib.lang.base.BuildsJavascript;
import org.extendedweb.aloft.lib.lang.types.base.V;
import org.extendedweb.aloft.server.compiler.compile.base.functions.base.AloftFunctionObject;
import org.extendedweb.aloft.server.compiler.compile.supporting.BuildsJava;
import org.extendedweb.aloft.server.grammar.antlr.AloftParser;

public abstract class AloftBuiltInFunction extends AloftFunctionObject {

    protected JavaScriptObject js;
    protected AloftServerCode server;

    public AloftBuiltInFunction(AloftParser.Function_callContext ctx) {
        super(Type.FUNCTION_CALL, parseArgsFromCall(ctx.param_values()));
    }
}
