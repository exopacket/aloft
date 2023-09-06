package com.inteliense.aloft.cli.commands.keywords;

import com.inteliense.aloft.cli.Help;
import com.inteliense.aloft.cli.commands.base.Command;

public class Create extends Command implements ImplementsCommand {

    private String[] childSignature;
    private Command subcommand;

    public Create(String[] args) {
        super(args);
        subcommand = parseArgs(args);
        childSignature = parseChildren(args);
    }

    public static String[] signature() {
        return null;
    }

    public static Help help() {
        return null;
    }

}
