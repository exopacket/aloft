package org.extendedweb.aloft.server.run;

import org.extendedweb.aloft.lib.application.cache.RouteCache;
import org.extendedweb.aloft.lib.application.config.AppConfig;
import org.extendedweb.aloft.server.run.cli.commands.base.Command;
import org.extendedweb.aloft.server.run.cli.commands.base.HandlesCommands;
import org.extendedweb.aloft.server.run.cli.fs.FileSystem;

public class Main {

    public static void main(String[] args) {

        Command cmd = null;
        HandlesCommands container = null;

        if(args.length == 0) {
            printHelp();
            System.exit(1);
        }

        try {
            cmd = new Command(args) {
                @Override
                public void exit(String message, int code) {
                    System.err.println(message);
                    System.exit(code);
                }
            };
            container = HandlesCommands.create(cmd);
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("General error.");
            System.exit(1);
        }

        try {
            if (container != null) container.run();
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
        try {
            return new AppConfig(new RouteCache(null));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
