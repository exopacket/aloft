package com.inteliense.aloft.server.performance.handlers.base;

import com.inteliense.aloft.server.performance.monitors.base.MonitorAlert;
import com.inteliense.aloft.server.performance.monitors.base.MonitorValues;

public interface HandlesPerfomance {

    void alert(MonitorAlert alert);
    void update(MonitorValues values);
    int run();

}
