package org.extendedweb.aloft.lib.lang.structure.components;

import org.extendedweb.aloft.lib.lang.supporting.MountableComponent;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

public class AloftRoot extends MountableComponent {

    @Override
    protected ArrayList<AloftComponent> build() throws InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        return null;
    }

    @Override
    public String getName() {
        return "__root__";
    }

}
