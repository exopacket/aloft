package org.extendedweb.aloft.server.compiler.compile.base;

import org.extendedweb.aloft.lib.html.elements.js.JavaScriptObject;
import org.extendedweb.aloft.lib.lang.base.BuildsJavascript;
import org.extendedweb.aloft.server.compiler.compile.supporting.BuildsJava;
import org.extendedweb.aloft.server.grammar.antlr.AloftParser;

import java.util.ArrayList;

public class AloftFunctionContainer {

    private AloftFunctionType type;
    private String name;
    private ArrayList<String> args;
    private AloftParser.Curly_blockContext body;

    public AloftFunctionContainer(AloftFunctionType type, String name, ArrayList<String> args, AloftParser.Curly_blockContext body) {
        this.type = type;
        this.name = name;
        this.args = args;
        this.body = body;
    }

    public AloftFunction compile() {
        return null;
    }

}
