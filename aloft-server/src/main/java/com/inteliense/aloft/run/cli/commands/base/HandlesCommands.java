package com.inteliense.aloft.run.cli.commands.base;

import com.inteliense.aloft.run.cli.Help;
import com.inteliense.aloft.run.cli.config.AppConfig;
import com.inteliense.aloft.utils.global.__;

import java.lang.reflect.Constructor;
import java.util.List;

public abstract class HandlesCommands {

    protected Command command;

    public static HandlesCommands create(Command command, AppConfig config) {
        try {
            Class<?> _class = command.getCommandClass();
            Constructor<?> construct = _class.getConstructor(Command.class, AppConfig.class);
            Object __class = construct.newInstance(command, config);
            return (HandlesCommands) __class;
        } catch (Exception ignored) {}
        return null;
    }

    public HandlesCommands(Command command, AppConfig config) {
        this.command = command;
    }

    public void printHelp() {

    }

    protected boolean hasFlag(String flag) {
        return findFlag(flag) != null;
    }

    protected String flagValue(String flag) {
        Arg arg = findFlag(flag);
        if(arg == null) return "";
        return arg.getValue();
    }

    private Arg findFlag(String flag) {
        flag = flag.replace("-", "");
        Arg[] args = command.getArgs();
        for(int i=0; i<args.length; i++) {
            if(__.same(args[i].getName(), flag)) return args[i];
        }
        return null;
    }

    protected abstract Help help();
    public abstract void run(AppConfig config) throws Exception;

}
