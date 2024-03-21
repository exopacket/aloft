package org.extendedweb.aloft.lib.lang.types.t;

import org.extendedweb.aloft.lib.lang.types.base.T;
import org.extendedweb.aloft.lib.lang.types.base.V;
import org.extendedweb.aloft.lib.lang.types.v.NullV;
import org.extendedweb.aloft.lib.lang.types.v.StringV;
import org.extendedweb.aloft.utils.encryption.A32;
import org.extendedweb.aloft.utils.global.__;

public class FieldT extends T {

    protected ModelT parent;
    protected String name;
    protected String id;
    protected T type;

    public FieldT(ModelT model, String name, T type) {
        this.parent = model;
        this.name = name;
        this.type = type;
        this.id = A32.get(model + "." + name);
    }

    @Override
    public V value(Object v) {
        return this.type.value(v);
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getFullyQualifiedName() {
        return parent.getPath() + "." + name;
    }

    public ModelT getParent() {
        return parent;
    }

    public String getFullyQualifiedName(String prepend) {
        if(__.empty(prepend)) return getFullyQualifiedName();
        return prepend + "." + name;
    }

    public T getType() {
        return type;
    }
}
