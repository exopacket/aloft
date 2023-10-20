package com.inteliense.aloft.compiler.lang.keywords.elements.base.validation.conditionals.base;

import com.inteliense.aloft.utils.global.__;

public class ConditionalValueSet {

    private Object active = null;
    private Object inactive = null;
    private Object clear = null;

    public ConditionalValueSet(Object active, Object inactive, Object clear) {
        this.active = active;
        this.inactive = inactive;
        this.clear = clear;
    }

    public static ConditionalValueSet create(Object active, Object inactive, Object clear) {
        return new ConditionalValueSet(active, inactive, clear);
    }

    public static ConditionalValueSet create(Object active, Object inactive) {
        return new ConditionalValueSet(active, inactive, null);
    }

    public static ConditionalValueSet create(Object active) {
        return new ConditionalValueSet(active, null, null);
    }

    public Object get(Conditions condition) {
        if(condition == Conditions.ACTIVATE) return active;
        if(condition == Conditions.INACTIVE && __.isset(inactive)) return inactive;
        if(condition == Conditions.CLEAR  && __.isset(inactive)) return clear;
        return null;
    }

}
