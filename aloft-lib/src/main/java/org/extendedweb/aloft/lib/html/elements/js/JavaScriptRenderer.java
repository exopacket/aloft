package org.extendedweb.aloft.lib.html.elements.js;

import org.extendedweb.aloft.lib.html.StaticSourceFile;

public class JavaScriptRenderer {

    public static StaticSourceFile render(ScriptEndpoint js) {
        return new StaticSourceFile(js.getScript().getFile().getPath(), js.getScript().getValue(), "application/js");
    }

}
