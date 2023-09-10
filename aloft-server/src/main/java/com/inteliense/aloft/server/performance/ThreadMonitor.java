package com.inteliense.aloft.server.performance;

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
