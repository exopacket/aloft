package com.inteliense.aloft.server.html.elements.js;

import com.inteliense.aloft.server.html.StaticSourceFile;

public class JavaScriptRenderer {

    public static StaticSourceFile render(ScriptEndpoint js) {
        return new StaticSourceFile(js.getScript().getFile().getPath(), js.getScript().getValue(), "application/js");
    }

}
