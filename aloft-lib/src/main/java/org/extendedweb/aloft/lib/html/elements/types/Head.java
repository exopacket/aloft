package org.extendedweb.aloft.lib.html.elements.types;

import org.extendedweb.aloft.lib.lang.structure.style.AloftStyleCss;
import org.extendedweb.aloft.lib.html.elements.HtmlElement;
import org.extendedweb.aloft.lib.html.elements.js.JavaScript;

import java.util.ArrayList;

public class Head extends HtmlElement {

    @Override
    public String getKey() {
        return "head";
    }

    public void addTitle(String title) {
        this.addChild(HtmlElement.builder("title", title, null));
    }

    public void addCss(AloftStyleCss css) {
        this.addChild(HtmlElement.builder("style", css.css(null), null));
    }

    public void addCss(String css) {
        this.addChild(HtmlElement.builder("style", css, null));
    }

    public void addJs(ArrayList<JavaScript> js) {
        StringBuilder builder = new StringBuilder();
        for(JavaScript script : js) {
            builder.append(script.getValue());
        }
        this.addChild(HtmlElement.builder("script", builder.toString(), null, new String[][]{{"type", "application/js"}}));
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
