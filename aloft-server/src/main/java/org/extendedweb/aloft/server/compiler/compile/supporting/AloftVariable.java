package org.extendedweb.aloft.server.compiler.compile.supporting;

import org.extendedweb.aloft.lib.lang.types.base.T;
import org.extendedweb.aloft.lib.lang.types.t.*;
import org.extendedweb.aloft.server.grammar.antlr.AloftParser;
import org.extendedweb.aloft.utils.global.__;

public class AloftVariable {

    private AloftAccess access;
    private String identifier;
    private T type;
    private AloftExpression value;

    public AloftVariable(AloftAccess access, String identifier, T type, AloftExpression value) {
        this.access = access;
        this.identifier = identifier;
        this.type = type;
        this.value = value;
    }

    public static AloftVariable fromContext(AloftParser.Declare_variableContext ctx) {
        AloftAccess access;
        String identifier;
        T type;
        AloftExpression value;
        AloftParser.VariableContext varCtx = ctx.variable();
        access = getAccess(varCtx);
        System.out.println(access);
        identifier = getIdentifier(varCtx);
        System.out.println(identifier);
        AloftParser.Var_typeContext typeCtx = ctx.var_type();
        type = getType(typeCtx.getText());
        System.out.println(typeCtx.getText());
        AloftParser.Var_expressionContext exprCtx = ctx.var_expression();
        value = parseExpression(exprCtx);
        return new AloftVariable(access, identifier, type, value);
    }

    private static T getType(String type) {
        switch(type) {
            case "string":
                return new StringT();
            case "number":
                return new NumberT();
            case "bool":
            case "boolean":
                return new BooleanT();
            case "time":
                return new TimeT();
            case "dynamic":
            default:
                return new DynamicT();
        }
    }

    private static AloftExpression parseExpression(AloftParser.Var_expressionContext ctx) {
        return new AloftExpression();
    }

    private static String getIdentifier(AloftParser.VariableContext ctx) {
        if(__.isset(ctx.NAMED())) return ctx.NAMED().getText();
        return ctx.NAMED_VAR().getText();
    }

    private static AloftAccess getAccess(AloftParser.VariableContext ctx) {
        if(!__.isset(ctx.VAR_ACCESS())) return AloftAccess.PUBLIC;
        String access = ctx.VAR_ACCESS().getText();
        if(__.same(access, "::")) return AloftAccess.STATIC;
        if(__.same(access, "*")) return AloftAccess.PRIVATE_REQUIRED;
        return AloftAccess.PUBLIC;
    }

}
