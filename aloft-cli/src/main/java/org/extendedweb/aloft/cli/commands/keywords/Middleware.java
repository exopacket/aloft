package org.extendedweb.aloft.cli.commands.keywords;

import org.extendedweb.aloft.cli.Help;
import org.extendedweb.aloft.cli.commands.base.Arg;
import org.extendedweb.aloft.cli.commands.base.Command;
import org.extendedweb.aloft.cli.commands.base.HandlesCommands;
import org.extendedweb.aloft.cli.config.AppConfig;

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
