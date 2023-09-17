package com.inteliense.aloft.server.html.elements.js;

import com.inteliense.aloft.utils.global.__;

public class JavaScript {

    JavaScriptWriterType type;
    Object js;

    public JavaScript(JavaScriptWriterType type, Object js) {
        this.type = type;
        this.js = js;
    }

    public String getTag() {
        if(type == JavaScriptWriterType.ELEMENT && __.isset(getElement())) return getElement().getHtml();
        else if(type == JavaScriptWriterType.FILE && __.isset(getFile())) return getFile().getHtml();
        return "";
    }

    public String getValue() {
        if(type == JavaScriptWriterType.ELEMENT && __.isset(getElement())) return getElement().getValue();
        else if(type == JavaScriptWriterType.FILE && __.isset(getFile())) return getFile().getValue();
        return "";
    }

    private JavaScriptElement getElement() {
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
