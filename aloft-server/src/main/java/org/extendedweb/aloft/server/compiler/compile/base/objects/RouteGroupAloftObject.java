package org.extendedweb.aloft.server.compiler.compile.base.objects;

import org.antlr.v4.runtime.ParserRuleContext;
import org.extendedweb.aloft.lib._AloftPage;
import org.extendedweb.aloft.lib.http.supporting.RequestType;
import org.extendedweb.aloft.lib.http.supporting.Route;
import org.extendedweb.aloft.lib.lang.types.t.PathT;
import org.extendedweb.aloft.server.compiler.compile.base.register.CompiledObjectsRegister;
import org.extendedweb.aloft.server.compiler.compile.supporting.AloftObject;
import org.extendedweb.aloft.server.compiler.compile.supporting.AloftObjectProperty;
import org.extendedweb.aloft.server.compiler.compile.supporting.ContextContainer;
import org.extendedweb.aloft.server.compiler.exceptions.CompilerException;
import org.extendedweb.aloft.server.grammar.antlr.AloftParser;
import org.extendedweb.aloft.utils.global.__;

import java.io.File;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class RouteGroupAloftObject extends AloftObject {

    public RouteGroupAloftObject(ParserRuleContext ctx, CompiledObjectsRegister register, File file) throws CompilerException {
        super(ctx, register, file);
    }

    public static RouteGroupAloftObject createIf(List<AloftParser.SyntaxContext> root, CompiledObjectsRegister register, int index, File file) {
        try {
            Object element = root.get(index);
            Method method = element.getClass().getMethod(getMethod());
            Object ctx = getContextClass().cast(method.invoke(element));
            if(!__.isset(ctx)) return null;
            return new RouteGroupAloftObject((ParserRuleContext) getContextClass().cast(ctx), register, file);
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
        return "var_name";
    }

    @Override
    public void compile(List<AloftParser.SyntaxContext> syntax, CompiledObjectsRegister register) throws CompilerException {
        System.out.println("PARSE PROPS - ROUTES");
        parseProperties(syntax, register);
        register.register(RouteGroupAloftObject.class, this, new ContextContainer(ctx, file));
        System.out.println(register.get(RouteGroupAloftObject.class, "default"));
        System.out.println("DONE WITH ROUTES");
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
            if(__.isset(property)) properties.add(property.cloneProperty(valueCtx));
            else if(allowsWildcardProperties()) properties.add(new AloftObjectProperty(var_name, new PathT(), false).cloneProperty(valueCtx));
            else new ContextContainer(varCtx, file).e("Unknown property name for object.", CompilerException.ExceptionType.CRITICAL);
            System.out.println(properties.size());
        }
        System.out.println("DONE");
    }

    public ArrayList<Route> getRoutes(CompiledObjectsRegister register) {
        ArrayList<Route> routes = new ArrayList<>();
        for(AloftObjectProperty route : properties)
            routes.add(buildRoute(route, register));
        return routes;
    }

    private static Route buildRoute(AloftObjectProperty route, CompiledObjectsRegister register) {
        String named = route.getName();
        String path = route.getValue().get();
        _AloftPage page = ((PageAloftObject) register.get(PageAloftObject.class, named)).getCompilerPage();
        System.out.println(page);
        return new Route(path, "GET", page);
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
        return "routes";
    }

    public static Class<?> getContextClass() {
        return AloftParser.RoutesContext.class;
    }

    public static Class<?> getObjectClass() {
        return null;
    }

}
