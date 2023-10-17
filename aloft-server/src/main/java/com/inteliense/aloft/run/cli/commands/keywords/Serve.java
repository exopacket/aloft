package com.inteliense.aloft.run.cli.commands.keywords;

import com.inteliense.aloft.compiler.lang.lib._AloftProject;
import com.inteliense.aloft.compiler.tests._TestProject;
import com.inteliense.aloft.run.cli.Help;
import com.inteliense.aloft.run.cli.commands.base.Command;
import com.inteliense.aloft.run.cli.commands.base.HandlesCommands;
import com.inteliense.aloft.application.config.AppConfig;
import com.inteliense.aloft.server.http.WebServer;
import com.inteliense.aloft.server.http.debug.DebugServer;
import com.inteliense.aloft.server.threading.ThreadGroup;
import com.inteliense.aloft.server.threading.types.DetachedThread;
import com.inteliense.aloft.utils.global.__;

import java.io.IOException;

public class Serve extends HandlesCommands {

    public Serve(Command command) {
        super(command);
    }

    @Override
    public void run() {
        int port = 8080;
        ThreadGroup threadGroup = new ThreadGroup(true);
        threadGroup.appendThread(getServerThread("", port));
        threadGroup.joinGroup(true);
    }

    @Override
    public Help help() {
        return null;
    }

    private DetachedThread getServerThread(String config, int port) {
        DetachedThread thr = new DetachedThread(5000) {
            @Override
            protected boolean execute() {
                return true;
            }
            @Override
            protected void onStart() {
                try {
                    setVar("server", new WebServer((int) getVar("port"), 443, !hasFlag("public"), new _AloftProject[]{_TestProject.launch(new String[]{"MY_PROJECT", "/"})}));
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
            @Override
            protected void onStop() {
                if(!issetVar("server")) return;
                ((DebugServer) getVar("server")).stop();
                removeVar("server");
            }
        };
        thr.setVar("port", port);
        return thr;
    }

}
