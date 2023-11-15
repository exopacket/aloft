package org.extendedweb.aloft.server.compiler.compile.supporting;

import org.extendedweb.aloft.lib.lang.types.base.T;
import org.extendedweb.aloft.lib.lang.types.base.V;
import org.extendedweb.aloft.lib.lang.types.t.DynamicT;
import org.extendedweb.aloft.lib.lang.types.t.StringT;
import org.extendedweb.aloft.server.compiler.compile.base.TypeCompiler;
import org.extendedweb.aloft.server.grammar.antlr.AloftParser;

public class AloftObjectProperty {

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

    public AloftObjectProperty cloneProperty(T type, AloftParser.Property_valueContext value) {
        AloftObjectProperty property = new AloftObjectProperty(this.name, this.required);
        property.set(type, value);
        return property;
    }

    public AloftObjectProperty cloneProperty(AloftParser.Property_valueContext value) {
        AloftObjectProperty property = new AloftObjectProperty(this.name, this.required);
        property.set(type, value);
        return property;
    }

    public void set(T type, AloftParser.Property_valueContext value) {
        this.type = type;
        this.value = compileValue(value);
    }

    private V compileValue(AloftParser.Property_valueContext value) {
        if(type instanceof DynamicT) return TypeCompiler.compile(value);
        return null;
    }

    public String getName() {
        return name;
    }

    public V getValue() {
        return value;
    }
}
