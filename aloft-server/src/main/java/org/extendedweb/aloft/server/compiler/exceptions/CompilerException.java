package org.extendedweb.aloft.server.compiler.exceptions;

import org.extendedweb.aloft.utils.exceptions.types.ExceptionAdapter;
import org.extendedweb.aloft.utils.global.__;

import java.io.File;

public class CompilerException extends ExceptionAdapter {

    private int line;
    private String filepath;
    private String value = null;
    private ExceptionType type;

    public CompilerException(int line, File file, String message, ExceptionType type) {
        super(message);
        this.line = line;
        this.type = type;
        this.filepath = file.getAbsolutePath();
    }

    public CompilerException(int line, File file, String message, String value, ExceptionType type) {
        super(message);
        this.line = line;
        this.type = type;
        this.filepath = file.getAbsolutePath();
        this.value = value;
    }

    @Override
    protected void onError() {

    }

    @Override
    protected boolean printErrors() {
        return false;
    }

    public void handle() {
        System.err.println(filepath + " [" + line + "]: " + message + (__.isset(value) ? (" (" + value + ")") : ""));
        if(type == ExceptionType.FATAL) System.exit(1);
    }

    public void handle(int exitCode) {
        System.err.println(filepath + " [" + line + "]: " + message + (__.isset(value) ? (" (" + value + ")") : ""));
        System.exit(exitCode);
    }

    public enum ExceptionType {
        WARNING,
        CRITICAL,
        FATAL
    }

}
