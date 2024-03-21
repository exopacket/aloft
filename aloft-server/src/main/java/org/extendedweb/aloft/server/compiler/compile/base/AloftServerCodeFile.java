package org.extendedweb.aloft.server.compiler.compile.base;

import org.extendedweb.aloft.lib.lang.types.base.V;

import java.util.ArrayList;

public class AloftServerCodeFile {

    private AloftServerCodeClassType type;
    private String pkg;
    private ArrayList<String> imports;
    private ArrayList<AloftServerVariable> variables;
    private ArrayList<AloftServerFunction> functions;

    public AloftServerCodeFile(AloftServerCodeClassType type, String pkg) {
        this.pkg = pkg;
        if(type == AloftServerCodeClassType.FUNCTION) functionDefaults();
    }

    public static AloftServerCodeFile createFunction(String pkg, String name, ArrayList<String> args) {
        return new AloftServerCodeFile(AloftServerCodeClassType.FUNCTION, pkg);
    }

    public AloftServerJavaFile getFile() {
        return getFile(new ArrayList<>());
    }

    public AloftServerJavaFile getFile(ArrayList<AloftServerVariable> scope) {
        return new AloftServerJavaFile(pkg, imports, scope, variables, functions);
    }

    public void function() {

    }

    private void functionDefaults() {

    }

}
