package com.inteliense.aloft.cli.commands.keywords;

import com.inteliense.aloft.cli.Help;
import com.inteliense.aloft.cli.commands.base.Arg;
import com.inteliense.aloft.cli.commands.base.Command;
import com.inteliense.aloft.cli.commands.base.HandlesCommands;
import com.inteliense.aloft.cli.config.AppConfig;

public class New extends HandlesCommands {

    public New(Command command, AppConfig config) {
        super(command, config);
    }

    @Override
    public void run(AppConfig config) {
        Arg flag = orRequiredFlag("class", "page"); //TODO
        System.out.println("Testing new flag '--" + flag.getName() + "'");
    }

    @Override
    public Help help() {
        return null;
    }

}
