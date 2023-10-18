package com.inteliense.aloft.server.html.elements.js;

import com.inteliense.aloft.utils.encryption.A32;
import com.inteliense.aloft.utils.encryption.SHA;
import com.inteliense.aloft.utils.global.__;

import java.util.ArrayList;

public class JavaScriptFunctionRef {

    private String key = null;
    private String var = null;
    private ArrayList<JavaScriptVariableRef> args = new ArrayList<>();

    public JavaScriptFunctionRef(String key, String... args) {
        this.key = key;
        for(int i=0; i<args.length; i++) {
            JavaScriptVariableRef var = new JavaScriptVariableRef(args[i]);
            var.set();
            this.args.add(var);
        }
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

    public String[] args() {
        String[] arr = new String[args.size()];
        for(int i=0; i<args.size(); i++) arr[i] = args.get(i).get();
        return arr;
    }

    public String arg(String key) {
        for(int i=0; i< args.size(); i++) {
            if(args.get(i).match(key)) return args.get(i).get();
        }
        return "";
    }

}
