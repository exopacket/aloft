package org.extendedweb.aloft.server.compiler.compile.supporting;

import org.antlr.v4.runtime.ParserRuleContext;
import org.extendedweb.aloft.server.grammar.antlr.AloftParser;

import java.util.ArrayList;
import java.util.List;

public interface CompilesAloftObjects {
    //abstract
    void properties(ArrayList<AloftObjectProperty> properties);
    boolean allowsWildcardProperties();
    String namedVar();
    ArrayList<AloftObject> compile(List<AloftParser.SyntaxContext> syntax);

    //super implemented
    void named(String named);
    void type(Class<?> c);
    List<AloftParser.SyntaxContext> preCompile(ParserRuleContext ctx);
    void parseProperties(List<AloftParser.SyntaxContext> syntax);
}
