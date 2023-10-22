package org.extendedweb.aloft.lib.application.config;

import org.extendedweb.aloft.lib.html.elements.css.Font;
import org.extendedweb.aloft.utils.global.__;

import java.util.ArrayList;
import java.util.Arrays;

public class FontEndpointList {

    private ArrayList<Font> list = new ArrayList<>();
    int currentIndex = 0;

    public FontEndpointList() { }

    public FontEndpointList(Font[] fonts) {
        this.list.addAll(Arrays.asList(fonts));
    }

    public void appendAppFontEndpoints(Font font) {
        this.list.add(font);
    }

    public boolean has(String path) {
        for(int i=0; i<list.size(); i++) if(__.same(path, list.get(i).getPath())) return true;
        return false;
    }

    public Font get(String path) {
        for(int i=0; i<list.size(); i++) if(__.same(path, list.get(i).getPath())) return list.get(i);
        return null;
    }

    public Font next() {
        Font font = list.get(currentIndex);
        currentIndex++;
        if(currentIndex == list.size()) currentIndex = 0;
        return font;
    }

    public int size() {
        return this.list.size();
    }

}
