package com.inteliense.aloft.compiler.lang.keywords.listeners.types;

import com.inteliense.aloft.compiler.lang.keywords.listeners.base.AloftListener;
import com.inteliense.aloft.server.html.elements.js.JavaScriptObject;
import com.inteliense.aloft.server.html.elements.js.types.AlertObject;

public class AloftOnClickListener extends AloftListener {
    @Override
    public JavaScriptObject getObject() {
        AlertObject alert = new AlertObject();
        alert.setText("\"test\"");
        alert.build();
        JavaScriptObject root = buildBase("click", "myAlert", alert);
        return root;
    }
}
