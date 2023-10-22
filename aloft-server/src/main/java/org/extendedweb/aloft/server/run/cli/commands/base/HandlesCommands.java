package org.extendedweb.aloft.server.run.cli.commands.base;

import org.extendedweb.aloft.server.run.cli.Help;
import org.extendedweb.aloft.utils.global.__;

import java.lang.reflect.Constructor;

public abstract class HandlesCommands {

    protected Command command;

    public static HandlesCommands create(Command command) {
        try {
            Class<?> _class = command.getCommandClass();
            Constructor<?> construct = _class.getConstructor(Command.class);
            Object __class = construct.newInstance(command);
            return (HandlesCommands) __class;
        } catch (Exception ignored) {}
        return null;
    }

    public HandlesCommands(Command command) {
        this.command = command;
    }

    public void printHelp() {

    }

    protected Arg requiredFlag(String flag) {
        Arg arg = Keywords.getFlagArg(flag);
        if(arg.isFlag() && hasFlag(flag) && ((arg.requiresValue() && !__.empty(flagValue(flag))) || !arg.requiresValue()))
            return arg;
        command.exit("[--" + flag + "] is required for this command.", 1);
        return null;
    }

    protected Arg orOptionalFlag(String ...flags) {
        for(int i=0; i<flags.length; i++) {
            Arg flag = Keywords.getFlagArg(flags[i]);
            if(!__.isset(flag)) continue;
            if(!flag.isFlag()) continue;
            if(hasFlag(flags[i]) && ((flag.requiresValue() && !__.empty(flagValue(flags[i]))) || !flag.requiresValue()))
                return flag;
        }
        return null;
    }

    protected Arg orRequiredFlag(String ...flags) {
        for(int i=0; i<flags.length; i++) {
            Arg flag = Keywords.getFlagArg(flags[i]);
            if(!__.isset(flag)) continue;
            if(!flag.isFlag()) continue;
            if(hasFlag(flags[i]) && ((flag.requiresValue() && !__.empty(flagValue(flags[i])) || !flag.requiresValue())))
                return flag;
        }
        String error = "[";
        for(int i=0; i<flags.length; i++) {
            if(i > 0) error += " | ";
            error += "--" + flags[i];
        }
        error += "] One of these flags are required for this command.";
        command.exit(error, 1);
        return null;
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
    public abstract void run() throws Exception;

}
