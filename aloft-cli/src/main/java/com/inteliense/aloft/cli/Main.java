package com.inteliense.aloft.cli;

import com.inteliense.aloft.cli.commands.base.Command;
import com.inteliense.aloft.cli.commands.base.HandlesCommands;
import com.inteliense.aloft.cli.config.AppConfig;
import com.inteliense.aloft.cli.fs.FileSystem;

public class Main {

    public static void main(String[] args) {

        AppConfig config = loadConfig();
        Command cmd = new Command(args, config);
        HandlesCommands container = HandlesCommands.create(cmd, config);
        try {
            if (container != null) container.run(config);
            System.exit(0);
        } catch(Exception e) {
            e.printStackTrace();
            if (container != null) container.printHelp(); //TODO better handling of help
            System.exit(1);
        }

        System.err.println("Command not found.");

    }

    private static FileSystem createFs() {
        return new FileSystem();
    }

    private static AppConfig loadConfig() {
        return new AppConfig(createFs());
    }

}
