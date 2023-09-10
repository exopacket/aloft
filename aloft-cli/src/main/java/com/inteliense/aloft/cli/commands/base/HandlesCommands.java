package com.inteliense.aloft.cli.commands.base;

import com.inteliense.aloft.cli.Help;

import java.lang.reflect.Constructor;

public abstract class HandlesCommands {

    protected Command command;

    public static HandlesCommands create(Class<?> _class, Command command) {
        try {
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

    protected abstract Help help();
    public abstract void run();

}
