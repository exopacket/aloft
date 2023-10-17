package com.inteliense.aloft.run.cli.commands.keywords;

import com.inteliense.aloft.run.cli.Help;
import com.inteliense.aloft.run.cli.commands.base.Command;
import com.inteliense.aloft.run.cli.commands.base.HandlesCommands;
import com.inteliense.aloft.application.config.AppConfig;

public class Build extends HandlesCommands {

    public Build(Command command) {
        super(command);
    }

    @Override
    public void run() {
        System.out.println("TESTING [build]");
    }

    @Override
    public Help help() {
        return null;
    }

}
