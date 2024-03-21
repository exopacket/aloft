package org.extendedweb.aloft.lib.html.elements.js;

import org.extendedweb.aloft.lib.html.elements.HtmlElement;
import org.extendedweb.aloft.utils.global.__;

public class JavaScript {

    private JavaScriptWriterType type;
    private JavaScriptBuilder js;
    private boolean isModule = false;

    public JavaScript(JavaScriptWriterType type, JavaScriptBuilder js) {
        this.type = type;
        this.js = js;
    }

    public JavaScript(JavaScriptWriterType type, JavaScriptBuilder js, boolean isModule) {
        this.type = type;
        this.js = js;
        this.isModule = isModule;
    }

    public JavaScriptWriterType getType() {
        return type;
    }

    public void clean() {

    }

    public HtmlElement getTag() {
        HtmlElement tag = getElement();
        if(isModule) tag.addAttribute("type", "module", true);
        System.out.println("MADE IT");
        return tag;
    }

    public String getValue() {
        if(type == JavaScriptWriterType.ELEMENT && __.isset(getElement())) return getElement().getValue();
        else if(type == JavaScriptWriterType.FILE && __.isset(getFile())) return getFile().getValue();
        return "";
    }

    private JavaScriptElement getElement() {
        return js.getElement();
    }

    public JavaScriptFile getFile() {
        if(type == JavaScriptWriterType.FILE)
            return js.getFile();
        return null;
    }

}
