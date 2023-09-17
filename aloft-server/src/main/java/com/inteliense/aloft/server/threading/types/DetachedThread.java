package com.inteliense.aloft.server.threading.types;

import com.inteliense.aloft.server.threading.base.DetachesThread;

public abstract class DetachedThread extends DetachesThread {

    protected abstract boolean execute();

    public DetachedThread() {
        start();
    }

    public DetachedThread(int idleMiilis) {
        this.idleMillis = idleMiilis;
        start();
    }

    @Override
    public void start() {
        thread = new Thread(() -> {
            boolean keepExecuting = true;
            while(keepExecuting && !Thread.currentThread().isInterrupted()) {
                keepExecuting = execute();
                if(idleMillis > 0) {
                    try {
                        Thread.sleep(idleMillis);
                    } catch (InterruptedException e) { break; }
                }
            }
        });
        thread.start();
    }

    @Override
    public void stop() {
        thread.interrupt();
    }

}
