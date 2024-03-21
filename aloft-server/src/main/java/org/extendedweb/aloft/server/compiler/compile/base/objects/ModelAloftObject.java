package org.extendedweb.aloft.server.compiler.compile.base.objects;

import org.antlr.v4.runtime.ParserRuleContext;
import org.extendedweb.aloft.lib._AloftModel;
import org.extendedweb.aloft.lib.lang.types.base.T;
import org.extendedweb.aloft.lib.model.AloftModelCollection;
import org.extendedweb.aloft.lib.model.AloftModelQuery;
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

public class ModelAloftObject extends AloftObject {

    private DbObject connection;

    public ModelAloftObject(ParserRuleContext ctx, CompiledObjectsRegister register, File file) throws CompilerException {
        super(ctx, register, file);
    }

    public static ModelAloftObject createIf(List<AloftParser.SyntaxContext> root, CompiledObjectsRegister register, int index, File file) {
        try {
            Object element = root.get(index);
            Method method = element.getClass().getMethod(getMethod());
            Object ctx = getContextClass().cast(method.invoke(element));
            if(!__.isset(ctx)) return null;
            return new ModelAloftObject((ParserRuleContext) getContextClass().cast(ctx), register, file);
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
    public ArrayList<AloftObject> compile(List<AloftParser.SyntaxContext> syntax, CompiledObjectsRegister register) throws CompilerException {
        parseVariables(syntax, register);
        parseFunctions(syntax, register);
        return null;
    }

    public _AloftModel getCompiled() {
        return new _AloftModel(modelName(), connectionName()) {

            @Override
            public HashMap<String, T> fields() {
                return createFields();
            }

            @Override
            public void query(AloftModelQuery aloftModelQuery) {

            }

            @Override
            public AloftModelCollection getQuery(AloftModelQuery aloftModelQuery) {
                return null;
            }

        };
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
