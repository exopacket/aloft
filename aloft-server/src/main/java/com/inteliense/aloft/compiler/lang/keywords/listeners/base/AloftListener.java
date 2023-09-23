package com.inteliense.aloft.compiler.lang.keywords.listeners.base;

import com.inteliense.aloft.compiler.lang.base.BuildsJavascript;
import com.inteliense.aloft.server.html.elements.js.JavaScriptObject;
import com.inteliense.aloft.server.html.elements.js.JSOV;
import com.inteliense.aloft.server.html.elements.js.types.FunctionObject;
import org.json.simple.JSONObject;

import java.util.ArrayList;

public abstract class AloftListener implements BuildsJavascript {

    protected ArrayList<String> required = new ArrayList<>();
    protected JSOV[] vars;

    protected abstract ArrayList<String> required(ArrayList<String> vars);

    public AloftListener(JSOV...variables) {
        this.required = required(new ArrayList<>());
        int required = this.required.size();
        int listed = 0;
        for (JSOV variable : variables)
            if (this.required.contains(variable.key())) listed++;
        assert listed == required : "Required variables for listener are not present.";
        this.vars = variables;
    }

    protected JavaScriptObject buildBase(String method) {
        JavaScriptObject base = new JavaScriptObject() {
            @Override
            public void create() {
                this.var("document");
                boolean multiple = getVar("multiple-elements").get();
                String selector = multiple ? "querySelectorAll" : "querySelector";
                this.chain(selector, FunctionArg.var("query"));
                this.chain("addEventListener", FunctionArg.preset(method), FunctionArg.var("function"));
                this.end();
                this.slot();
            }
        };
        base.setVars(new String[]{"query", "function", "multiple-elements"});
        base.setVars(vars);
        base.build();
        FunctionObject func = new FunctionObject();
        func.setVars(new String[]{"function", "function-slot"});
        func.setVars(vars);
        JavaScriptObject funcSlot = func.getVar("function-slot").get();
        funcSlot.build();
        func.build();
        func.setSlot(funcSlot);
        base.setSlot(func);
        return base;
    }

}
