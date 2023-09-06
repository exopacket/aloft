package com.inteliense.aloft.cli.commands.base;


public abstract class Command {

    protected String[] args;

    public Command(String[] args) {
        this.args = args;
    }

    protected Command parseArgs(String[] args) {
        return null;
    }

    protected String[] parseChildren(String[] args) {
        return null;
    }

}
