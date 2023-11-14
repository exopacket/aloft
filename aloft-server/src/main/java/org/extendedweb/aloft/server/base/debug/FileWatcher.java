package org.extendedweb.aloft.server.base.debug;

import org.extendedweb.aloft.server.compiler.compile.supporting.AloftObject;
import org.extendedweb.aloft.utils.encryption.SHA;
import org.extendedweb.aloft.utils.global.__;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public abstract class FileWatcher {

    private File dir = null;
    private ArrayList<FileContains> files = new ArrayList<>();

    public FileWatcher(File dir) {
        this.dir = dir;
    }

    protected abstract void compile(FileContains file);

    protected FileContains update(File file) {
        try {
            Scanner scanner = new Scanner(file);
            StringBuilder builder = new StringBuilder();
            while(scanner.hasNextLine()) builder.append(scanner.nextLine()).append('\n');
            int indexOf = findFile(file);
            if(indexOf >= 0) {
                FileContains v = files.get(indexOf);
                if(!v.hashMatches(builder.toString())) {
                    compile(v);
                }
            }
            return null;
        } catch (FileNotFoundException ignored) { }
        return null;
    }

    private int findFile(File file) {
        for(int i=0; i<files.size(); i++) {
            if(files.get(i).pathMatches(file.getAbsolutePath())) return i;
        }
        return -1;
    }

    public static class FileContains {
        private String path;
        private String hash;
        private String content;
        private File file;
        private ArrayList<AloftObject> objects = new ArrayList<>();

        public FileContains(String path, String content, File file) {
            this.path = path;
            this.content = content;
            this.hash = SHA.get384(content);
            this.file = file;
        }

        public boolean hashMatches(String content) {
            return __.same(SHA.get384(content), hash);
        }

        public boolean pathMatches(String path) { return __.same(path, this.path); }

        public String getContent() {
            return content;
        }

        public File getFile() {
            return file;
        }
    }

}
