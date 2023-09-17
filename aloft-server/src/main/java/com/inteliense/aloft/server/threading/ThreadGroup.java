package com.inteliense.aloft.server.threading;

import com.inteliense.aloft.server.threading.base.ThreadImpl;
import com.inteliense.aloft.server.threading.types.DetachedThread;
import com.inteliense.aloft.server.threading.types.JoinedThread;

import java.util.ArrayList;

public class ThreadGroup {

    private ArrayList<ThreadImpl> threads = new ArrayList<>();
    private ArrayList<ThreadImpl> detached = new ArrayList<>();
    private boolean containedThread = false;
    private boolean interrupt = false;
    private JoinedThread currentJoined = null;

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

        interrupt = false;

        ArrayList<ThreadImpl> joined = new ArrayList<>();

        for(int i=0; i<threads.size(); i++) {
            ThreadImpl thread = threads.get(i);
            if(thread.doesJoin()) joined.add(thread);
            else detached.add(thread);
        }

        if(containedThread) {
            new Thread(() -> {
                for (int i = 0; i < detached.size(); i++) {
                    detached.get(i).start();
                }

                for (int i = 0; i < joined.size(); i++) {
                    currentJoined = (JoinedThread) joined.get(i);
                    currentJoined.start();
                    if(interrupt) break;
                }
            }).start();
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
        currentJoined.stop();
        currentJoined = null;
        detached.clear();
    }

}
