package com.inteliense.aloft.compiler.lang.keywords.listeners.base;

import com.inteliense.aloft.compiler.lang.base.BuildsJavascript;
import com.inteliense.aloft.compiler.lang.keywords.elements.base.validation.Validator;
import com.inteliense.aloft.server.html.elements.HtmlElement;
import com.inteliense.aloft.server.html.elements.js.JavaScriptObject;
import com.inteliense.aloft.server.html.elements.js.JSOV;
import com.inteliense.aloft.server.html.elements.js.types.ElementRef;
import com.inteliense.aloft.server.html.elements.js.types.FunctionObject;
import com.inteliense.aloft.utils.global.__;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class AloftListener implements BuildsJavascript {

    protected ArrayList<String> required = new ArrayList<>();
    protected ArrayList<JSOV> vars;
    protected String elementKey;
    protected HtmlElement element;
    protected ElementRef ref;
    protected ElementRef root;
    protected String childRef = null;
    protected Validator validator = null;

    protected abstract JavaScriptObject create();

    @Override
    public JavaScriptObject getObject() {
        int required = this.required.size();
        int listed = 0;
        for (JSOV variable : vars)
            if (this.required.contains(variable.key())) listed++;
        assert listed == required : "Required variables for listener are not present.";
        return create();
    }

    protected abstract ArrayList<String> required(ArrayList<String> vars);

    public AloftListener(JSOV...variables) {
        this.required = required(new ArrayList<>());
        this.vars = new ArrayList<>(Arrays.asList(variables));
    }

    public AloftListener(Validator validator, JSOV... variables) {
        this.validator = validator;
        this.required = required(new ArrayList<>());
        this.vars = new ArrayList<>(Arrays.asList(variables));
    }

    protected JavaScriptObject buildBase(String method) {
        JavaScriptObject base = new JavaScriptObject() {
            @Override
            public void create() {
                this.placeRef(FunctionArg.var("ref"));
                this.var(FunctionArg.var("ref"));
                this.chain("addEventListener", FunctionArg.preset(method), FunctionArg.var("function"));
                this.end();
                this.slot();
            }
        };
        base.setVars(new String[]{"ref", "function"});
        base.setVars(vars);
        base.build();
        FunctionObject func = new FunctionObject();
        func.setVars(new String[]{"function", "function-slot"});
        func.setVars(vars);
        if(__.isset(validator)) func.replaceVar("function-slot", validator.validation(root).build());
        JavaScriptObject funcSlot = func.getVar("function-slot").get();
        funcSlot.build();
        func.build();
        func.setSlot(funcSlot);
        base.setSlot(func);
        return base;
    }

    public void setRef() {
        this.root = element.ref();
        ElementRef ref = this.root.getChild(childRef);
        this.vars.add(JSOV.v("ref", ref));
        this.ref = ref;
    }

    public void setElement(String childRef, HtmlElement el) {
        this.childRef = childRef;
        this.element = el;
    }

    public void inline() {
        element.addChild(getObject().getJs());
    }
    public void setElementKey(String key) {
        this.elementKey = key;
    }

    public boolean match(String key) {
        return this.elementKey.equals(key);
    }

}
