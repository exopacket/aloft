package org.extendedweb.aloft.server.compiler.compile.base;

import org.extendedweb.aloft.lib.html.elements.js.JavaScriptObject;
import org.extendedweb.aloft.lib.lang.types.base.T;
import org.extendedweb.aloft.lib.lang.types.base.V;
import org.extendedweb.aloft.server.compiler.compile.base.functions.base.AloftFunctionObject;
import org.extendedweb.aloft.server.compiler.compile.base.register.CompiledObjectsRegister;
import org.extendedweb.aloft.server.compiler.compile.supporting.AloftAccess;
import org.extendedweb.aloft.server.compiler.compile.supporting.AloftVariable;
import org.extendedweb.aloft.server.grammar.antlr.AloftParser;

import java.util.ArrayList;
import java.util.HashMap;

public class AloftFunctionContainer {

    private AloftFunctionType type;
    private String name;
    private ArrayList<String> args;
    private AloftParser.Function_curly_blockContext body;
    private HashMap<String, AloftVariable> variables;
    private AloftFunctionDivider divider;

    public AloftFunctionContainer(AloftFunctionType type, String name, ArrayList<String> args, AloftParser.Function_curly_blockContext body, CompiledObjectsRegister register) {
        this.type = type;
        this.name = name;
        this.args = args;
        this.body = body;
        this.divider = new AloftFunctionDivider(body, variables, register);
    }

    public ArrayList<AloftFunctionObject> objects() {
        return null;
    }

    public JavaScriptObject js() {
        return null;
    }

    public AloftServerCode server() {
        return null;
    }

}
