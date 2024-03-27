package org.extendedweb.aloft.server.compiler.compile.base.objects;

import org.antlr.v4.runtime.ParserRuleContext;
import org.extendedweb.aloft.server.compiler.compile.base.register.CompiledObjectsRegister;
import org.extendedweb.aloft.server.compiler.compile.supporting.AloftObject;
import org.extendedweb.aloft.server.compiler.compile.supporting.AloftObjectProperty;
import org.extendedweb.aloft.server.compiler.exceptions.CompilerException;
import org.extendedweb.aloft.server.grammar.antlr.AloftParser;

import java.util.ArrayList;
import java.util.List;

public class FunctionAloftObject extends AloftObject {

    public FunctionAloftObject(ParserRuleContext ctx) throws CompilerException {
        super(ctx, null, null);
    }

    @Override
    public void properties(ArrayList<AloftObjectProperty> properties) {

    }

    @Override
    public boolean allowsWildcardProperties() {
        return false;
    }

    @Override
    public String namedVar() {
        return null;
    }

    @Override
    public void compile(List<AloftParser.SyntaxContext> syntax, CompiledObjectsRegister register) {

    }

    @Override
    public ArrayList<String> imports() {
        return null;
    }

    @Override
    public String extendsClassName() {
        return null;
    }

    @Override
    public String[] constructorArgs() {
        return new String[0];
    }


}
