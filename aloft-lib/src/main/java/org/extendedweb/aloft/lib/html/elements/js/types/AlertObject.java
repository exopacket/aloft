package org.extendedweb.aloft.lib.html.elements.js.types;

import org.extendedweb.aloft.lib.html.elements.js.JavaScriptObject;

public class AlertObject extends JavaScriptObject {

    private String title;
    private String body;
    private String id;

    public void setId(String id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public void create() {
        call("alert", FunctionArg.preset(title));
        end();
    }
}
