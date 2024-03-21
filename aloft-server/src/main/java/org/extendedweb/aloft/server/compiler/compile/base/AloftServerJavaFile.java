package org.extendedweb.aloft.server.compiler.compile.base;

import org.extendedweb.aloft.utils.data.Hex;
import org.extendedweb.aloft.utils.encryption.A32;
import org.extendedweb.aloft.utils.encryption.Rand;

import java.io.File;
import java.util.ArrayList;

public class AloftServerJavaFile {

    private String id;
    private StringBuilder file;

    public AloftServerJavaFile(String pkg, ArrayList<String> imports, ArrayList<AloftServerVariable> scope, ArrayList<AloftServerVariable> variables, ArrayList<AloftServerFunction> functions) {
        this.id = Rand.letter(String.valueOf(System.nanoTime())) + A32.get(Hex.getHex(Rand.generateIv(64)));
        appendPackage(pkg);
        appendImports(imports);
        createClass();
        appendVariables(includesScope(scope, variables, functions));
        createScopedConstructor(neededFromScope(scope, variables, functions));
        appendFunctions(functions);
        closeClass();
    }

    public AloftServerJavaFile(String pkg, ArrayList<String> imports, String toExtend, ArrayList<AloftServerVariable> scope, ArrayList<AloftServerVariable> variables, ArrayList<AloftServerFunction> functions) {
        this.id = Rand.letter(String.valueOf(System.nanoTime())) + A32.get(Hex.getHex(Rand.generateIv(64)));
        appendPackage(pkg);
        appendImports(imports);
        createClass(toExtend);
        appendVariables(includesScope(scope, variables, functions));
        createScopedConstructor(neededFromScope(scope, variables, functions));
        appendFunctions(functions);
        closeClass();
    }

    private void appendPackage(String pkg) {
        file.append(pkg).append(';');
        nl(2);
    }

    private void appendImports(ArrayList<String> imports) {
        for(String str : imports) {
            file.append("import").append(' ').append(str).append(';');
            nl();
        }
        nl();
    }

    private void createClass() {
        file.append("public class").append(' ').append(id).append(' ').append('{');
        nl(2);
    }

    private void createClass(String toExtend) {
        file.append("public class").append(' ').append(id).append(' ').append("extends").append(' ').append(toExtend).append(' ').append('{');
        nl(2);
    }

    private void closeClass() {
        nl();
        file.append("}");
    }

    private ArrayList<AloftServerVariable> includesScope(ArrayList<AloftServerVariable> scope, ArrayList<AloftServerVariable> vars, ArrayList<AloftServerFunction> functions) {
        return scope;
    }

    private ArrayList<AloftServerVariable> neededFromScope(ArrayList<AloftServerVariable> scope, ArrayList<AloftServerVariable> variables, ArrayList<AloftServerFunction> functions) {
        return scope;
    }

    //TODO
    private void createScopedConstructor(ArrayList<AloftServerVariable> scope) {

    }

    private void appendVariables(ArrayList<AloftServerVariable> vars) {
        for(AloftServerVariable var : vars) {
            file.append(var.getDeclaration()).append(';');
            nl();
        }
        nl();
    }

    private void appendFunctions(ArrayList<AloftServerFunction> funcs) {
        for(AloftServerFunction func : funcs) {
            file.append(func.getCode()).append(';');
            nl();
        }
        nl();
    }

    private void nl() {
        nl(1);
    }

    private void nl(int num) {
        for(int i=0; i<num; i++) file.append('\n');
    }

    public String getId() {
        return id;
    }

    public String getCompiled() {
        return file.toString();
    }

    public File write(String path) {
        return null;
    }

    public File write(String path, String name) {
        return null;
    }

}
