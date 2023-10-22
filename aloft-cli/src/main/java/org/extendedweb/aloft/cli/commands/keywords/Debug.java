package org.extendedweb.aloft.cli.commands.keywords;

import org.extendedweb.aloft.cli.Help;
import org.extendedweb.aloft.cli.commands.base.Command;
import org.extendedweb.aloft.cli.commands.base.HandlesCommands;
import org.extendedweb.aloft.cli.config.AppConfig;
import org.extendedweb.aloft.utils.global.__;
import org.extendedweb.aloft.utils.sys.shell.Run;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Debug extends HandlesCommands {

    public Debug(Command command, AppConfig config) {
        super(command, config);
    }

    @Override
    public void run(AppConfig config) {
        File dot = new File(".tt");
        if (!dot.exists()) {
            File cwd = new File("");
            String fullPath = cwd.getAbsolutePath();
            if (fullPath.contains("/src/")) {
                String[] parts = fullPath.split("/src/");
                String path = "";
                for(int i=0; i<parts.length; i++) {
                    if(i == parts.length - 1) break;
                    path += parts[i] + "/src/";
                }
                String _dot = path + ".tt";
                dot = new File(_dot);
                if (!dot.exists()) command.exit("Could not find the aloft project from this directory.", 1);
            } else {
                dot = new File("src/.tt");
                if (!dot.exists()) command.exit("Could not find the aloft project from this directory.", 1);
            }
        }
        try {
            Scanner scnr = new Scanner(dot);
            String src = "";
            String project = "";
            for (int i = 0; i < 3; i++) {
                if (!scnr.hasNextLine()) break;
                String line = scnr.nextLine();
                if (i == 1) project = line;
                if (i == 2) src = line;
            }
            if (!__.empty(src) && !__.empty(project)) {
                try {
                    Run cmd = new Run("aloft-server debug --src " + src + " --config " + project) {
                        @Override
                        public void lineRead(byte[] bytes, String line) {
                            System.out.println(line);
                        }
                    };
                    __.printPrettyLn(cmd.getStatusString(), __.ANSI_YELLOW);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            } else {
                command.exit("Corrupt .tt file.", 1);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Help help() {
        return null;
    }

}