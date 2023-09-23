package com.inteliense.aloft.compiler.lang.keywords.components;

import com.inteliense.aloft.compiler.lang.supporting.MountableComponent;
import com.inteliense.aloft.server.html.elements.js.AppJavaScript;

import java.util.concurrent.atomic.AtomicReference;

public class AloftScreen extends MountableComponent {

    public AloftScreen() { super(); }

    @Override
    public String getName() {
        return "__root__";
    }

}
