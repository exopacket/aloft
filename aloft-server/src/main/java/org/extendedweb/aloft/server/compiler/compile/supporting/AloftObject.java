package org.extendedweb.aloft.server.compiler.compile.supporting;

import org.antlr.v4.runtime.ParserRuleContext;
import org.extendedweb.aloft.lib.lang.types.base.V;
import org.extendedweb.aloft.lib.lang.types.t.PathT;
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
    private List<AloftParser.SyntaxContext> syntax;
    protected File file = null;
    protected ParserRuleContext ctx;

    public AloftObject() { }

    public AloftObject(ParserRuleContext ctx, CompiledObjectsRegister register, File file) throws CompilerException {
        this.file = file;
        this.ctx = ctx;
        properties(defaultProperties);
        List<AloftParser.SyntaxContext> syntax = preCompile(ctx);
        this.syntax = syntax;
        compile(syntax, register);
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

    protected CompiledAloftObject getCompiled() {
        return null;
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
    public void parseProperties(List<AloftParser.SyntaxContext> syntax, CompiledObjectsRegister register) throws CompilerException {
        System.out.println("PARSE PROPS -- INNER");
        for(AloftParser.SyntaxContext ctx : syntax) {
            AloftParser.PropertyContext pCtx = ctx.property();
            System.out.println(pCtx.getText());
            if(!__.isset(pCtx)) continue;
            AloftParser.Var_nameContext varCtx = pCtx.var_name();
            String var_name = varCtx.getText();
            AloftParser.Property_valueContext pValCtx = pCtx.property_value();
            ContextContainer valueCtx = new ContextContainer(pValCtx, file);
            String var_value = pValCtx.getText();
            System.out.println("var_name=" + var_name);
            System.out.println("var_value=" + var_value);
            AloftObjectProperty property = findProperty(var_name);
            System.out.println("TEST=" + __.isset(property));
            System.out.println("v=" + property.cloneProperty(valueCtx).getType().getClass());
            if(__.isset(property)) properties.add(property.cloneProperty(valueCtx));
            else if(allowsWildcardProperties()) properties.add(new AloftObjectProperty(var_name, new PathT(), false).cloneProperty(valueCtx));
            else new ContextContainer(varCtx, file).e("Unknown property name for object.", CompilerException.ExceptionType.CRITICAL);
            System.out.println(properties.size());
        }
        System.out.println("DONE");
    }

    protected V getProperty(String key) {
        System.out.println(key);
        for(AloftObjectProperty prop : properties) {
            System.out.println(prop.getName());
            if(__.same(prop.getName(), key)) return prop.getValue();
        }
        return V.nothing();
    }

    @Override
    public void parseFunctions(List<AloftParser.SyntaxContext> syntax, CompiledObjectsRegister register) throws CompilerException {
        for(AloftParser.SyntaxContext ctx : syntax) {
            AloftParser.UpdateContext fCtx = ctx.update();
            if(!__.isset(fCtx)) continue;
            AloftFunctionContainer func = AloftFunctionCompiler.compile(this, fCtx, register);
            if(__.isset(func)) functions.add(func);
            else new ContextContainer(fCtx, file).e("Duplicate function name.", CompilerException.ExceptionType.FATAL);
        }
        for(AloftParser.SyntaxContext ctx : syntax) {
            AloftParser.FunctionContext fCtx = ctx.function();
            if(!__.isset(fCtx)) continue;
            AloftFunctionContainer func = AloftFunctionCompiler.compile(this, fCtx, register, false);
            if(__.isset(func)) functions.add(func);
            else new ContextContainer(fCtx, file).e("Duplicate function name.", CompilerException.ExceptionType.FATAL);
        }
    }

    public AloftFunctionContainer getFunctionByName(String name, CompiledObjectsRegister register) throws CompilerException {
        //todo check for array typed functions
        for(AloftParser.SyntaxContext ctx : syntax) {
            AloftParser.FunctionContext fCtx = ctx.function();
            if(!__.isset(fCtx)) continue;
            String curName = AloftFunctionCompiler.getFunctionName(fCtx.function_declaration(), register, this);
            if(!__.same(curName, name)) continue;
            return AloftFunctionCompiler.compile(this, fCtx, register, true);
        }
        return null;
    }

    @Override
    public ArrayList<AloftFunction> getFunctions() {
        ArrayList<AloftFunction> list = new ArrayList<>();
        for(AloftFunctionContainer container : functions) {
            list.add(new AloftFunction(container));
        }
        return list;
    }

    public boolean functionExists(String functionName, boolean isArray, ArrayList<String> args) {
        for(AloftFunctionContainer func : functions) {
            boolean exists = true;
            if(!__.same(func.getName(), functionName)) continue;
            if(func.isArray() != isArray) exists = false;
            if(func.getArgs().size() != args.size()) exists = false;
            return exists;
        }
        return false;
    }

    protected void registration(CompiledObjectsRegister register) {

    }

    @Override
    public String className() {
        return "_" + named + extendsClassName();
    }

    protected AloftObjectProperty findProperty(String name) {
        for(AloftObjectProperty prop : defaultProperties) {
            System.out.println("propName=" + prop.getName());
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

    public String getName() {
        return named;
    }

}
