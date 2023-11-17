package org.extendedweb.aloft.server.compiler.compile.base.objects;

import org.antlr.v4.runtime.ParserRuleContext;
import org.extendedweb.aloft.lib._AloftPage;
import org.extendedweb.aloft.lib.application.cache.RouteCache;
import org.extendedweb.aloft.lib.lang.supporting.MountableComponent;
import org.extendedweb.aloft.lib.lang.types.t.PathT;
import org.extendedweb.aloft.lib.lang.types.t.StringT;
import org.extendedweb.aloft.server.compiler.compile.base.register.CompiledObjectsRegister;
import org.extendedweb.aloft.server.compiler.compile.supporting.*;
import org.extendedweb.aloft.server.compiler.exceptions.CompilerException;
import org.extendedweb.aloft.server.grammar.antlr.AloftParser;
import org.extendedweb.aloft.utils.global.__;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class PageAloftObject extends AloftObject {

    public PageAloftObject(ParserRuleContext ctx, CompiledObjectsRegister register, File file) throws CompilerException {
        super(ctx, register, file);
    }

    public static PageAloftObject createIf(List<AloftParser.SyntaxContext> root, CompiledObjectsRegister register, int index, File file) throws CompilerException {
        try {
            Object element = root.get(index);
            Method method = element.getClass().getMethod(getMethod());
            Object ctx = getContextClass().cast(method.invoke(element));
            if(!__.isset(ctx)) return null;
            return new PageAloftObject((ParserRuleContext) getContextClass().cast(ctx), register, file);
        } catch (Exception e) { e.printStackTrace(); }
        return null;
    }

    @Override
    public void properties(ArrayList<AloftObjectProperty> properties) {
        properties.add(new AloftObjectProperty("favicon", new PathT(), false));
        properties.add(new AloftObjectProperty("title", new StringT(),false));
        properties.add(new AloftObjectProperty("root", new ComponentDefinitionT(), true));
    }

    @Override
    public boolean allowsWildcardProperties() {
        return false;
    }

    @Override
    public String namedVar() {
        return "var_name";
    }

    @Override
    public ArrayList<AloftObject> compile(List<AloftParser.SyntaxContext> syntax, CompiledObjectsRegister register) throws CompilerException {
        parseVariables(syntax, register);
        parseProperties(syntax);
        parseFunctions(syntax, register); //TODO remove for page
        return null;
    }

    public _AloftPage getCompiled(RouteCache routes) {
        return new _AloftPage("", "Test Page", "/") {
            @Override
            protected MountableComponent buildTree() throws InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
                return null;
            }
        };
    }

    public static String getMethod() {
        return "page";
    }

    public static Class<?> getContextClass() {
        return AloftParser.PageContext.class;
    }

    public static Class<?> getObjectClass() {
        return null;
    }
}
