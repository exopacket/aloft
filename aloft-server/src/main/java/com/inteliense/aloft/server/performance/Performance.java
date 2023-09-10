package com.inteliense.aloft.server.performance;

public class Performance {

    ThreadMonitor threadMonitor;
    MemoryMonitor memoryMonitor;

    public Performance(Threshold threadThreshold, Threshold ramThreshold) {
        this.threadMonitor = new ThreadMonitor(threadThreshold) {
            @Override
            protected void alert(MonitorAlert info) {

            }

            @Override
            protected void update(MonitorValues values) {

            }

            @Override
            protected int run() throws Exception {
                return 0;
            }
        };
        this.memoryMonitor = new MemoryMonitor(ramThreshold) {
            @Override
            protected void alert(MonitorAlert info) {

            }

            @Override
            protected void update(MonitorValues values) {

            }

            @Override
            protected int run() throws Exception {
                return 0;
            }
        };
    }

    public void start() {
        this.threadMonitor.start();
        this.memoryMonitor.start();
    }

}
