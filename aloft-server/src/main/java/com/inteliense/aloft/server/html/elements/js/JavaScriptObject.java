package com.inteliense.aloft.server.html.elements.js;

import com.inteliense.aloft.utils.global.__;

import java.util.ArrayList;

public abstract class JavaScriptObject {

    private ArrayList<Object> lines = new ArrayList<>();

    public JavaScriptObject build() {
        this.lines.clear();
        create();
        return this;
    }

    protected abstract void create();

    public void setSlot(JavaScriptObject slot) {
        for(int i=0; i<lines.size(); i++) {
            if(!__.isset(lines.get(i))) {
                lines.set(i, slot);
                break;
            }
        }
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
        this.lines.add(null);
    }

    protected void child(JavaScriptObject object) {
        this.lines.add(object);
    }

    protected void call(String name) {
        addLine(name + "()");
    }

    protected void call(String[] var, String name, String...args) {
        String ln = name + "(";
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
