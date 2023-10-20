package com.inteliense.aloft.server.html.elements.js;

import java.util.ArrayList;
import java.util.HashMap;

public class JavaScriptRefMapper {

    private HashMap<Integer, ArrayList<String>> placedRefs = new HashMap<>();
    private HashMap<Integer, ArrayList<JavaScriptVariableRef>> variableRefs = new HashMap<>();
    private HashMap<Integer, ArrayList<JavaScriptFunctionRef>> functionRefs = new HashMap<>();

    public JavaScriptRefMapper() { }

    public void syncRefs(HashMap<Integer, ArrayList<String>> placedRefs) {
        this.placedRefs.clear();
        this.placedRefs.putAll(placedRefs);
    }

    public void syncVariableRefs(HashMap<Integer, ArrayList<JavaScriptVariableRef>> variableRefs) {
        this.variableRefs.clear();
        this.variableRefs.putAll(variableRefs);
    }

    public void syncFunctionRefs(HashMap<Integer, ArrayList<JavaScriptFunctionRef>> functionRefs) {
        this.functionRefs.clear();
        this.functionRefs.putAll(functionRefs);
    }

    public HashMap<Integer, ArrayList<String>> getPlacedRefs() {
        return placedRefs;
    }

    public HashMap<Integer, ArrayList<JavaScriptFunctionRef>> getFunctionRefs() {
        return functionRefs;
    }

    public HashMap<Integer, ArrayList<JavaScriptVariableRef>> getVariableRefs() {
        return variableRefs;
    }

    public ArrayList<JavaScriptFunctionRef> getAllFunctionRefs() {
        ArrayList<JavaScriptFunctionRef> refs = new ArrayList<>();
        for(Integer key : functionRefs.keySet()) refs.addAll(functionRefs.get(key));
        return refs;
    }

    public ArrayList<JavaScriptVariableRef> getAllVariableRefs() {
        ArrayList<JavaScriptVariableRef> refs = new ArrayList<>();
        for(Integer key : variableRefs.keySet()) refs.addAll(variableRefs.get(key));
        return refs;
    }

}
