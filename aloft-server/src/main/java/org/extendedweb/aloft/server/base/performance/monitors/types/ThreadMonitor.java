package org.extendedweb.aloft.server.base.performance.monitors.types;

import org.extendedweb.aloft.server.base.performance.monitors.base.MonitorAlert;
import org.extendedweb.aloft.server.base.performance.monitors.base.MonitorValues;
import org.extendedweb.aloft.server.base.performance.monitors.base.Threshold;
import org.extendedweb.aloft.server.base.performance.monitors.base.Monitor;

public abstract class ThreadMonitor extends Monitor {

    public ThreadMonitor(Threshold threshold) {
        super(threshold);
    }

    @Override
    protected abstract void alert(MonitorAlert info);
    @Override
    protected abstract void update(MonitorValues values);
    @Override
    protected abstract int run() throws Exception;

}
