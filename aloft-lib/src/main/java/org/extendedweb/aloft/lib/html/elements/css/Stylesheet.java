package org.extendedweb.aloft.lib.html.elements.css;

import org.extendedweb.aloft.lib.html.elements.HtmlElement;
import org.extendedweb.aloft.utils.global.__;

public class Stylesheet {

    private StylesheetWriterType type;
    private StylesheetBuilder css;

    public Stylesheet(StylesheetWriterType type, StylesheetBuilder css) {
        this.type = type;
        this.css = css;
    }

    public StylesheetWriterType getType() {
        return type;
    }

    public HtmlElement getTag() {
        if(type == StylesheetWriterType.ELEMENT && __.isset(getElement())) return getElement();
        else if(type == StylesheetWriterType.FILE && __.isset(getFile())) return getFile();
        return null;
    }

    public String getValue() {
        if(type == StylesheetWriterType.ELEMENT && __.isset(getElement())) return getElement().getValue();
        else if(type == StylesheetWriterType.FILE && __.isset(getFile())) return getFile().getValue();
        return "";
    }

    private StylesheetElement getElement() {
        if(type == StylesheetWriterType.ELEMENT)
            return css.getElement();
        return null;
    }

    public StylesheetFile getFile() {
        if(type == StylesheetWriterType.FILE)
            return css.getFile();
        return null;
    }

}
