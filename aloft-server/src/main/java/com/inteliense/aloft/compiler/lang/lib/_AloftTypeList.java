package com.inteliense.aloft.compiler.lang.lib;

import com.inteliense.aloft.compiler.lang.lib.model._AloftModel;

import java.lang.reflect.Constructor;
import java.util.ArrayList;

public abstract class _AloftTypeList {

    protected ArrayList<_AloftModel> models = new ArrayList<>();

    public void append(Class<?> c) throws Exception {
        Constructor<?> construct = c.getConstructor();
        _append(construct.newInstance());
    }

    private void _append(Object instance) {
        if(instance instanceof _AloftModel) __append((_AloftModel) instance);
    }

    protected void __append(_AloftModel model) {
        models.add(model);
    }

    public int findModel(String name) {
        return -1;
    }

    public _AloftModel getModel(int index) {
        return models.get(index);
    }

}
