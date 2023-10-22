package org.extendedweb.aloft.lib.html.elements.js;

import org.extendedweb.aloft.lib.html.elements.js.types.ElementRef;
import org.extendedweb.aloft.utils.encryption.A32;
import org.extendedweb.aloft.utils.encryption.SHA;
import org.extendedweb.aloft.utils.global.__;

import java.util.ArrayList;

public class JavaScriptFunctionRef {

    private String key = null;
    private String var = null;
    private ArrayList<JavaScriptVariableRef> args = new ArrayList<>();
    private boolean call = false;

    public JavaScriptFunctionRef(String key) {
        this.key = key;
    }

    public JavaScriptFunctionRef(String key, String... args) {
        this.key = key;
        for(int i=0; i<args.length; i++) {
            JavaScriptVariableRef var = new JavaScriptVariableRef(args[i], true);
            var.set();
            this.args.add(var);
        }
    }

    public JavaScriptFunctionRef(String key, JavaScriptVariableRef... args) {
        this.key = key;
        for(int i=0; i<args.length; i++) {
            JavaScriptVariableRef var = args[i];
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

    public String get(Object...args) {
        return call(args);
    }

    public void willCall() {
        this.call = true;
    }

    public String call(Object...args) {
        String ln = this.var + "(";
        for(int i=0; i< args.length; i++) {
            if(i > 0) ln += ", ";
            String str = "";
            Object arg = args[i];
            if(arg instanceof String) str = ((String) arg);
            else if(arg instanceof JavaScriptVariableRef) str = ((JavaScriptVariableRef) arg).get();
            else if(arg instanceof JavaScriptFunctionRef) str = ((JavaScriptFunctionRef) arg).get();
            else if(arg instanceof ElementRef) str = ((ElementRef) arg).getId();
            else str = String.valueOf(arg);
            ln += str;
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
