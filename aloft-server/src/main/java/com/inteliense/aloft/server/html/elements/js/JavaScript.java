package com.inteliense.aloft.server.html.elements.js;

import com.inteliense.aloft.server.html.elements.HtmlElement;

public class JavaScript {

    JavaScriptWriterType type;
    Object js;

    public JavaScript(JavaScriptWriterType type, Object js) {
        this.type = type;
        this.js = js;
    }

    public String getContent() {
        return getElement().getHtml();
    }

    public JavaScriptWriterType getType() {
        return type;
    }

    public JavaScriptElement getElement() {
        if(type == JavaScriptWriterType.ELEMENT)
            return (JavaScriptElement) js;
        return null;
    }

    public JavaScriptFile getFile() {
        if(type == JavaScriptWriterType.FILE)
            return (JavaScriptFile) js;
        return null;
    }

}
