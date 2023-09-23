package com.inteliense.aloft.compiler.lang.supporting;

import com.inteliense.aloft.compiler.lang.keywords.components.AloftComponent;
import com.inteliense.aloft.server.html.elements.js.AppJavaScript;

import java.util.concurrent.atomic.AtomicReference;

public class MountPoint extends AloftComponent {

    public MountPoint() {
        super();
    }

    @Override
    public String getName() {
        return "__mount__";
    }
}
