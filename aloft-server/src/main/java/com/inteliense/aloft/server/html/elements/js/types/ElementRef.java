package com.inteliense.aloft.server.html.elements.js.types;

import com.inteliense.aloft.compiler.lang.keywords.style.base.AloftStyleConditionalClass;
import com.inteliense.aloft.server.html.elements.HtmlElement;
import com.inteliense.aloft.server.html.elements.js.JavaScriptObject;
import com.inteliense.aloft.utils.encryption.A32;
import com.inteliense.aloft.utils.encryption.SHA;
import com.inteliense.aloft.utils.global.__;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class ElementRef extends JavaScriptObject {

    private String id;
    private String elementKey = null;
    private ArrayList<Ref> refs = new ArrayList<>();
    private HashMap<String, ElementRef> children = new HashMap<>();
    private ArrayList<AloftStyleConditionalClass> conditionalClasses = new ArrayList<>();

    public ElementRef(String id, String elementKey) { super(); this.id = id; this.elementKey = elementKey; }

    public static ElementRef el(HtmlElement el) {
        ElementRef ref = new ElementRef(A32.casified(SHA.getSha1(el.getVeryUniqueId())), el.getRef());
        ElementRef.Selector selector = ElementRef.Selector.byAttribute("data-uid", el.getUniqueId());
        ref.addRef(selector, ElementRef.Type.SINGLE);
        return ref;
    }

    public static ElementRef el(HtmlElement el, ArrayList<AloftStyleConditionalClass> conditionalClasses) {
        ElementRef ref = new ElementRef(A32.casified(SHA.getSha1(el.getVeryUniqueId())), el.getRef());
        ElementRef.Selector selector = ElementRef.Selector.byAttribute("data-uid", el.getUniqueId());
        ref.addRef(selector, ElementRef.Type.SINGLE);
        ref.setConditionalClasses(conditionalClasses);
        return ref;
    }

    public void addRef(Selector selector, Type type) {
        this.refs.add(new Ref(selector, type));
    }

    public void setConditionalClasses(ArrayList<AloftStyleConditionalClass> conditionalClasses) {
        this.conditionalClasses = conditionalClasses;
    }

    public ElementRef getChild(String key) {
        if(__.same(key, elementKey)) return this;
        if(!children.containsKey(key)) return null;
        return children.get(key);
    }

    public String getElementKey() {
        return elementKey;
    }

    public void addChild(String key, ElementRef el) {
        this.children.put(key, el);
    }

    public JavaScriptObject replaceClass(String key, String groupId) {
        ArrayList<AloftStyleConditionalClass> toAdd = new ArrayList<>();
        ArrayList<AloftStyleConditionalClass> toRemove = new ArrayList<>();
        ArrayList<AloftStyleConditionalClass> toPlace = new ArrayList<>();
        ArrayList<String> toPlaceIds = new ArrayList<>();
        for(AloftStyleConditionalClass c : conditionalClasses) {
            if(c.match(groupId)) {
                toPlace.add(c);
                if (c.match(groupId, key)) toAdd.add(c);
                else toRemove.add(c);
            }
        }
        if(toAdd.isEmpty() && toRemove.isEmpty()) return null;
        return new JavaScriptObject() {
            @Override
            protected void create() {
                for(AloftStyleConditionalClass c : toPlace) {
                    ElementRef ref = ElementRef.this;
                    if(__.isset(children.get(c.getElementKey()))) ref = children.get(c.getElementKey());
                    if(!toPlaceIds.contains(ref.getId())) {
                        placeRef(ref);
                        end();
                        toPlaceIds.add(ref.getId());
                    }
                }
                for(AloftStyleConditionalClass c : toAdd) {
                    ElementRef ref = ElementRef.this;
                    if(__.isset(children.get(c.getElementKey()))) ref = children.get(c.getElementKey());
                    variable(ref.getId());
                    chain("classList");
                    chain("add", FunctionArg.raw("\"" + c.getClassName() + "\""));
                    end();
                }
                for(AloftStyleConditionalClass c : toRemove) {
                    ElementRef ref = ElementRef.this;
                    if(__.isset(children.get(c.getElementKey()))) ref = children.get(c.getElementKey());
                    variable(ref.getId());
                    chain("classList");
                    chain("remove", FunctionArg.raw("\"" + c.getClassName() + "\""));
                    end();
                }
            }

        }.build();
    }

    //TODO more dynamic class operations

    public JavaScriptObject deactivateClass(String key, String groupId) {
        ArrayList<AloftStyleConditionalClass> toRemove = new ArrayList<>();
        ArrayList<AloftStyleConditionalClass> toPlace = new ArrayList<>();
        ArrayList<String> toPlaceIds = new ArrayList<>();
        for(AloftStyleConditionalClass c : conditionalClasses) {
            if(c.match(groupId)) {
                if (c.match(groupId, key)) {
                    toRemove.add(c);
                    toPlace.add(c);
                }
            }
        }
        if(toRemove.isEmpty()) return null;
        return new JavaScriptObject() {
            @Override
            protected void create() {
                for(AloftStyleConditionalClass c : toPlace) {
                    ElementRef ref = ElementRef.this;
                    if(__.isset(children.get(c.getElementKey()))) ref = children.get(c.getElementKey());
                    if(!toPlaceIds.contains(ref.getId())) {
                        placeRef(ref);
                        end();
                        toPlaceIds.add(ref.getId());
                    }
                }
                for(AloftStyleConditionalClass c : toRemove) {
                    ElementRef ref = ElementRef.this;
                    if(__.isset(children.get(c.getElementKey()))) ref = children.get(c.getElementKey());
                    variable(ref.getId());
                    chain("classList");
                    chain("remove", FunctionArg.raw("\"" + c.getClassName() + "\""));
                    end();
                }
            }

        }.build();
    }

    public JavaScriptObject deactivateGroup(String groupId) {
        ArrayList<AloftStyleConditionalClass> toRemove = new ArrayList<>();
        for(AloftStyleConditionalClass c : conditionalClasses) if(c.inGroup(groupId)) toRemove.add(c);
        if(toRemove.isEmpty()) return null;
        return new JavaScriptObject() {
            @Override
            protected void create() {
                for(AloftStyleConditionalClass c : conditionalClasses) {
                    ElementRef ref = ElementRef.this;
                    if(__.isset(children.get(c.getElementKey()))) ref = children.get(c.getElementKey());
                    placeRef(ref);
                    end();
                }
                for(AloftStyleConditionalClass c : toRemove) {
                    ElementRef ref = ElementRef.this;
                    if(__.isset(children.get(c.getElementKey()))) ref = children.get(c.getElementKey());
                    variable(ref.getId());
                    chain("classList");
                    chain("remove", FunctionArg.raw("\"" + c.getClassName() + "\""));
                    end();
                }
            }

        }.build();
    }

    public void addChild(String key, HtmlElement el) {
        this.children.put(key, el(el));
    }

    public String getId() {
        return id;
    }

    public int size() {
        return children.size();
    }

    @Override
    protected void create() {
        declare(id, true);
        var("document");
        for(int i=0; i<refs.size(); i++) {
            if(refs.get(i).getType() == Type.ARRAY) {
                String selector = refs.get(i).getSelector().selectorString().trim();
                chain("querySelectorAll", FunctionArg.preset(selector));
            } else if(refs.get(i).getType() == Type.SINGLE) {
                String selector = refs.get(i).getSelector().selectorString().trim();
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
