package com.inteliense.aloft.server.html.elements.files;

import com.inteliense.aloft.server.html.elements.HtmlElement;

public class ImageFile extends HtmlElement {

    private String value;
    private String path;
    private String key;

    @Override
    public String getKey() {
        return key;
    }

    public ImageFile(String key, String endpoint, String img) {
        path = endpoint;
        value = img;
        this.key = key;
    }

    public static ImageFile forFavicon(String endpoint, String img, String mime) {
        ImageFile file = new ImageFile("link", endpoint, img);
        file.addAttribute("type", mime);
        file.addAttribute("href", endpoint);
        file.addAttribute("rel", "icon");
        return file;
    }

    public String getValue() {
        return value;
    }

    public String getPath() {
        return path;
    }

}
