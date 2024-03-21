package org.extendedweb.aloft.lib.http.protocol.responses.defined;

import com.sun.net.httpserver.HttpExchange;
import org.extendedweb.aloft.lib.application.config.AppConfig;
import org.extendedweb.aloft.lib.application.config.MiddlewareList;
import org.extendedweb.aloft.lib.client.ClientInfo;
import org.extendedweb.aloft.lib.client.ClientSession;
import org.extendedweb.aloft.lib.http.protocol.responses.base.DefinedResponse;
import org.extendedweb.aloft.lib.http.protocol.responses.base.ResponseObject;
import org.extendedweb.aloft.lib.http.supporting.*;

public class ComponentStateResponse extends DefinedResponse {

    public ComponentStateResponse(RequestParams params, AppConfig config) {
        super(params, config);
    }

    @Override
    protected ResponseObject buildResponse() {
        return null;
    }

}
