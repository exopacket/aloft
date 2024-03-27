package org.extendedweb.aloft.server.run.cli.commands.keywords;

import org.extendedweb.aloft.server.run.cli.Help;
import org.extendedweb.aloft.server.run.cli.commands.base.Command;
import org.extendedweb.aloft.server.run.cli.commands.base.HandlesCommands;
import org.extendedweb.aloft.lib.application.config.AppConfig;
import org.extendedweb.aloft.server.base.debug.ReloadServer;
import org.extendedweb.aloft.server.base.http.debug.DebugServer;
import org.extendedweb.aloft.server.base.threading.types.DetachedThread;
import org.extendedweb.aloft.utils.global.__;
import org.extendedweb.aloft.server.base.threading.ThreadGroup;

import java.io.IOException;

public class Debug extends HandlesCommands {

    public Debug(Command command) {
        super(command);
    }

    @Override
    public void run() {
        requiredFlag("src");
        requiredFlag("config");
        int port = 8181;
        if (!__.empty(flagValue("port"))) {
            try {
                port = Integer.parseInt(flagValue("port"));
                if(port <= 0) command.exit("Invalid port [--port] value.", 1);
            } catch (Exception e) {
                command.exit("Invalid port [--port] value.", 1);
            }
        }
        ThreadGroup threadGroup = new ThreadGroup(true);
        threadGroup.appendThread(getServerThread(flagValue("config"), port));
        threadGroup.appendThread(getHotReloadThread());
        threadGroup.joinGroup(true);
    }

    @Override
    public Help help() {
        return null;
    }

    private DetachedThread getHotReloadThread() {
        DetachedThread thr = new DetachedThread(5000) {
            @Override
            protected boolean execute() {
                return true;
            }
            @Override
            protected void onStart() {
                try {
                    ReloadServer server = new ReloadServer("127.0.0.1", 8282, "debug");
                    server.start();
                    setVar("server", server);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
            @Override
            protected void onStop() {
                if(!issetVar("server")) return;
                try {
                    ((ReloadServer) getVar("server")).stop();
                } catch (Exception ignored) { }
                removeVar("server");
            }
        };
        return thr;
    }

    private DetachedThread getServerThread(String config, int port) {
        DetachedThread thr = new DetachedThread(5000) {
            @Override
            protected boolean execute() {
                return true;
            }
            @Override
            protected void onStart() {
//                try {
////                    setVar("server", new DebugServer(config, (int) getVar("port"), hasFlag("secure"), !hasFlag("public")));
//                } catch (IOException e) {
//                    throw new RuntimeException(e);
//                }
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
