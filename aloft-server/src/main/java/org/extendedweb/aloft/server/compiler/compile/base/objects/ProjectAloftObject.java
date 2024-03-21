package org.extendedweb.aloft.server.compiler.compile.base.objects;

import org.antlr.v4.runtime.ParserRuleContext;
import org.extendedweb.aloft.lib._AloftRoute;
import org.extendedweb.aloft.server.compiler.compile.base.register.CompiledObjectsRegister;
import org.extendedweb.aloft.server.compiler.compile.supporting.AloftObject;
import org.extendedweb.aloft.server.compiler.compile.supporting.AloftObjectProperty;
import org.extendedweb.aloft.server.compiler.exceptions.CompilerException;
import org.extendedweb.aloft.server.grammar.antlr.AloftParser;
import org.extendedweb.aloft.utils.global.__;

import java.io.File;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class ProjectAloftObject extends AloftObject {

    public ProjectAloftObject(ParserRuleContext ctx, CompiledObjectsRegister register, File file) throws CompilerException {
        super(ctx, register, file);
    }

    public static ProjectAloftObject createIf(List<AloftParser.SyntaxContext> root, CompiledObjectsRegister register, int index, File file) {
        try {
            Object element = root.get(index);
            Method method = element.getClass().getMethod(getMethod());
            Object ctx = getContextClass().cast(method.invoke(element));
            if(!__.isset(ctx)) return null;
            return new ProjectAloftObject((ParserRuleContext) getContextClass().cast(ctx), register, file);
        } catch (Exception ignored) { } catch (CompilerException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    @Override
    public void properties(ArrayList<AloftObjectProperty> properties) { }

    @Override
    public boolean allowsWildcardProperties() {
        return true;
    }

    @Override
    public String namedVar() {
        return "path";
    }

    @Override
    public ArrayList<AloftObject> compile(List<AloftParser.SyntaxContext> syntax, CompiledObjectsRegister register) throws CompilerException {
        parseProperties(syntax);
        return null;
    }

    public ArrayList<_AloftRoute> getCompiled() {
        return null;
    }

    public static String getMethod() {
        return "routes";
    }

    public static Class<?> getContextClass() {
        return AloftParser.RoutesContext.class;
    }

    public static Class<?> getObjectClass() {
        return null;
    }

}
