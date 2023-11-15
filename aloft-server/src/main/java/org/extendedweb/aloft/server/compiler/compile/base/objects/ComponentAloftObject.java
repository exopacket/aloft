package org.extendedweb.aloft.server.compiler.compile.base.objects;

import org.antlr.v4.runtime.ParserRuleContext;
import org.extendedweb.aloft.lib._AloftComponent;
import org.extendedweb.aloft.lib._AloftPage;
import org.extendedweb.aloft.lib.application.cache.RouteCache;
import org.extendedweb.aloft.lib.lang.supporting.MountableComponent;
import org.extendedweb.aloft.lib.lang.types.t.StringT;
import org.extendedweb.aloft.server.compiler.compile.base.register.CompiledObjectsRegister;
import org.extendedweb.aloft.server.compiler.compile.supporting.AloftObject;
import org.extendedweb.aloft.server.compiler.compile.supporting.AloftObjectProperty;
import org.extendedweb.aloft.server.compiler.compile.supporting.ComponentTreeT;
import org.extendedweb.aloft.server.grammar.antlr.AloftParser;
import org.extendedweb.aloft.utils.global.__;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class ComponentAloftObject extends AloftObject {

    public ComponentAloftObject(ParserRuleContext ctx, CompiledObjectsRegister register) {
        super(ctx, register);
    }

    public static ComponentAloftObject createIf(List<AloftParser.SyntaxContext> root, CompiledObjectsRegister register, int index) {
        try {
            Object element = root.get(index);
            Method method = element.getClass().getMethod(getMethod());
            Object ctx = getContextClass().cast(method.invoke(element));
            if(!__.isset(ctx)) return null;
            return new ComponentAloftObject((ParserRuleContext) getContextClass().cast(ctx), register);
        } catch (Exception ignored) { }
        return null;
    }

    @Override
    public void properties(ArrayList<AloftObjectProperty> properties) {
        properties.add(new AloftObjectProperty("root", new ComponentTreeT(), true));
        properties.add(new AloftObjectProperty("favicon", new StringT(), false));
        properties.add(new AloftObjectProperty("title", new StringT(),false));
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
    public ArrayList<AloftObject> compile(List<AloftParser.SyntaxContext> syntax, CompiledObjectsRegister register) {
        parseVariables(syntax, register);
        parseProperties(syntax);
        parseFunctions(syntax, register); //TODO remove for page
        return null;
    }

    public _AloftComponent getCompiled(RouteCache routes) {
        return null;
    }

    public static String getMethod() {
        return "component";
    }

    public static Class<?> getContextClass() {
        return AloftParser.ComponentContext.class;
    }

    public static Class<?> getObjectClass() {
        return null;
    }
}
