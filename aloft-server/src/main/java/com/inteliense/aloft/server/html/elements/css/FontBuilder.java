package com.inteliense.aloft.server.html.elements.css;

import com.inteliense.aloft.compiler.lang.keywords.style.base.AloftStyleCss;
import com.inteliense.aloft.server.html.StaticSourceFile;
import com.inteliense.aloft.utils.global.__;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Scanner;

public class FontBuilder {

    private String id;
    private File file;

    private String fontPath;

    public FontBuilder(String path, File file) {
        this.file = file;
        this.fontPath = path;
        this.id = getId();
    }

    public String getPath() {
        return this.fontPath;
    }

    public byte[] getBytes() {
        if(!__.isset(file)) return null;
        if(!file.exists()) return null;
        try {
            return Files.readAllBytes(Path.of(file.getAbsolutePath()));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private String getId() {
        return fontPath;
    }

}
