package org.extendedweb.aloft.server.compiler.compile.base.objects;

import org.extendedweb.aloft.lib.application.config.AppConfig;
import org.extendedweb.aloft.lib.db.internal.Db;
import org.extendedweb.aloft.lib.db.internal.supporting.DbType;
import org.extendedweb.aloft.server.compiler.compile.base.register.CompiledObjectsRegister;
import org.extendedweb.aloft.server.compiler.compile.supporting.AloftObject;
import org.extendedweb.aloft.server.compiler.compile.supporting.AloftObjectProperty;
import org.extendedweb.aloft.server.compiler.exceptions.CompilerException;
import org.extendedweb.aloft.server.grammar.antlr.AloftParser;

import java.util.ArrayList;
import java.util.List;

public class DbObject extends AloftObject {

    private DbType type;
    private Db db;

    public DbObject(Db connection) {
        super();
        db = connection;
    }

    public static void linkIf(ModelAloftObject model, CompiledObjectsRegister register, AppConfig config) throws CompilerException {
        String connectionName = model.connectionName();
        if(existsInRegistry(connectionName, register)) {
            DbObject db = getFromRegistry(connectionName, register);
            model.linkConnection(db);
        } else {
            DbObject db = new DbObject(config.db(connectionName));
            model.linkConnection(db);
            //TODO register in registry
        }
    }

    private static boolean existsInRegistry(String name, CompiledObjectsRegister register) {
        return register.exists(DbObject.class, name);
    }

    private static DbObject getFromRegistry(String name, CompiledObjectsRegister register) {
        return (DbObject) register.get(DbObject.class, name);
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
        parseFunctions(syntax, register); //TODO remove for page
        return null;
    }

    public Db getDb() {
        return db;
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
