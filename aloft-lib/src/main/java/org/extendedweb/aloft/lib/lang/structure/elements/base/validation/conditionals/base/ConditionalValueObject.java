package org.extendedweb.aloft.lib.lang.structure.elements.base.validation.conditionals.base;

import org.extendedweb.aloft.lib.lang.structure.style.AloftStyle;
import org.extendedweb.aloft.lib.lang.structure.style.AloftStyleClass;
import org.extendedweb.aloft.lib.html.elements.js.JavaScriptObject;
import org.extendedweb.aloft.lib.html.elements.js.types.ElementRef;
import org.extendedweb.aloft.utils.global.__;

public class ConditionalValueObject {

    private String conditionalKey;
    private String groupId;
    private ConditionalValueType type;
    private ConditionalValueSet value;
    private String elementKey = null;
    private ElementRef ref = null;

    public ConditionalValueObject(String conditionalKey, String groupId, ConditionalValueType type, ConditionalValueSet value, String elementKey) {
        this.type = type;
        this.value = value;
        this.elementKey = elementKey;
        this.conditionalKey = conditionalKey;
        this.groupId = groupId;
    }

    public ConditionalValueObject(String conditionalKey, String groupId, ConditionalValueType type, ConditionalValueSet value) {
        this.type = type;
        this.value = value;
        this.conditionalKey = conditionalKey;
        this.groupId = groupId;
    }

    public ConditionalValueObject(String conditionalKey, String groupId, ConditionalValueType type, ConditionalValueSet value, String elementKey, ElementRef ref) {
        this.type = type;
        this.value = value;
        this.elementKey = elementKey;
        this.conditionalKey = conditionalKey;
        this.groupId = groupId;
        this.ref = ref;
    }

    public void setRef(ElementRef ref) {
        this.ref = ref;
    }

    public boolean match(String conditionalKey, String groupId) {
        return __.same(conditionalKey, this.conditionalKey) && __.same(groupId, this.groupId);
    }

    public boolean match(String groupId) {
        return __.same(groupId, this.groupId);
    }

    public JavaScriptObject getJs(Conditions action) {
        if(action == Conditions.ACTIVATE) return activate();
        if(action == Conditions.INACTIVE) return deactivate();
        if(action == Conditions.CLEAR) return clear();
        return null;
    }

    public Object getValue(Conditions condition) { return getValue(condition, false); }

    public Object getValue(Conditions condition, boolean allowNull) {
        if(allowNull) return value.get(condition);
        Object active = value.get(Conditions.ACTIVATE);
        Object inactive = value.get(Conditions.INACTIVE);
        Object clear = value.get(Conditions.CLEAR);
        if(condition == Conditions.INACTIVE && !__.isset(inactive)) {
            if(__.isset(clear)) return clear;
            return active;
        }
        if(condition == Conditions.CLEAR && !__.isset(clear)) {
            if(__.isset(inactive)) return inactive;
            return active;
        }
        return value.get(condition);
    }

    private JavaScriptObject activate() {
        if(type == ConditionalValueType.INNER_HTML) return innerHtml(getValue(Conditions.ACTIVATE));
        if(type == ConditionalValueType.CLASS) return classes(getValue(Conditions.ACTIVATE), Conditions.ACTIVATE);
        return null;
    }

    private JavaScriptObject deactivate() {
        if(type == ConditionalValueType.INNER_HTML) return innerHtml(getValue(Conditions.INACTIVE, true));
        if(type == ConditionalValueType.CLASS) return classes(getValue(Conditions.INACTIVE), Conditions.INACTIVE);
        return null;
    }

    private JavaScriptObject clear() {
        if(type == ConditionalValueType.INNER_HTML) return innerHtml(getValue(Conditions.CLEAR, true));
        if(type == ConditionalValueType.CLASS) return classes(getValue(Conditions.CLEAR), Conditions.CLEAR);
        return null;
    }

    private JavaScriptObject innerHtml(Object value) {
        final String v = (__.isset(value)) ? ((String) value) : "";
        return new JavaScriptObject() {
            @Override
            protected void create() {
                try {
                    this.placeRef(ConditionalValueObject.this.ref());
                    this.variable(ConditionalValueObject.this.ref().getId());
                    this.chain("innerHTML");
                    this.set();
                    this.str(v);
                    this.end();
                } catch (Exception e) {
                    System.err.println("Unset element ref exception.");
                }
            }
        };
    }

    private JavaScriptObject classes(Object value, Conditions condition) {
        if(condition == Conditions.ACTIVATE || (condition == Conditions.INACTIVE && __.isset(value))) {
            try {
                ElementRef ref = ref();
                return ref.replaceClass((String) value, groupId);
            } catch (Exception e) {
                e.printStackTrace();
                System.err.println("Unset element ref exception.");
            }
        }

        try {
            ElementRef ref = ref();
            return ref.deactivateGroup(groupId);
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Unset element ref exception.");
        }
        return null;
    }

    public ElementRef ref() throws Exception {
        if(!__.isset(ref)) throw new Exception("Unset ref.");
        if(!__.isset(elementKey)) return ref;
        if(__.isset(ref.getElementKey()) && ref.getElementKey().equals(elementKey)) return ref;
        if(__.isset(ref.getChild(elementKey))) return ref.getChild(elementKey);
        throw new Exception("Unset ref.");
    }

    public ConditionalValueType getType() {
        return type;
    }

    public Class<?> getObjectType() {
        switch(type) {
            case STYLE -> {
                return AloftStyle.class;
            }
            case CLASS -> {
                return AloftStyleClass.class;
            }
            case VALUE, INNER_HTML -> {
                return String.class;
            }
            case JAVASCRIPT_FUNCTION -> {
                return JavaScriptObject.class;
            }
        }
        return null;
    }

}
