package com.inteliense.aloft.run;

import com.inteliense.aloft.compiler.lang.lib.colors.Colors;
import com.inteliense.aloft.run.cli.commands.base.Command;
import com.inteliense.aloft.run.cli.commands.base.HandlesCommands;
import com.inteliense.aloft.application.config.AppConfig;
import com.inteliense.aloft.run.cli.fs.FileSystem;

public class Main {

    public static void main(String[] args) {

//        try {
//            WebSockServer server = new WebSockServer("127.0.0.1", 3030, "debug") {
//                @Override
//                protected boolean validateConnection(Session session) {
//                    return true;
//                }
//
//                @Override
//                protected void onConnect(String sessionId) {
//                    System.out.println("Connection Successful.");
//                    System.out.println(sessionId);
//                }
//
//                @Override
//                protected void onMessage(String sessionId, JSONObject json) {
//                    System.out.println("MESSAGE RECEIVED");
//                }
//
//                @Override
//                protected void onClose(String sessionId) {
//                    System.out.println("SESSION " + sessionId + " CLOSED.");
//                }
//            };
//            server.start();
//            server.join();
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }

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
        try {
            return new AppConfig();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
