package org.extendedweb.aloft.server.compiler.compile.supporting;

import org.extendedweb.aloft.lib.lang.types.base.T;
import org.extendedweb.aloft.lib.lang.types.base.V;
import org.extendedweb.aloft.lib.lang.types.t.*;
import org.extendedweb.aloft.server.compiler.exceptions.CompilerException;
import org.extendedweb.aloft.server.grammar.antlr.AloftParser;
import org.extendedweb.aloft.utils.global.__;

import java.util.ArrayList;
import java.util.List;

public class AloftVariable {

    private AloftAccess access;
    private String identifier;
    private T type;
    private V value;

    public AloftVariable(AloftAccess access, String identifier, T type, V value) {
        this.access = access;
        this.identifier = identifier;
        this.type = type;
        this.value = value;
    }

    public AloftVariable(AloftAccess access, String identifier, T type, AloftExpression value) {
        this.access = access;
        this.identifier = identifier;
        this.type = type;
        this.value = new BooleanT().value(value.evaluate());
    }

    public static ArrayList<AloftVariable> fromContext(AloftParser.Declare_variableContext ctx) {
        ArrayList<AloftVariable> allVars = new ArrayList<>();
        AloftAccess access;
        ArrayList<String> indentifiers;
        T type;
        AloftExpression value;
        AloftParser.VariableContext varCtx = ctx.variable();
        access = getAccess(varCtx);
        System.out.println(access);
        indentifiers = getIdentifiers(varCtx);
        System.out.println(indentifiers.toString());
        AloftParser.Var_typeContext typeCtx = varCtx.var_type();
        type = (__.isset(typeCtx)) ? getType(typeCtx.getText()) : new DynamicT();
        System.out.println(__.isset(typeCtx) ? typeCtx.getText() : "dynamic");
        AloftParser.ExpressionContext exprCtx = ctx.expression();
        value = parseExpression(exprCtx);
        for(String identifier : indentifiers) {
            allVars.add(new AloftVariable(access, identifier, type, value));
        }
        return allVars;
    }

    public V value() {
        return value;
    }

    public void set(AloftParser.ExpressionContext ctx) {

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
                return new DynamicT();
            default:
                return new NamedT(type);
        }
    }

    private static AloftExpression parseExpression(AloftParser.ExpressionContext ctx) {
        return new AloftExpression(false, null, null, null);
    }

    private static ArrayList<String> getIdentifiers(AloftParser.VariableContext ctx) {
        ArrayList<String> indentifiers = new ArrayList<>();
        AloftParser.Var_namesContext namesCtx = null;
        if(__.isset(ctx.private_named_multiple())) namesCtx = ctx.private_named_multiple().var_names();
        else namesCtx = ctx.var_names();
        List<AloftParser.Var_nameContext> namesList = namesCtx.var_name();
        for(AloftParser.Var_nameContext context : namesList) {
            indentifiers.add(context.getText());
        }
        return indentifiers;
    }

    private static AloftAccess getAccess(AloftParser.VariableContext ctx) {
//        boolean isPrivate = __.isset(ctx.private_named_multiple());
//        boolean isStatic = __.isset(ctx.var_access()) && __.isset(ctx.var_access().static_field());
//        boolean isRequired = __.isset(ctx.var_access()) && __.isset(ctx.var_access().required_field());
//        if(!isPrivate && !isRequired && !isStatic) return AloftAccess.PUBLIC;
//        else if(isPrivate && !isRequired && !isStatic) return AloftAccess.PRIVATE;
//        else if(isPrivate && isRequired && !isStatic) return AloftAccess.PRIVATE_REQUIRED;
//        else if(isPrivate && !isRequired) return AloftAccess.PRIVATE_STATIC;
//        else if(!isPrivate && isRequired && !isStatic) return AloftAccess.PUBLIC_REQUIRED;
//        else if(!isPrivate && !isRequired) return AloftAccess.PUBLIC_STATIC;
        return new AloftAccess(AloftAccess.AloftAccessType.PUBLIC, true, false); //FIXME (compiler error)
    }

}
