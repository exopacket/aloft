package org.extendedweb.aloft.server.compiler.compile.base;

import org.extendedweb.aloft.lib.html.elements.js.JavaScriptObject;
import org.extendedweb.aloft.server.compiler.compile.base.functions.base.AloftFunctionObject;
import org.extendedweb.aloft.server.compiler.compile.base.register.CompiledObjectsRegister;
import org.extendedweb.aloft.server.compiler.compile.supporting.AloftVariable;
import org.extendedweb.aloft.server.grammar.antlr.AloftParser;

import java.util.ArrayList;
import java.util.HashMap;

public class AloftFunctionDivider {

    private AloftServerCode server;
    private JavaScriptObject js;

    public AloftFunctionDivider(AloftParser.Function_curly_blockContext ctx, HashMap<String, AloftVariable> variables, CompiledObjectsRegister register) {
        ArrayList<AloftFunctionObject> linkedObjects = AloftFunctionCompiler.compileChild(ctx, register);
        ArrayList<AloftFunctionObject> clientObjects = clientObjects(linkedObjects);
        ArrayList<AloftFunctionObject> serverObjects = serverObjects(linkedObjects);
        this.server = buildServer(serverObjects);
        this.js = buildJs(clientObjects);
    }

    public AloftServerCode getServer() {
        return server;
    }

    public JavaScriptObject getJs() {
        return js;
    }

    private JavaScriptObject buildJs(ArrayList<AloftFunctionObject> objects) {
        return null;
    }

    private AloftServerCode buildServer(ArrayList<AloftFunctionObject> objects) {
        return null;
    }

    private ArrayList<AloftFunctionObject> linkObjects(AloftFunctionContainer container) {
        return container.objects();
    }

    private ArrayList<AloftFunctionObject> clientObjects(ArrayList<AloftFunctionObject> objects) {
        return null;
    }

    private ArrayList<AloftFunctionObject> serverObjects(ArrayList<AloftFunctionObject> objects) {
        return null;
    }

}
