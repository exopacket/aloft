package org.extendedweb.aloft.server.compiler.compile.base.functions.builtin;

import org.extendedweb.aloft.lib.html.elements.js.JavaScriptObject;
import org.extendedweb.aloft.server.compiler.compile.base.AloftBuiltInFunction;
import org.extendedweb.aloft.server.compiler.compile.base.AloftServerCode;
import org.extendedweb.aloft.server.grammar.antlr.AloftParser;

public class AlertFunction extends AloftBuiltInFunction {

    private String value;

    public AlertFunction(AloftParser.Function_callContext ctx) {
        super(ctx);
        this.value = args[0].get();
    }

    @Override
    protected boolean serverSide() {
        return false;
    }

    @Override
    protected boolean clientSide() {
        return true;
    }

    @Override
    public JavaScriptObject getObject() {
        return new JavaScriptObject() {
            @Override
            protected void create() {
                call("alert", FunctionArg.raw("\"" + value + "\""));
            }
        };
    }

    @Override
    public AloftServerCode server() {
        return null;
    }
}
