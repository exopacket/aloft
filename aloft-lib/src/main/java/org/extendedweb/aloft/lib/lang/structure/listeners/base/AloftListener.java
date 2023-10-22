package org.extendedweb.aloft.lib.lang.structure.listeners.base;

import org.extendedweb.aloft.lib.lang.base.BuildsJavascript;
import org.extendedweb.aloft.lib.lang.structure.elements.base.validation.Validator;
import org.extendedweb.aloft.lib.html.elements.HtmlElement;
import org.extendedweb.aloft.lib.html.elements.js.JavaScriptFunctionRef;
import org.extendedweb.aloft.lib.html.elements.js.JavaScriptObject;
import org.extendedweb.aloft.lib.html.elements.js.JSOV;
import org.extendedweb.aloft.lib.html.elements.js.JavaScriptRefMapper;
import org.extendedweb.aloft.lib.html.elements.js.types.ElementRef;
import org.extendedweb.aloft.lib.html.elements.js.types.FunctionObject;
import org.extendedweb.aloft.utils.global.__;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

public abstract class AloftListener implements BuildsJavascript {

    protected ArrayList<String> required = new ArrayList<>();
    protected ArrayList<JSOV> vars;
    protected String elementKey;
    protected HtmlElement element;
    protected ElementRef ref;
    protected ElementRef root;
    protected String childRef = null;
    protected Validator validator = null;
    protected JavaScriptRefMapper mapper = null;

    protected abstract JavaScriptObject create();

    @Override
    public JavaScriptObject getObject() {
        int required = this.required.size();
        int listed = 0;
        for (JSOV variable : vars)
            if (this.required.contains(variable.key())) listed++;
        assert listed == required : "Required variables for listener are not present.";
        return (__.isset(mapper)) ? create().build(mapper) : create().build();
    }

    protected abstract ArrayList<String> required(ArrayList<String> vars);

    public AloftListener(JSOV...variables) {
        this.required = required(new ArrayList<>());
        this.vars = new ArrayList<>(Arrays.asList(variables));
    }

    public AloftListener(Validator validator, JavaScriptRefMapper mapper, JSOV... variables) {
        this.validator = validator;
        this.required = required(new ArrayList<>());
        this.vars = new ArrayList<>(Arrays.asList(variables));
        this.mapper = mapper;
    }

    protected JavaScriptObject buildBase(String method) {

        FunctionObject func = new FunctionObject();
        func.setVars(new String[]{"function", "function-slot"});
        func.setVars(vars);
        if(__.isset(validator)) func.replaceVar("function-slot", validator.validation(root));
        JavaScriptObject funcSlot = func.getVar("function-slot").get();
        funcSlot.build();
        func.build();
        JavaScriptFunctionRef functionRef = func.getRef();
        func.setSlot(funcSlot);

        JavaScriptObject base = new JavaScriptObject() {
            @Override
            public void create() {
                this.placeRef(ref);
                this.variable(ref.getId());
                this.chain("addEventListener", FunctionArg.preset(method), FunctionArg.ref(functionRef, false));
                this.end();
                this.slot();
            }
        };
        base.setVars(new String[]{"ref", "function"});
        base.setVars(vars);
        base.setSlot(func);
        return base.build();
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

    public void setMapper(AtomicReference<JavaScriptRefMapper> mapper) {
        this.mapper = mapper.get();
    }

    public void setMapper(JavaScriptRefMapper mapper) {
        this.mapper = mapper;
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
