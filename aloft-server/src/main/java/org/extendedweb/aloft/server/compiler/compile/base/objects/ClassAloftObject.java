package org.extendedweb.aloft.server.compiler.compile.base.objects;

import org.antlr.v4.runtime.ParserRuleContext;
import org.extendedweb.aloft.lib.lang.types.base.T;
import org.extendedweb.aloft.server.compiler.compile.base.register.CompiledObjectsRegister;
import org.extendedweb.aloft.server.compiler.compile.supporting.AloftObject;
import org.extendedweb.aloft.server.compiler.compile.supporting.AloftObjectProperty;
import org.extendedweb.aloft.server.compiler.exceptions.CompilerException;
import org.extendedweb.aloft.server.grammar.antlr.AloftParser;
import org.extendedweb.aloft.utils.global.__;

import java.io.File;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ClassAloftObject extends AloftObject {

    private DbObject connection;

    public ClassAloftObject(ParserRuleContext ctx, CompiledObjectsRegister register, File file) throws CompilerException {
        super(ctx, register, file);
    }

    public static ClassAloftObject createIf(List<AloftParser.SyntaxContext> root, CompiledObjectsRegister register, int index, File file) {
        try {
            Object element = root.get(index);
            Method method = element.getClass().getMethod(getMethod());
            Object ctx = getContextClass().cast(method.invoke(element));
            if(!__.isset(ctx)) return null;
            return new ClassAloftObject((ParserRuleContext) getContextClass().cast(ctx), register, file);
        } catch (Exception ignored) { } catch (CompilerException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    public void linkConnection(DbObject object) {
        this.connection = object;
    }

    public String connectionName() {
        if(getName().contains("@")) return getName().split("@")[1];
        return "default";
    }

    public String modelName() {
        if(getName().contains("@")) return getName().split("@")[0];
        return getName();
    }

    @Override
    public void properties(ArrayList<AloftObjectProperty> properties) { }

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

    private HashMap<String, T> createFields() {
        HashMap<String, T> fields = new HashMap<>();



        return fields;
    }

    public static String getMethod() {
        return "model";
    }

    public static Class<?> getContextClass() {
        return AloftParser.ModelContext.class;
    }

    public static Class<?> getObjectClass() {
        return null;
    }

}
