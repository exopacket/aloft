package com.inteliense.aloft.server.html.elements.js;

import com.inteliense.aloft.server.html.elements.js.types.ElementRef;
import com.inteliense.aloft.utils.global.__;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public abstract class JavaScriptObject {

    private HashMap<String, JSOV> vars = new HashMap<>();
    private HashMap<Integer, ArrayList<JavaScriptVariableRef>> variableRefs = new HashMap<>();
    private HashMap<Integer, ArrayList<JavaScriptFunctionRef>> functionRefs = new HashMap<>();

    protected ArrayList<Object> lines = new ArrayList<>();
    protected HashMap<Integer, ArrayList<String>> placedRefs = new HashMap<>();
    protected HashMap<Integer, ArrayList<String>> parentPlacedRefs = new HashMap<>();
    protected boolean inheritsRefs = true;
    private int slotIndex = -1;
    private JavaScriptObject slot;
    private boolean built = false;

    public JavaScriptObject build() {
        return build(null, false);
    }

    public JavaScriptObject build(JavaScriptRefMapper mapper) {
        return build(mapper, built);
    }

    public JavaScriptObject build(JavaScriptRefMapper mapper, boolean refresh) {
        if(__.isset(mapper)) {
            HashMap<Integer, ArrayList<String>> placedRefs = mapper.getPlacedRefs();
            if (inheritsRefs) {
                if ((!this.placedRefs.isEmpty() && !this.parentPlacedRefs.isEmpty()) || built) {
                    updateRefs(mapper, true);
                    this.placedRefs.clear();
                    for (int i = 0; i < this.parentPlacedRefs.size(); i++) {
                        this.placedRefs.put(i + 1, parentPlacedRefs.get(i + 1));
                    }
                } else if (this.parentPlacedRefs.isEmpty() && this.placedRefs.isEmpty()) {
                    for (int i = 0; i < placedRefs.size(); i++) {
                        this.parentPlacedRefs.put(i + 1, placedRefs.get(i + 1));
                        this.placedRefs.put(i + 1, placedRefs.get(i + 1));
                    }
                }
            }
            if (refresh) {
                this.lines.clear();
                this.vars.clear();
                this.variableRefs.clear();
                this.functionRefs.clear();
                this.variableRefs.putAll(mapper.getVariableRefs());
                this.functionRefs.putAll(mapper.getFunctionRefs());
                create();
                if (slotIndex >= 0 && __.isset(setSlot())) setSlot();
                postCreate(mapper);
                built = true;
            } else if (!built) {
                this.variableRefs.putAll(mapper.getVariableRefs());
                this.functionRefs.putAll(mapper.getFunctionRefs());
                create();
                if (slotIndex >= 0 && __.isset(setSlot())) setSlot();
                postCreate(mapper);
                built = true;
            }
            if (inheritsRefs) updateRefs(mapper, false);
        } else {
            if (refresh) {
                this.lines.clear();
                this.vars.clear();
                create();
                if (slotIndex >= 0 && __.isset(setSlot())) setSlot();
                built = true;
            } else if (!built) {
                create();
                if (slotIndex >= 0 && __.isset(setSlot())) setSlot();
                built = true;
            }
        }
        return this;
    }

    protected abstract void create();

    public void postCreate(JavaScriptRefMapper mapper) {
        int level = (placedRefs.isEmpty()) ? 1 : placedRefs.size();
        if(!placedRefs.containsKey(level)) placedRefs.put(level, new ArrayList<>());
        for(int i=0; i<lines.size(); i++) {
            Object line = lines.get(i);
            if(line instanceof ElementRef) {
                String id = ((ElementRef) line).getId();
                if (placedRefsContains(id, level)) {
                    lines.set(i, new Void());
                } else {
                    placedRefs.get(level).add(id);
                    lines.set(i, ((ElementRef) line).build());
                }
            } else if(line instanceof ConditionGroup) {
                lines.set(i, ((ConditionGroup) line).build(mapper));
            } else if(line instanceof BlockStart) {
                lines.set(i, ((BlockStart) line).build());
                level++;
                placedRefs.put(level, new ArrayList<>());
            } else if(line instanceof BlockEnd) {
                lines.set(i, ((BlockEnd) line).build());
                placedRefs.remove(level);
                level--;
            } else if(line instanceof JavaScriptObject) {
                lines.set(i, ((JavaScriptObject) line).build(mapper));
            }
        }
    }

    private boolean placedRefsContains(String id, int level) {
        if(placedRefs.size() < level) return false;
        for(int i=0; i<level; i++) {
            if(placedRefs.get(i + 1).contains(id)) return true;
        }
        return false;
    }

    private boolean placedRefsContains(HashMap<Integer, ArrayList<String>> placedRefs, String id, int level) {
        int x = level;
        if(placedRefs.size() < level) x = placedRefs.size();
        for(int i=0; i<x; i++) {
            if(!placedRefs.containsKey(i + 1)) continue;
            if(!__.isset(placedRefs.get(i + 1))) continue;
            if(placedRefs.get(i + 1).contains(id)) return true;
        }
        return false;
    }

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
        this.slot = slot;
        if(slotIndex < 0) return this.slot;
        for(int i=0; i<lines.size(); i++) {
            if(slotIndex == i) {
                lines.set(i, slot);
                break;
            }
        }
        return this.slot;
    }

    public JavaScriptObject setSlot() {
        if(!__.isset(slot)) return null;
        for(int i=0; i<lines.size(); i++) {
            if(slotIndex == i) {
                lines.set(i, slot);
                break;
            }
        }
        return this.slot;
    }

    public String string() {
        StringBuilder builder = new StringBuilder();
        for(int i=0; i<lines.size(); i++) {
            Object obj = lines.get(i);
            if (!__.isset(lines.get(i))) continue;
            if (obj instanceof Void) continue;
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
            if (obj instanceof Void) continue;
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

    public void updateRefs(JavaScriptRefMapper mapper, boolean remove) {
        HashMap<Integer, ArrayList<String>> parent = mapper.getPlacedRefs();
        if(!__.isset(parent)) parent = new HashMap<>();
        for(Integer key : placedRefs.keySet()) {
            ArrayList<String> currentRefs = placedRefs.get(key);
            ArrayList<String> parentRefs = (remove) ? parentPlacedRefs.get(key) : new ArrayList<>();
            if(!remove) {
                if (parent.containsKey(key)) {
                    if(!__.isset(parent.get(key))) parent.put(key, new ArrayList<>());
                    for (String ref : currentRefs) {
                        if(!placedRefsContains(parent, ref, key)) parent.get(key).add(ref);
                    }
                } else {
                    for (String ref : currentRefs) {
                        if(!placedRefsContains(parent, ref, key) && !parentRefs.contains(ref)) parentRefs.add(ref);
                    }
                    parent.put(key, parentRefs);
                }
            } else {
                for (String ref : currentRefs) {
                    if (!placedRefsContains(parentPlacedRefs, ref, key) && placedRefsContains(parent, ref, key)) parent.get(key).remove(ref);
                }
                if(__.isset(parent.get(key)) && parent.get(key).isEmpty() && parent.size() > 1) parent.remove(key);
            }
        }
        mapper.syncRefs(parent);
    }

    public void removeUniqueRefs(HashMap<Integer, ArrayList<String>> parent) {
        for(Integer key : placedRefs.keySet()) {
            ArrayList<String> currentRefs = placedRefs.get(key);
            ArrayList<String> parentRefs = new ArrayList<>();
            if(parent.containsKey(key)) parentRefs.addAll(parent.get(key));
            else {
                for(String ref : currentRefs) {
                    if(!parentRefs.contains(ref)) parentRefs.add(ref);
                }
            }
            parent.put(key, parentRefs);
        }
    }

    protected void placeRef(FunctionArg var) {
        JSOV v = getVar((String) var.getValue());
        if(v.type() == ElementRef.class) placeRef(((ElementRef) v.get()));
    }

    protected void placeRef(ElementRef ref) {
        this.lines.add(ref);
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
                else if(arg instanceof JavaScriptVariableRef) ln += getRef((JavaScriptVariableRef) arg);
                else if(arg instanceof JavaScriptFunctionRef) ln += getRef((JavaScriptFunctionRef) arg);
                else if(arg instanceof JavaScriptObject) ln += ((JavaScriptObject) arg).build().getJs().getValue();
                else ln += String.valueOf(arg);
            }
        }
        return ln;
    }

    protected String getRef(String ref) {
        for(Integer key : variableRefs.keySet()) {
            for (JavaScriptVariableRef var : variableRefs.get(key)) {
                if (var.match(ref)) {
                    return var.get();
                }
            }
        }
        return "";
    }

    protected String getRef(JavaScriptVariableRef ref) {
        if(ref.initialized()) return ref.get();
        for(Integer key : variableRefs.keySet()) {
            for (JavaScriptVariableRef var : variableRefs.get(key)) {
                if (var.match(ref.key())) {
                    return var.get();
                }
            }
        }
        return "";
    }

    protected String getRef(JavaScriptFunctionRef ref) {
        if(ref.initialized()) return ref.get();
        for(Integer key : functionRefs.keySet()) {
            for (JavaScriptFunctionRef var : functionRefs.get(key)) {
                if (var.match(ref.key())) {
                    return var.get();
                }
            }
        }
        return "";
    }

    protected void chain(String var) {
        add("." + var);
    }

    protected void set() {
        add(" = ");
    }

    protected void str(String str) {
        add("\"" + str + "\"");
    }

    protected void chain(String... vars) {
        String ln = "";
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

    protected void _if(ConditionGroup.Condition[] conditions) {
        String ln = "if(";
        for(int i=0; i<conditions.length; i++) {
            if(i > 0) ln += " ";
            ln += conditions[i].get();
        }
        ln += ")";
        add(ln);
    }

    protected void _elseif(ConditionGroup.Condition[] conditions) {
        String ln = "else if(";
        for(int i=0; i<conditions.length; i++) {
            if(i > 0) ln += " ";
            ln += conditions[i].get();
        }
        ln += ")";
        add(ln);
    }

    protected void _else() {
        add("else ");
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
        JavaScriptVariableRef ref = new JavaScriptVariableRef(var,false);
        ref.set();
        lines.add(ref);
        return ref;
    }

    protected JavaScriptVariableRef let() {
        JavaScriptVariableRef ref = new JavaScriptVariableRef(false);
        lines.add(ref);
        return ref;
    }

    protected JavaScriptVariableRef constant(String var) {
        JavaScriptVariableRef ref = new JavaScriptVariableRef(var, true);
        ref.set();
        lines.add(ref);
        return ref;
    }

    protected JavaScriptVariableRef constant() {
        JavaScriptVariableRef ref = new JavaScriptVariableRef(true);
        lines.add(ref);
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

    protected void call(JavaScriptFunctionRef ref) {
        add(ref.call());
    }

    protected void placeFunction(JavaScriptFunctionRef ref) {
        add(ref.get(true));
    }

    public void condition(ConditionGroup...groups) {
        for(int i=0; i<groups.length; i++) {
            child(groups[i].get(i > 0));
        }
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
        lines.add(new BlockStart());
    }

    protected void blockEnd() {
        lines.add(new BlockEnd());
    }

    protected void add(String ln) {
        lines.add(ln);
    }

    protected ConditionGroup createCondition(Condition...conditions) {
        return new ConditionGroup(conditions);
    }

    protected ConditionGroup createElse() {
        return new ConditionGroup();
    }

    public static JavaScriptObject builder(JavaScriptObject... objects) {
        return new JavaScriptObject() {
            @Override
            protected void create() {
                for(int i=0; i<objects.length; i++) {
                    JavaScriptObject object = objects[i];
                    if(object instanceof ElementRef) placeRef((ElementRef) object);
                    else child(object);
                }
            }
        }.build();
    }
    public class ConditionGroup extends JavaScriptObject {

        private ArrayList<Condition> conditions = new ArrayList<>();
        private boolean elseif = false;
        public ConditionGroup(Condition... conditions) {
            this.conditions.addAll(Arrays.asList(conditions));
        }

        public ConditionGroup() { }

        public void addCondition(Condition condition) {
            this.conditions.add(condition);
        }

        @Override
        protected void create() {
            if(conditions.isEmpty()) this._else();
            else if(elseif) {
                Condition[] arr = new Condition[conditions.size()];
                conditions.toArray(arr);
                this._elseif(arr);
            } else {
                Condition[] arr = new Condition[conditions.size()];
                conditions.toArray(arr);
                this._if(arr);
            }

            this.blockStart();
            this.slot();
            this.blockEnd();
        }
        public JavaScriptObject get(boolean elseif) {
            this.elseif = elseif;
            return this;
        }

    }

    private static class Void extends JavaScriptObject {
        @Override
        protected void create() {
        }
    }

    private static class BlockStart extends JavaScriptObject {

        @Override
        protected void create() {
            add(" { ");
        }
    }

    private static class BlockEnd extends JavaScriptObject {

        @Override
        protected void create() {
            add(" } ");
        }
    }

    protected enum Compare {
        AND,
        OR
    }

    public static class Condition {

        private String leftSide = null;
        private String operator = null;
        private String rightSide = null;
        private String truthy = null;
        private Compare comparison = null;

        public Condition(String var, boolean not) {
            this.truthy = ((not) ? "!" : "") + var;
        }

        public Condition(String left, String operator, String right) {
            this.leftSide = left;
            this.operator = operator;
            this.rightSide = right;
        }

        public Condition(Compare comparison) {
            this.comparison = comparison;
        }

        public static Condition compare(Compare comparison) {
            return new Condition(comparison);
        }

        public static Condition truthy(String truthy) {
            return new Condition(truthy, false);
        }

        public static Condition equals(String left, String right) {
            return new Condition(left, "===", right);
        }

        public static Condition different(String left, String right) {
            return new Condition(left, "!==", right);
        }

        public static Condition not(String var) {
            return new Condition(var, true);
        }

        public static Condition create(String left, String operator, String right) {
            return new Condition(left, operator, right);
        }

        public String get() {
            if(__.isset(truthy)) return truthy;
            if(__.isset(comparison)) {
                if(comparison == Compare.AND) return " && ";
                if(comparison == Compare.OR) return " || ";
            }
            return leftSide + " " + operator + " " + rightSide;
        }

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

        public static FunctionArg ref(JavaScriptFunctionRef ref) {
            return ref(ref, true);
        }

        public static FunctionArg ref(JavaScriptFunctionRef ref, boolean willCall) {
            JavaScriptFunctionRef _ref = new JavaScriptFunctionRef(ref);
            if(willCall) _ref.willCall();
            return new FunctionArg(_ref, false);
        }

        public static FunctionArg ref(String key) {
            return new FunctionArg(new JavaScriptVariableRef(key, true), false);
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
