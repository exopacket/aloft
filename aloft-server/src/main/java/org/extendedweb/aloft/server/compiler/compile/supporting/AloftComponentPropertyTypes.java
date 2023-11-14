package org.extendedweb.aloft.server.compiler.compile.supporting;

import java.util.ArrayList;

public abstract class AloftComponentPropertyTypes {

    private ArrayList<String> allowedStatic = new ArrayList<>();
    protected boolean isRequired = false;

    public abstract PropertyType[] getType();
    public abstract String getKey();
    protected void allowedStatic(ArrayList<String> allowedStatic) { this.allowedStatic.addAll(allowedStatic); }

    public AloftComponentPropertyTypes required() {
        isRequired = true;
        return this;
    }

    public boolean isRequired() {
        return isRequired;
    }

    public enum PropertyType {
        INTEGER,
        BOOLEAN,
        DECIMAL,
        STRING,
        ELEMENT,
        OBJECT,
        OBJECT_ARRAY,
        COLOR,
        STATIC
    }

}
