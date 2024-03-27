package org.extendedweb.aloft.server.run.cli.commands.keywords;

import org.extendedweb.aloft.lib._AloftProject;
import org.extendedweb.aloft.lib.tests._TestProject;
import org.extendedweb.aloft.server.run.cli.Help;
import org.extendedweb.aloft.server.run.cli.commands.base.Command;
import org.extendedweb.aloft.server.run.cli.commands.base.HandlesCommands;
import org.extendedweb.aloft.lib.application.config.AppConfig;
import org.extendedweb.aloft.server.base.http.WebServer;
import org.extendedweb.aloft.server.base.http.debug.DebugServer;
import org.extendedweb.aloft.server.base.threading.ThreadGroup;
import org.extendedweb.aloft.server.base.threading.types.DetachedThread;
import org.extendedweb.aloft.utils.global.__;

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
                    setVar("server", new WebServer((int) getVar("port"), 443, !hasFlag("public"), _TestProject.launch(new String[]{"MY_PROJECT", "/"})));
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
