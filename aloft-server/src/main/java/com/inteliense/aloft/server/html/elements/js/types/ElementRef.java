package com.inteliense.aloft.server.html.elements.js.types;

import com.inteliense.aloft.server.html.elements.js.JavaScriptObject;

import java.util.ArrayList;
import java.util.Arrays;

public class ElementRef extends JavaScriptObject {

    private String id;
    private ArrayList<Ref> refs = new ArrayList<>();

    public ElementRef(String id) { super(); this.id = id; }

    public void addRef(Selector selector, Type type) {
        this.refs.add(new Ref(selector, type));
    }

    public String getId() { return id; }

    @Override
    protected void create() {
        declare(id, true);
        var("document");
        for(int i=0; i<refs.size(); i++) {
            if(refs.get(i).getType() == Type.ARRAY) {
                String selector = refs.get(i).getSelector().selectorString();
                chain("querySelectorAll", FunctionArg.preset(selector));
            } else if(refs.get(i).getType() == Type.SINGLE) {
                String selector = refs.get(i).getSelector().selectorString();
                chain("querySelector", FunctionArg.preset(selector));
            }
        }
        end();
    }

    public static class Selector {

        private T type;
        private Object selector;

        public Selector(Object selector, T type) {
            this.selector = selector;
            this.type = type;
        }

        public Selector() {
            this.selector = new ArrayList<Selector>();
            this.type = T.COMPOUND;
        }

        public String selectorString() {
            if(this.type == T.COMPOUND) {
                String selector = "";
                ArrayList<Selector> list = (ArrayList<Selector>) this.selector;
                for(int i=0; i<list.size(); i++) {
                    selector += list.get(i).selectorString();
                }
                return selector;
            } else if(this.type == T.ATTRIBUTE) {
                String[] arr = (String[]) this.selector;
                return " [" + arr[0] + "=" + arr[1] + "] ";
            } else if(this.type == T.ID) {
                return "#" + this.selector;
            } else {
                return " " + (String) this.selector + " ";
            }
        }

        public void addRule(Selector...selectors) {
            if(this.type != T.COMPOUND) return;
            ((ArrayList<Selector>) this.selector).addAll(Arrays.asList(selectors));
        }

        public static Selector byRules(Selector...selectors) {
            Selector selector = new Selector();
            for(int i=0; i< selectors.length; i++) {
                selector.addRule(selectors[i]);
            }
            return selector;
        }

        public static Selector byId(String id) {
            return new Selector(id, T.ID);
        }

        public static Selector byClass(String className) {
            return new Selector(className, T.CLASS);
        }

        public static Selector byAttribute(String attr, String value) {
            return new Selector(new String[]{attr, value}, T.ATTRIBUTE);
        }

        public static Selector byElement(String element) {
            return new Selector(element, T.ELEMENT);
        }

        public static Selector isChildOf() {
            return new Selector(">", T.OPERATOR);
        }

        public static Selector withClass(String className) {
            return new Selector(className, T.CLASS);
        }

        public static Selector or() {
            return new Selector(",", T.OPERATOR);
        }

        public enum T {
            ID,
            ATTRIBUTE,
            CLASS,
            ELEMENT,
            COMPOUND,
            OPERATOR
        }

    }

    public enum Type {
        ARRAY,
        SINGLE,
    }

    private static class Ref {
        private Type type;
        private Selector selector;

        public Ref(Selector selector, Type type) {
            this.type = type;
            this.selector = selector;
        }

        public Selector getSelector() {
            return selector;
        }

        public Type getType() {
            return type;
        }
    }

}
