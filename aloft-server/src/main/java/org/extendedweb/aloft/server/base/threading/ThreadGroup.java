package org.extendedweb.aloft.server.base.threading;

import org.extendedweb.aloft.server.base.threading.base.ThreadImpl;
import org.extendedweb.aloft.server.base.threading.types.DetachedThread;
import org.extendedweb.aloft.server.base.threading.types.JoinedThread;
import org.extendedweb.aloft.utils.global.__;

import java.util.ArrayList;

public class ThreadGroup {

    private ArrayList<ThreadImpl> threads = new ArrayList<>();
    private ArrayList<ThreadImpl> detached = new ArrayList<>();
    private boolean containedThread = false;
    private boolean joinContainer = false;
    private boolean mainThread = false;
    private boolean interrupt = false;
    private JoinedThread currentJoined = null;
    private Thread container = null;

    public ThreadGroup() { }

    public ThreadGroup(boolean containedThread) {
        this.containedThread = true;
    }

    public void appendThread(JoinedThread thread) {
        threads.add(thread);
    }

    public void appendThread(DetachedThread thread) {
        threads.add(thread);
    }

    public void startGroup() {
        startGroup(false, 0);
    }

    public void joinGroup() {
        joinGroup(false);
    }

    public void joinGroup(boolean mainThread) {
        this.mainThread = mainThread;
        startGroup(true, 0);
    }

    public void joinGroup(int stopDelay, boolean mainThread) {
        this.mainThread = mainThread;
        startGroup(true, stopDelay);
    }

    public void startGroup(boolean joinContainer, int stopDelay) {

        if(mainThread && joinContainer) {
            Runtime.getRuntime().addShutdownHook(new Thread() {
                public void run() {
                    __.printPrettyLn("Shutting down all application threads...", __.ANSI_YELLOW);
                    stopGroup();
                }
            });
        }

        this.joinContainer = joinContainer;
        interrupt = false;

        ArrayList<ThreadImpl> joined = new ArrayList<>();

        for(int i=0; i<threads.size(); i++) {
            ThreadImpl thread = threads.get(i);
            if(thread.doesJoin()) joined.add(thread);
            else detached.add(thread);
        }

        if(joinContainer && containedThread) {
            joined.add(new JoinedThread(stopDelay > 0 ? stopDelay : 5000) {
                @Override
                protected boolean execute() {
                    return true;
                }
            });
        }

        if(containedThread) {
            container = new Thread(() -> {
                for (int i = 0; i < detached.size(); i++) {
                    detached.get(i).start();
                }

                for (int i = 0; i < joined.size(); i++) {
                    currentJoined = (JoinedThread) joined.get(i);
                    currentJoined.start();
                    if(interrupt) break;
                }
            });
            container.start();
            if(joinContainer) {
                try { container.join(); }
                catch (InterruptedException ignored) { }
            }
        } else {
            for (int i = 0; i < detached.size(); i++) {
                detached.get(i).start();
            }

            for (int i = 0; i < joined.size(); i++) {
                currentJoined = (JoinedThread) joined.get(i);
                currentJoined.start();
                if(interrupt) break;
            }
        }

    }

    public void stopGroup() {
        interrupt = true;
        for(int i=0; i<detached.size(); i++) {
            detached.get(i).stop();
        }
        if(__.isset(currentJoined)) currentJoined.stop();
        currentJoined = null;
        detached.clear();
    }

}
