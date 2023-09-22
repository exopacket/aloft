package com.inteliense.aloft.server.html.elements.css;

import com.inteliense.aloft.compiler.lang.keywords.style.base.AloftStyleCss;
import com.inteliense.aloft.utils.global.__;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class StylesheetBuilder {

    private String id;
    private File file;

    private AloftStyleCss css;
    private String stylesheetPath;

    public StylesheetBuilder(String path, File file) {
        this.file = file;
        this.stylesheetPath = path;
        this.id = getId();
    }

    public void addObject(AloftStyleCss object) {
        this.css = object;
    }

    public StylesheetElement getElement() {
        return null;
    }

    public StylesheetFile getFile() {
        if(!__.isset(file)) return null;
        if(!file.exists()) return null;
        try {
            Scanner scnr = new Scanner(file);
            StringBuilder builder = new StringBuilder();
            while(scnr.hasNext()) {
                builder.append(scnr.nextLine() + "\n");
            }
            return new StylesheetFile(id, builder.toString());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private String getId() {
        return stylesheetPath;
    }

}
