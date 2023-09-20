package com.inteliense.aloft.cli.commands.keywords;

import com.inteliense.aloft.cli.Help;
import com.inteliense.aloft.cli.commands.base.Arg;
import com.inteliense.aloft.cli.commands.base.Command;
import com.inteliense.aloft.cli.commands.base.HandlesCommands;
import com.inteliense.aloft.cli.config.AppConfig;

public class Cache extends HandlesCommands {

    public Cache(Command command, AppConfig config) {
        super(command, config);
    }

    @Override
    public void run(AppConfig config) {
        Arg flag = orRequiredFlag("list", "clear");
        System.out.println("Testing cache flag '--" + flag.getName() + "'");
    }

    @Override
    public Help help() {
        return null;
    }

}
