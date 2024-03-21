package org.extendedweb.aloft.lib.http.protocol.responses.base;

import org.extendedweb.aloft.lib.application.config.AppConfig;
import org.extendedweb.aloft.lib.client.ClientInfo;
import org.extendedweb.aloft.lib.client.ClientSession;
import org.extendedweb.aloft.lib.http.supporting.*;
import org.extendedweb.aloft.lib.lang.base.Jsonable;
import org.json.simple.JSONObject;

public abstract class DefinedResponse extends Endpoint implements Jsonable {

    public DefinedResponse(RequestParams params, AppConfig config) {
        super(params, config);
    }

    //TODO validate middleware in the endpoint class

//    protected abstract MiddlewareList selectMiddleware(MiddlewareList global);
    protected abstract ResponseObject buildResponse();
//
//    public boolean validateMiddleware() {
//        MiddlewareList selected = selectMiddleware(config.getMiddleware());
//        return false;
//    }

    @Override
    public JSONObject json() {
        return buildResponse().json();
    }
}
