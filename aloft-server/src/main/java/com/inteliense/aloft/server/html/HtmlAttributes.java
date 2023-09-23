package com.inteliense.aloft.server.html;

import java.util.ArrayList;

public class HtmlAttributes {

    private ArrayList<HtmlAttribute> list = new ArrayList<>();
    private int currentIndex = 0;

    public void add(String key, String value) {
        this.list.add(new HtmlAttribute(key, value));
    }

    public HtmlAttribute next() {
        HtmlAttribute attribute = this.list.get(currentIndex);
        currentIndex++;
        if(currentIndex == size()) currentIndex = 0;
        return attribute;
    }

    public int size() {
        return list.size();
    }
}
