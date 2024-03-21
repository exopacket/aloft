package org.extendedweb.aloft.server.compiler.compile.supporting;

import org.extendedweb.aloft.lib.lang.structure.elements.base.AloftElement;

import java.util.ArrayList;

public abstract class AloftAbstractComponentClass extends AloftComponentClass {
    private ArrayList<AloftComponentPropertyTypes> types = new ArrayList<>();
    private boolean hasChild = false;
    private boolean hasChildren = false;

    public AloftAbstractComponentClass(Class<? extends AloftElement> c) {
        super(c);
        addPropertyTypes(types);
    }

    protected abstract void addPropertyTypes(ArrayList<AloftComponentPropertyTypes> types);
    public abstract String getKey();

    protected void hasStyle()  {

    }

    protected void hasText() {
        types.add(new AloftComponentPropertyTypes() {
            @Override
            public PropertyType[] getType() {
                return new PropertyType[] { PropertyType.STRING, PropertyType.DECIMAL, PropertyType.INTEGER };
            }

            @Override
            public String getKey() {
                return "text";
            }
        });
    }

    protected void allowsElement() {
        types.add(new AloftComponentPropertyTypes() {
            @Override
            public PropertyType[] getType() {
                return new PropertyType[] { PropertyType.ELEMENT };
            }

            @Override
            public String getKey() {
                return "#";
            }
        });
    }

    protected void requiresElement() {
        types.add(new AloftComponentPropertyTypes() {
            @Override
            public PropertyType[] getType() {
                return new PropertyType[] { PropertyType.ELEMENT };
            }

            @Override
            public String getKey() {
                return "#";
            }
        }.required());
    }
}
