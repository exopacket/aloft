package org.extendedweb.aloft.lib.html.elements.js;

import org.extendedweb.aloft.lib.application.config.AppConfig;
import org.extendedweb.aloft.lib.client.ClientInfo;
import org.extendedweb.aloft.lib.client.ClientSession;
import org.extendedweb.aloft.lib.http.supporting.*;

public class ScriptEndpoint extends Endpoint {

    private JavaScript script;

    public ScriptEndpoint(RequestParams params, AppConfig config, JavaScript js) {
        super(params, config);
        this.script = js;
    }

    public JavaScript getScript() {
        return script;
    }

}
