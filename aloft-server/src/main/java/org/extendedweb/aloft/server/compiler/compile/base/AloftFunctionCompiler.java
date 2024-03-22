package org.extendedweb.aloft.server.compiler.compile.base;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.extendedweb.aloft.lib.lang.types.base.A;
import org.extendedweb.aloft.server.compiler.compile.base.functions.base.AloftFunctionObject;
import org.extendedweb.aloft.server.compiler.compile.base.register.CompiledObjectsRegister;
import org.extendedweb.aloft.server.compiler.compile.supporting.AloftAccess;
import org.extendedweb.aloft.server.grammar.antlr.AloftParser;
import org.extendedweb.aloft.utils.global.__;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AloftFunctionCompiler {

    public static AloftFunctionContainer queue(AloftParser.FunctionContext ctx, CompiledObjectsRegister register) {
        AloftParser.Function_declarationContext declarationCtx = ctx.function_declaration();
        AloftFunctionType type = AloftFunctionTypeParser.parse(declarationCtx, register);
        String name = getFunctionName(declarationCtx, register);
        AloftAccess.AloftAccessType access = getFunctionAccess(declarationCtx);
        ArrayList<String> args = getArgs(declarationCtx);
        ArrayList<String> problematicArgs = argCheck(args, register);
        return new AloftFunctionContainer(type, isArray(declarationCtx), access, name, args, ctx.function_curly_block(), register);
    }

    private static String getFunctionName(AloftParser.Function_declarationContext ctx, CompiledObjectsRegister register) {
        AloftParser.Name_declarationContext nameCtx = ctx.name_declaration();
        if(__.isset(nameCtx.private_named())) return nameCtx.private_named().var_name().getText();
        return nameCtx.var_name().getText();
    }

    private static AloftAccess.AloftAccessType getFunctionAccess(AloftParser.Function_declarationContext ctx) {
        boolean isStatic = __.isset(ctx.STATIC_ACCESS());
        AloftParser.Name_declarationContext nameCtx = ctx.name_declaration();
        boolean isPrivate = __.isset(nameCtx.private_named());
        return AloftAccess.getFunctionType(isStatic, isPrivate);
    }

    private static boolean isArray(AloftParser.Function_declarationContext ctx) {
        return __.isset(ctx.ARRAY_TYPE_SUFFIX());
    }

    private static ArrayList<String> getArgs(AloftParser.Function_declarationContext ctx) {
        ArrayList<String> args = new ArrayList<>();
        AloftParser.Var_argsContext argsCtx = ctx.var_args();
        if(!__.isset(argsCtx.EMPTY_PARENTHESIS())) {
            AloftParser.Named_with_params_specialContext paramsCtx = argsCtx.named_with_params_special();
            List<AloftParser.Var_nameContext> names = paramsCtx.var_name();
            for(int i=0; i<names.size(); i++) {
                AloftParser.Var_nameContext nameCtx = names.get(i);
                if(i == (names.size() - 1)) {
                    if(__.isset(paramsCtx.VARIABLE_ARGS())) args.add(null);
                }
                args.add(nameCtx.getText());
            }
        }
        return args;
    }

    private static ArrayList<String> argCheck(ArrayList<String> args, CompiledObjectsRegister register) {
        ArrayList<String> problems = new ArrayList<>();
        for(String arg : args) {
            if(register.existsInScope(arg)) problems.add(arg);
        }
        return problems;
    }

    public static ArrayList<AloftFunctionObject> compileChild(AloftParser.Function_curly_blockContext ctx, CompiledObjectsRegister global) {
        TempFunctionRegister register = new TempFunctionRegister(global);
        ArrayList<AloftFunctionObject> functionObjects = new ArrayList<>();
        List<AloftParser.Function_syntaxContext> root = ctx.function_syntax();
        for(int i=0; i<root.size(); i++) {
            ParserRuleContext child = root.get(i);
            int ruleIndex = child.getRuleIndex();
            if(ruleIndex == AloftParser.RULE_function_call) functionObjects.add(compileStatement((AloftParser.Function_callContext) child, register));
        }
        return functionObjects;
    }

    private static AloftFunctionObject compileStatement(AloftParser.Function_callContext ctx, TempFunctionRegister register) {
        AloftFunctionObject object = register.createIf(ctx);
        return object; //TODO... IF NULL... THROW UNDEFINED FUNCTION ERROR
    }

    private static class TempFunctionRegister {

        CompiledObjectsRegister global;

        TempFunctionRegister(CompiledObjectsRegister global) {
            this.global = global;
        }

        public AloftFunctionObject createIf(AloftParser.Function_callContext ctx) {
            return null;
        }

    }

}
