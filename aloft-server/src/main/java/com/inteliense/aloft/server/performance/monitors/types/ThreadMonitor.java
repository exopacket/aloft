package com.inteliense.aloft.server.performance.monitors.types;

import com.inteliense.aloft.server.performance.monitors.base.MonitorAlert;
import com.inteliense.aloft.server.performance.monitors.base.MonitorValues;
import com.inteliense.aloft.server.performance.monitors.base.Threshold;
import com.inteliense.aloft.server.performance.monitors.base.Monitor;

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
