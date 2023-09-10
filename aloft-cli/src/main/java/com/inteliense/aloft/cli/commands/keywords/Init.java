package com.inteliense.aloft.cli.commands.keywords;

import com.inteliense.aloft.cli.Help;
import com.inteliense.aloft.cli.commands.base.Command;
import com.inteliense.aloft.cli.commands.base.HandlesCommands;
import com.inteliense.aloft.cli.config.AppConfig;

public class Init extends HandlesCommands {

    public Init(Command command, AppConfig config) {
        super(command, config);
    }

    @Override
    public void run(AppConfig config) {
        System.out.println("TESTING [init]");
    }

    @Override
    public Help help() {
        return null;
    }

}
