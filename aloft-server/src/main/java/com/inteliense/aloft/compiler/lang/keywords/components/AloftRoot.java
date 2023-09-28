package com.inteliense.aloft.compiler.lang.keywords.components;

import com.inteliense.aloft.compiler.lang.supporting.MountableComponent;

public class AloftRoot extends MountableComponent {

    public AloftRoot() { super(); }

    @Override
    public String getName() {
        return "__root__";
    }

}
