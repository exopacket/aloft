package com.inteliense.aloft.run.cli.commands.keywords;

import com.inteliense.aloft.run.cli.Help;
import com.inteliense.aloft.run.cli.commands.base.Command;
import com.inteliense.aloft.run.cli.commands.base.HandlesCommands;
import com.inteliense.aloft.run.cli.config.AppConfig;
import com.inteliense.aloft.server.http.debug.DebugServer;
import com.inteliense.aloft.utils.global.__;

import java.io.IOException;

public class Debug extends HandlesCommands {

    public Debug(Command command, AppConfig config) {
        super(command, config);
    }

    @Override
    public void run(AppConfig config) {
        try {
            int port = 8181;
            if(!__.empty(flagValue("port"))) port = Integer.parseInt(flagValue("port"));
            DebugServer server = new DebugServer(port, false, true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Help help() {
        return null;
    }

}
