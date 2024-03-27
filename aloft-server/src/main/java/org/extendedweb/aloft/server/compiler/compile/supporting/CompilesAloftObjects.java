package org.extendedweb.aloft.server.compiler.compile.supporting;

import org.antlr.v4.runtime.ParserRuleContext;
import org.extendedweb.aloft.server.compiler.compile.base.AloftFunction;
import org.extendedweb.aloft.server.compiler.compile.base.register.CompiledObjectsRegister;
import org.extendedweb.aloft.server.compiler.exceptions.CompilerException;
import org.extendedweb.aloft.server.grammar.antlr.AloftParser;

import java.util.ArrayList;
import java.util.List;

public interface CompilesAloftObjects {
    //abstract
    void properties(ArrayList<AloftObjectProperty> properties);
    boolean allowsWildcardProperties();
    String namedVar();
    void compile(List<AloftParser.SyntaxContext> syntax, CompiledObjectsRegister register) throws CompilerException;
    ArrayList<String> imports();
    String className();
    String extendsClassName();
    String[] constructorArgs();

    //super implemented
    void named(String named);
    void type(Class<?> c);
    List<AloftParser.SyntaxContext> preCompile(ParserRuleContext ctx);
    void parseProperties(List<AloftParser.SyntaxContext> syntax, CompiledObjectsRegister register) throws CompilerException;
    void parseVariables(List<AloftParser.SyntaxContext> syntax, CompiledObjectsRegister register) throws CompilerException;
    void parseFunctions(List<AloftParser.SyntaxContext> syntax, CompiledObjectsRegister register) throws CompilerException;
    ArrayList<AloftFunction> getFunctions();
}
