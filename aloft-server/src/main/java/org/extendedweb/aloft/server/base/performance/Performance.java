package org.extendedweb.aloft.server.base.performance;

import org.extendedweb.aloft.server.base.performance.handlers.types.ConnectionsHandler;
import org.extendedweb.aloft.server.base.performance.handlers.types.MemoryHandler;
import org.extendedweb.aloft.server.base.performance.handlers.types.ThreadHandler;
import org.extendedweb.aloft.server.base.performance.monitors.base.MonitorAlert;
import org.extendedweb.aloft.server.base.performance.monitors.base.MonitorValues;
import org.extendedweb.aloft.server.base.performance.monitors.base.Threshold;
import org.extendedweb.aloft.server.base.performance.monitors.types.ConnectionsMonitor;
import org.extendedweb.aloft.server.base.performance.monitors.types.MemoryMonitor;
import org.extendedweb.aloft.server.base.performance.monitors.types.ThreadMonitor;

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
