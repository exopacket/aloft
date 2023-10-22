package org.extendedweb.aloft.server.run.cli.commands.base;

import java.util.Arrays;

public abstract class Command {

    private Arg cmd = null;
    private Arg[] args = null;
    private Class cmdClass = null;

    public Command(String[] args) {
        Arg[] arr = Parser.getArgs(args);
        if(arr.length == 0) {
            exit("Command not found.", 1);
            return;
        }
        cmd = arr[0];
        cmdClass = Keywords.getClass(cmd.getName());
        this.args = Arrays.copyOfRange(arr, 1, arr.length);
    }

    public Class<?> getCommandClass() {
        return this.cmdClass;
    }

    public Arg getBase() {
        return cmd;
    }

    public Arg[] getArgs() {
        return this.args;
    }

    public abstract void exit(String message, int code);

}