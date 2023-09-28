package com.inteliense.aloft.server.html.elements.types;

import com.inteliense.aloft.compiler.lang.keywords.style.base.AloftStyleCss;
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

    public void addCss(AloftStyleCss css) {
        this.addChild(HtmlElement.builder("style", css.css(null)));
    }

    public void addCss(String css) {
        this.addChild(HtmlElement.builder("style", css));
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

}
