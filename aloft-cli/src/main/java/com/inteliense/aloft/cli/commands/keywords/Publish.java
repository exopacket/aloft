package com.inteliense.aloft.cli.commands.keywords;

import com.inteliense.aloft.cli.Help;
import com.inteliense.aloft.cli.commands.base.Command;
import com.inteliense.aloft.cli.commands.base.HandlesCommands;
import com.inteliense.aloft.cli.config.AppConfig;
import com.inteliense.aloft.utils.global.__;

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
