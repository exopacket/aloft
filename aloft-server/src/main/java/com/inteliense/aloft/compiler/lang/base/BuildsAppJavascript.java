package com.inteliense.aloft.compiler.lang.base;

import com.inteliense.aloft.server.html.elements.js.AppJavaScript;

import java.util.concurrent.atomic.AtomicReference;

public interface BuildsAppJavascript {
    void javascript(AtomicReference<AppJavaScript> js);
}
