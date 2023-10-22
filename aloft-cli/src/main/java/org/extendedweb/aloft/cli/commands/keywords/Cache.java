package org.extendedweb.aloft.cli.commands.keywords;

import org.extendedweb.aloft.cli.Help;
import org.extendedweb.aloft.cli.commands.base.Arg;
import org.extendedweb.aloft.cli.commands.base.Command;
import org.extendedweb.aloft.cli.commands.base.HandlesCommands;
import org.extendedweb.aloft.cli.config.AppConfig;

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
