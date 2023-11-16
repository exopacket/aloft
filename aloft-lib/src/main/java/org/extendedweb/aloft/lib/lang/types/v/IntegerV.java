package org.extendedweb.aloft.lib.lang.types.v;

public class IntegerV extends NumberV {

    private Integer value;

    public IntegerV(int value) {
        this.value = value;
    }

    @Override
    public <Any> Any get() {
        return (Any) value;
    }
}
