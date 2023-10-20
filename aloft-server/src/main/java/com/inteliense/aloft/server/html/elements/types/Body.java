package com.inteliense.aloft.server.html.elements.types;

import com.inteliense.aloft.server.html.elements.HtmlElement;
import com.inteliense.aloft.server.html.elements.js.JavaScript;

import java.util.ArrayList;

public class Body extends HtmlElement {

    @Override
    public String getKey() {
        return "body";
    }

    public void addJs(ArrayList<JavaScript> js) {
        StringBuilder builder = new StringBuilder();
        for(JavaScript script : js) {
            builder.append(script.getValue());
        }
        this.addChild(HtmlElement.builder("script", builder.toString(), null));
    }

}
