package com.inteliense.aloft.server.html.elements.files;

import com.inteliense.aloft.utils.encryption.SHA;
import com.inteliense.aloft.utils.global.__;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ImageBuilder {

    private File file;
    private String path;

    public ImageBuilder(String base, File file) {
        String src = SHA.getSha1(file.getName() + ":" + file.getAbsolutePath()) + "." + file.getName().split("\\.")[1];
        this.file = file;
        this.path = base + "/" + src;
    }

    public ImageElement getElement() {
        String src = SHA.getSha1(file.getName() + ":" + file.getAbsolutePath()) + "." + file.getName().split("\\.")[1];
        return new ImageElement(src);
    }

    public ImageFile getFile() {
        if(!__.isset(file)) return null;
        if(!file.exists()) return null;
        try {
            Scanner scnr = new Scanner(file);
            StringBuilder builder = new StringBuilder();
            while(scnr.hasNext()) {
                builder.append(scnr.nextLine() + "\n");
            }
            return new ImageFile("img", path, builder.toString());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public ImageFile getFavicon() {
        if(!__.isset(file)) return null;
        if(!file.exists()) return null;
        try {
            Scanner scnr = new Scanner(file);
            StringBuilder builder = new StringBuilder();
            while(scnr.hasNext()) {
                builder.append(scnr.nextLine() + "\n");
            }
            return ImageFile.forFavicon(path, builder.toString(), "image/png");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
