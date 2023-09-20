package com.inteliense.aloft.cli.commands.keywords;

import com.inteliense.aloft.cli.Help;
import com.inteliense.aloft.cli.commands.base.Arg;
import com.inteliense.aloft.cli.commands.base.Command;
import com.inteliense.aloft.cli.commands.base.HandlesCommands;
import com.inteliense.aloft.cli.config.AppConfig;

public class Create extends HandlesCommands {

    public Create(Command command, AppConfig config) {
        super(command, config);
    }

    @Override
    public void run(AppConfig config) {
        requiredFlag("group-id");
        Arg arg = orOptionalFlag("project", "module", "middleware");
        System.out.println("Creating new project in directory './" + command.getBase().getValue() + "'...");
        config.setPackageName(flagValue("group-id") + "." + command.getBase().getValue());
        config.createTemplate(command.getBase().getValue(), flagValue("group-id"));
        config.createProjectDirs();
        System.out.println("Project '" + command.getBase().getValue() + "' created successfully!");
    }

    @Override
    public Help help() {
        return null;
    }

}
