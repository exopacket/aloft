package org.extendedweb.aloft.server.compiler.compile.base.functions.base;

import org.extendedweb.aloft.lib.html.elements.js.JavaScriptObject;
import org.extendedweb.aloft.lib.lang.base.BuildsJavascript;
import org.extendedweb.aloft.lib.lang.types.base.T;
import org.extendedweb.aloft.lib.lang.types.base.V;
import org.extendedweb.aloft.server.compiler.compile.base.AloftFunctionCompiler;
import org.extendedweb.aloft.server.compiler.compile.base.AloftServerCode;
import org.extendedweb.aloft.server.compiler.compile.supporting.BuildsJava;
import org.extendedweb.aloft.server.grammar.antlr.AloftParser;
import org.extendedweb.aloft.utils.global.__;

import java.util.List;

public abstract class AloftFunctionObject implements BuildsJava, BuildsJavascript {

    private Type type;
    protected V[] args;

    protected abstract boolean serverSide();
    protected abstract boolean clientSide();

    public AloftFunctionObject(Type type, V...args) {
        this.type = type;
        this.args = args;
    }

    protected static V[] parseArgsFromCall(AloftParser.Param_valuesContext ctx) {
        if(__.isset(ctx.EMPTY_PARENTHESIS())) return new V[0];
        AloftParser.Vars_with_params_specialContext paramsCtx = ctx.vars_with_params_special();
        List<AloftParser.Var_paramContext> paramsList = paramsCtx.var_param();
        V[] values = new V[paramsList.size()];
        int i = 0;
        for(AloftParser.Var_paramContext param : paramsList) {
            if(__.isset(param.string())) {
                String str = param.string().getText().replaceAll("\"", "");
                V value = T.string().value(str);
                i++;
                continue;
            }
        }
        return values;
    }

    @Override
    public AloftServerCode server() {
        return null;
    }

    @Override
    public JavaScriptObject getObject() {
        return null;
    }

    public enum Type {
        FUNCTION_CALL,
        DECLARE_VARIABLE,
        ASSIGN_VARIABLE,
        CONSTRUCTOR,
    }

}
