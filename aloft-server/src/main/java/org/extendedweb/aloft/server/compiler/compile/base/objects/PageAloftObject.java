package org.extendedweb.aloft.server.compiler.compile.base.objects;

import org.antlr.v4.runtime.ParserRuleContext;
import org.extendedweb.aloft.lib._AloftPage;
import org.extendedweb.aloft.lib.lang.structure.AloftPage;
import org.extendedweb.aloft.lib.lang.structure.components.AloftComponent;
import org.extendedweb.aloft.lib.lang.supporting.MountableComponent;
import org.extendedweb.aloft.lib.lang.types.t.NamedT;
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

    private AloftComponent mount;

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
        properties.add(new AloftObjectProperty("mount", new NamedT(),true));
    }

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
        parseVariables(syntax, register);
        parseProperties(syntax, register);
//        parseFunctions(syntax, register); //TODO remove for page
        this.mount = register.getComponentsRegister().getComponent(getProperty("mount").get());
        register.register(PageAloftObject.class, this, new ContextContainer(ctx, file));
        System.out.println(this.mount);
    }

    @Override
    public ArrayList<String> imports() {
        ArrayList<String> imports = new ArrayList<>();
        imports.add("org.extendedweb.aloft.lib._AloftPage");
        imports.add("org.extendedweb.aloft.lib.lang.supporting.MountableComponent");
        imports.add("org.extendedweb.aloft.lib.tests.components._MyLoginForm");
        imports.add("java.lang.reflect.InvocationTargetException"); //FIXME
        return imports;
    }

    @Override
    public String extendsClassName() {
        return "_AloftPage";
    }

    @Override
    public String[] constructorArgs() {
        return new String[]{"null", "\"Hello World\"", "\"/\""};
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

    public _AloftPage getCompilerPage() {
        return new _AloftPage(null, "Hello World", "/") {
            @Override
            protected MountableComponent buildTree() throws InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
                System.out.println(PageAloftObject.this.mount);
                return mountable(PageAloftObject.this.mount.getClass());
            }
        };
    }

}
