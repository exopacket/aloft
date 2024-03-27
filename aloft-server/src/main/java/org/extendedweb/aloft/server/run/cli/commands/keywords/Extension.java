package org.extendedweb.aloft.server.run.cli.commands.keywords;

import org.extendedweb.aloft.server.run.cli.Help;
import org.extendedweb.aloft.server.run.cli.commands.base.Arg;
import org.extendedweb.aloft.server.run.cli.commands.base.Command;
import org.extendedweb.aloft.server.run.cli.commands.base.HandlesCommands;
import org.extendedweb.aloft.server.base.debug.ReloadServer;
import org.extendedweb.aloft.server.base.http.debug.DebugServer;
import org.extendedweb.aloft.server.base.threading.ThreadGroup;
import org.extendedweb.aloft.server.base.threading.types.DetachedThread;
import org.extendedweb.aloft.utils.global.__;

import java.io.IOException;

public class Extension extends HandlesCommands {

    public Extension(Command command) {
        super(command);
    }

    @Override
    public void run() {
        Arg framework = orRequiredFlag("vue");
        Arg function = orRequiredFlag("create-template", "build-extension");
        Arg name = requiredFlag("name");
        Arg element = requiredFlag("element");
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
}
