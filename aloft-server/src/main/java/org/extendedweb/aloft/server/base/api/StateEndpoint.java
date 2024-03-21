package org.extendedweb.aloft.server.base.api;

import org.extendedweb.aloft.lib.application.config.AppConfig;
import org.extendedweb.aloft.lib.http.supporting.*;

public class StateEndpoint extends Endpoint {
    public StateEndpoint(RequestParams params, AppConfig config) {
        super(params, config);
    }
}
