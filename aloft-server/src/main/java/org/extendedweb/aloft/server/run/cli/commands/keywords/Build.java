package org.extendedweb.aloft.server.run.cli.commands.keywords;

import org.extendedweb.aloft.server.run.cli.Help;
import org.extendedweb.aloft.server.run.cli.commands.base.Command;
import org.extendedweb.aloft.server.run.cli.commands.base.HandlesCommands;
import org.extendedweb.aloft.lib.application.config.AppConfig;

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
