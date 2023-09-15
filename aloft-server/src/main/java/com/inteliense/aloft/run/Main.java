package com.inteliense.aloft.run;

import com.inteliense.aloft.run.cli.commands.base.Command;
import com.inteliense.aloft.run.cli.commands.base.HandlesCommands;
import com.inteliense.aloft.run.cli.config.AppConfig;
import com.inteliense.aloft.run.cli.fs.FileSystem;
import com.inteliense.aloft.utils.sys.shell.Run;

public class Main {

    public static void main(String[] args) throws Exception {

        Run.runAndWait("touch /etc/test.conf");
        System.out.println("EXITING");
        System.exit(1);

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
                protected void exit() {
                    System.err.println("Command not found.");
                    System.exit(1);
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
            else throw new Exception("Command not found");
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
