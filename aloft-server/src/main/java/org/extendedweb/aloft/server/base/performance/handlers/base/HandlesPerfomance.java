package org.extendedweb.aloft.server.base.performance.handlers.base;

import org.extendedweb.aloft.server.base.performance.monitors.base.MonitorAlert;
import org.extendedweb.aloft.server.base.performance.monitors.base.MonitorValues;

public interface HandlesPerfomance {

    void alert(MonitorAlert alert);
    void update(MonitorValues values);
    int run();

}
