package com.inteliense.aloft.compiler.lang.keywords.components;

import com.inteliense.aloft.compiler.lang.base.BuildsHtml;
import com.inteliense.aloft.server.html.elements.HtmlElement;

import java.util.ArrayList;

public class AloftComponent implements BuildsHtml {

    private ArrayList<AloftComponent> children = new ArrayList<>();
    private int currentIndex = 0;

    public AloftComponent() { }

    public void addChild(AloftComponent component) { this.children.add(component); }

    public AloftComponent next() {
        if(currentIndex == children.size()) return null;
        AloftComponent component = children.get(currentIndex);
        currentIndex++;
        return component;
    }

    public String getName() {
        return "MyComponent";
    }

    @Override
    public HtmlElement html() {
        if(this.children.size() == 1) {
            return children.get(0).html();
        } else if(this.children.size() > 1) {
            HtmlElement container = new HtmlElement() {
                @Override
                protected String getKey() {
                    return "div";
                }
            };
            for(int i=0; i< children.size(); i++) {
                container.addChild(children.get(i).html());
            }
            return container;
        }
        return null;
    }
}
