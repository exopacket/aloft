package com.inteliense.aloft.server.html.elements.files;

import com.inteliense.aloft.server.html.elements.HtmlElement;
import com.inteliense.aloft.utils.global.__;

public class Image {

    private ImageWriterType type;
    private ImageBuilder img;

    public Image(ImageWriterType type, ImageBuilder js) {
        this.type = type;
        this.img = js;
    }

    public ImageWriterType getType() {
        return type;
    }

    public HtmlElement getTag() {
        if(type == ImageWriterType.ELEMENT && __.isset(getElement())) return getElement();
        else if(type == ImageWriterType.FILE && __.isset(getFile())) return getFile();
        else if(type == ImageWriterType.FAVICON && __.isset(getFavicon())) return getFavicon();
        return null;
    }

    public String getValue() {
        if(type == ImageWriterType.ELEMENT && __.isset(getElement())) return getElement().getValue();
        else if(type == ImageWriterType.FILE && __.isset(getFile())) return getFile().getValue();
        else if(type == ImageWriterType.FAVICON && __.isset(getFavicon())) return getFavicon().getValue();
        return "";
    }

    private ImageElement getElement() {
        if(type == ImageWriterType.ELEMENT)
            return img.getElement();
        return null;
    }

    public ImageFile getFile() {
        if(type == ImageWriterType.FILE)
            return img.getFile();
        return null;
    }

    public ImageFile getFavicon() {
        if(type == ImageWriterType.FAVICON)
            return img.getFavicon();
        return null;
    }

}
