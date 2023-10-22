package org.extendedweb.aloft.lib.lang.base;

import org.extendedweb.aloft.lib.html.elements.js.AppJavaScript;

import java.util.concurrent.atomic.AtomicReference;

public interface BuildsAppJavascript {
    void javascript(AtomicReference<AppJavaScript> js);
}
