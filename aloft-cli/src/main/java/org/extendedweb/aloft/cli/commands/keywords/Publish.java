package org.extendedweb.aloft.cli.commands.keywords;

import org.extendedweb.aloft.cli.Help;
import org.extendedweb.aloft.cli.commands.base.Command;
import org.extendedweb.aloft.cli.commands.base.HandlesCommands;
import org.extendedweb.aloft.cli.config.AppConfig;
import org.extendedweb.aloft.utils.global.__;

import java.util.Scanner;

public class Publish extends HandlesCommands {

    public Publish(Command command, AppConfig config) {
        super(command, config);
    }

    @Override
    public void run(AppConfig config) {
        Scanner scnr = new Scanner(System.in);
        __.printPrettyLn(" -- PUBLISH PROJECT -- \n");
    }

    @Override
    public Help help() {
        return null;
    }

}
