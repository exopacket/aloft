package com.inteliense.aloft.server.html.elements.js;

import com.inteliense.aloft.server.html.elements.types.Content;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.Scanner;

public class AloftJavaScript extends JavaScriptElement {

    public AloftJavaScript(String resource) {
        super();
        resource = resource.replace(".js", "");
        if(resource.charAt(0) != '/') resource = "/" + resource;
        addAttribute("type", "application/javascript");
        URL url = this.getClass().getResource(resource + ".js");
        value = readFile(getFile(url));
        addChild(new Content(value, false));
    }

    private String readFile(File file) {
        if(file == null) { return "//empty script"; }
        try {
            Scanner scnr = new Scanner(file);
            StringBuilder sb = new StringBuilder();
            while(scnr.hasNextLine()) {
                sb.append(scnr.nextLine()).append("\n");
            }
            return sb.toString();
        } catch (FileNotFoundException e) {
            return "//empty script";
        }
    }

    private File getFile(URL url) {
        File file = new File(url.getPath());
        if(!file.exists()) return null;
        return file;
    }

}
