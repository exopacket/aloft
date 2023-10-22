package org.extendedweb.aloft.lib.application.config;

import org.extendedweb.aloft.lib.html.elements.css.Stylesheet;
import org.extendedweb.aloft.lib.html.elements.js.JavaScript;
import org.extendedweb.aloft.utils.global.__;

import java.util.ArrayList;
import java.util.Arrays;

public class StylesheetEndpointList {

    private ArrayList<Stylesheet> list = new ArrayList<>();
    int currentIndex = 0;

    public StylesheetEndpointList() { }

    public StylesheetEndpointList(Stylesheet[] stylesheets) {
        this.list.addAll(Arrays.asList(stylesheets));
    }

    public void appendAppStylesheetEndpoints(Stylesheet stylesheet) {
        this.list.add(stylesheet);
    }

    public boolean has(String path) {
        for(int i=0; i<list.size(); i++) if(__.same(path, list.get(i).getFile().getPath())) return true;
        return false;
    }

    public Stylesheet get(String path) {
        for(int i=0; i<list.size(); i++) if(__.same(path, list.get(i).getFile().getPath())) return list.get(i);
        return null;
    }

    public Stylesheet next() {
        Stylesheet css = list.get(currentIndex);
        currentIndex++;
        if(currentIndex == list.size()) currentIndex = 0;
        return css;
    }

    public int size() {
        return this.list.size();
    }

}
