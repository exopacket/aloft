package com.inteliense.aloft.server.html.elements.js;

import com.inteliense.aloft.utils.encryption.A32;
import com.inteliense.aloft.utils.encryption.Rand;
import com.inteliense.aloft.utils.encryption.SHA;
import com.inteliense.aloft.utils.global.__;

public class JavaScriptVariableRef extends JavaScriptObject {

    private String key = null;
    private String var = null;
    private boolean constant = false;

    public JavaScriptVariableRef(boolean constant) {
        this.constant = constant;
        this.key = A32.casified(SHA.getSha1(Rand.secure(64)));
        this.set();
    }

    public JavaScriptVariableRef(String key, boolean constant) {
        this.constant = constant;
        this.key = key;
    }

    public boolean initialized() {
        return !__.empty(var);
    }

    @Override
    protected void create() {
        if(!constant) add("let " + var + " = ");
        else add("const " + var + " = ");
    }

    public void set() {
        this.var = A32.casified(SHA.getSha1(key));
    }

    public boolean match(String key) {
        return __.same(key, this.key);
    }

    public String key() {
        return key;
    }

    public String get() {
        return this.var;
    }

}
