package com.inteliense.aloft.compiler.tests.pages;

import com.inteliense.aloft.compiler.lang.keywords.elements.types.CenteredAloftElement;
import com.inteliense.aloft.compiler.lang.lib._AloftPage;
import com.inteliense.aloft.compiler.lang.supporting.MountableComponent;

import java.lang.reflect.InvocationTargetException;

public class _TestProjectHome extends _AloftPage {

    public _TestProjectHome() throws InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        super(null, "Hello World");
    }

    @Override
    protected MountableComponent buildTree() throws InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        return mountable(
                CenteredAloftElement.class,
                group(CenteredAloftElement.class)
        );
    }


}
