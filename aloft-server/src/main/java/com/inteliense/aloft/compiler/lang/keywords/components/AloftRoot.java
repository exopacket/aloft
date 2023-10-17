package com.inteliense.aloft.compiler.lang.keywords.components;

import com.inteliense.aloft.compiler.lang.supporting.MountableComponent;

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
