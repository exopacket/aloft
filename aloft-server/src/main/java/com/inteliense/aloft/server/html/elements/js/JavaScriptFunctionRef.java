package com.inteliense.aloft.server.html.elements.js;

import com.inteliense.aloft.utils.encryption.A32;
import com.inteliense.aloft.utils.encryption.SHA;
import com.inteliense.aloft.utils.global.__;

import java.util.ArrayList;

public class JavaScriptFunctionRef {

    private String key = null;
    private String var = null;
    private ArrayList<JavaScriptVariableRef> args = new ArrayList<>();
    private boolean call = false;

    public JavaScriptFunctionRef(String key, String... args) {
        this.key = key;
        for(int i=0; i<args.length; i++) {
            JavaScriptVariableRef var = new JavaScriptVariableRef(args[i]);
            var.set();
            this.args.add(var);
        }
    }

    public JavaScriptFunctionRef(JavaScriptFunctionRef clone) {
        this.key = clone.getKey();
        this.var = clone.getVar();
        this.args = clone.getArgsList();
    }

    public boolean initialized() {
        return !__.empty(var);
    }

    public void set() {
        this.var = A32.casified(SHA.getSha1(key));
    }

    public String getKey() {
        return key;
    }

    public String getVar() {
        return var;
    }

    public boolean match(String key) {
        return __.same(key, this.key);
    }

    public String key() {
        return key;
    }

    public String get() {
        return get(false);
    }

    public String get(boolean override) {
        if(this.call && !override) {
            this.call = false;
            return call();
        }
        if(override) this.call = false;
        return this.var;
    }

    public void willCall() {
        this.call = true;
    }

    public String call() {
        String ln = this.var + "(";
        for(int i=0; i< args.size(); i++) {
            if(i > 0) ln += ", ";
            JavaScriptVariableRef ref = args.get(i);
            ln += ref.get();
        }
        ln += ")";
        return ln;
    }

    public ArrayList<JavaScriptVariableRef> getArgsList() {
        return args;
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
