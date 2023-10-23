package org.extendedweb.aloft.lib.js;

import org.extendedweb.aloft.lib.html.elements.js.JavaScriptObject;

public abstract class JS {

    protected abstract JavaScriptObject create();

    protected JavaScriptObject container(JSO...objects) {
        return new JavaScriptObject() {
            @Override
            protected void create() {
                for(JSO jso : objects) child(jso.get());
            }
        };
    }

    protected Variable Let(String name, JSO v) {
        return new Variable(name, v);
    }

    protected Variable Let(String name, JSImpl func) {
            JSO v = func.run();
            return new Variable(name, v);
    }

    protected Variable Constant(String name, JSO v) {
        return new Variable(true, name, v);
    }

    protected Variable Constant(String name, JSImpl func) {
        JSO v = func.run();
        return new Variable(true, name, v);
    }

    protected Function Function(String name, Args args, JSFunctionImpl func) {
        return new Function(name, args, func.run(args));
    }

    protected ConditionGroup Decide(Condition...blocks) {
        return new ConditionGroup(blocks);
    }

    protected ConditionExpression Or() {
        return new ConditionExpression(true);
    }

    protected ConditionExpression And() {
        return new ConditionExpression(false);
    }

    protected ConditionExpression Not(String var) {
        return new ConditionExpression(true, var);
    }

    protected ConditionExpression Truthy(String var) {
        return new ConditionExpression(false, var);
    }

    protected ConditionExpression Compare(String left, String operator, String right) {
        return new ConditionExpression(left, operator, right);
    }

    protected ConditionExpression[] Expr(ConditionExpression...expressions) {
        return expressions;
    }

    protected Condition If(ConditionExpression[] expressions, JavaScriptObject block) {
        return Condition._if(block, expressions);
    }

    protected Condition ElseIf(ConditionExpression[] expressions, JavaScriptObject block) {
        return Condition._elseif(block, expressions);
    }

    protected Condition Else(JavaScriptObject block) {
        return Condition._else(block);
    }

    protected Ref VarRef(String name) {
        return new Ref();
    }

    protected Ref FuncRef(String name) {
        return new Ref();
    }

    public JavaScriptObject get() {
        return create();
    }

}
