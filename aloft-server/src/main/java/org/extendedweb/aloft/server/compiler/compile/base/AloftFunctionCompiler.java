package org.extendedweb.aloft.server.compiler.compile.base;

import org.extendedweb.aloft.server.compiler.compile.base.register.CompiledObjectsRegister;
import org.extendedweb.aloft.server.grammar.antlr.AloftParser;

import java.util.ArrayList;

public class AloftFunctionCompiler {

    public static AloftFunction compile(AloftParser.FunctionsContext ctx, CompiledObjectsRegister register) {
        AloftFunctionType type;
        String name = "";
        ArrayList<String> args = getArgs(ctx);
        ArrayList<String> problematicArgs = argCheck(args, register);
        ArrayList<AloftFunctionObject> objects = parseBody(null, register);
        return null;
    }

    private static ArrayList<String> getArgs(AloftParser.FunctionsContext ctx) {
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

    private static ArrayList<AloftFunctionObject> parseBody(AloftParser.Curly_blockContext ctx, CompiledObjectsRegister register) {
        return null;
    }

}
