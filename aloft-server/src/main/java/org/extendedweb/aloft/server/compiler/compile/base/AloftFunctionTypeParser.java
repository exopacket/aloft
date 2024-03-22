package org.extendedweb.aloft.server.compiler.compile.base;

import org.extendedweb.aloft.server.compiler.compile.base.register.CompiledObjectsRegister;
import org.extendedweb.aloft.server.grammar.antlr.AloftParser;
import org.extendedweb.aloft.utils.global.__;

public class AloftFunctionTypeParser {

    public static AloftFunctionType parse(AloftParser.Function_declarationContext ctx, CompiledObjectsRegister register) {
        AloftParser.Function_typesContext typesCtx = ctx.function_types();
        String typeStr = typesCtx.getText();
        if(__.same("update", typeStr)) return AloftFunctionType.UPDATE;
        if(__.same("void", typeStr)) return AloftFunctionType.VOID;
        AloftParser.Var_typeContext varTypeCtx = typesCtx.var_type();
        if(__.isset(varTypeCtx)) return getBuiltInType(varTypeCtx, register);
        return null;
    }

    private static AloftFunctionType getBuiltInType(AloftParser.Var_typeContext ctx, CompiledObjectsRegister register) {
        if(__.isset(ctx.var_name())) return getObjectType(ctx.var_name(), register);
        String type = ctx.getText();
        switch(type) {
            case "string": return AloftFunctionType.STRING;
        }
        return null;
    }

    private static AloftFunctionType getObjectType(AloftParser.Var_nameContext ctx, CompiledObjectsRegister register) {
        return AloftFunctionType.COMPONENT;
    }

}
