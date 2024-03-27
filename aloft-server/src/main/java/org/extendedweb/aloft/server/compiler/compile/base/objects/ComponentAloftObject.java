package org.extendedweb.aloft.server.compiler.compile.base.objects;

import org.antlr.v4.runtime.ParserRuleContext;
import org.extendedweb.aloft.lib.lang.structure.components.AloftComponent;
import org.extendedweb.aloft.lib.lang.structure.elements.types.TextAloftElement;
import org.extendedweb.aloft.server.compiler.compile.base.register.CompiledObjectsRegister;
import org.extendedweb.aloft.server.compiler.compile.supporting.*;
import org.extendedweb.aloft.server.compiler.exceptions.CompilerException;
import org.extendedweb.aloft.server.grammar.antlr.AloftParser;
import org.extendedweb.aloft.utils.global.__;

import java.io.File;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class ComponentAloftObject extends AloftObject {

    private AloftComponentClass mount;

    public ComponentAloftObject(ParserRuleContext ctx, CompiledObjectsRegister register, File file) throws CompilerException {
        super(ctx, register, file);
        System.out.println("MADE IT x2");
    }

    public static ComponentAloftObject createIf(List<AloftParser.SyntaxContext> root, CompiledObjectsRegister register, int index, File file) {
        try {
            Object element = root.get(index);
            Method method = element.getClass().getMethod(getMethod());
            Object ctx = getContextClass().cast(method.invoke(element));
            System.out.println(__.isset(ctx));
            if(!__.isset(ctx)) return null;
            return new ComponentAloftObject((ParserRuleContext) getContextClass().cast(ctx), register, file);
        } catch (Exception e) { e.printStackTrace(); } catch (CompilerException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    @Override
    public void properties(ArrayList<AloftObjectProperty> properties) {
        properties.add(new AloftObjectProperty("mount", new BuiltComponentContainerT(), true));
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
    public void compile(List<AloftParser.SyntaxContext> syntax, CompiledObjectsRegister register) throws CompilerException {
        parseVariables(syntax, register);
        parseFunctions(syntax, register);
        parseProperties(syntax, register);
        register.getComponentsRegister().register(getName(), this.mount);
    }

    @Override
    public void parseProperties(List<AloftParser.SyntaxContext> syntax, CompiledObjectsRegister register) throws CompilerException {
        System.out.println("PARSE PROPS");
        for(AloftParser.SyntaxContext ctx : syntax) {
            AloftParser.PropertyContext pCtx = ctx.property();
            if(!__.isset(pCtx)) continue;
            AloftParser.Var_nameContext varCtx = pCtx.var_name();
            String var_name = varCtx.getText();
            if(!__.same(var_name, "mount")) {
                new ContextContainer(varCtx, file).e("Invalid property name for a component. 'mount' is the only allowed property.", CompilerException.ExceptionType.CRITICAL);
                continue;
            }
            AloftParser.Component_treeContext componentCtx = pCtx.property_value().component_tree();
            ContextContainer valueCtx = new ContextContainer(componentCtx, file);
            if(!__.isset(componentCtx)) {
                valueCtx.e("Invalid component tree.", CompilerException.ExceptionType.FATAL);
                continue;
            }
            AloftComponent component = new BuiltComponentContainerT().value(new ContextContainer(componentCtx, file), register).get();
            AloftComponentClass aloftComponentClass = new AloftComponentClass(component);
            this.mount = aloftComponentClass;
        }
        System.out.println("DONE");
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

    public static String getMethod() {
        return "component";
    }

    public static Class<?> getContextClass() {
        return AloftParser.ComponentContext.class;
    }

    public static Class<?> getObjectClass() {
        return AloftComponent.class;
    }
}
