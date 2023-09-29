package com.inteliense.aloft.compiler.lang.lib.model;

public class _AloftModelProperty {

    private String name;
    private _AloftModelPropertyType type;

    public _AloftModelProperty(String name, _AloftModelPropertyType type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public _AloftModelPropertyType getType() {
        return type;
    }
}
