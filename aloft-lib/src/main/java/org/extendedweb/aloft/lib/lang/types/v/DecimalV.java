package org.extendedweb.aloft.lib.lang.types.v;

public class DecimalV extends NumberV {

    private Double value;

    public DecimalV(double value) {
        this.value = value;
    }

    @Override
    public <Any> Any get() {
        return (Any) value;
    }
}
