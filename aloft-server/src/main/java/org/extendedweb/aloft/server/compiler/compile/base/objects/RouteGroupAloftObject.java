package org.extendedweb.aloft.server.compiler.compile.base.objects;

import org.antlr.v4.runtime.ParserRuleContext;
import org.extendedweb.aloft.lib._AloftComponent;
import org.extendedweb.aloft.lib._AloftRoute;
import org.extendedweb.aloft.lib.application.cache.RouteCache;
import org.extendedweb.aloft.lib.lang.types.t.StringT;
import org.extendedweb.aloft.server.compiler.compile.base.register.CompiledObjectsRegister;
import org.extendedweb.aloft.server.compiler.compile.supporting.AloftObject;
import org.extendedweb.aloft.server.compiler.compile.supporting.AloftObjectProperty;
import org.extendedweb.aloft.server.compiler.compile.supporting.ComponentTreeT;
import org.extendedweb.aloft.server.grammar.antlr.AloftParser;
import org.extendedweb.aloft.utils.global.__;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class RouteGroupAloftObject extends AloftObject {

    public RouteGroupAloftObject(ParserRuleContext ctx, CompiledObjectsRegister register) {
        super(ctx, register);
    }

    public static RouteGroupAloftObject createIf(List<AloftParser.SyntaxContext> root, CompiledObjectsRegister register, int index) {
        try {
            Object element = root.get(index);
            Method method = element.getClass().getMethod(getMethod());
            Object ctx = getContextClass().cast(method.invoke(element));
            if(!__.isset(ctx)) return null;
            return new RouteGroupAloftObject((ParserRuleContext) getContextClass().cast(ctx), register);
        } catch (Exception ignored) { }
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
    public ArrayList<AloftObject> compile(List<AloftParser.SyntaxContext> syntax, CompiledObjectsRegister register) {
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
