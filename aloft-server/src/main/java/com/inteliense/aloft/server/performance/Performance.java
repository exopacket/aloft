package com.inteliense.aloft.server.performance;

import com.inteliense.aloft.server.performance.handlers.types.ConnectionsHandler;
import com.inteliense.aloft.server.performance.handlers.types.MemoryHandler;
import com.inteliense.aloft.server.performance.handlers.types.ThreadHandler;
import com.inteliense.aloft.server.performance.monitors.base.MonitorAlert;
import com.inteliense.aloft.server.performance.monitors.base.MonitorValues;
import com.inteliense.aloft.server.performance.monitors.base.Threshold;
import com.inteliense.aloft.server.performance.monitors.types.ConnectionsMonitor;
import com.inteliense.aloft.server.performance.monitors.types.MemoryMonitor;
import com.inteliense.aloft.server.performance.monitors.types.ThreadMonitor;

public class Performance {

    ThreadMonitor threadMonitor;
    MemoryMonitor memoryMonitor;
    ConnectionsMonitor connectionsMonitor;

    ThreadHandler threadHandler = new ThreadHandler();
    MemoryHandler memoryHandler = new MemoryHandler();
    ConnectionsHandler connectionsHandler = new ConnectionsHandler()
;
    public Performance(Threshold threadThreshold, Threshold ramThreshold, Threshold tcpThreshold) {
        this.threadMonitor = new ThreadMonitor(threadThreshold) {
            @Override
            protected void alert(MonitorAlert info) {
                threadHandler.alert(info);
            }

            @Override
            protected void update(MonitorValues values) {
                threadHandler.update(values);
            }

            @Override
            protected int run() throws Exception {
                return threadHandler.run();
            }
        };
        this.memoryMonitor = new MemoryMonitor(ramThreshold) {
            @Override
            protected void alert(MonitorAlert info) {
                memoryHandler.alert(info);
            }

            @Override
            protected void update(MonitorValues values) {
                memoryHandler.update(values);
            }

            @Override
            protected int run() throws Exception {
                return memoryHandler.run();
            }
        };
        this.connectionsMonitor = new ConnectionsMonitor(tcpThreshold) {
            @Override
            protected void alert(MonitorAlert info) {
                connectionsHandler.alert(info);
            }

            @Override
            protected void update(MonitorValues values) {
                connectionsHandler.update(values);
            }

            @Override
            protected int run() throws Exception {
                return connectionsHandler.run();
            }
        };
    }

    public void start() {
        this.threadMonitor.start();
        this.memoryMonitor.start();
        this.connectionsMonitor.start();
    }

    public void stop() {
        this.threadMonitor.stop();
        this.memoryMonitor.stop();
        this.connectionsMonitor.stop();
    }

}
