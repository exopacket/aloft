package com.inteliense.aloft.server.html.elements.types;

import com.inteliense.aloft.server.html.elements.HtmlElement;
import com.inteliense.aloft.server.html.elements.js.JavaScriptElement;
import com.inteliense.aloft.server.html.elements.js.JavaScriptFile;

public class Head extends HtmlElement {

    @Override
    protected String getKey() {
        return "head";
    }

    public void addTitle(String title) {
        this.addChild(HtmlElement.builder("title", title));
    }

    public void addFavicon(String filepath) {
        //FIXME support other file types other than .png
        if(!filepath.contains(".")) return;
        int count = filepath.length() - filepath.replace(".", "").length();
        String[] parts = filepath.split("\\.");
        String fileType = "image/" + parts[count - 1];
        this.addChild(HtmlElement.builder("link", null, null, new String[][]{
                { "rel", "icon" },
                { "type", fileType },
                { "href", filepath }
        }));
    }

    public void addJs(JavaScriptElement element) {
        addChild(element);
    }

    public void addJs(JavaScriptFile file) {
        addChild(file);
    }

}
