package org.extendedweb.aloft.lib.html.elements.js.types;

import org.extendedweb.aloft.lib.html.elements.js.JSOV;
import org.extendedweb.aloft.lib.html.elements.js.JavaScriptFunctionRef;
import org.extendedweb.aloft.lib.html.elements.js.JavaScriptObject;
import org.extendedweb.aloft.utils.global.__;

public class FunctionObject extends JavaScriptObject {

    private String name = null;
    private String[] args = new String[0];
    private JavaScriptFunctionRef ref = null;

    public FunctionObject(String name, String...args) {
        this.inheritsRefs = false;
        this.name = name;
        this.args = args;
    }

    public FunctionObject(String...args) {
        this.inheritsRefs = false;
        this.args = args;
    }

    public FunctionObject() {
        this.inheritsRefs = false;
    }

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
