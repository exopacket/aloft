package com.inteliense.aloft.run;

import com.inteliense.aloft.run.cli.commands.base.Command;
import com.inteliense.aloft.run.cli.commands.base.HandlesCommands;
import com.inteliense.aloft.run.cli.config.AppConfig;
import com.inteliense.aloft.run.cli.fs.FileSystem;

public class Main {

    public static void main(String[] args) {

        Command cmd = null;
        HandlesCommands container = null;
        AppConfig config = null;

        if(args.length == 0) {
            printHelp();
            System.exit(1);
        }

        try {
            config = loadConfig();
            cmd = new Command(args, config) {
                @Override
                public void exit(String message, int code) {
                    System.err.println(message);
                    System.exit(code);
                }
            };
            container = HandlesCommands.create(cmd, config);
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("General error.");
            System.exit(1);
        }

        try {
            if (container != null) container.run(config);
            else throw new Exception("Command not found.");
            System.exit(0);
        } catch(Exception e) {
            System.err.println("Command not found.");
            e.printStackTrace();
            if (container != null) container.printHelp(); //TODO better handling of help
            System.exit(1);
        }

    }

    private static void printHelp() {
        System.err.println("You must need help.");
    }

    private static FileSystem createFs() {
        return new FileSystem();
    }

    private static AppConfig loadConfig() {
        return new AppConfig(createFs());
    }

}
