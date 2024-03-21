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
        return getElement();
    }

    public String getValue() {
        return getFile().getValue();
    }

    private StylesheetElement getElement() {
        return css.getElement();
    }

    public StylesheetFile getFile() {
        return css.getFile();
    }

}
