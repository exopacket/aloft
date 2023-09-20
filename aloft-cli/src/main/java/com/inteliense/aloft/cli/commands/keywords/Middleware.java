package com.inteliense.aloft.cli.commands.keywords;

import com.inteliense.aloft.cli.Help;
import com.inteliense.aloft.cli.commands.base.Arg;
import com.inteliense.aloft.cli.commands.base.Command;
import com.inteliense.aloft.cli.commands.base.HandlesCommands;
import com.inteliense.aloft.cli.config.AppConfig;

public class Middleware extends HandlesCommands {

    public Middleware(Command command, AppConfig config) {
        super(command, config);
    }

    @Override
    public void run(AppConfig config) {
        Arg flag = orRequiredFlag("add", "delete", "install", "configure");
        System.out.println("Testing middleware flag '--" + flag.getName() + "'");
    }

    @Override
    public Help help() {
        return null;
    }

}
