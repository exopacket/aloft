package org.extendedweb.aloft.lib.html.elements.css;

import org.extendedweb.aloft.lib.html.elements.HtmlElement;
import org.extendedweb.aloft.lib.lang.structure.style.AloftStyleCss;
import org.extendedweb.aloft.utils.global.__;

import java.io.File;
import java.io.FileNotFoundException;
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
        StylesheetElement el = new StylesheetElement();
        el.addAttribute("href", stylesheetPath);
        el.addAttribute("rel", "stylesheet");
        el.addAttribute("type", "text/css");
        return el;
    }

    public StylesheetFile getFile() {
        if(!__.isset(file)) System.exit(12);
        if(!file.exists()) System.exit(13);
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