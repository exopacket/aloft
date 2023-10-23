package org.extendedweb.aloft.lib.js;

import org.extendedweb.aloft.lib.html.elements.js.JavaScriptObject;

public class Condition extends JSO {

    private JavaScriptObject root;

    public Condition(JavaScriptObject condition) {
        this.root = condition;
    }

    public static Condition _if(JavaScriptObject slot, ConditionExpression...expressions) {
        JavaScriptObject.ConditionGroup group = new JavaScriptObject.ConditionGroup(getConditionArray(expressions));
        JavaScriptObject root = group.get(false);
        root.setSlot(slot.build());
        return new Condition(root);
    }

    public static Condition _elseif(JavaScriptObject slot, ConditionExpression...expressions) {
        JavaScriptObject.ConditionGroup group = new JavaScriptObject.ConditionGroup(getConditionArray(expressions));
        JavaScriptObject root = group.get(true);
        root.setSlot(slot.build());
        return new Condition(root);
    }

    public static Condition _else(JavaScriptObject slot) {
        JavaScriptObject.ConditionGroup group = new JavaScriptObject.ConditionGroup();
        JavaScriptObject root = group.get(false);
        root.setSlot(slot.build());
        return new Condition(root);
    }

    private static JavaScriptObject.Condition[] getConditionArray(ConditionExpression[] expressions) {
        JavaScriptObject.Condition[] arr = new JavaScriptObject.Condition[expressions.length];
        for(int i=0; i<arr.length; i++) arr[i] = expressions[i].get();
        return arr;
    }

    @Override
    protected JavaScriptObject build() {
        return root;
    }
}
