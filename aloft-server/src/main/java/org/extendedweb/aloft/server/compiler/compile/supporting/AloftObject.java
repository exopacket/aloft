package org.extendedweb.aloft.server.compiler.compile.supporting;

import org.antlr.v4.runtime.ParserRuleContext;
import org.extendedweb.aloft.lib.lang.types.t.DynamicT;
import org.extendedweb.aloft.lib.lang.types.t.StringT;
import org.extendedweb.aloft.server.compiler.compile.base.AloftFunction;
import org.extendedweb.aloft.server.compiler.compile.base.AloftFunctionCompiler;
import org.extendedweb.aloft.server.compiler.compile.base.AloftFunctionContainer;
import org.extendedweb.aloft.server.compiler.compile.base.register.CompiledObjectsRegister;
import org.extendedweb.aloft.server.compiler.exceptions.CompilerException;
import org.extendedweb.aloft.server.grammar.antlr.AloftParser;
import org.extendedweb.aloft.utils.global.__;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public abstract class AloftObject implements CompilesAloftObjects {

    private String named = null;
    private ArrayList<AloftObjectProperty> defaultProperties = new ArrayList<>();
    protected ArrayList<AloftObjectProperty> properties = new ArrayList<>();
    protected ArrayList<AloftVariable> variables = new ArrayList<>();
    protected ArrayList<AloftFunctionContainer> functions = new ArrayList<>();
    private Class<?> type = null;
    protected ArrayList<AloftObject> objects;
    protected File file = null;
    private AloftComponentClass c = null;

    public AloftObject(ParserRuleContext ctx, CompiledObjectsRegister register, File file) throws CompilerException {
        this.file = file;
        properties(defaultProperties);
        List<AloftParser.SyntaxContext> syntax = preCompile(ctx);
        this.objects = compile(syntax, register);
    }

    @Override
    public List<AloftParser.SyntaxContext> preCompile(ParserRuleContext ctx) {
        try {
            Method method = ctx.getClass().getMethod(namedVar());
            ParserRuleContext result = (ParserRuleContext) method.invoke(ctx);
            named(result.getText());
            return getSyntaxFromContext(ctx);
        } catch (Exception e) { e.printStackTrace(); }
        return null;
    }

    private List<AloftParser.SyntaxContext> getSyntaxFromContext(ParserRuleContext ctx) {
        try {
            AloftParser.Curly_blockContext innerCtx = (AloftParser.Curly_blockContext) ctx.getClass().getMethod("curly_block").invoke(ctx);
            return innerCtx.syntax();
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void parseVariables(List<AloftParser.SyntaxContext> syntax, CompiledObjectsRegister register) {
        System.out.println("PARSE VARS");
        for(AloftParser.SyntaxContext ctx : syntax) {
            AloftParser.Declare_variableContext declareCtx = ctx.declare_variable();
            if(!__.isset(declareCtx)) continue;
            variables.addAll(AloftVariable.fromContext(declareCtx));
        }
        System.out.println("DONE");
    }

    @Override
    public void parseProperties(List<AloftParser.SyntaxContext> syntax) throws CompilerException {
        System.out.println("PARSE PROPS");
        for(AloftParser.SyntaxContext ctx : syntax) {
            AloftParser.PropertyContext pCtx = ctx.property();
            if(!__.isset(pCtx)) continue;
            AloftParser.Var_nameContext varCtx = pCtx.var_name();
            String var_name = varCtx.getText();
            AloftParser.Property_valueContext pValCtx = pCtx.property_value();
            ContextContainer valueCtx = new ContextContainer(pValCtx, file);
            String var_value = pValCtx.getText();
            AloftObjectProperty property = findProperty(var_name);
            if(__.isset(property)) properties.add(property.cloneProperty(valueCtx));
            else if(allowsWildcardProperties()) properties.add(new AloftObjectProperty(var_name, false).cloneProperty(valueCtx));
            else new ContextContainer(varCtx, file).e("Unknown property name for object.", CompilerException.ExceptionType.CRITICAL);
            System.out.println(var_name + " = " + var_value);
        }
        System.out.println("DONE");
    }

    @Override
    public void parseFunctions(List<AloftParser.SyntaxContext> syntax, CompiledObjectsRegister register) {
        System.out.println("PARSE FUNCTIONS");
        for(AloftParser.SyntaxContext ctx : syntax) {
            AloftParser.FunctionsContext fCtx = ctx.functions();
            if(!__.isset(fCtx)) continue;
            AloftFunctionContainer func = AloftFunctionCompiler.queue(fCtx, register);
            functions.add(func);
        }
        System.out.println("DONE");
    }

    private AloftObjectProperty findProperty(String name) {
        for(AloftObjectProperty prop : defaultProperties) {
            System.out.println(prop.getName());
            if(__.same(prop.getName(), name)) return prop;
        }
        return null;
    }

    @Override
    public void named(String named) {
        this.named = named;
    }

    @Override
    public void type(Class<?> c) {
        this.type = c;
    }

}
