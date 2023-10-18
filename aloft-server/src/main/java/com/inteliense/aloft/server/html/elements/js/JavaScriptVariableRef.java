package com.inteliense.aloft.server.html.elements.js;

import com.inteliense.aloft.utils.encryption.A32;
import com.inteliense.aloft.utils.encryption.SHA;
import com.inteliense.aloft.utils.global.__;

public class JavaScriptVariableRef {

    private String key = null;
    private String var = null;

    public JavaScriptVariableRef(String key) {
        this.key = key;
    }

    public boolean initialized() {
        return !__.empty(var);
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
