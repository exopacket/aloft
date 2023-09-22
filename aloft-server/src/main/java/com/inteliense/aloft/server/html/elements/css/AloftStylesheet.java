package com.inteliense.aloft.server.html.elements.css;

import com.inteliense.aloft.server.html.elements.types.Content;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.Scanner;

//Internal CSS that is static
public class AloftStylesheet extends StylesheetElement {

    public AloftStylesheet(String resource) {
        super();
        resource = resource.replace(".css", "");
        if(resource.charAt(0) != '/') resource = "/" + resource;
        URL url = this.getClass().getResource(resource + ".css");
        value = readFile(getFile(url));
        addChild(new Content(value, false));
    }

    private String readFile(File file) {
        if(file == null) { return "//empty stylsheet"; }
        try {
            Scanner scnr = new Scanner(file);
            StringBuilder sb = new StringBuilder();
            while(scnr.hasNextLine()) {
                sb.append(scnr.nextLine()).append("\n");
            }
            return sb.toString();
        } catch (FileNotFoundException e) {
            return "//empty stylesheet";
        }
    }

    private File getFile(URL url) {
        File file = new File(url.getPath());
        if(!file.exists()) return null;
        return file;
    }

}
