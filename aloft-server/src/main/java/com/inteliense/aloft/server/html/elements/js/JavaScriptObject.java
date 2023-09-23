package com.inteliense.aloft.server.html.elements.js;

import com.inteliense.aloft.utils.global.__;

import java.util.ArrayList;

public abstract class JavaScriptObject {

    private ArrayList<Object> lines = new ArrayList<>();
    private int slotIndex = -1;

    public JavaScriptObject build() {
        this.lines.clear();
        create();
        return this;
    }

    protected abstract void create();

    public JavaScriptObject setSlot(JavaScriptObject slot) {
        for(int i=0; i<lines.size(); i++) {
            if(slotIndex == i) {
                lines.set(i, slot);
                break;
            }
        }
        return slot;
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

    protected void call(String name) {
        addLine(name + "()");
    }

    protected String byId(String id) {
        return "document.getElementById('" + id + "')";
    }

    protected void var(String var) {
        lines.add("let " + var + " = ");
    }

    protected String object() {
        return "{}";
    }

    protected void constant(String constant) {
        lines.add("const " + constant + " = ");
    }

    protected void call(boolean isNew, String[] var, String name, String...args) {
        String ln = ((isNew) ? "new " : "");
        for(int i=0; i<var.length; i++) {
            ln += var[i] + ".";
        }
        ln += name + "(";
        for(int i=0; i< args.length;i++) {
            if(i>0) ln += ", ";
            ln += args[i];
        }
        addLine(ln + "); ");
    }

    public static JavaScriptObject function(String name, String...args) {
        return new JavaScriptObject() {
            @Override
            public void create() {
                this.namedFunction(name, args);
                this.blockStart();
                this.slot();
                this.blockEnd();
            }
        };
    }

    protected void namedFunction(String name, String[] args) {
        lines.add(" function " + name + "()");
    }

    protected void blockStart() {
        lines.add(" { ");
    }

    protected void blockEnd() {
        lines.add(" } ");
    }

    protected void addLine(String ln) {
        lines.add(ln);
    }

}
