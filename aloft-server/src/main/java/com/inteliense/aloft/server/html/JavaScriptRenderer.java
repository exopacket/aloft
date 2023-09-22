package com.inteliense.aloft.server.html;

import com.inteliense.aloft.compiler.lang.keywords.AloftPage;
import com.inteliense.aloft.compiler.lang.keywords.components.AloftComponent;
import com.inteliense.aloft.compiler.lang.keywords.elements.base.AloftElement;
import com.inteliense.aloft.server.html.elements.js.JavaScript;

public class JavaScriptRenderer {

    public static StaticSourceFile render(JavaScript js) {
        return new StaticSourceFile("bootstrap", js.getValue(), "application/js");
    }

}
