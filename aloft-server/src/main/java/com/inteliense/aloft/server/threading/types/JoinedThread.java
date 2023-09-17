package com.inteliense.aloft.server.threading.types;

import com.inteliense.aloft.server.threading.base.JoinsThread;

public abstract class JoinedThread extends JoinsThread {

    private boolean active = false;

    protected abstract boolean execute();

    public JoinedThread(int idleMiilis) {
        this.idleMillis = idleMiilis;
    }

    @Override
    public void start() {
        thread = new Thread(() -> {
            active = true;
            boolean keepExecuting = true;
            while(keepExecuting && !Thread.currentThread().isInterrupted()) {
                keepExecuting = execute();
                if(idleMillis > 0) {
                    try {
                        Thread.sleep(idleMillis);
                    } catch (InterruptedException e) { break; }
                }
            }
            active = false;
        });
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException ignored) { }
    }

    @Override
    public void stop() {
        if(active) thread.interrupt();
    }

}
