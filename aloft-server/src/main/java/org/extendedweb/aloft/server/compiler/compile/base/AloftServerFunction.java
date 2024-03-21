package org.extendedweb.aloft.server.compiler.compile.base;

import org.extendedweb.aloft.server.compiler.compile.base.functions.base.AloftFunctionObject;

import java.util.ArrayList;

public class AloftServerFunction {

    private ArrayList<AloftFunctionObject> objects = new ArrayList<>();
    ArrayList<String> constructorArgs;

    public AloftServerFunction() {

    }

    public void appendObject(AloftFunctionObject object) {
        objects.add(object);
    }

    public ArrayList<AloftServerVariable> variables(ArrayList<AloftServerVariable> current) {
        ArrayList<AloftServerVariable> list = new ArrayList<>();
        list.addAll(current);
        list.addAll(constructorArgs(current));
        list.addAll(functionArgs());
        return list;
    }

    public ArrayList<AloftServerVariable> constructorArgs(ArrayList<AloftServerVariable> current) {
        return new ArrayList<>();
    }

    public ArrayList<AloftServerVariable> functionArgs() {
        return new ArrayList<>();
    }

    public String getCode() {
        return "";
    }

}
