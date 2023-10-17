package com.inteliense.aloft.compiler.tests.pages;

import com.inteliense.aloft.compiler.lang.lib._AloftPage;
import com.inteliense.aloft.compiler.lang.supporting.MountableComponent;
import com.inteliense.aloft.compiler.tests.components._MyLoginForm;

import java.lang.reflect.InvocationTargetException;

public class _TestProjectHome extends _AloftPage {

    public _TestProjectHome() {
        super(null, "Hello World", "/");
    }

    @Override
    protected MountableComponent buildTree() throws InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        return mountable(
                _MyLoginForm.class
        );
    }


}
