package com.inteliense.aloft.run.cli.commands.keywords;

import com.inteliense.aloft.run.cli.Help;
import com.inteliense.aloft.run.cli.commands.base.Command;
import com.inteliense.aloft.run.cli.commands.base.HandlesCommands;
import com.inteliense.aloft.run.cli.config.AppConfig;
import com.inteliense.aloft.server.http.debug.DebugServer;
import com.inteliense.aloft.server.threading.types.DetachedThread;
import com.inteliense.aloft.server.threading.types.JoinedThread;
import com.inteliense.aloft.utils.global.__;
import com.inteliense.aloft.server.threading.ThreadGroup;

import java.io.IOException;

public class Debug extends HandlesCommands {

    public Debug(Command command, AppConfig config) {
        super(command, config);
    }

    @Override
    public void run(AppConfig config) {
        if (!hasFlag("src") || __.empty(flagValue("src"))) command.exit("Source directory [--src] is required.", 1);
        if (!hasFlag("config") || __.empty(flagValue("config")))
            command.exit("Config filepath [--config] is required.", 1);
        int port = 8181;
        if (!__.empty(flagValue("port"))) port = Integer.parseInt(flagValue("port"));
        ThreadGroup threadGroup = new ThreadGroup(true);
        threadGroup.appendThread(getServerThread(port));
        threadGroup.joinGroup(true);
    }

    @Override
    public Help help() {
        return null;
    }

    private DetachedThread getServerThread(int port) {
        DetachedThread thr = new DetachedThread(5000) {
            @Override
            protected boolean execute() {
                return true;
            }
            @Override
            protected void onStart() {
                try {
                    setVar("server", new DebugServer((int) getVar("port"), hasFlag("secure"), true));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            @Override
            protected void onStop() {
                if(!__.isset(getVar("server"))) return;
                ((DebugServer) getVar("server")).stop();
                removeVar("server");
            }
        };
        thr.setVar("port", port);
        return thr;
    }

}
