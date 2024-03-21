package org.extendedweb.aloft.server.compiler.compile.base;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.extendedweb.aloft.lib.lang.types.base.A;
import org.extendedweb.aloft.server.compiler.compile.base.functions.base.AloftFunctionObject;
import org.extendedweb.aloft.server.compiler.compile.base.register.CompiledObjectsRegister;
import org.extendedweb.aloft.server.grammar.antlr.AloftParser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AloftFunctionCompiler {

    public static AloftFunctionContainer queue(AloftParser.FunctionContext ctx, CompiledObjectsRegister register) {
        AloftFunctionType type = AloftFunctionType.VOID;
        String name = "";
        ArrayList<String> args = getArgs(ctx);
        ArrayList<String> problematicArgs = argCheck(args, register);
        return new AloftFunctionContainer(type, name, args, ctx.function_curly_block(), register);
    }

    public static AloftFunction compile(AloftParser.FunctionContext ctx, CompiledObjectsRegister register) {
        AloftFunctionType type = AloftFunctionType.VOID;
        String name = "";
        ArrayList<String> args = getArgs(ctx);
        ArrayList<String> problematicArgs = argCheck(args, register);
        AloftFunctionContainer container = new AloftFunctionContainer(type, name, args, ctx.function_curly_block(), register);
        return new AloftFunction(container);
    }

    private static ArrayList<String> getArgs(AloftParser.FunctionContext ctx) {
        ArrayList<String> args = new ArrayList<>();
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
