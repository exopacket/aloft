package org.extendedweb.aloft.lib.tests.pages;

import org.extendedweb.aloft.lib._AloftPage;
import org.extendedweb.aloft.lib.lang.supporting.MountableComponent;
import org.extendedweb.aloft.lib.tests.components._MyLoginForm;

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
