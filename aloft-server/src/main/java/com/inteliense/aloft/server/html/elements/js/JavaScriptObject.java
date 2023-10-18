package com.inteliense.aloft.server.html.elements.js;

import com.inteliense.aloft.server.html.elements.js.types.ElementRef;
import com.inteliense.aloft.utils.global.__;

import java.util.ArrayList;
import java.util.HashMap;

public abstract class JavaScriptObject {

    private HashMap<String, JSOV> vars = new HashMap<>();
    private ArrayList<JavaScriptVariableRef> variableRefs = new ArrayList<>();
    private ArrayList<JavaScriptFunctionRef> functionRefs = new ArrayList<>();
    protected ArrayList<Object> lines = new ArrayList<>();
    private int slotIndex = -1;
    private boolean built = false;

    public JavaScriptObject build() {
        return build(new ArrayList<>(), new ArrayList<>(), false);
    }

    public JavaScriptObject build(ArrayList<JavaScriptVariableRef> variableRefs, ArrayList<JavaScriptFunctionRef> functionRefs) {
        return build(variableRefs, functionRefs, false);
    }

    public JavaScriptObject build(ArrayList<JavaScriptVariableRef> variableRefs, ArrayList<JavaScriptFunctionRef> functionRefs, boolean refresh) {
        if(refresh) {
            this.lines.clear();
            create();
            built = true;
        } else if(!built) {
            create();
            built = true;
        }
        return this;
    }

    protected abstract void create();

    public void setVars(String[] vars) {
        for(int i=0; i<vars.length; i++) {
            this.vars.put(vars[i], null);
        }
    }

    public void setVars(JSOV...variables) {
        if(this.vars.isEmpty()) return;
        for(JSOV var : variables) {
            if(!this.vars.containsKey(var.key())) continue;
            this.vars.replace(var.key(), var);
        }
    }

    public void setVars(ArrayList<JSOV> variables) {
        if(this.vars.isEmpty()) return;
        for(JSOV var : variables) {
            if(!this.vars.containsKey(var.key())) continue;
            this.vars.replace(var.key(), var);
        }
    }

    public void replaceVar(String key, Object value) {
        this.vars.replace(key, JSOV.v(key, value));
    }

    public JSOV getVar(String key) {
        return this.vars.get(key);
    }

    public JavaScriptObject setSlot(JavaScriptObject slot) {
        for(int i=0; i<lines.size(); i++) {
            if(slotIndex == i) {
                lines.set(i, slot);
                break;
            }
        }
        return slot;
    }

    public String string() {
        StringBuilder builder = new StringBuilder();
        for(int i=0; i<lines.size(); i++) {
            Object obj = lines.get(i);
            if (!__.isset(lines.get(i))) continue;
            if (obj instanceof JavaScriptObject) builder.append(((JavaScriptObject) obj).getJs().getValue());
            if (obj.getClass() == String.class) builder.append((String) obj);
        }
        return builder.toString();
    }

    public JavaScriptElement getJs() {
        StringBuilder builder = new StringBuilder();
        for(int i=0; i<lines.size(); i++) {
            Object obj = lines.get(i);
            if (!__.isset(lines.get(i))) continue;
            if (obj instanceof JavaScriptObject) builder.append(((JavaScriptObject) obj).getJs().getValue());
            if (obj.getClass() == String.class) builder.append((String) obj);
        }
        return new JavaScriptElement(builder.toString());
    }

    protected void slot() {
        slotIndex = this.lines.size();
        this.lines.add(null);
    }

    protected void child(JavaScriptObject object) {
        this.lines.add(object);
    }
    
    protected void var(String var) {
        add(var);
    }

    protected void placeRef(FunctionArg var) {
        JSOV v = getVar((String) var.getValue());
        if(v.type() == ElementRef.class) child(((ElementRef) v.get()).build());

    }

    protected void var(FunctionArg var) {
        JSOV v = getVar((String) var.getValue());
        if(v.type() == ElementRef.class) add(((ElementRef) v.get()).getId());
        else add(v.get());
    }

    protected void construct(String name, FunctionArg...args) {
        String ln = "new " + name + "(";
        ln += getArgsString(args);
        ln += ")";
        add(ln);
    }

    private String getArgsString(FunctionArg[] args) {
        String ln = "";
        for(int i=0; i<args.length; i++) {
            if(i > 0) ln += ",";
            if(args[i].isVariable()) {
                String v = (String) args[i].getValue();
                JSOV var = getVar(v);
                if(var.type() == String.class) ln += var.getString();
                else ln += String.valueOf(var.get());
            } else {
                Object arg = args[i].getValue();
                if(arg.getClass() == String.class) ln += "\"" + arg + "\"";
                else if(arg instanceof JavaScriptObject) ln += ((JavaScriptObject) arg).build(this.variableRefs, this.functionRefs).getJs().getValue();
                else if(arg instanceof JavaScriptVariableRef) ln += getRef((JavaScriptVariableRef) arg);
                else ln += String.valueOf(arg);
            }
        }
        return ln;
    }

    protected String getRef(String ref) {
        for(JavaScriptVariableRef var : variableRefs) {
            if(var.match(ref)) {
                return var.get();
            }
        }
        return "";
    }

    protected String getRef(JavaScriptVariableRef ref) {
        if(ref.initialized()) return ref.get();
        for(JavaScriptVariableRef var : variableRefs) {
            if(var.match(ref.key())) {
                return var.get();
            }
        }
        return "";
    }

    protected void chain(String var) {
        add("." + var);
    }
    protected void chain(String... vars) {
        String ln = ".";
        for(int i=0; i<vars.length; i++) ln += "." + vars[i];
        add(ln);
    }

    protected void chain(String var, FunctionArg...args) {
        String ln = "." + var;
        if(args.length > 0) {
            ln += "(";
            ln += getArgsString(args);
            ln += ")";
        }
        add(ln);
    }

    protected void result() {
        add("return ");
    }

    protected void callEmpty() {
        add("()");
    }

    protected void variable(String var) {
        add(var);
    }

    protected void declare(String var, boolean constant) {
        lines.add(((constant) ? "const " : "let ") + var + " = ");
    }

    protected JavaScriptVariableRef let(String var) {
        JavaScriptVariableRef ref = new JavaScriptVariableRef(var);
        ref.set();
        lines.add("let " + ref.get() + " = ");
        variableRefs.add(ref);
        return ref;
    }

    protected JavaScriptVariableRef constant(String var) {
        JavaScriptVariableRef ref = new JavaScriptVariableRef(var);
        ref.set();
        lines.add("const " + ref.get() + " = ");
        variableRefs.add(ref);
        return ref;
    }

    protected void emptyObject() {
        add("{ }");
    }

    protected void byId(String id) {
        var("document");
        chain("getElementById", FunctionArg.var(id));
    }

    protected void queryAll(String query) {
        var("document");
        chain("querySelectorAll", FunctionArg.var(query));
    }

    protected void query(String query) {
        var("document");
        chain("querySelector", FunctionArg.var(query));
    }

    protected void end() {
        add("; ");
    }

    protected void call(String name, FunctionArg...args) {
        String ln = name + "(";
        ln += getArgsString(args);
        ln += ")";
        add(ln);
    }

    public static JavaScriptObject function(String name, String...args) {

        return new JavaScriptObject() {
            @Override
            public void create() {
                JavaScriptFunctionRef ref = new JavaScriptFunctionRef(name, args);
                ref.set();
                this.namedFunction(ref.get(), ref.args());
                this.blockStart();
                this.slot();
                this.blockEnd();
            }
        };
    }

    protected void namedFunction(String name, String...args) {
        String lines = " function " + name + "(";
        for(int i=0; i<args.length; i++) {
            String line = "";
            if(i > 0) line += ", ";
            line += args[i];
            lines += line;
        }
        lines += ")";
        this.lines.add(lines);
    }

    protected void blockStart() {
        lines.add(" { ");
    }

    protected void blockEnd() {
        lines.add(" } ");
    }

    protected void add(String ln) {
        lines.add(ln);
    }

    protected static class FunctionArg {

        private boolean isVariable = false;
        private Object value;

        public FunctionArg(Object value, boolean isVariable) {
            this.isVariable = isVariable;
            this.value = value;
        }

        public FunctionArg(JavaScriptObject value, boolean isVariable) {
            this.isVariable = isVariable;
            this.value = value;
        }

        public static FunctionArg ref(JavaScriptVariableRef ref) {
            return new FunctionArg(ref, false);
        }

        public static FunctionArg ref(String key) {
            return new FunctionArg(new JavaScriptVariableRef(key), false);
        }

        public static FunctionArg var(Object value) {
            return new FunctionArg(value, true);
        }

        public static FunctionArg preset(Object value) {
            return new FunctionArg(value, false);
        }

        public static FunctionArg raw(String value) {
            JavaScriptObject obj = new JavaScriptObject() {
                @Override
                protected void create() {
                    add(value);
                }
            };
            return new FunctionArg(obj.build(), false);
        }

        public boolean isVariable() {
            return isVariable;
        }

        public Object getValue() {
            return value;
        }
    }

}
