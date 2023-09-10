package com.inteliense.aloft.server.performance;

public abstract class Monitor {

    private Thread thr = null;
    private Threshold threshold = null;

    protected abstract void alert(MonitorAlert info);
    protected abstract void update(MonitorValues values);

    protected abstract int run() throws Exception;

    public Monitor(Threshold threshold) {
        this.threshold = threshold;
    }

    public void start() {
        thr = new Thread(() -> {
            while(!Thread.currentThread().isInterrupted()) {
                try {
                    Thread.sleep(run());
                } catch (Exception ignored) { }
            }
        });
        thr.start();
    }

    public void stop() {
        thr.interrupt();
    }

}