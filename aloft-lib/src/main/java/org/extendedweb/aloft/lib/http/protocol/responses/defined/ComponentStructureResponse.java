package org.extendedweb.aloft.lib.http.protocol.responses.defined;

import org.extendedweb.aloft.lib.application.config.AppConfig;
import org.extendedweb.aloft.lib.client.ClientInfo;
import org.extendedweb.aloft.lib.http.protocol.responses.base.DefinedResponse;
import org.extendedweb.aloft.lib.http.protocol.responses.base.ResponseObject;
import org.extendedweb.aloft.lib.http.supporting.*;
import org.extendedweb.aloft.lib.lang.types.t.StringT;

public class ComponentStructureResponse extends DefinedResponse {

    public ComponentStructureResponse(RequestParams params, AppConfig config) {
        super(params, config);
    }

    @Override
    protected ResponseObject buildResponse() {
        ResponseObject root = new ResponseObject("application");

        return root;
    }
}
