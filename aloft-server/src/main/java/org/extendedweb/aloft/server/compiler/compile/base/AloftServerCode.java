package org.extendedweb.aloft.server.compiler.compile.base;

import java.io.File;
import java.util.ArrayList;

public class AloftServerCode {

    private ArrayList<AloftServerCodeFile> files;

    public AloftServerCode() { }

    public AloftServerCodeFile function() {
        AloftServerCodeFile file = new AloftServerCodeFile(AloftServerCodeClassType.FUNCTION, "");
        files.add(file);
        return file;
    }

    public ArrayList<AloftServerCodeFile> files() {
        return files;
    }

    public void merge(AloftServerCode toMerge) {
        this.files.addAll(toMerge.files());
    }

    public String build(String path) {
        File dir = new File(path);
        if(!dir.exists() || !dir.isDirectory()) return null;
        File src = new File(path + "src");
        src.mkdir();
        ArrayList<File> toCompile = new ArrayList<>();
        for(AloftServerCodeFile file : files) {
            toCompile.add(file.getFile().write(path + "src"));
        }
        return javacc(path + "src", path, toCompile);
    }

    private String javacc(String srcPath, String outPath, ArrayList<File> files) {
        return ".jar";
    }

}
