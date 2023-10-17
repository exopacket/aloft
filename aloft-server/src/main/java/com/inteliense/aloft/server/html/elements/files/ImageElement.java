package com.inteliense.aloft.server.html.elements.files;

import com.inteliense.aloft.server.html.elements.HtmlElement;

public class ImageElement extends HtmlElement {

    protected int width = 0;
    protected int height = 0;
    protected String src;
    protected String alt = "image";

    public ImageElement(String src) {
        this.src = src;
        addAttribute("src", src);
        addAttribute("alt", this.alt);
    }

    public ImageElement(String src, int width, int height) {
        this.src = src;
        this.width = width;
        this.height = height;
        addAttribute("src", this.src);
        addAttribute("alt", this.alt);
        if(this.width > 0) addAttribute("width", "" + this.width);
        if(this.height > 0) addAttribute("height", "" + this.height);
    }

    public ImageElement(String src, String alt) {
        this.src = src;
        this.alt = alt;
        addAttribute("src", src);
        addAttribute("alt", this.alt);
    }

    public ImageElement(String src, String alt, int width, int height) {
        this.src = src;
        this.width = width;
        this.height = height;
        this.alt = alt;
        addAttribute("src", this.src);
        addAttribute("alt", this.alt);
        if(this.width > 0) addAttribute("width", "" + this.width);
        if(this.height > 0) addAttribute("height", "" + this.height);
    }

    public void setAttributes(String alt, int width, int height) {
        this.width = width;
        this.height = height;
        this.alt = alt;
        addAttribute("src", this.src);
        addAttribute("alt", this.alt);
        if(this.width > 0) addAttribute("width", "" + this.width);
        if(this.height > 0) addAttribute("height", "" + this.height);
    }

    public static ImageElement fromBase64(String mime, String base64, String alt, int width, int height) {
        String src = "data:" + mime + ";base64," + base64;
        return new ImageElement(src, alt, width, height);
    }

    @Override
    public String getKey() {
        return "img";
    }

    public String getValue() {
        return src;
    }

}
