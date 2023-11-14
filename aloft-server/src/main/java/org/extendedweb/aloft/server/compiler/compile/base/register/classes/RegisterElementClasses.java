package org.extendedweb.aloft.server.compiler.compile.base.register.classes;

import org.extendedweb.aloft.server.compiler.compile.supporting.AloftComponentClass;
import org.extendedweb.aloft.server.compiler.compile.supporting.AloftComponentPropertyTypes;

import java.util.ArrayList;

public class RegisterElementClasses {

    public static void register(ArrayList<AloftComponentClass> list) {
        list.add(button());
    }

    private static AloftComponentClass button() {
        return new AloftComponentClass() {
            @Override
            protected void addPropertyTypes(ArrayList<AloftComponentPropertyTypes> types) {
                allowsElement();
                hasText();
                hasStyle();
                types.add(new AloftComponentPropertyTypes() {
                    @Override
                    public PropertyType[] getType() {
                        return new PropertyType[] { PropertyType.STRING, PropertyType.COLOR, PropertyType.STATIC };
                    }

                    @Override
                    public String getKey() {
                        return "color";
                    }

                    @Override
                    protected void allowedStatic(ArrayList<String> allowedStatic) {
                        allowedStatic.add("Color");
                    }
                });
            }

            @Override
            public String getKey() {
                return "Button";
            }
        };
    }

}
