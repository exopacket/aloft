package com.inteliense.aloft.server.html.elements.js.types;

import com.inteliense.aloft.server.html.elements.js.JSOV;
import com.inteliense.aloft.server.html.elements.js.JavaScriptFunctionRef;
import com.inteliense.aloft.server.html.elements.js.JavaScriptObject;
import com.inteliense.aloft.utils.global.__;

public class FunctionObject extends JavaScriptObject {

    private String name = null;
    private String[] args = new String[0];

    private JavaScriptFunctionRef ref = null;

    public FunctionObject(String name, String...args) {
        this.name = name;
        this.args = args;
    }

    public FunctionObject(String...args) {
        this.args = args;
    }

    public FunctionObject() { }

    public JavaScriptFunctionRef getRef() {
        return ref;
    }

    @Override
    public void create() {
        if(!__.isset(name)) name = String.valueOf(getVar("function"));
        JavaScriptFunctionRef ref = new JavaScriptFunctionRef(name, args);
        ref.set();
        this.ref = ref;
        this.namedFunction(ref.get(), ref.args());
        this.blockStart();
        this.slot();
        this.blockEnd();
    }
}
