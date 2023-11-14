package org.extendedweb.aloft.server.compiler.compile.supporting;

import org.antlr.v4.runtime.ParserRuleContext;
import org.extendedweb.aloft.lib.lang.types.t.DynamicT;
import org.extendedweb.aloft.lib.lang.types.t.StringT;
import org.extendedweb.aloft.server.grammar.antlr.AloftParser;
import org.extendedweb.aloft.utils.global.__;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public abstract class AloftObject implements CompilesAloftObjects {

    private String named = null;
    private ArrayList<AloftObjectProperty> defaultProperties = new ArrayList<>();
    protected ArrayList<AloftObjectProperty> properties = new ArrayList<>();
    private Class<?> type = null;
    protected ArrayList<AloftObject> objects;
    private AloftComponentClass c = null;

    public AloftObject(ParserRuleContext ctx) {
        properties(defaultProperties);
        List<AloftParser.SyntaxContext> syntax = preCompile(ctx);
        this.objects = compile(syntax);
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
    public void parseProperties(List<AloftParser.SyntaxContext> syntax) {
        System.out.println("PARSE PROPS");
        for(AloftParser.SyntaxContext ctx : syntax) {
            AloftParser.PropertyContext pCtx = ctx.property();
            if(!__.isset(pCtx)) throw new RuntimeException("TEST");
            AloftParser.Var_nameContext varCtx = pCtx.var_name();
            if(!__.isset(varCtx)) throw new RuntimeException("VAR NAME NOT SET");
            String var_name = varCtx.getText();
            AloftParser.Property_valueContext pValCtx = pCtx.property_value();
            if(!__.isset(pValCtx)) throw new RuntimeException("VAR VALUE NOT SET");
            String var_value = pValCtx.getText();
            AloftObjectProperty property = findProperty(var_name);
            if(!__.isset(property)) throw new RuntimeException("INVALID PROPERTY");
            properties.add(property.cloneProperty(var_value));
            System.out.println(var_name + " = " + var_value);
        }
    }

    private AloftObjectProperty findProperty(String name) {
        for(AloftObjectProperty prop : defaultProperties) {
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
