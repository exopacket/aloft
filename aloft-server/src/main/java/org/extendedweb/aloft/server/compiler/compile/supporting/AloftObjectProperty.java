package org.extendedweb.aloft.server.compiler.compile.supporting;

import org.extendedweb.aloft.lib.lang.types.base.T;
import org.extendedweb.aloft.lib.lang.types.base.V;
import org.extendedweb.aloft.lib.lang.types.t.DynamicT;
import org.extendedweb.aloft.lib.lang.types.v.NullV;
import org.extendedweb.aloft.server.compiler.compile.base.TypeCompiler;
import org.extendedweb.aloft.server.compiler.exceptions.CompilerException;

public class  AloftObjectProperty {

    private String name;
    private boolean required;
    private T type;
    private V value;

    public AloftObjectProperty(String name, boolean required) {
        this.name = name;
        this.type = new DynamicT();
        this.required = required;
    }

    public AloftObjectProperty(String name, T type, boolean required) {
        this.name = name;
        this.type = type;
        this.required = required;
    }

    public AloftObjectProperty cloneProperty(T type, ContextContainer value) throws CompilerException {
        AloftObjectProperty property = new AloftObjectProperty(this.name, this.required);
        property.set(type, value);
        return property;
    }

    public AloftObjectProperty cloneProperty(ContextContainer value) throws CompilerException {
        AloftObjectProperty property = new AloftObjectProperty(this.name, this.required);
        property.set(type, value);
        return property;
    }

    public void set(T type, ContextContainer value) throws CompilerException {
        this.type = type;
        this.value = compileValue(value);
    }

    private V compileValue(ContextContainer value) throws CompilerException {
        return TypeCompiler.compile(type, value);
    }

    public T getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public V getValue() {
        return value;
    }
}
