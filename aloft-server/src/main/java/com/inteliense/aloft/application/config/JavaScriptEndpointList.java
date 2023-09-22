package com.inteliense.aloft.application.config;

import com.inteliense.aloft.server.html.elements.js.JavaScript;
import com.inteliense.aloft.utils.global.__;

import java.util.ArrayList;
import java.util.Arrays;

public class JavaScriptEndpointList {

    private ArrayList<JavaScript> list = new ArrayList<>();
    int currentIndex = 0;

    public JavaScriptEndpointList() { }

    public JavaScriptEndpointList(JavaScript[] scripts) {
        this.list.addAll(Arrays.asList(scripts));
    }

    public void appendAppScriptEndpoints(JavaScript script) {
        this.list.add(script);
    }

    public boolean has(String path) {
        for(int i=0; i<list.size(); i++) if(__.same(path, list.get(i).getFile().getPath())) return true;
        return false;
    }

    public JavaScript get(String path) {
        for(int i=0; i<list.size(); i++) if(__.same(path, list.get(i).getFile().getPath())) return list.get(i);
        return null;
    }

    public JavaScript next() {
        JavaScript js = list.get(currentIndex);
        currentIndex++;
        if(currentIndex == list.size()) currentIndex = 0;
        return js;
    }

    public int size() {
        return this.list.size();
    }

}
