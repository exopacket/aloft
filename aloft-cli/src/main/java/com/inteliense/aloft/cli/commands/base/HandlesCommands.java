package com.inteliense.aloft.cli.commands.base;

import com.inteliense.aloft.cli.Help;
import com.inteliense.aloft.cli.config.AppConfig;

import java.lang.reflect.Constructor;

public abstract class HandlesCommands {

    protected Command command;

    public static HandlesCommands create(Command command, AppConfig config) {
        try {
            Class<?> _class = command.getCommandClass();
            Constructor<?> construct = _class.getConstructor(Command.class);
            Object __class = construct.newInstance(command);
            return (HandlesCommands) __class;
        } catch (Exception ignored) {}
        return null;
    }

    public HandlesCommands(Command command, AppConfig config) {
        this.command = command;
    }

    public void printHelp() {

    }

    protected abstract Help help();
    public abstract void run(AppConfig config) throws Exception;

}
