package com.inteliense.aloft.compiler.lang.keywords.listeners.types;

import com.inteliense.aloft.compiler.lang.keywords.listeners.base.AloftListener;
import com.inteliense.aloft.server.html.elements.js.JavaScriptObject;
import com.inteliense.aloft.server.html.elements.js.types.AlertObject;
import com.inteliense.aloft.server.html.elements.js.types.ShowAlertObject;

import java.util.HashMap;

public class AloftOnClickListener extends AloftListener {
    @Override
    public JavaScriptObject getObject() {
        ShowAlertObject alert = new ShowAlertObject();
        alert.build();
        JavaScriptObject root = buildBase("click", "myAlert", alert);
        return root;
    }
}
