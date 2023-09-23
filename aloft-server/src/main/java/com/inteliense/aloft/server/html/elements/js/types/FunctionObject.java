package com.inteliense.aloft.server.html.elements.js.types;

import com.inteliense.aloft.server.html.elements.js.JSOV;
import com.inteliense.aloft.server.html.elements.js.JavaScriptObject;

public class FunctionObject extends JavaScriptObject {

    @Override
    public void create() {
        this.namedFunction(getVar("function").getString());
        this.blockStart();
        this.slot();
        this.blockEnd();
    }
}
